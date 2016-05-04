/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.jmh;

import org.lwjgl.system.MemoryAccess;
import org.lwjgl.system.MemoryUtil;
import org.openjdk.jmh.annotations.*;

import static org.lwjgl.system.MemoryUtil.*;

@State(Scope.Benchmark)
public class MemCpyTest {

	private long f = nmemAlloc(1024);
	private long t = nmemAlloc(1024);

	@Param({ "8", "12", "16", "32", "64", "96", "128", "256", "384", "512", "768", "1024" })
	public int length;

	@Benchmark
	public void memCopy() {
		MemoryUtil.memCopy(f, t, length);
	}

	@Benchmark
	public void loop() {
		memCopyAligned(f, t, length);
	}

	@Benchmark
	public void jni() {
		MemoryAccess.memcpy(t, f, length);
	}

	private static void memCopyAligned(long src, long dst, int bytes) {
		int i = 0;

		// Aligned longs for performance
		while ( i <= bytes - 8 ) {
			memPutLong(dst + i, memGetLong(src + i));
			i += 8;
		}

		// Tail
		for ( ; i < bytes; i++ )
			memPutByte(dst + i, memGetByte(src + i));
	}

}
