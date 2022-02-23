package com.simple.array;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] jumsu = new int[6]; // 배열 선언
		
		
		// 배열 초기화 -- 배열 값을 설정
		String[] name = {"홍길동", "이순신", "유관순"};
		
		int size = jumsu.length; // @@.length : 배열의 크기
		System.out.println("배열 크기 : " +size);
		
		double avg = 0.0; // 평균을 저장
		int tot = 0;
		
		jumsu[0]=34;
		jumsu[1]=24;
		jumsu[2]=14;
		jumsu[3]=44;
		jumsu[4]=54;
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("배열 값" + name[i]);
		}
		
		for(int i = 0; i < jumsu.length; i++) {
			System.out.println("배열 값" + jumsu[i]);
			// 총합을 구하기
			tot += jumsu[i];	// tot = jumsu[]+jumsu[]+ ...		
		}
		// 평균 구하기
		avg = (double)tot / jumsu.length;
		
		System.out.printf("총점 : %d, 평균 : %.2f", tot, avg);
	}

}
