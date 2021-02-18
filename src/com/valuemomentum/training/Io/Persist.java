package com.valuemomentum.training.Io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"ram");
		FileOutputStream fout=new FileOutputStream("newserial.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
		
	}

}
