package com.simple.oop;

public class FruitSeller {

	int numOfApple;
	int myMoney;
	final int APPLE_PRICE = 1000;

	public FruitSeller(int numOfApple, int myMoney) {
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
	}

	public int saleApple(int money) {
		int number = money / APPLE_PRICE; // »ç°ú °¹¼ö
		numOfApple -= number;
		myMoney += money;
		return number;
	}

	@Override
	public String toString() {
		return "FruitSeller [numOfApple=" + numOfApple + ", myMoney=" + myMoney + ", APPLE_PRICE=" + APPLE_PRICE + "]";
	}

}
