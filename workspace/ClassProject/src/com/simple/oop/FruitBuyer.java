package com.simple.oop;

public class FruitBuyer {

	int myMoney;
	int numOfApple;
	
	public FruitBuyer(int myMoney, int numOfApple) {
		this.myMoney = myMoney;		
		this.numOfApple = numOfApple;
	}
	
	
	public void buyApple(FruitSeller seller, int money) {
		myMoney -= money;
		numOfApple += seller.saleApple(money);
		
	}


	@Override
	public String toString() {
		return "FruitBuyer [myMoney=" + myMoney + ", numOfApple=" + numOfApple + "]";
	}
	
	
	
}
