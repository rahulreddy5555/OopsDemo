package com.valuemomentum.training.Io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamExample{    
public static void main(String args[])throws Exception{             
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name=br.readLine(); 
    int age=Integer.parseInt(br.readLine());
    System.out.println("Welcome "+name+"  age  "+age);    
}    
}  