package hyeri;

import java.util.Scanner;

public class homework {
		// 혼자
	public static void main(String[] args) {

		int menu = 0;
		int coin = 0; // 커피가격
		int money = 0; // 입금금액
		String choice = "를 선택하셨습니다.";


		///////////////////////////////////////////////////////////

		Scanner kbd = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요. \n 1 : 밀크커피(300원) 2 : 프림커피(200원) 3 : 블랙커피(250원)\n번호를 입력해 주문해주세요.");
		menu = kbd.nextInt(); // => 숫자만

		///////////////////////////////////////////////////////////

		if (menu==1) {
		System.out.println("밀크커피" + choice);
		coin = 300;
		}else if(menu==2) {
		System.out.println("프림커피" + choice);
		coin = 200;
		}else {
		System.out.println("블랙커피" + choice);
		coin = 250;
		}

		///////////////////////////////////////////////////////////

		System.out.println("입금금액을 입력해주세요.");
		money = kbd.nextInt(); // => 숫자만

		///////////////////////////////////////////////////////////

		// price가 money보다 클때
		if(coin>money) {
		System.out.println("금액이 부족합니다.");
		}else {
		System.out.println("커피를 받으세요.\n잔돈 : " + (money-coin) + "원 입니다.");
		}
		

		}

		}
