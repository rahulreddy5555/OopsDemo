package com.valuemomentum.training.collections;
class Employee10{
	private String name;

	public Employee10(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
interface pair<k,v>{
	public k getKey();
	public v getValue();
	}
class OrderedPair<k,v> implements pair<k,v>{
	private k key;
	private v value;

	public OrderedPair(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public k getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public v getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
public class GenericMultipleParameters {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedPair<Integer,String> op1=new OrderedPair(4, "rahul");
		System.out.println(op1.getKey()+": "+		op1.getValue());
		
		OrderedPair<String,String> op2=new OrderedPair("rahul", "reddy");
		System.out.println(op2.getKey()+": "+		op2.getValue());
		
		OrderedPair<Integer,Employee10> op3=new OrderedPair<Integer,Employee10>(10,new Employee10("rr"));
		System.out.println(op3.getKey()+": "+		op3.getValue().getName());
	}


	

}
