package com.simple.ex;
/*[문제6] 다음을 입력받아 계산하시오 2022-03-11

        (삼각형넓이 = (밑변 * 높이)/2)  



--입력--

**** 삼각형의 넓이 구하기  ****

밑변 :  10  

높이 :   3


--출력--

넓이 :   XX.XX  <--- 소수 2자리까지출력하시오

*/

public class practice06 {

	public static void main(String[] args) {
		
		double tri;
		int length = 10;
		int height = 3;
		
		tri = (length*height)/2;
		System.out.printf("넓이 : " + "%.2f", tri);
		
		
		
		
	}
}
