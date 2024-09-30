package com.multithreadingdemo;

class Thread1 extends Thread{
	public void run() {
		System.out.println("first thread is running");
	}
}

public class MyThread1 {
	public static void main(String[] args) {
		Thread t1=new Thread1();
		//Use start method
		t1.start();
		System.out.println("main thread is running..");
	}
}