
package com.valuemomentum.training.collections;
import java.util.*;
public class TestArraylist {
	public static void main(String ...args) {
	String str1="madam";
	String str2="";
	for(int i=str1.length()-1;i>=0;i--) {
		str2+=str1.charAt(i);
	
	}
	if(str1==str2) {
		System.out.println("palindrome");
	}
	}
}
