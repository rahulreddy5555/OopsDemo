package com.valuemomentum.training.Io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.name="rahul";
		e.address="hyderabad";
		e.SSN=34567;
		e.number=999;
		try {
			FileOutputStream fout=new FileOutputStream("emp.ser");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(e);
			out.close();
			fout.close();
		}
		catch(Exception E) {
			System.out.println(E.getMessage());
		}
	}

}
