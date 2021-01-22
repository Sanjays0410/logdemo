package com.cruds.logdemo;

import java.util.Scanner;

public class Mm {
	
	public static void main(String[] args) {
		
	StringBuffer b=new StringBuffer();
	b.append("abc");
	System.out.println(b.capacity());
	System.out.println(b.length());
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<n;i++)
		{
			fact=fact*i;
			
			
		}
		System.out.println("the fact of"+n+""+fact);
		
		
		}
	
}
