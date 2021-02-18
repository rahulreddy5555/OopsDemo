package com.valuemomentum.training.collections;

import java.util.*;
public class HashMapExample {

 

    public static void main(String[] args) {
        Map<Integer,Book> mapBook=new HashMap<Integer,Book>();
        
        Book b1=new Book(101,"Let us C","Yeshwant","BPB",8);
        Book b2=new Book(102,"Let us Python","Vishal","AAf",4);
        Book b3=new Book(103,"Let us Java","Naresh","B",7);
        
        mapBook.put(1, b1);
        mapBook.put(2, b2);
        mapBook.put(3, b3);
        
        
        for(Map.Entry<Integer,Book> e:mapBook.entrySet()) {
            
            int key=e.getKey();
            Book b=e.getValue();
            
            System.out.println("Book "+key+" Details");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
            
            
            
        }

 

    }

 

}