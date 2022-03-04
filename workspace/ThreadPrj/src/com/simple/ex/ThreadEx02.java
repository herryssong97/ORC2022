package com.simple.ex;

class MyThread02 extends Thread {
	int sum = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			sum += i;
			try {
				sleep(1000); // 속도조절: (1/1000 초 = 1초 쉬게 한다는 뜻) 예외처리를 해줘야 한다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("B:" + i + "합:" + sum);
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
		System.out.println("프로그램 종료");

	}

}
