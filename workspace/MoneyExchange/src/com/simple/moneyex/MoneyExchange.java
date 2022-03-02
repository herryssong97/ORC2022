package com.simple.moneyex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class MoneyExchange extends JFrame implements ActionListener{

	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
	JButton btn1;
	
	public MoneyExchange() {
		// 윈도우 기본구성을 설정
		
		this.setTitle("화폐종류별 반환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLayout(null);
		// 컴포넌트 생성
		tf1 = new JTextField("금액 입력", 10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		
		lbl1 = new JLabel("급여 수령액");
		lbl2 = new JLabel("만원");
		lbl3 = new JLabel("오천원");
		lbl4 = new JLabel("천원");
		lbl5 = new JLabel("오백원");
		lbl6 = new JLabel("백원");
		
		btn1 = new JButton("계산");
		
		// 이벤트 리스너 등록
		btn1.addActionListener(this);
		
		lbl1.setBounds(10, 10, 100 ,30); // x축, y축, 가로크기, 높이
		tf1.setBounds(120, 10, 100, 30);
		
		lbl2.setBounds(10, 50, 100 ,30);
		tf2.setBounds(120, 50, 100, 30);
		
		lbl3.setBounds(10, 90, 100 ,30);
		tf3.setBounds(120, 90, 100, 30);
		
		lbl4.setBounds(10, 130, 100 ,30);
		tf4.setBounds(120, 130, 100, 30);
		
		lbl5.setBounds(10, 170, 100 ,30);
		tf5.setBounds(120, 170, 100, 30);
		
		lbl6.setBounds(10, 210, 100 ,30);
		tf6.setBounds(120, 210, 100, 30);
		
		btn1.setBounds(120, 250, 100, 30);
		
		// 컨테이너에 등록
		this.add(btn1);
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(tf4);
		this.add(tf5);
		this.add(tf6);
		this.add(lbl1);
		this.add(lbl2);
		this.add(lbl3);
		this.add(lbl4);
		this.add(lbl5);
		this.add(lbl6);
		
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 클릭시 처리할 내용을 기술
		// 화폐 종류별로 급여를 지급
		// 1. 급여를 읽어오기
		String money_ = tf1.getText();
		int money = Integer.parseInt(money_);
		int mok = 0;
		//int na = 0;
		
		
		// 만원권 처리
		if(money >= 10000) {
			mok = money / 10000;
			tf2.setText(mok + "개");
			money = money % 10000;
		}		
		// 오천원권 처리
		// System.out.println("5천원 이하 : " + na);
		if(money >= 5000) {
			mok = money / 5000;
			tf3.setText(mok + "개");
			money = money % 5000;
		}	
		// 천원권 처리
		if(money >= 1000) {
			mok = money / 1000;
			tf4.setText(mok + "개");
			money = money % 1000;
		}	
		// 오백원권 처리
		if(money >= 500) {
			mok = money / 500;
			tf5.setText(mok + "개");
			money = money % 500;
		}	
		// 백원권 처리
		if(money >= 100) {
			mok = money / 100;
			tf6.setText(mok + "개");
			money = money % 100;
		}	
		
		
		// System.out.println("나머지 : " + na);
		// tf2.setText(String.valueOf(mok));
		
		
		
		
		
		
	}

}
