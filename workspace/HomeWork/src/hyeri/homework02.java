package hyeri;

import java.util.Scanner;

public class homework02 {
		// 선생님이랑
	public static void main(String[] args) {

		/*
		 * 커피 자판기 메뉴 선택 및 처리
		 * 
		 * 1. 밀크커피 : 300원 milk 2. 프림커피 : 200원 prim 3. 블랙커피 : 250원 black
		 * 
		 * 1. 돈은 입력 받는다. 2. 메뉴를 선택한다. (1, 2, 3 중에서) 3. 메뉴에 해당하는 처리를 수행한다. 4. 만약에 돈이 모자라면
		 * "돈이 모자랍니다." 5. 만약 돈이 남으면 잔돈 출력한다.
		 * 
		 */

		int milk = 300;
		int prim = 200;
		int black = 250;
		int menu;
		String manual = "를 선택하셨습니다. 입금 금액을 숫자로만 입력해주세요.";
		int money; // 입금금액

		///////////////////////////////////////////////////////////

		// 키보드 객체 생성
		Scanner kbd = new Scanner(System.in);

		// 입력 데이터 맞는 변수 준비해서 데이터를 받음
		System.out.println("메뉴를 선택하세요. \n 1 : 밀크커피(300원) 2 : 프림커피(200원) 3 : 블랙커피(250원)\n번호만 입력해주세요.");
		menu = kbd.nextInt(); // => 숫자만

		///////////////////////////////////////////////////////////

		// 커피 선택 시 출력글자
		if (menu == 1) {
			System.out.println("밀크커피" + manual);
		} else if (menu == 2) {
			System.out.println("프림커피" + manual);
		} else {
			System.out.println("블랙커피" + manual);
		}

		///////////////////////////////////////////////////////////

		// 금액 입력
		money = kbd.nextInt(); // => 숫자만

		if (menu > money) {
			System.out.println("금액이 모자랍니다.");
			if (menu == 1) {
				menu = milk;
			}
			if (menu == 2) {
				menu = prim;
			}
			if (menu == 3) {
				menu = black;
			}
		}System.out.println(money - menu + "원을 받으십시오.");
		
	
		

		}

		}
