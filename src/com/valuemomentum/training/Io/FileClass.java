package com.valuemomentum.training.Io;

import java.io.File;
import java.sql.Date;

public class FileClass {

	public static void main(String[] args) {
		try {
			File f= new File("c:test1.txt");
			if(f.createNewFile()) {
				System.out.println("file created");
			}
			else {
				System.out.println("file exists");
			}
			System.out.println("file name: "+f.getName());
			System.out.println("file length: "+f.length());
			System.out.println("file parent: "+f.getParent());
			System.out.println("last modified: "+new Date(f.lastModified()));
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
