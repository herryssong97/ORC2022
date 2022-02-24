package com.simple.JPclass;

import java.util.Scanner;

public class Japangi {


	
	//public int menu;// = 0; // 번호
	public int coin;// = 0; // 커피가격
	public int money;// = 0; // 입금금액
	public String choice = "를 선택하셨습니다.";
	
	public Japangi() {
		
	}
	
	////////////////////////////////////////////////////
	

	Scanner kbd = new Scanner(System.in);
	// System.out.println("메뉴를 선택하세요. \n 1 : 밀크커피(300원) 2 : 프림커피(200원) 3 : 블랙커피(250원)\n번호를 입력해 주문해주세요.");
	public int menu = kbd.nextInt(); // => 숫자만
	
	
	
	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		
		if (menu==1) {
		System.out.println("밀크커피" + choice);
		coin = 300;
		}else if(menu==2) {
		System.out.println("프림커피" + choice);
		coin = 200;
		}else if(menu==3) {
		System.out.println("블랙커피" + choice);
		coin = 250;
		}else if(3<menu && 1>menu){
			System.out.println("1~3 사이의 숫자를 입력해주세요.");
		}
		
		this.menu = menu;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getMoney() {
		
		
		return money;
	}

	public void setMoney(int money) {

		if(coin>money) {
		System.out.println("금액이 부족합니다.");
		}else {
		System.out.println("커피를 받으세요.\n잔돈 : " + (money-coin) + "원 입니다.");
		}
		
		this.money = money;
	}

	

	
	
	
	
	
	
	
	
}
