package com.valuemomentum.training.Io;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterDemo {  

public static void main(String args[])throws Exception{ 
   
          CharArrayWriter out=new CharArrayWriter(); 
   
          out.write("Welcome to IO Programming in Java");    
          FileWriter f1=new FileWriter("t1.txt");    
          FileWriter f2=new FileWriter("t2.txt");    
          FileWriter f3=new FileWriter("t3.txt");    
          FileWriter f4=new FileWriter("t4.txt");

    
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
          out.writeTo(f4);    

          f1.close();    
          f2.close();    
          f3.close();    
          f4.close();    
          System.out.println("Success...");    
         }    
        }    
