package com.valuemomentum.training.collections;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> book=new ArrayList<Book>();
		//Creating Books
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    book.add(b1);
	    book.add(b2);
	    book.add(b3);
	    for(Book b:book) {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
	    }
	}

}
