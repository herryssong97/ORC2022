package com.simple.japangi;

import java.util.Scanner;

public class VandingMachine {

	int returnCoin;

	int coin; // 입력된 돈
	int selectMenu; // 선택한 메뉴

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getCoin() {
		return coin;
	}

	public VandingMachine(int returnCoin) {
		this.returnCoin = returnCoin;
	}

	public void menuProcess(int coin, int selectMenu) {
// 커피 메뉴 처리
		int returnMoney = 0;
		String coffee = "블랙";
		String message = "";

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
			if (coin >= 250) {
				returnMoney = coin - 250;
			} else {
				returnMoney = coin;
				coffee = "";
				message = "동전이 모자랍니다.";
			}
		} else {
			coffee = "";
			returnMoney = coin;
			message = "메뉴를 다시선택하세요.";
		}

		System.out.println("커피출력 : " + coffee);
		System.out.println("잔돈 : " + returnMoney);
		System.out.println("메시지 :" + message);

	}

	public int menuSelect(Scanner input) {
		int select;

		menu();
		System.out.println("메뉴 선택[1, 2, 3]: ");

		select = input.nextInt();

		return select;
	}

	public void inputCoin(Scanner input) {

		System.out.println("동전을 입력: ");

		coin += input.nextInt();
	}

	public void menu() {
		System.out.println("1. 밀크커피: 300원");
		System.out.println("2. 프림커피: 250원");
		System.out.println("3. 블랙커피: 200원");
	}

}
