
package com.simple.japangi;

import java.util.Scanner;

/*
 * Ŀ�� ���Ǳ� ���α׷�
 * �ͼ� Ŀ�� �𵨸�
 * �ۼ���: ������
 * �ۼ���: 2022-02-23 * 
 * 
 */

public class VM {

public static void main(String[] args) {

VandingMachine vm = new VandingMachine(5000);

Scanner input = new Scanner(System.in);


vm.menu();
// �����Է� �ޱ�
vm.inputCoin(input);
System.out.println("���� : "+vm.getCoin());

vm.inputCoin(input);
System.out.println("���� : "+vm.getCoin());

vm.menuSelect(input);
System.out.println("������ �޴� : "+ vm.selectMenu);

vm.menuProcess(vm.coin, vm.selectMenu);
// Ű���� �ڿ�����
input.close();

}


}