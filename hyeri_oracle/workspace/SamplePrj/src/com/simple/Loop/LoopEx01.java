package com.simple.Loop;

public class LoopEx01 {

	public static void main(String[] args) {
		
		/*
		 * /////// while ��
		 * 
		 * int a = 0;
		 * 
		 * while(a<=10){ System.out.println("a�� : "+a); a++; }
		 * 
		 */

		/*
		 *  //////// do while ��
		 * 
		 * int a = 0;
		 * 
		 * do { System.out.println("a�� : " + a); a++; } while (a <= 10);
		 * 
		 */

		int i2=0;

		for (int i = 0; i < 10; i++) {
			System.out.println("a�� : " + i);
			i2 = i;
		}

		System.out.println("���� a�� : " + i2);

	}

}
