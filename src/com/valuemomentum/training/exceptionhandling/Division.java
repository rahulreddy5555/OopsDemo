package com.valuemomentum.training.exceptionhandling;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a and b values");
		int a=obj.nextInt();
		int b=obj.nextInt();
		try{int res=a/b;
		System.out.println(res);}
		
		catch(ArithmeticException e) {
			System.out.println("divide by zero exception");
			System.out.println(e.getMessage());
		}
		
		finally{
			obj.close();
		System.out.println("in finally block");
		}
	}

}
