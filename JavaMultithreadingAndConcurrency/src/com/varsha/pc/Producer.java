package com.varsha.pc;

public class Producer implements Runnable{

	Q q;
	Thread t;
	
	public Producer(Q q) {
		this.q = q;
		t = new Thread(this, "Producer");
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 5; i++) {
			q.put(i);
		}
		
	}
	
}
