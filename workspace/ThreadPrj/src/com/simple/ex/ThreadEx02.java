package com.simple.ex;

class MyThread02 extends Thread {
	int sum = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			sum += i;
			try {
				sleep(1000); // �ӵ�����: (1/1000 �� = 1�� ���� �Ѵٴ� ��) ����ó���� ����� �Ѵ�.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("B:" + i + "��:" + sum);
		}
	}
}

class MyThread01 extends Thread {
	int sum = 0;

	public void run() {
		for (int i = 10; i < 20; i++) {
			sum += i;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("A:" + i);
		}
	}
}

public class ThreadEx02 {

	public static void main(String[] args) {

		Thread t1 = new MyThread02();
		Thread t2 = new MyThread01();
		t1.start();
		t2.start();
		System.out.println("���α׷� ����");

	}

}
