package com.simple.ex;
/*[문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오.

money = 65430원

만원 = 6

천원 = 5

백원 = 4

십원 = 3


*/

public class practice02 {

	public static void main(String[] args) {

		String money = "65430";
		char man = money.charAt(0);
		char mill = money.charAt(1);
		char hund = money.charAt(2);
		char ten = money.charAt(3);
		
		System.out.println("65430원을 만들기 위한 화폐의 갯수를 구하시오.");
		System.out.println("만원 ="+man+" 장");
		System.out.println("천원 ="+mill+" 장");
		System.out.println("백원 ="+hund+" 장");
		System.out.println("십원 ="+ten+" 장");
		
		
	}
}
