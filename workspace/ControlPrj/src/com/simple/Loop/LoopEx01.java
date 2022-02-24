package com.simple.Loop;

public class LoopEx01 {

	public static void main(String[] args) {
		
		/*
		 * /////// while 문
		 * 
		 * int a = 0;
		 * 
		 * while(a<=10){ System.out.println("a값 : "+a); a++; }
		 * 
		 */

		/*
		 *  //////// do while 문
		 * 
		 * int a = 0;
		 * 
		 * do { System.out.println("a값 : " + a); a++; } while (a <= 10);
		 * 
		 */

		int i2=0;

		for (int i = 0; i < 10; i++) {
			System.out.println("a값 : " + i);
			i2 = i;
		}

		System.out.println("최종 a값 : " + i2);

	}

}
