package com.simple.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


public class MyListener1 implements ActionListener {
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		JButton button = (JButton)e.getSource();
		button.setText("��ħ�� Ŭ���߳׿�");
		
		// JLabel label = (JLabel)e.getSource();
		// event1.label.setText("��ħ�� Ŭ���߳׿�~!");
		// ���̺� ĸ���� ����
		
	}

	
	
}
