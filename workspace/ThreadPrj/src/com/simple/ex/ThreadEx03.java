package com.simple.ex;

class MyRunnable implements Runnable {
	int sum = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			sum += i;
			try {
				Thread.sleep(100); // �ӵ����� ����ó���� ����� �Ѵ�.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("B:" + i + "��:" + sum);
		}
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		System.out.println("���α׷� ����");

	}

}
