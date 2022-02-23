package com.simple.japangi;

import java.util.Scanner;

/*
 * 
 * 커피 자판기 프로그램
 * 믹서커피모델링
 * 작성자 : 송혜리
 * 작성일 : 2022-02-23 
 * 
 */
public class japangi {

	public static void main(String[] args) {
		int coin; // 입력된 돈
		int selectMenu; // 선택한 메뉴

		Scanner input = new Scanner(System.in);

		menu();
		// 동전입력 받기
		coin = inputCoin(input);
		System.out.println("동전 : " + coin);

		selectMenu = menuSelect(input);
		System.out.println("선택한 메뉴 : " + selectMenu);

		menuProcess(coin, selectMenu);
		// 키보드 자원해제
		input.close();
	}

	private static void menuProcess(int coin, int selectMenu) {
		// 커피 처리 메뉴
		int returnMoney = 0;
		String coffee = "블랙";
		String message = "커피를 받아주세요.";

		if (selectMenu == 1) {
			if (coin >= 300) {
				returnMoney = coin - 300;
				coffee = "밀크";
			} else {
				returnMoney = coin;
				coffee = "";
				message = "동전이 모자랍니다.";
			}

		} else if (selectMenu == 2) {
			if (coin >= 250) {
				returnMoney = coin - 250;
				coffee = "프림";
			} else {
				returnMoney = coin;
				coffee = "";
				message = "동전이 모자랍니다.";
			}

		} else if (selectMenu == 3) {
			if (coin >= 200) {
				returnMoney = coin - 200;
			} else {
				returnMoney = coin;
				coffee = "";
				message = "동전이 모자랍니다.";
			}
		} else {
			coffee = "";
			returnMoney = coin;
			message = "다시 선택해주세요.";
		}

		System.out.println("커피출력 : " + coffee);
		System.out.println("잔돈 : " + returnMoney);
		System.out.println("메시지 : " + message);
	}

	private static int menuSelect(Scanner input) {
		int select;

		menu();
		System.out.println("메뉴 선택[1, 2, 3] : ");

		select = input.nextInt();

		return select;
	}

	private static int inputCoin(Scanner input) {
		int coin;
		System.out.println("동전을 입력 : ");

		coin = input.nextInt();

		return coin;
	}

	// 동전 입력을 위한 메서드
	private static int inputCoin() {
		int coin;
		Scanner input = new Scanner(System.in);
		System.out.println("동전을 입력 : ");

		coin = input.nextInt();

		return coin;
	}

	private static void menu() {
		System.out.println("1. 밀크커피 : 300원");
		System.out.println("2. 프림커피 : 250원");
		System.out.println("3. 블랙커피 : 200원");
	}

}
