package com.valuemomentum.training.collections;

import java.util.*;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("reddy");
		al.add("ram");
		al.add(1,"rahul");
		System.out.println("second element is: "+al.get(1));
		java.util.ListIterator<String> i=al.listIterator();
		System.out.println("from forward");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("from backward");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}

	}

}
