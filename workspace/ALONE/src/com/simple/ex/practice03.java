package com.simple.ex;
/*[����3] �޿������� �ۼ��Ͻÿ�

  ����1) �⺻���� 1,500,000��,������ 55,000��,������ �⺻���� 10%

  ����2) �Ǽ��ɾ� = �⺻�� + �ð����� - ����



--���--

�Ǽ��ɾ� : 1405000��


*/

public class practice03 {

	public static void main(String[] args) {

		int normal = 1500000; // �⺻��
		int time = 55000;		// ����
		double tax = normal * 0.01;	// ���� = �⺻���� 10%
		// System.out.println("�⺻�� + �ð����� = " + (normal + time));
		double money ; // �Ǽ��ɾ�
		
		money = (normal + time) - tax;
		System.out.println("�Ǽ��ɾ� = " + money);
		
		
		
	}
}
