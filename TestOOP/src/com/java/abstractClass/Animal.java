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
		System.out.println("èС��");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è�Է�");
		
	}

	class Dog extends Animal {

		@Override
		public void run() {
			System.out.println("��С��");
		}

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("���Է�");

		}
	}
}
