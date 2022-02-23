package com.simple.classex;

public class Calculator {

	// ¸â¹ö (¼Ó¼º, µ¥ÀÌÅÍ)
	int num1, num2, result = 0;
	double mok;

	public void showResult(String msg) {
		
		if (msg.equals("¸ò : "))
			System.out.println(msg + mok);
		else
			System.out.println(msg + result);
	}

	// µ¡¼À ¸Þ¼­µå (±â´É)
	public int add(int num1, int num2) {
		result = num1 + num2;
		// System.out.println("ÇÕ : " + result);
		showResult("ÇÕ : ");
		return result;
	}

	// »¬¼À ¸Þ¼­µå (±â´É)
	public int sub(int num1, int num2) {
		result = num1 - num2;
		// System.out.println("Â÷ : " + result);
		showResult("Â÷ : ");
		return result;
	}

	// °ö¼À ¸Þ¼­µå (±â´É)
	public int mul(int num1, int num2) {
		result = num1 * num2;
		// System.out.println("°ö : " + result);
		showResult("°ö : ");
		return result;
	}

	// ³ª´°¼À ¸Þ¼­µå (±â´É) ³ª´«¼ÀÀº ¼Ò¼öÁ¡±îÁö ³ª¿Í¾ß ÇÏ¹Ç·Î ´õºí!
	public double div(int num1, int num2) {
		mok = 0.0;

		if (num2 != 0) // ²À ÇØÁà¾ßÇÔ
			mok = (double)num1 / num2; // °ýÈ£ ¼Ó ´õºíÀº Çüº¯È¯
		else
			System.out.println("0À¸·Î ³ª´°¼À ºÒ°¡");

		showResult("¸ò : ");
		// System.out.println("¸ò : " + mok);
		return mok;
	}

	// Á¦°ö ¸Þ¼­µå (±â´É)
	public int square(int num1) {
		result = num1 * num1;
		// System.out.println("Á¦°ö : " + num1);
		showResult("Á¦°ö : ");
		return result;
	}

}
