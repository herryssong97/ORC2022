package com.simple.event;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;

class Eventex02 extends JFrame implements ActionListener {

	// �̷��� ������ ������ ���������� �ٷ� �� ����
	JButton button1, button2, button3, button4;
	JLabel label;

	public Eventex02() {
		this.setTitle("�̺�Ʈ ó�� ���1");
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		// ������Ʈ ���� (������ ��ü)

		// �����̳� �߰� (�г� -> ��ġ�� �پ�ȭ)

		JPanel panel = new JPanel();
		button1 = new JButton("+");
		button2 = new JButton("-");
		button3 = new JButton("*");
		button4 = new JButton("/");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");

		// �̺�Ʈ ������ ���
		button1.addActionListener(new MyListener());
		button2.addActionListener(new MyListener());
		button3.addActionListener(this);
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ������ưó��
				label.setText("������ Ŭ���߳׿�~");
				
			}
		});

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);

		// ������Ʈ ���
		this.add(panel);
		this.setVisible(true);
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				label.setText("���� Ŭ���߳׿�~!");
			} else if (e.getSource() == button2) {
				label.setText("���� Ŭ���߳׿�~!");
			}
		}

	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button3) {
			label.setText("���� Ŭ���߳׿�~!");
		}

	}

}

public class EventProEx02 {

	public static void main(String[] args) {
		Eventex02 event1 = new Eventex02();

	}

}