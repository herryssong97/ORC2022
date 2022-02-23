package com.simple.classex;

public class CalculatorTest {

	public static void main(String[] args) {

		// °´Ã¼»ý¼º (°è»ê±â)
		Calculator calc1 = new Calculator();

		// °´Ã¼ »ç¿ë (µ¡¼À)
		int sum = calc1.add(5, 3);
		// System.out.println("ÇÕ :" + sum);

		// °´Ã¼ »ç¿ë (»¬¼À)
		sum = calc1.sub(10, 5);
		// System.out.println("Â÷ :" + sum);

		// °´Ã¼ »ç¿ë (°ö¼À)
		sum = calc1.mul(7, 3);
		// System.out.println("°ö :" + sum);

		// °´Ã¼ »ç¿ë (³ª´°¼À)
		double mok = calc1.div(33, 6);
		// System.out.println("¸ò :" + mok);
		
		// °´Ã¼ »ç¿ë (Á¦°ö)
		sum = calc1.square(2);
		// System.out.println("Á¦°ö :" + sum);

	}
}
