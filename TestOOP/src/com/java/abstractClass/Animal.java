package com.java.abstractClass;

public abstract class Animal {
	public abstract void run();

	public  void eat(){
		run();
	};

}

class Cat extends Animal {
	@Override
	public void run() {
		System.out.println("√®–°≈‹");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("√®≥‘∑π");
		
	}

	class Dog extends Animal {

		@Override
		public void run() {
			System.out.println("π∑–°≈‹");
		}

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("π∑≥‘∑π");

		}
	}
}
