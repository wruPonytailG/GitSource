package com.java.extendsClass;

public class Animal {
	public int age;
	public void run(){
		System.out.println("≈‹∞°≈‹∞°≈‹");
	}
	public void eat(){
		System.out.println("≥‘∞°≥‘∞°≥‘");
	}
//	public String toString(){
//		return "";
//	}
	public Animal() {
		System.out.println("supersupersupersupersuper");
	}
	
}

class Bird extends Animal{
	
	public Bird() {
		System.out.println("thisthisthisthisthisthisthis");
	}
	public void run(){
		System.out.println("∑…∞°∑…∞°∑…∞°∑…");
		super.run();
		super.toString();
	}
//	public void eat(){
//		System.out.print("chichichi");
//	}
	public void egg(){
		super.run();
	}
}
