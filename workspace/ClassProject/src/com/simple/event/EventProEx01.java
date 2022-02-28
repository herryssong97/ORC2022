package com.simple.event;

import java.awt.Button;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.simple.GUI.MyListener1;

import javax.swing.JLabel;

class Eventex01 extends JFrame {
	
	// 이렇게 안으로 들어오면 직접적으로 다룰 수 있음
	JButton button;
	JLabel label;

	public Eventex01() {
		this.setTitle("이벤트 처리 방법1");
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		// 컴포넌트 생성 (윈도우 객체)
		
		// 컨테이너 추가 (패널 -> 배치를 다양화)
		
		JPanel panel = new JPanel();
		button = new JButton("버튼 클릭");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		// 이벤트 리스너 등록
		button.addActionListener(new MyListener1());
		
		
		panel.add(button);
		panel.add(label);
			
		
		// 컴포넌트 등록
		this.add(panel);		
		this.setVisible(true);

	}

}

public class EventProEx01 {

	public static void main(String[] args) {
		Eventex01 event1 = new Eventex01();
		
	}

}
