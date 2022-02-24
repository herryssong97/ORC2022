package com.simple.hyeri;

import java.util.Scanner;

public class homework03 {

	public static void main(String[] args) {

		/*
		 * 1. 아래와 같은 모양의 별표를 출력하세요. (단 for, while문 사용하여 출력)
		 *
		 * * ** *** **** *****
		 * 
		 */

		
		/*** 방법 A ***/
		
		String[] star = { "*", "**", "***", "****", "*****" };

		for (int i = 0; i < star.length; i++) {
			System.out.println(star[i]);
		}

		System.out.println();

		
		/*** 방법 B ***/
		
		String[][] starB = { { "*" }, { "*","*" }, { "*","*","*" }, { "*","*","*","*" },
				{ "*","*","*","*","*" } };

		for (int i = 0; i < starB.length; i++) {
			for (int j = 0; j < starB[i].length; j++) {
				System.out.print(starB[i][j]);
			}
			System.out.println();

		}
		System.out.println();
		
		
		/*** 방법 C ***/
		
		int cnt = 1;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				cnt++;
				System.out.print("*");
			}
			System.out.println();
			 //System.out.println();
		}
	
		
	}

}