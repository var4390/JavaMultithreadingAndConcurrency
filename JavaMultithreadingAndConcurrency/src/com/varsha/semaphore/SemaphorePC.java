package com.varsha.semaphore;

public class SemaphorePC {

	public static void main(String[] args) {
		
		Q q = new Q();
		
		new Thread(new Producer(q)).start();
		new Thread(new Consumer(q)).start();

	}

}
