package com.varsha.pc;

public class Q {

	int n; //data
	boolean valueSet = false;
	
	//use inter thread communication along with synchronization for correct implementation of PC problem
	//PC: Producer produces data and waits for consumer to consume data; Consumer consumes data and waits
	//for Producer to produce more data
	
	synchronized int get() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Got: "+ n);
		valueSet = false;
		notify();
		
		return n;
	}
	
	synchronized void put (int n) {
		
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.n = n;
		System.out.println("Put: "+ n);
		valueSet = true;
		notify();
		
	}
	
}
