package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx03 extends JFrame {

	public JComponentEx03() {

		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// �̹��� üũ�ڽ��� ����� 2���� �̹��� ��ü ����
		ImageIcon cherryIcon = new ImageIcon("img/cherry.jpg"); // ���� ���� �̹���
		ImageIcon selectedCherryIcon = new ImageIcon("img/selectedCherry.jpg"); // ���� ���� �̹���
		ImageIcon carIcon = new ImageIcon("img/car.gif"); // ���� ���� �̹���
		ImageIcon selectedCarIcon = new ImageIcon("img/car1.gif"); // ���� ���� �̹���

		// 3���� üũ�ڽ� ����
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true); // üũ�� �Ǿ� �ִ°��� true
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		JCheckBox car = new JCheckBox("�ڵ���", carIcon);

		cherry.setBorderPainted(true); // üũ�ڽ� �ܰ����� ���̵��� ����
		cherry.setSelectedIcon(selectedCherryIcon); // ���� ���� �̹��� ���
		car.setBorderPainted(true); // üũ�ڽ� �ܰ����� ���̵��� ����
		car.setSelectedIcon(selectedCarIcon); // ���� ���� �̹��� ���

		// ����Ʈ�ҿ� 3���� üũ�ڽ� ����
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		c.add(car);

		setSize(450, 150);
		setVisible(true);
	}

}

public class SwingEx03 {

	public static void main(String[] args) {

		JComponentEx03 w1 = new JComponentEx03(); // ���⼭ ȣ���� ����� ȭ�鱸���� ��

	}
}