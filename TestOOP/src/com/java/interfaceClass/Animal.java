package com.java.interfaceClass;

public interface Animal {
	//接口只有：常量和接口
	//接口中常量默认 public static final
	String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	
	//接口中方法默认 public static
	public void run();
	
	public void eat(String name);
	
}

interface Attack{
	public void attack();
}

interface Flyable extends Animal,Attack{
	public void fly();
} 