package com.valuemomentum.training.Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("newserial.txt"));
		Student s=(Student)in.readObject();
		System.out.println(s.id+"    "+s.name);
		in.close();
		

	}

}
