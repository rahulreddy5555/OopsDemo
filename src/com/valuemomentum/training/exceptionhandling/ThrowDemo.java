package com.valuemomentum.training.exceptionhandling;


public class ThrowDemo {
	public static void hello() {
		throw new ArithmeticException("test");
	}
	
	public static void main(String args[]) {
		hello();
	}
}
