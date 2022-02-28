package com.simple.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GuiEx01 {

	public static void main(String[] args) {
		JFrame f = new JFrame("�� �ű��� ��������");
		FlowLayout lay1 = new FlowLayout();

		f.setLayout(lay1); // ����� ���̾ƿ�

		// ������Ʈ ����
		// 2���� ���� �Է� �޴� ������Ʈ
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextField sum = new JTextField(10);

		JButton btn1 = new JButton("����");

		// text1.setText();
		// text2.setText();

		// �̺�Ʈ ó��
		// �̺�Ʈ ���� -> �̺�Ʈ ������ ���
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//
				String num1 = text1.getText();
				String num2 = text2.getText();

				int total = Integer.parseInt(num1) + Integer.parseInt(num2);

				sum.setText(String.valueOf(total));

			}
		});


		// btn3.setBounds(x, y, width, height);
		// btn1.setBounds(130, 100, 100, 40);

		// ������Ʈ�� �����̳ʿ� ����
		f.add(text1);
		f.add(text2);
		f.add(btn1);
		f.add(sum);
		f.setSize(100, 500);
		f.setVisible(true);

	}

}
