package com.simple.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GuiEx02 {

	public static void main(String[] args) {
		// 메소드 안의 지역개체 확장하려면 한계가 있음
		JFrame f = new JFrame("오 신기해 ㅋㅋㅋㅋ");
		FlowLayout lay1 = new FlowLayout();

		f.setLayout(lay1); // 사용자 레이아웃

		// 컴포넌트 생성
		// 2개의 값을 입력 받는 컴포넌트
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextField sum = new JTextField(10);

		JButton btnAdd = new JButton("덧셈");
		JButton btnSub = new JButton("뺄셈");

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



		// System.out.println("=>" + total);

		// btn3.setBounds(x, y, width, height);
		// btn1.setBounds(130, 100, 100, 40);

		// 컴포넌트를 컨테이너에 삽입
		f.add(text1);
		f.add(text2);
		f.add(btnAdd);
		f.add(btnSub);
		f.add(sum);
		f.setSize(100, 500);
		f.setVisible(true);

	}

}
