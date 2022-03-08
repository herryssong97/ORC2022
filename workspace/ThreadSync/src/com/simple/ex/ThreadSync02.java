package com.simple.ex;

class Counter02 {
	private int value = 0;

	public void increment() {
		value++;
	}

	public void decrement() {
		value--;
	}

	public void printCounter() {
		System.out.println("=>" + value);
	}
}

class MyThread02 extends Thread {

	// �����ڿ� ����
	// ��� �����尡 �����ϴ� �ڿ��̶�� ��
	Counter sharedCounter;

	public MyThread02(Counter c) {

		this.sharedCounter = c;
	}

	public void run() {
		int i = 0;

		// ������ �۾� ���� : � �����尡 ���ͼ� 20000�� �۾��� �Ѵ�
		while (i < 20000) {
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

public class ThreadSync02 {

	public static void main(String[] args) {

		Counter c = new Counter();

		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();

	}

}
