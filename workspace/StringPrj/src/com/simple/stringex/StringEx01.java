package com.simple.stringex;

public class StringEx01 {

	public static void main(String[] args) {

		String cc = "ȫ�浿!";
		System.out.println("�̸� : " + cc);
		System.out.println(cc.hashCode());
		
		String a = new String("ȫ�浿~");
		cc = "�̼���" + cc;
		
		System.out.println(cc.hashCode());
		System.out.println("�̸� : " + cc);
		
	}
}
