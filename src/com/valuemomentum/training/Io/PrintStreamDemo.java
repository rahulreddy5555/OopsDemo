package com.valuemomentum.training.Io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  FileOutputStream fout=new FileOutputStream("t1.txt ");    
		   PrintStream pout=new PrintStream(fout);    
		   pout.println(2016);    
		   pout.println("Hello Java");    
		   pout.println("Welcome to Java");    
		   pout.close();    
		   fout.close();    
		  System.out.println("Success?");    
	}

}
