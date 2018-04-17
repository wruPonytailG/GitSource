package com.java.test;

public class TestString {
	private Integer a = 0;
	private String b = "asd";
	private StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		TestString t = new TestString();
		System.out.println(t.a.hashCode());
		System.out.println(t.b.hashCode());	
		t.setA();
		System.out.println(t.b.hashCode());	
		System.out.println(t.a.hashCode());
		System.out.println(t.sb.hashCode());
		t.setA();
		System.out.println(t.b.hashCode());	
		System.out.println(t.a.hashCode());
		System.out.println(t.sb.hashCode());
		
	}
	void setA(){
		b = b + "4123";
		a = a + 1;
		sb.append("123");
	}
}
