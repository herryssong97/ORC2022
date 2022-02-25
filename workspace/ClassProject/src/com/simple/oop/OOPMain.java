package com.simple.oop;

public class OOPMain {

	public static void main(String[] args) {
		// 按眉 积己
		int n;
		
		FruitBuyer buyer;
		FruitSeller seller;
		
		// 荤苞 厘荐 按眉 积己
		seller = new FruitSeller(10, 5000);
		
		// 苞老 厘荐 按眉 积己
		buyer = new FruitBuyer(5000, 0);
		
		buyer.buyApple(seller, 3000);		
		System.out.println(buyer);
		System.out.println(seller);

		buyer.buyApple(seller, 3000);		
		System.out.println(buyer);
		System.out.println(seller);
		
	}

}
