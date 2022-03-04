package com.simple.ex;

public class ExceptionEx {

	public static void main(String[] args) {

		int[] array = new int[10];
		int result = 100;
		int a = 100;
		int b = 10;
		int c = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		try {
			result = array[10];
			c = a / b;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열 크기를 벗어났습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요.");
		} catch (Exception e) {
			System.out.println("예외 발생되었네요.");
		}finally { // close하는 것
			System.out.println("사용된 자원을 해제합니다.");
		}
		System.out.println("값은 " + result);
	}

}
