package com.valuemomentum.training.Io;

import java.io.Serializable;

public class Employee implements Serializable{
	//public static final String SSN = null;
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	
	
	public void mailcheck() {
		System.out.println("mailing a check to"+"   "+name);
	}
	
}
