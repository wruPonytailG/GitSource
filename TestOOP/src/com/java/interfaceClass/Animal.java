package com.java.interfaceClass;

public interface Animal {
	//�ӿ�ֻ�У������ͽӿ�
	//�ӿ��г���Ĭ�� public static final
	String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	
	//�ӿ��з���Ĭ�� public static
	public void run();
	
	public void eat(String name);
	
}

interface Attack{
	public void attack();
}

interface Flyable extends Animal,Attack{
	public void fly();
} 