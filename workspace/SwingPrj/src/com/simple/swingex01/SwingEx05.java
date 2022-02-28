package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx05 extends JFrame {
	
	public JComponentEx05() {
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		// �̹��� ������ư�� ����� ���� 2���� �̹��� ��ü ����
		ImageIcon cherryIcon = new ImageIcon("img/cherry.jpg"); // ���� ���¸� ���´� �̹���
		ImageIcon selectedCherryIcon = new ImageIcon("img/selectedCherry.jpg"); // ���� ���¸� ��Ÿ���� �̹���
		
		// ��ư �׷� ��ü ����
		// �̰� �ؿ��� ȣ������� ��ư�� ���γ�� !!!!!!!
		ButtonGroup g = new ButtonGroup();
		ButtonGroup g1 = new ButtonGroup();
		
		// ������ư 3�� ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon); // �̹��� ������ư
		
		// ��ȣ�ϴ� Ŀ���� ������ �����Ͻÿ�.
		JRadioButton milk = new JRadioButton("��ũĿ��");
		JRadioButton cream = new JRadioButton("ũ��Ŀ��");
		JRadioButton black = new JRadioButton("��Ŀ��"); // �̹��� ������ư
		
		
		
		
		
		cherry.setBorderPainted(true); // �̹��� ������ư�� �ܰ��� ���
		cherry.setSelectedIcon(selectedCherryIcon); // ���� ���� �̹��� ���
		
		// ��ư �׷쿡 3���� ������ư ����
		// �̰� ���⼭ ȣ������� ��ư�� ���γ�� !!!!!!!
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		g1.add(milk);
		g1.add(cream);
		g1.add(black);

		
		// ����Ʈ�ҿ� 3���� ������ư ����
		// panel1 / panel2 ������ ������ ũ�⿡ ���� �г� ������ ��� �ö󰡰� ������
		panel1.add(apple);
		panel1.add(pear);
		panel1.add(cherry);

		panel2.add(milk);
		panel2.add(cream);
		panel2.add(black);
		
		c.add(panel1);
		c.add(panel2);	
		
		setResizable(false); // ������ ������ ����
		setSize(350,200);
		setVisible(true);
		
	}

	}

public class SwingEx05 {

	public static void main(String[] args) {

		JComponentEx05 w1 = new JComponentEx05(); // ���⼭ ȣ���� ����� ȭ�鱸���� ��

	}
}