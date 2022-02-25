package com.simple.oop;

public class OOPMain {

	public static void main(String[] args) {
		// ��ü ����
		int n;
		
		FruitBuyer buyer;
		FruitSeller seller;
		
		// ��� ��� ��ü ����
		seller = new FruitSeller(10, 5000);
		
		// ���� ��� ��ü ����
		buyer = new FruitBuyer(5000, 0);
		
		buyer.buyApple(seller, 3000);		
		System.out.println(buyer);
		System.out.println(seller);

		buyer.buyApple(seller, 3000);		
		System.out.println(buyer);
		System.out.println(seller);
		
	}

}
