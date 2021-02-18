package com.valuemomentum.training.exceptionhandling;

public class ThrowsDemo {
	void division() throws ArithmeticException {
		int a=10;
		int b=0;
		int res=a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo t=new ThrowsDemo();
		try {
			t.division();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
