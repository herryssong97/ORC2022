package com.simple.ex;
/*[����5] ������ �Է¹޾� ����Ͻÿ� 2022-03-10
 * 
--�Է�--

Input name : �ε鷡

kor : 90 

eng : 70 

mat : 75

--���--

�̸� : �ε鷡

�հ����� : 235��

������� :  78.3   <-- �Ҽ� 1�ڸ���������Ͻÿ�

*/

public class practice05 {

	public static void main(String[] args) {
		
		
		
		String name = "�ε鷹";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		int sum;
		double avg;
		
		sum = kor + eng + mat;
		avg = sum/3;
		
		
		System.out.println("�̸� : " + name);
		System.out.println("�հ����� : " + sum);
		System.out.printf(String.format("������� : "+"%.1f", avg));
		
		
		
		
	}
}
