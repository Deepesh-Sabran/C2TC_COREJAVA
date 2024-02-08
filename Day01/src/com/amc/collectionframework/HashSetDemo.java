package com.amc.collectionframework;
import java.util.*;

public class HashSetDemo {

	@SuppressWarnings({ "unchecked", "removal" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Set s = new LinkedHashSet();
		s.add("First");
		s.add(1);
		s.add(false);
		s.add(new Float(4.6f));
		System.out.println(s);
		s.add(false);
		s.add(null);
		System.out.println(s);
	}
}
