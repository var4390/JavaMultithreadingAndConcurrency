package com.varsha.semaphore;

public class Consumer implements Runnable{

	Q q;
	
	public Consumer(Q q) {
		this.q = q;
	}
	
	@Override
	public void run() {
		
		for (int i =1; i <=5; i++) {
			q.get();
		}
		
	}

}
