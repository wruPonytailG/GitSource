package com.java.test;

public abstract class SuperClass {
	abstract void setUserName(String name);
}

class subClass extends SuperClass{
	public String name;
	void setUserName(String UserName) {
		this.name = UserName;		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("");
		e.empAge(2);
	}
}
