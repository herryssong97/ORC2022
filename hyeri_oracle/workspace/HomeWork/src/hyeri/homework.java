package hyeri;

import java.util.Scanner;

public class homework {
		// ȥ��
	public static void main(String[] args) {

		int menu = 0;
		int coin = 0; // Ŀ�ǰ���
		int money = 0; // �Աݱݾ�
		String choice = "�� �����ϼ̽��ϴ�.";


		///////////////////////////////////////////////////////////

		Scanner kbd = new Scanner(System.in);
		System.out.println("�޴��� �����ϼ���. \n 1 : ��ũĿ��(300��) 2 : ����Ŀ��(200��) 3 : ��Ŀ��(250��)\n��ȣ�� �Է��� �ֹ����ּ���.");
		menu = kbd.nextInt(); // => ���ڸ�

		///////////////////////////////////////////////////////////

		if (menu==1) {
		System.out.println("��ũĿ��" + choice);
		coin = 300;
		}else if(menu==2) {
		System.out.println("����Ŀ��" + choice);
		coin = 200;
		}else {
		System.out.println("��Ŀ��" + choice);
		coin = 250;
		}

		///////////////////////////////////////////////////////////

		System.out.println("�Աݱݾ��� �Է����ּ���.");
		money = kbd.nextInt(); // => ���ڸ�

		///////////////////////////////////////////////////////////

		// price�� money���� Ŭ��
		if(coin>money) {
		System.out.println("�ݾ��� �����մϴ�.");
		}else {
		System.out.println("Ŀ�Ǹ� ��������.\n�ܵ� : " + (money-coin) + "�� �Դϴ�.");
		}
		

		}

		}
