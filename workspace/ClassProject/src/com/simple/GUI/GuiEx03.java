package com.simple.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 별도의 클래스 만들어주기
class Calculator extends JFrame {
	// =JFrame f = new JFrame("오 개신기해 ㅋㅋㅋㅋ");
	// Calculator 이름의 윈도우가 하나 만들어 진 것

	// 컴포넌트 생성
	// 2개의 값을 입력 받는 컴포넌트
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JTextField sum = new JTextField(10);

	JButton btnAdd = new JButton("+");
	JButton btnSub = new JButton("-");
	JButton btnMul = new JButton("*");
	JButton btnDiv = new JButton("/");

	public Calculator() {
		//
		this.setTitle("오 개신기해 ㅋㅋㅋㅋ");
		FlowLayout lay1 = new FlowLayout();

		this.setLayout(lay1); // 사용자 레이아웃

		// text1.setText();
		// text2.setText();

		// 이벤트 처리
		// 이벤트 감지 -> 이벤트 리스너 등록
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//
				String num1 = text1.getText();
				String num2 = text2.getText();

				int total = Integer.parseInt(num1) + Integer.parseInt(num2);

				sum.setText(String.valueOf(total));

			}
		});

		btnSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String num1 = text1.getText();
				String num2 = text2.getText();

				int total = Integer.parseInt(num1) - Integer.parseInt(num2);

				sum.setText(String.valueOf(total));

			}
		});

		btnMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String num1 = text1.getText();
				String num2 = text2.getText();

				int total = Integer.parseInt(num1) * Integer.parseInt(num2);

				sum.setText(String.valueOf(total));

			}
		});
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double div = 0;
				String num1_ = text1.getText();
				String num2_ = text2.getText();
				int num1 = Integer.parseInt(num1_);
				int num2 = Integer.parseInt(num2_);

				if (num2 > 0) {
					div = (double) num1 / num2;
					sum.setText(String.valueOf(div));
				} else {
					sum.setText("0으로 나눌 수 없습니다");
				}

				sum.setText(String.valueOf(div));

			}
		});

		// System.out.println("=>" + total);

		// btn3.setBounds(x, y, width, height);
		// btn1.setBounds(130, 100, 100, 40);

		// 컴포넌트를 컨테이너에 삽입
		this.add(text1);
		this.add(text2);
		this.add(btnAdd);
		this.add(btnSub);
		this.add(btnMul);
		this.add(btnDiv);
		this.add(sum);
		this.setSize(100, 500);
		this.setVisible(true);

	}

}

public class GuiEx03 {

	public static void main(String[] args) {
		new Calculator();
	}

}
