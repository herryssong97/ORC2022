package com.simple.ex;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" ");
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {

		Thread t1 = new MyThread();
		t1.start();

	}

}
