// Protocol Buffers - Google's data interchange format
// Copyright 2008 Google Inc.  All rights reserved.
// https://developers.google.com/protocol-buffers/
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
//     * Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
//     * Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
//     * Neither the name of Google Inc. nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

// Author: kenton@google.com (Kenton Varda)
//  Based on original Protocol Buffers design by
//  Sanjay Ghemawat, Jeff Dean, and others.

#ifndef GOOGLE_PROTOBUF_COMPILER_JAVA_MESSAGE_H__
#define GOOGLE_PROTOBUF_COMPILER_JAVA_MESSAGE_H__

#include <map>
#include <string>
#include <google/protobuf/compiler/java_leo/java_field.h>

namespace google {
namespace protobuf {
namespace compiler {
namespace java_leo {
class Context;            // context.h
class ClassNameResolver;  // name_resolver.h
}  // namespace java
}  // namespace compiler
namespace io {
class Printer;  // printer.h
}
}  // namespace protobuf
}  // namespace google

namespace google {
namespace protobuf {
namespace compiler {
namespace java_leo {

static const int kMaxStaticSize = 1 << 15;  // aka 32k

class MessageGenerator {
 public:
  explicit MessageGenerator(const Descriptor* descriptor);
  virtual ~MessageGenerator();

  // All static variables have to be declared at the top-level of the file
  // so that we can control initialization order, which is important for
  // DescriptorProto bootstrapping to work.
  virtual void GenerateStaticVariables(io::Printer* printer,
                                       int* bytecode_estimate) = 0;

  // Output code which initializes the static variables generated by
  // GenerateStaticVariables(). Returns an estimate of bytecode size.
  virtual int GenerateStaticVariableInitializers(io::Printer* printer) = 0;

  // Generate the class itself.
  virtual void Generate(io::Printer* printer) = 0;

  // Generates the base interface that both the class and its builder
  // implement
  virtual void GenerateInterface(io::Printer* printer) = 0;

  // Generate code to register all contained extensions with an
  // ExtensionRegistry.
  virtual void GenerateExtensionRegistrationCode(io::Printer* printer) = 0;

 protected:
  const Descriptor* descriptor_;

 private:
  GOOGLE_DISALLOW_EVIL_CONSTRUCTORS(MessageGenerator);
};

class ImmutableMessageGenerator : public MessageGenerator {
 public:
  ImmutableMessageGenerator(const Descriptor* descriptor, Context* context);
  virtual ~ImmutableMessageGenerator();

  virtual void Generate(io::Printer* printer);
  virtual void GenerateInterface(io::Printer* printer);
  virtual void GenerateExtensionRegistrationCode(io::Printer* printer);
  virtual void GenerateStaticVariables(io::Printer* printer,
                                       int* bytecode_estimate);

  // Returns an estimate of the number of bytes the printed code will compile to
  virtual int GenerateStaticVariableInitializers(io::Printer* printer);

 private:
  void GenerateFieldAccessorTable(io::Printer* printer, int* bytecode_estimate);

  // Returns an estimate of the number of bytes the printed code will compile to
  int GenerateFieldAccessorTableInitializer(io::Printer* printer);

  void GenerateMessageSerializationMethods(io::Printer* printer);
  void GenerateParseFromMethods(io::Printer* printer);
  void GenerateSerializeOneField(io::Printer* printer,
                                 const FieldDescriptor* field);
  void GenerateSerializeOneExtensionRange(
      io::Printer* printer, const Descriptor::ExtensionRange* range);

  void GenerateIsInitialized(io::Printer* printer);
  void GenerateDescriptorMethods(io::Printer* printer);
  void GenerateInitializers(io::Printer* printer);
  void GenerateEqualsAndHashCode(io::Printer* printer);
  void GenerateParser(io::Printer* printer);
  void GenerateParsingConstructor(io::Printer* printer);
  void GenerateUpdateFromMethod(io::Printer* printer);
  void GenerateAnyMethods(io::Printer* printer);

  Context* context_;
  ClassNameResolver* name_resolver_;
  FieldGeneratorMap<ImmutableFieldGenerator> field_generators_;

  GOOGLE_DISALLOW_EVIL_CONSTRUCTORS(ImmutableMessageGenerator);
  void GenerateClearMethod(io::Printer* printer);
};

}  // namespace java
}  // namespace compiler
}  // namespace protobuf
}  // namespace google

#endif  // GOOGLE_PROTOBUF_COMPILER_JAVA_MESSAGE_H__
