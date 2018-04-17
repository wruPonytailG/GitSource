package com.java.test;

public class Person {
	int age;
	
	public static void main(String[] args){
		Person t1 = new Person();
		Person t2 = t1;
		t1.age =10;
		t2.age =20;
		System.out.println(t1.age );
		System.out.println(t2.age );
	}

}

