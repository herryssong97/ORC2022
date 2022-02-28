package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx02 extends JFrame {

	public JComponentEx02() {

		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// ���ڿ� ���̺� ����
		JLabel textLabel = new JLabel("����մϴ�.");

		// �̹��� ���̺� ����
		ImageIcon beauty = new ImageIcon("img/beauty.jpg"); // �̹��� �ε�
		JLabel imageLabel = new JLabel(beauty); // �̹��� ���̺� ����

		// ���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("img/normalIcon.gif"); // �̹��� �ε�
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", 
			normalIcon, SwingConstants.CENTER); // ���̺� ���� SwingConstants.CENTER


		// ����Ʈ�ҿ� 3���� ���̺� ����
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);

		setSize(1000, 600);
		setVisible(true);
	}

}

public class SwingEx02 {

	public static void main(String[] args) {

		JComponentEx02 w1 = new JComponentEx02(); // ���⼭ ȣ���� ����� ȭ�鱸���� ��

	}
}