package com.simple.stringex;

public class StringEx02 {

	public static void main(String[] args) {

		String id = "herryssong";
		System.out.println("이름 : " + id.length());

		if (id.length() < 10) {
			System.out.println("아이디는 10자 이상으로 생성 가능합니다.");
		} else {
			System.out.println("아이디로 사용 가능합니다.");
		}

	}
}
