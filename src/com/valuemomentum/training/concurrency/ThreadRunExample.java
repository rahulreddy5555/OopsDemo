package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		Thread t1=new Thread(new HeavyWorkRunnable(),"t1-r");
		Thread t2=new Thread(new HeavyWorkRunnable(),"t2-s");
		System.out.println("stating runnable threads");
		t1.start();
		t2.start();
		System.out.println("runnable thread has been startde");
		Thread t3=new MyThread2("t3");
		Thread t4=new MyThread2("t4");
		t3.start();
		t4.start();
		System.out.println("my threads has been started");
	}
}
