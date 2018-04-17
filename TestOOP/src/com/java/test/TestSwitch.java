package com.java.test;

public class TestSwitch {
	
	 static char[] name = {'a','x'};
	
	public static void main(String args[]) {
		// char grade = args[0].charAt(0);
		char grade = 'D';
		
		grade = (char) 56;
		
		int a = 89;
		
		grade = (char) a;
		
		System.out.println(grade);
		
		String names = "chsjehennns";
		
		names.replaceAll("chs", "123");
		System.out.println(names.replaceAll("chs", "123"));
		
		switch (grade) {
		case 'A':
			System.out.println("优秀");
			break;

		case 'B':

		case 'C':
			System.out.println("良好");
			break;
		case 'D':
			System.out.println("及格");
		case 'F':
			System.out.println("你需要再努力努力");
			break;
		default:
			System.out.println("未知等级");
		}
		System.out.println("你的等级是 " + grade);
	}
}