package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	 

    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(111,"John",29));
        al.add(new Student(222,"Mike",21));
        al.add(new Student(333,"Mary",25));
        
        Collections.sort(al);
        for(Student st:al) {
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }

 

    }

 

}