package com.simple.array;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] jumsu = new int[6]; // �迭 ����
		
		
		// �迭 �ʱ�ȭ -- �迭 ���� ����
		String[] name = {"ȫ�浿", "�̼���", "������"};
		
		int size = jumsu.length; // @@.length : �迭�� ũ��
		System.out.println("�迭 ũ�� : " +size);
		
		double avg = 0.0; // ����� ����
		int tot = 0;
		
		jumsu[0]=34;
		jumsu[1]=24;
		jumsu[2]=14;
		jumsu[3]=44;
		jumsu[4]=54;
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("�迭 ��" + name[i]);
		}
		
		for(int i = 0; i < jumsu.length; i++) {
			System.out.println("�迭 ��" + jumsu[i]);
			// ������ ���ϱ�
			tot += jumsu[i];	// tot = jumsu[]+jumsu[]+ ...		
		}
		// ��� ���ϱ�
		avg = (double)tot / jumsu.length;
		
		System.out.printf("���� : %d, ��� : %.2f", tot, avg);
	}

}
