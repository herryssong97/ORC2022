package com.simple.collection;

import java.util.ArrayList;

public class CollectionEx {

	public static void main(String[] args) {
		
		// ArrayList ���� �迭 : ũ�Ⱑ ������
		// list�� ������� ������ش�.
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ٳ���"); // add, apend, insert
		list.add("���θӽ�Ĺ");
		list.add("������");
		System.out.println(list);
		list.add("12345");
		System.out.println(list);
		
		// 0,��"" �տ� ���̸� �� �����ϰ� �� ������ ����.
		list.add(0,"����"); 
		System.out.println(list);
		
		// ����Ʈ�� ������ ���ڷ� ���
		System.out.println(list.size());
		
		System.out.println(list.get(2)); //0���� ���������� 0, 1, 2 �ڸ��� list ȣ��
		
		// ����
		//list.set(index, element) // �ε����� �׻� ����, ���������� ������ ��
		list.set(2, "����"); // 2 �ڸ��� ������ ����
		System.out.println(list);
		
		// ����
		//list.remove(index)
		list.remove(2); // 2 �ڸ��� ����
		System.out.println(list);
		System.out.println(list.size());
		
		// ��ȸ(�˻�)
		for(String i : list) {
			System.out.println(i + ", ");
			if(i.equals("������")) {
				System.out.println("������ ����");
				break;
			}
		}
		// �߰�(����), ����, ��ȸ(�˻�), ����
		
		System.out.println(list.contains("�ٳ���"));
		// "@@"�� ������ true, ������ false
		
		
		
		
		
		
	}
	
}
