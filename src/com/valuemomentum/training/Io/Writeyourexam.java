package com.valuemomentum.training.Io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Writeyourexam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{Writer w=new FileWriter("test6.txt");
		String s="hi there complete the exam";
		w.write(s);
		w.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
