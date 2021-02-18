package com.valuemomentum.training.concurrency;

public class HeavyWorkRunnable implements Runnable {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Doing heavy processing-START "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("doing heavy processing end"+Thread.currentThread().getName());	
	}
		private void doDBProcessing() throws Exception {
			Thread.sleep(1000);
		}
	}


