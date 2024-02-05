package com.amc.day13.arrays;

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[] = new Student[5];
		arr[0] = new Student(01, "Deepesh");
		arr[1] = new Student(02, "Fullpack");
		arr[2] = new Student(03, "Nanda");
		arr[3] = new Student(04, "Mola");
		arr[4] = new Student(05, "Suraj");
		
		for(Student s:arr) {
			System.out.println(s.getAge()+" "+s.getName());
		}
	}

}
