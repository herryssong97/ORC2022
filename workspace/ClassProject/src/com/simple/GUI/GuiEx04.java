package com.simple.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// 별도의 클래스 만들어주기
class Calculator2 extends JFrame implements ActionListener{

	// 컴포넌트 생성
	// 2개의 값을 입력 받는 컴포넌트
	JTextField text1 = new JTextField(10);
	
	JTextField text2 = new JTextField(10);
	JTextField text3 = new JTextField(10);
	JTextField text4 = new JTextField(10);
	JTextField text5 = new JTextField(10);
	JTextField text6 = new JTextField(10);
//	JTextField text2 = new JTextField(10);
//	JTextField sum = new JTextField(10);

	JButton btn = new JButton("계산");
	
	public Calculator2() {
		
		this.setTitle("급여 수령액");
		FlowLayout lay1 = new FlowLayout();

		this.setLayout(lay1); // 사용자 레이아웃
		
		JTextField text = new JTextField("", SwingConstants.CENTER);
		

		// text1.setText();
		// text2.setText();

		// 이벤트 처리
		// 이벤트 감지 -> 이벤트 리스너 등록
		
		btn.addActionListener(this);

		
	

		// System.out.println("=>" + total);

		// btn3.setBounds(x, y, width, height);
		// btn1.setBounds(130, 100, 100, 40);

		// 컴포넌트를 컨테이너에 삽입
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(text4);
		this.add(text5);
		this.add(text6);
		this.add(btn);
		this.setSize(150, 500);
		this.setVisible(true);

	}
	
	// override
	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		
	}
	

}

public class GuiEx04 {

	public static void main(String[] args) {
		new Calculator2();
	}

}
