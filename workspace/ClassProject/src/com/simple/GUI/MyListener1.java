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
		button.setText("마침내 클릭했네요");
		
		// JLabel label = (JLabel)e.getSource();
		// event1.label.setText("마침내 클릭했네요~!");
		// 레이블 캡션을 변경
		
	}

	
	
}
