package com.simple.stringex;

public class StringEx01 {

	public static void main(String[] args) {

		String cc = "홍길동!";
		System.out.println("이름 : " + cc);
		System.out.println(cc.hashCode());
		
		String a = new String("홍길동~");
		cc = "이순신" + cc;
		
		System.out.println(cc.hashCode());
		System.out.println("이름 : " + cc);
		
	}
}
