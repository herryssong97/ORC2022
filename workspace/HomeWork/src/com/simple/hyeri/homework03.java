package com.simple.hyeri;

import java.util.Scanner;

public class homework03 {

	public static void main(String[] args) {

		/*
		 * 1. �Ʒ��� ���� ����� ��ǥ�� ����ϼ���. (�� for, while�� ����Ͽ� ���)
		 *
		 * * ** *** **** *****
		 * 
		 */

		
		/*** ��� A ***/
		
		String[] star = { "*", "**", "***", "****", "*****" };

		for (int i = 0; i < star.length; i++) {
			System.out.println(star[i]);
		}

		System.out.println();

		
		/*** ��� B ***/
		
		String[][] starB = { { "*" }, { "*","*" }, { "*","*","*" }, { "*","*","*","*" },
				{ "*","*","*","*","*" } };

		for (int i = 0; i < starB.length; i++) {
			for (int j = 0; j < starB[i].length; j++) {
				System.out.print(starB[i][j]);
			}
			System.out.println();

		}
		System.out.println();
		
		
		/*** ��� C ***/
		
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