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

package com.google.protobuf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.protobuf.testing.Proto3Testing.Proto3Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public final class BinaryProtocolTest {
  @BeforeEach
  public void setup() {
    TestSchemas.registerGenericProto2Schemas();

    Protobuf.getInstance()
        .registerSchemaOverride(Proto3Message.class, TestSchemas.genericProto3Schema);
  }

  @Test
  public void proto3Roundtrip() throws Exception {
    Proto3Message expected = new Proto3MessageFactory(5, 10, 2, 2).newMessage();
    byte[] expectedBytes = expected.toByteArray();

    // Deserialize with BinaryReader and verify that the message matches the original.
    Proto3Message result =
        ExperimentalSerializationUtil.fromByteArray(expectedBytes, Proto3Message.class);
    assertEquals(expected, result);

    // Now write it back out using BinaryWriter and verify the output length.
    byte[] actualBytes = ExperimentalSerializationUtil.toByteArray(result);
    assertEquals(expectedBytes.length, actualBytes.length);

    // Read back in the bytes and verify that it matches the original message.
    Proto3Message actual = Proto3Message.parseFrom(actualBytes);
    assertEquals(expected, actual);
  }
}
