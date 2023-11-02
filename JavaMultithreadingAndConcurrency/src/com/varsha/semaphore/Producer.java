package com.varsha.semaphore;

public class Producer implements Runnable{

	Q q;
	
	public Producer(Q q) {
		this.q = q;
	}
	
	@Override
	public void run() {
		
		for(int i = 1; i <=5 ; i++) {
			q.put(i);
		}
		
	}


}
