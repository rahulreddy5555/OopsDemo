package com.valuemomentum.training.concurrency;
class MyThreads extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" is running.");
		}
	}
}
public class YeildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreads k=new MyThreads();
		k.start();
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+" is in control");
		}

	}

}
