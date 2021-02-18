package com.valuemomentum.training.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee1> eset=new HashSet<>();
		Employee1 e1=new Employee1(100, "reddy", 6500);
		Employee1 e2=new Employee1(102, "rahul", 4000);
		Employee1 e3=new Employee1(103, "george", 5500);
		Employee1 e4=new Employee1(100, "shyam", 3500);
		eset.add(e1);
		eset.add(e2);
		eset.add(e3);
		eset.add(e4);
		for(Employee1 e: eset) {
			System.out.println(e.id+" "+e.name+" "+e.sal);
		}
	}

}
