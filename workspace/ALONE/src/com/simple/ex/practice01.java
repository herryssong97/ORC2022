package com.simple.ex;
/*[문제1]

String a = "100";

String b = "200";

a 와  b의 값을 형변환해서 두수의 곱을 구하시오



--출력--

100 * 200 = 20000 

*/

public class practice01 {

	public static void main(String[] args) {

		String a = "100";
		int A = Integer.parseInt(a);
		String b = "200";
		int B = Integer.parseInt(b);
		
		System.out.println(A+"*"+B+"="+A*B);
		
	}
}
