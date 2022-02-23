package com.simple.ex01;

public class TypeCastingEx {

	public static void main(String[] args) {

		// 형변환
		// 1. 데이터의 정확한 계산
		// 2. 객체지향에서 관점을 다루게 할때

		int a = 5;
		int b = 2;

		int sum;
		double tot, tot1, tot2;

		tot1 = a / 3.0; // .을 붙이면 내부적으로 실수로 바뀜
		tot2 = a / 3;
		System.out.println(tot1);
		System.out.println(tot2); // 정수세계에서는 실수는 존재하지 않기 때문에 소수점은 없앰

		// sum = a / b;
		tot = (double) a / b; // 소수점 자리가 필요하면 (double)을 꼭 입력해줘야함
		sum = (int) tot;
		System.out.println("몫:" + sum);
		System.out.println("몫:" + tot); 

	}

}
