package com.amc.collectionframework;
import java.util.*;

public class ArrayListDemo {

	@SuppressWarnings({ "unchecked", "removal" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		List obj = new ArrayList();
		obj.add(7);
		obj.add("Rahul");
		obj.add(4.8f);
		obj.add(new Integer(9));
		obj.add(true);
		obj.add(7);
		obj.add(null);
		System.out.println(obj);
	}
}
