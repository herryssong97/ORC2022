package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx07 extends JFrame {
	private String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry",
			"blackberry" };
	private String[] names = { "a", "b", "c", "d","e", "kitae", "jaemoon", "hyosoo", "namyun" };

	public JComponentEx07() {
		setTitle("�޺��ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JComboBox<String> strCombo = new JComboBox<String>(fruits); // ���ڿ� �޺��ڽ� ����
		c.add(strCombo); // ũ�⿡ ���� �ڵ����� ��ũ���� ����

		JComboBox<String> nameCombo = new JComboBox<String>(); // �޺��ڽ� ����
		for (int i = 0; i < names.length; i++)
			nameCombo.addItem(names[i]); // �޺��ڽ��� ���ڿ� ������ ����

		c.add(nameCombo);
		setSize(300, 300);
		setVisible(true);
	}

}

public class SwingEx07 {

	public static void main(String[] args) {

		JComponentEx07 w1 = new JComponentEx07(); // ���⼭ ȣ���� ����� ȭ�鱸���� ��

	}
}