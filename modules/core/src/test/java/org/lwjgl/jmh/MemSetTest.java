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
		memSetLoop(m, (byte)0, length);
	}

	@Benchmark
	public void jni() {
		MemoryAccess.memset(m, 0, length);
	}

	@Benchmark
	public void arrayFill() {
		Arrays.fill(a, 0, length, (byte)0);
	}

	private static void memSetLoop(long dst, byte value, int bytes) {
		int i = 0;

		if ( 8 <= bytes ) {
			int misalignment = (int)dst & 7;
			if ( misalignment != 0 ) {
				// Align to 8 bytes
				for ( int len = 8 - misalignment; i < len; i++ )
					memPutByte(dst + i, value);
			}

			// Aligned longs for performance
			long fill = fill(value);
			do {
				memPutLong(dst + i, fill);
				i += 8;
			} while ( i <= bytes - 8 );
		}

		// Tail
		for ( ; i < bytes; i++ )
			memPutByte(dst + i, value);
	}

	private static long fill(byte value) {
		long fill = value;

		if ( value != 0 ) {
			fill += fill << 8;
			fill += fill << 16;
			fill += fill << 32;
		}

		return fill;
	}

}