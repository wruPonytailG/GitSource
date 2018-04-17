package com.java.test;

public class chengfabiao {
	public static void main(String[] args) {
		/*for(int i= 1;i<=9;i++){
			for(int j= 1;j<=i;j++){			
			System.out.print(j + "*"+ i + ": = " + i*j + '\t');
			}
			System.out.println('\n');
		}*/
		
		
		for (int i = 101; i<150; i++){
			int m = 0;
			
			for (int j=2 ; j< i/2; j++){
				if (i%j==0){
					m++;
					break;
				}
			}
			if (m > 0){
				continue;
			}			
			System.out.println(i/2);
		    System.out.println(i + "  ");
		}
	}
}
