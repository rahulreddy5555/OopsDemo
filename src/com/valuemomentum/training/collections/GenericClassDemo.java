package com.valuemomentum.training.collections;
class sample<T>{
	private T data;

	public sample(T data) {
		super();
		this.data = data;
	}
	public T getdata() {
		return this.data;
	}
/*	void setData(T data) {
		this.data=data;
	}*/
}

public class GenericClassDemo {

	public static void main(String[] args) {
		sample<Integer> s1=new sample<Integer>(15);
		//s1.setData(15);
		System.out.println("displaying data of int generic class: "+s1.getdata());
		
		sample<String> s2=new sample<String>("rahul");
		//s2.setData("Rahul");
		System.out.println("displaying data of type string: "+s2.getdata());
		

	}

}
