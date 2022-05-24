package com.stream.test;

import java.util.stream.IntStream;

public class Count1To50WithStream {
	
	public static void main(String[] args) {
		// using for loop
		int total = 0;
		int streamTotal = 0;
		for(int i = 0; i <= 50; i++) {
			total += i;
		}
		System.out.println("Count : " +total );
		// using stream
		streamTotal = IntStream.rangeClosed(0, 50).map(Integer::new).sum();
		System.out.println("Using stream : " + streamTotal);
	}

}
