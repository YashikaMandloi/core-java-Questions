package com.multithreadingdemo;

class Thread2 implements Runnable{
	public void run( ) {
		System.out.println("using runnable interface");
	}
}

public class MyThread2 {
	public static void main(String[] args ) {
		//object 
		Thread2 runnable=new Thread2();
		//
		Thread th=new Thread (runnable);
		th.start();
		System.out.println("main runnable interface");
	}
}