package com.lilin.java.design.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Stream3 {

	public static final int MAX = 1000000;

	/**
	 * stream 流处理
	 */
	public static void sortSeuentail() {
		List<String> strings = new ArrayList<String>(MAX);
		for (int i = 0; i < MAX; i++) {
			UUID uuid = UUID.randomUUID();
			strings.add(uuid.toString());
		}
		long t0 = System.nanoTime();
		long count = strings.stream().sorted().count();
		System.out.println(count);
		long t1 = System.nanoTime();

		long mills = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sortSeuentail sort took: %s ms", mills));
	}
	
	/**
	 * stream 并行流处理
	 */
	public static void sortParallel() {
		List<String> strings = new ArrayList<String>(MAX);
		for (int i = 0; i < MAX; i++) {
			UUID uuid = UUID.randomUUID();
			strings.add(uuid.toString());
		}
		long t0 = System.nanoTime();
		long count = strings.parallelStream().sorted().count();
		System.out.println(count);
		long t1 = System.nanoTime();

		long mills = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sortParallel sort took: %s ms", mills));
	}

	public static void main(String[] args) {
		sortSeuentail();
		sortParallel();
	}
}
