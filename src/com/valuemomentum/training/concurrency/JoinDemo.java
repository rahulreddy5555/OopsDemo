package com.valuemomentum.training.concurrency;

public class JoinDemo extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinDemo j1=new JoinDemo();
		JoinDemo j2=new JoinDemo();
		JoinDemo j3=new JoinDemo();
		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j2.start();
		j3.start();

	}

}
