package com.java.test;

public class SencondDemo {
	public static void main(String[] args){
		if (args.length>0){
			System.out.println("the first Demo :" + args[0]);
		}
		else{
			new SencondDemo().callFirst(new FisrtDemo("Hello"));
			new SencondDemo().callFirst(new FisrtDemo("World"));
		}
	}
	
	public void callFirst(FisrtDemo first){
		first.sayHello();
	}
}
