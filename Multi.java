package com.collections;

// thread example by extending Thread class :-

//public class Multi extends Thread {
//	public void run() {
//		System.out.println("thread is running");
//	}
//
//	public static void main(String[] args) {
//		Multi m = new Multi();
//		m.start();
//      }
//	}

// Java Thread Example by implementing Runnable interface :-

public class Multi implements Runnable {
	public void run() {
		System.out.println("thread is running....");
	}
	public static void main(String[] args) {
		Multi m = new Multi();
		Thread t = new Thread(m);  // Using the constructor Thread(Runnable r) 
		t.start();
	}
}

