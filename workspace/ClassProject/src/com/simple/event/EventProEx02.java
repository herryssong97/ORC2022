package com.simple.event;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;

class Eventex02 extends JFrame implements ActionListener {

	// 이렇게 안으로 들어오면 직접적으로 다룰 수 있음
	JButton button1, button2, button3, button4;
	JLabel label;

	public Eventex02() {
		this.setTitle("이벤트 처리 방법1");
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		// 컴포넌트 생성 (윈도우 객체)

		// 컨테이너 추가 (패널 -> 배치를 다양화)

		JPanel panel = new JPanel();
		button1 = new JButton("+");
		button2 = new JButton("-");
		button3 = new JButton("*");
		button4 = new JButton("/");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");

		// 이벤트 리스너 등록
		button1.addActionListener(new MyListener());
		button2.addActionListener(new MyListener());
		button3.addActionListener(this);
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 곱셈버튼처리
				label.setText("나눗셈 클릭했네요~");
				
			}
		});

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);

		// 컴포넌트 등록
		this.add(panel);
		this.setVisible(true);
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				label.setText("덧셈 클릭했네요~!");
			} else if (e.getSource() == button2) {
				label.setText("뺄셈 클릭했네요~!");
			}
		}

	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button3) {
			label.setText("곱셈 클릭했네요~!");
		}

	}

}

public class EventProEx02 {

	public static void main(String[] args) {
		Eventex02 event1 = new Eventex02();

	}

}