package com.java.test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	
	public static void main(String[] args) throws ParseException{
		
			// 初始化 Date 对象
		     Date date = new Date();
		     SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		 
		     System.out.println(getNowDate());
		     
		     // 使用toString()显示日期和时间
		     String str = ft.format(getNowDate());
		     
		     System.out.println(str);
		     
		     Date datetime = ft.parse(str);
		     
		     
		     
		
		
	}
	
	public static Date getNowDate() throws ParseException {
		   Date currentTime = new Date();
		   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   String dateString = formatter.format(currentTime);
		   ParsePosition pos = new ParsePosition(8);
		   Date currentTime_2 = formatter.parse(dateString);
		   return currentTime_2;
		}
	
}

