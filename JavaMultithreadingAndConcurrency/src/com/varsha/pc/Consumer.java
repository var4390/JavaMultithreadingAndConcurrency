package com.varsha.pc;

public class Consumer implements Runnable{

	Q q;
	Thread t;
	
	public Consumer(Q q) {
		this.q = q;
		t = new Thread(this, "Consumer");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			q.get();
		}
		
	}

}
