package com.java.extendsClass;

import static java.lang.System.out;

public class Dog {
	int dogage;

	public Dog(String name) {
		int y;
		y = dogage + 3;
		out.println("小狗的名字: " + y);

	}

	public int getAge() {
		System.out.println("小狗的年龄： " + dogage);
		return 5;
	}

	public void setAge(int age) {
		this.dogage = getAge();
	}

	public static void main(String[] args) {
		Dog d = new Dog("punny");

		d.setAge(2);

		System.out.println("变量值： " + d.getAge());

	}

}
