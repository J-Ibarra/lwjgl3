/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.jmh;

import org.lwjgl.system.MemoryAccess;
import org.openjdk.jmh.annotations.*;

import java.util.Arrays;

import static org.lwjgl.system.MemoryUtil.*;

@State(Scope.Benchmark)
public class MemSetTest {

	private static long m = nmemAlloc(1024);

	private static byte[] a = new byte[1024];

	@Param({ "16", "32", "64", "128", "256", "1024" })
	public int length;

	@Benchmark
	public void memset() {
		memSet(m, 0, length);
	}

	@Benchmark
	public void loop() {
		memSetLoop(m, 0, length);
	}

	@Benchmark
	public void jni() {
		MemoryAccess.memset(m, 0, length);
	}

	@Benchmark
	public void arrayFill() {
		Arrays.fill(a, 0, length, (byte)0);
	}

	private static void memSetLoop(long m, int value, int length) {
		int bytes = value & 0xFF;
		int longs = length >> 3;

		// Align with byte operations
		int i = 0;
		for ( int len = length - (longs << 3); i < len; i++ )
			memPutByte(m + i, (byte)bytes);

		// Set the rest with long operations
		bytes |= bytes << 8;
		bytes |= bytes << 16;
		long l = bytes | (bytes << 32);
		for ( ; i < length; i += 8 )
			memPutLong(m + i, l);
	}

}