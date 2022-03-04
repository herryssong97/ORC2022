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
			System.out.println("�迭 ũ�⸦ ������ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����.");
		} catch (Exception e) {
			System.out.println("���� �߻��Ǿ��׿�.");
		}finally { // close�ϴ� ��
			System.out.println("���� �ڿ��� �����մϴ�.");
		}
		System.out.println("���� " + result);
	}

}
