package com.valuemomentum.training.exceptionhandling;

public class ExceptionMCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=0;
		int result=0;
		int arr[]=new int[5];
		try {
			arr[0]=0;
			arr[1]=1;
			arr[2]=2;
			arr[3]=3;
			arr[4]=4;
			arr[5]=5;
			result=num1/num2;
			System.out.println("result :"+result);
		}
	/*	catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of bound");
		}*/
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
