package com.java.test;

public class HttpServlet {
	public void Service(){
		doGet();
	}
	public void doGet(){
		System.out.println("HttpServlet.doGet......");
	}
	
	public static void main(String[] args) {
		HttpServlet s = new MyServlet();
		s.Service();
	}
}
