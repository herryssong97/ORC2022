package com.simple.event;

import java.awt.Button;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.simple.GUI.MyListener1;

import javax.swing.JLabel;

class Eventex01 extends JFrame {
	
	// �̷��� ������ ������ ���������� �ٷ� �� ����
	JButton button;
	JLabel label;

	public Eventex01() {
		this.setTitle("�̺�Ʈ ó�� ���1");
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		// ������Ʈ ���� (������ ��ü)
		
		// �����̳� �߰� (�г� -> ��ġ�� �پ�ȭ)
		
		JPanel panel = new JPanel();
		button = new JButton("��ư Ŭ��");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		// �̺�Ʈ ������ ���
		button.addActionListener(new MyListener1());
		
		
		panel.add(button);
		panel.add(label);
			
		
		// ������Ʈ ���
		this.add(panel);		
		this.setVisible(true);

	}

}

public class EventProEx01 {

	public static void main(String[] args) {
		Eventex01 event1 = new Eventex01();
		
	}

}
