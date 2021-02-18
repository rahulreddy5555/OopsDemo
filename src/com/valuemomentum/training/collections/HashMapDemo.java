package com.valuemomentum.training.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> languages=new HashMap<>();
		languages.put(1, "java");
		languages.put(2, "python");
		languages.put(3, "js");
		System.out.println("HashMaps:"+languages);
		String value=languages.get(1);
		System.out.println("value at index 1: "+value);
		System.out.println("value at index 3: "+languages.get(3));
		System.out.println("key: "+languages.keySet());
		System.out.println("values: "+languages.values());
		System.out.println("key/value mappings: "+languages.entrySet());
		languages.replace(2, "c#");
		System.out.println(languages);
		for(Integer key:languages.keySet()) {
			System.out.print(key+"  : "+languages.get(key)+" ,");
			
			
		
		}
	}

}
