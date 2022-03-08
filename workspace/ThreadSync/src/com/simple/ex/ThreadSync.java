package com.simple.ex;

class Counter {
	private int value = 0;

	public synchronized void increment() {
		value++;
	}

	public synchronized void decrement() {
		value--;
	}

	public void printCounter() {
		System.out.println("=>" + value);
	}
}

class MyThread extends Thread {

	// 공유자원 설정
	// 모든 쓰레드가 공유하는 자원이라는 말
	Counter sharedCounter;

	public MyThread(Counter c) {

		this.sharedCounter = c;
	}

	public void run() {
		int i = 0;

		Object mutex = sharedCounter;

		// 쓰레드 작업 정의 : 어떤 스레드가 들어와서 20000번 작업을 한다
		while (i < 20000) {

			synchronized (mutex) {
				sharedCounter.increment();
				sharedCounter.decrement();

				if (i % 40 == 0)
					sharedCounter.printCounter();
				try {
					Thread.sleep((int) Math.random() * 200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				i++;

			}
		}
	}
}

public class ThreadSync {

	public static void main(String[] args) {

		Counter c = new Counter();

		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();

		System.out.println("------------------------");

	}

}
