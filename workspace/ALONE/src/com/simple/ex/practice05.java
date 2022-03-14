package com.simple.ex;
/*[문제5] 다음을 입력받아 계산하시오 2022-03-10
 * 
--입력--

Input name : 민들래

kor : 90 

eng : 70 

mat : 75

--출력--

이름 : 민들래

합계점수 : 235점

평균점수 :  78.3   <-- 소수 1자리까지출력하시오

*/

public class practice05 {

	public static void main(String[] args) {
		
		
		
		String name = "민들레";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		int sum;
		double avg;
		
		sum = kor + eng + mat;
		avg = sum/3;
		
		
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + sum);
		System.out.printf(String.format("평균점수 : "+"%.1f", avg));
		
		
		
		
	}
}
