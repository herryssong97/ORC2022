package com.simple.ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class BMI extends JFrame implements ActionListener {

	JTextField in_height;
	JTextField in_weight;
	JTextField reBMI;
	JTextField reBMI2;
	JTextArea ta;

	public BMI() {
		//
		this.setTitle("BMI지수 구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 400);
		setLayout(new GridLayout(2, 1, 5, 5)); // 레이아웃이 표로 바뀜

		JPanel p1 = new JPanel(); // 최초의 패널
		p1.setBackground(Color.yellow); // 배경색
		p1.setLayout(new BorderLayout());

		JLabel lbl1 = new JLabel("키(cm)와 몸무게(kg) 입력하시고" + "'체크' 버튼을 누르세요");
		p1.add(lbl1, BorderLayout.NORTH); // 상단에 위치

		JPanel p11 = new JPanel();
		p11.add(new Label("키(cm) : "));
		in_height = new JTextField(5);
		p11.add(in_height);

		p11.add(new Label("몸무게(kg) : "));
		in_weight = new JTextField(5);
		p11.add(in_weight);

		p1.add(p11, BorderLayout.CENTER);

		JPanel p12 = new JPanel(); // 두번째 패널
		JButton enter = new JButton("체크");
		JButton reset = new JButton("다시입력");

		enter.addActionListener(this);
		reset.addActionListener(this);

		p12.add(enter);
		p12.add(reset);

		p1.add(p12, BorderLayout.SOUTH);

		add(p1);

		// 결과 패널 생성
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		JLabel lbl2 = new JLabel("--- 결과보기 ----");
		p2.add(lbl2, BorderLayout.NORTH); // 상단에 위치

		JPanel p21 = new JPanel();
		p21.add(new JLabel("비만지수(BMI) : "));
		reBMI = new JTextField(5);
		p21.add(reBMI);

		p21.add(new JLabel("표준체중(kg) : "));
		reBMI2 = new JTextField(5);
		p21.add(reBMI2);

		p21.add(new JLabel("BMI로 본 당신의 상태는?"));
		ta = new JTextArea(1, 20);
		p21.add(ta);

		p2.add(p21, BorderLayout.CENTER);

		add(p2); // grid 두번째 행에 등록

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//

		String s = e.getActionCommand();

		// 표준체중
		double N_weight = 0.0;
		double weight = 0.0;

		String height_ = in_height.getText();
		double height = Double.parseDouble(height_);

		String weight_ = in_weight.getText();
		weight = Double.parseDouble(weight_);

		if (s.equals("체크")) {

			N_weight = (height - 100) * 0.9;

			// 단위변환
			height = height / 100;

			// BMI지수 계산
			double BMI = Math.round(weight / (height * height));
			String re = BMI_Check(BMI);

			// 결과출력
			reBMI.setText(BMI + ""); // 내 비엠아이
			reBMI2.setText(N_weight + ""); // 표준체중
			ta.setText(re + "");

		}

	}

	private String BMI_Check(double BMI) {
		String result = "";

		if (BMI < 18.5) {
			result = "저체중";
		}
		if (BMI >= 18.5 && BMI <= 22.9) {
			result = "정상";
		}
		if (BMI >= 23.0 && BMI <= 24.9) {
			result = "과체중";
		}
		if (BMI >= 25.0) {
			result = "비만";
		}

		return result;
	}

}

public class BMIEx {

	public static void main(String[] args) {
		new BMI();
	}

}
