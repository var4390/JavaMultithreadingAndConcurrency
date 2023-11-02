package com.varsha.semaphore;

import java.util.concurrent.Semaphore;

public class Q {

	static Semaphore semProd = new Semaphore(1);
	static Semaphore semCon = new Semaphore(0);
	
	int n;
	
	void get() {
		try {
			semCon.acquire();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Got: "+ n);
		semProd.release();
	}
	
	
	void put (int n) {
		try {
			semProd.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.n = n;
		System.out.println("Put: "+ n);
		semCon.release();
	}
}
