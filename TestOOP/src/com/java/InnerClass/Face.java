package com.java.InnerClass;

public class Face {
	public static void main(String[] args) {
		Face p = new Face();
		Face.Nose e = p.new Nose();
		e.age = 100;
		e.shape = "changlian";
		e.breath();
		
		Face.Eye eye = new Face.Eye();
	}
	
	
	
	private int age = 20;
	private String shape = "¹Ï×ÓÁ³";
			
	
	
	public class Nose{
		
		 int age = 10;
		 String shape = "Ô°Á³";
		 
		void breath(){
						 
			System.out.println(Face.this.age);
			System.out.println(Face.this.shape);
			
			System.out.println(age);
			System.out.println(shape);
		}
	}
	
	public static class Eye{
		void see(){
			System.out.println("sss");
			System.out.println("bbb");
		}
	}
	
	
	
	
}
