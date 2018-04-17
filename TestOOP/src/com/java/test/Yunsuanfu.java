package com.java.test;

public class Yunsuanfu {
	public static void main(String []args){
		Integer a = 60;
		Integer b = 13;
		Integer c = 0;
		
		a = c.equals(0) ? 20:30;		
		System.out.println(a);
		
		switch(b){
			case 10 :
				System.out.println(1);
			
			case 20 :
				System.out.println(2);
				
			case 13 :
				System.out.println(3);	
			
			case 30 :
				System.out.println(4);
				
			default :
				System.out.println(5);
			
		}
	}
}
