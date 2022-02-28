package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx04 extends JFrame {

	private JCheckBox[] fruits = new JCheckBox[4]; // üũ�ڽ� �迭 [3]���� ��ڴ�. (üũ�ڽ���ü, üũ�ڽ���ü�� �迭)
	// ��ü ������ �ƴ�, �迭�� ũ�⸦ ���ϴ� ��, ������ ũ�⸦ ������ �ְ� ����ؾ���
	private String[] names = { "���", "��", "ü��", "������" }; // üũ�ڽ� ���ڿ��� ����� ���ڿ� �迭
	private JLabel sumLabel; // ��� ���� ����� ���̺�

	String name = "";

	public JComponentEx04() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��, ������ 5000��"));

		// 3���� üũ�ڽ��� ����. ����Ʈ�ҿ� �����ϰ� Item ������ ���
		MyItemListener listener = new MyItemListener();
		// MyItemListener ��� Ŭ������ listener ��� ��ü�� ����
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); // names[]�� ���ڿ��� üũ�ڽ� ����
			fruits[i].setBorderPainted(true); // üũ�ڽ� �ܰ��� ���̵��� ����
			c.add(fruits[i]); // ����Ʈ�ҿ� üũ�ڽ� ����
			fruits[i].addItemListener(listener); // üũ�ڽ��� Item ������ ���
		}

		sumLabel = new JLabel("���� 0 �� �Դϴ�."); // ���� ���� ����ϴ� ���̺� ����
		c.add(sumLabel);

		setSize(550, 200);
		setVisible(true);
	}

	// Item ������ ����
	class MyItemListener implements ItemListener {
		private int sum = 0; // ������ ��

		// üũ�ڽ��� ���� ���°� ���ϸ� itemStateChanged()�� ȣ���
		public void itemStateChanged(ItemEvent e) {

			// String name = "";

			if (e.getStateChange() == ItemEvent.SELECTED) { // üũ�ڽ��� ������ ���
				if (e.getItem() == fruits[0]) // ��� üũ�ڽ�
				{
					name += "���";
					sum += 100;
				} else if (e.getItem() == fruits[1]) // �� üũ�ڽ�
				{
					name += "��";
					sum += 500;
				} else if (e.getItem() == fruits[2])// ü�� üũ�ڽ�
				{
					name += "ü��";
					sum += 20000;
				} else {
					name += "������";
					sum += 5000; // ������ üũ�ڽ�
				}
			} else { // üũ�ڽ��� ������ ���
				if (e.getItem() == fruits[0]) // ��� üũ�ڽ�
				{
					sum -= 100;
				} else if (e.getItem() == fruits[1]) // �� üũ�ڽ�
				{
					sum -= 500;
				} else if (e.getItem() == fruits[2])// ü�� üũ�ڽ�
				{
					sum -= 20000;
				} else {
					sum -= 5000;
				}
			}
			sumLabel.setText("���� " + name + ":" + sum + "�� �Դϴ�."); // �� ���
		}

	}
}

public class SwingEx04 {

	public static void main(String[] args) {

		JComponentEx04 w1 = new JComponentEx04(); // ���⼭ ȣ���� ����� ȭ�鱸���� ��

	}
}