package com.amc.collectionframework;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> que = new LinkedList<>();
//		System.out.println(que);
		
		for(int i=0; i<5; i++) {
			que.add(i);
		}
		System.out.println("Elements in the que : "+que);
		int re = que.remove();
		System.out.println("Element removed is : "+ re);
		System.out.println(que);
		int s = que.size();
		System.out.println("Size of queue : "+s);
		int head = que.peek();
		System.out.println("Head of element : "+head);
		System.out.println(que);
		int data = que.poll(); // it also behave like remove()
		System.out.println(data);
		System.out.println(que);
	}
}
