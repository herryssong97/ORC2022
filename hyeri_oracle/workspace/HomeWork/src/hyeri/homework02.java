package hyeri;

import java.util.Scanner;

public class homework02 {
		// �������̶�
	public static void main(String[] args) {

		/*
		 * Ŀ�� ���Ǳ� �޴� ���� �� ó��
		 * 
		 * 1. ��ũĿ�� : 300�� milk 2. ����Ŀ�� : 200�� prim 3. ��Ŀ�� : 250�� black
		 * 
		 * 1. ���� �Է� �޴´�. 2. �޴��� �����Ѵ�. (1, 2, 3 �߿���) 3. �޴��� �ش��ϴ� ó���� �����Ѵ�. 4. ���࿡ ���� ���ڶ��
		 * "���� ���ڶ��ϴ�." 5. ���� ���� ������ �ܵ� ����Ѵ�.
		 * 
		 */

		int milk = 300;
		int prim = 200;
		int black = 250;
		int menu;
		String manual = "�� �����ϼ̽��ϴ�. �Ա� �ݾ��� ���ڷθ� �Է����ּ���.";
		int money; // �Աݱݾ�

		///////////////////////////////////////////////////////////

		// Ű���� ��ü ����
		Scanner kbd = new Scanner(System.in);

		// �Է� ������ �´� ���� �غ��ؼ� �����͸� ����
		System.out.println("�޴��� �����ϼ���. \n 1 : ��ũĿ��(300��) 2 : ����Ŀ��(200��) 3 : ��Ŀ��(250��)\n��ȣ�� �Է����ּ���.");
		menu = kbd.nextInt(); // => ���ڸ�

		///////////////////////////////////////////////////////////

		// Ŀ�� ���� �� ��±���
		if (menu == 1) {
			System.out.println("��ũĿ��" + manual);
		} else if (menu == 2) {
			System.out.println("����Ŀ��" + manual);
		} else {
			System.out.println("��Ŀ��" + manual);
		}

		///////////////////////////////////////////////////////////

		// �ݾ� �Է�
		money = kbd.nextInt(); // => ���ڸ�

		if (menu > money) {
			System.out.println("�ݾ��� ���ڶ��ϴ�.");
			if (menu == 1) {
				menu = milk;
			}
			if (menu == 2) {
				menu = prim;
			}
			if (menu == 3) {
				menu = black;
			}
		}System.out.println(money - menu + "���� �����ʽÿ�.");
		
	
		

		}

		}
