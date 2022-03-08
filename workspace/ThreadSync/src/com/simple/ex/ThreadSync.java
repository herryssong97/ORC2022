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

	// �����ڿ� ����
	// ��� �����尡 �����ϴ� �ڿ��̶�� ��
	Counter sharedCounter;

	public MyThread(Counter c) {

		this.sharedCounter = c;
	}

	public void run() {
		int i = 0;

		Object mutex = sharedCounter;

		// ������ �۾� ���� : � �����尡 ���ͼ� 20000�� �۾��� �Ѵ�
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
