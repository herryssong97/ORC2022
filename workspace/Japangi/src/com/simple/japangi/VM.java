
package com.simple.japangi;

import java.util.Scanner;

/*
 * 커피 자판기 프로그램
 * 믹서 커피 모델링
 * 작성자: 송혜리
 * 작성일: 2022-02-23 * 
 * 
 */

public class VM {

public static void main(String[] args) {

VandingMachine vm = new VandingMachine(5000);

Scanner input = new Scanner(System.in);


vm.menu();
// 동전입력 받기
vm.inputCoin(input);
System.out.println("동전 : "+vm.getCoin());

vm.inputCoin(input);
System.out.println("동전 : "+vm.getCoin());

vm.menuSelect(input);
System.out.println("선택한 메뉴 : "+ vm.selectMenu);

vm.menuProcess(vm.coin, vm.selectMenu);
// 키보드 자원해제
input.close();

}


}