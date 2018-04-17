package com.java.test;

public class Employee{
	   static String name = "EmployeeName";
	   int age;
	   String designation;
	   double salary;
	   static String user ="UserName";
	   
	   // Employee 类的构造器
	   protected Employee(String name){
	      Employee.name = name;
	   }
	   static void setName(){
		   name= name;
		   
	   }
	   // 设置age的值
	   public void empAge(int empAge){
	      age =  empAge;
	   }
	   /* 设置designation的值*/
	   public void empDesignation(String empDesig){
	      designation = empDesig;
	   }
	   /* 设置salary的值*/
	   public void empSalary(double empSalary){
	      salary = empSalary;
	   }
	   /* 打印信息 */
	   public void printEmployee(){
	      System.out.println("名字:"+ name );
	      System.out.println("年龄:" + age );
	      System.out.println("职位:" + designation );
	      System.out.println("薪水:" + salary);
	   }
	}
final class EmployeeTest extends Employee{

	public EmployeeTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}