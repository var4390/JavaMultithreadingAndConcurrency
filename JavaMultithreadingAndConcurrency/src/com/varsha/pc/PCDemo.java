package com.varsha.pc;

public class PCDemo {

	public static void main(String[] args) {
		
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.t.start();
		c.t.start();
		
		try {
			p.t.join();
			c.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done!");

	}

}
