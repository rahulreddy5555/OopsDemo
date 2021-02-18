package com.valuemomentum.training.exceptionhandling;

public class MyException extends Exception {
	 // private static int accno[] = {​​​​1001, 1002, 1003, 1004}​​​​;
	private static int accno[]= {1001,1002,1003,1004};
	   // private static String name[] ={​​​​"Nish", "Shubh", "Sush", "Abhi", "Akash"}​​​​;
	  private static String names[]= {"nish","shub","abi","akash"};
	   private static double amt[]= {10000,12999,12334,333};	
	   public MyException() {
		// TODO Auto-generated constructor stub
	}
	   
	   MyException(String str){
		   super(str);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 System.out.println("accno"+"\t"+"names"+"\t"+"amt");
			 for(int i=0;i<5;i++) {
				 System.out.println(accno[i]+"\t"+names[i]+"\t"+amt[i]);
				 if(amt[i]<1000) {
					 MyException me=new MyException("balance is less than 1000");
					 throw me;
				 }
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }

	}

}
