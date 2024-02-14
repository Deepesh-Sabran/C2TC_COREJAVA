package com.amc.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> con = MethodReferencing::show;
		con.accept("Rahul");
		
		Supplier<String> sup = () -> "Hello from supplier !!";
		con.accept(sup.get());
		
		Predicate<Integer> pred = (num) -> num > 0;
		System.out.println(pred.test(24));
		System.out.println(pred.test(-24));
		
		BiFunction<Integer, Integer, Integer> max = (x, y) -> x>y?x:y;
		System.out.println(max.apply(5, 7));
	}
}
