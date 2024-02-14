package com.amc.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for the stream topic ...
//		List<Integer> list = Arrays.asList(1,2,3,4,5,5,4,3);// if we use null the it will give null pointer exception
//		list.stream().distinct().forEach(System.out::println); // stream doesn't modify the source
//		System.out.println(list);
//			
//		System.out.println(list.stream().filter(i -> i%5==0).map(i -> i*2).findFirst().orElse(0));
//		System.out.println(list.stream().filter(i -> i%3==0).reduce(0, (a, b) -> Integer.sum(a, b)));
		
		List<Integer> list = Arrays.asList(12,20,35,46,55,68,75);
		System.out.println(list.stream().filter(i -> i%5 == 0).map(i -> i*2).reduce(0, (c,e) -> (c+e)));
	}

}
