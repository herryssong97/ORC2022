package com.simple.hyeri;

import java.awt.BorderLayout;
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

class BANK extends JFrame implements ActionListener {

	JTextField number1; // 홍길동 계좌번호
	JTextField number2; // 홍길동 이체계좌입력
	String Number2;
	JTextField number3; // 홍길순 계좌번호
	JTextField number4; // 홍길순 이체계좌입력
	int Number4;
	JTextField cash1; // 홍길동 잔액
	String cashA;
	JTextField cash2; // 홍길순 잔액
	String cashB;
	JTextField transfer1; // 홍길동 이체금액
	String transferA;
	JTextField transfer2; // 홍길순 이체금액
	JTextArea msg1; // 홍길동 오류메시지
	JTextArea msg2; // 홍길순 이체금액
	int Transfer1;
	int Transfer2;
	private int Cash1;
	private int Cash2;
	
	String num1 = "123-456";
	String num2 = "345-567";

	public BANK() {
		//
		this.setTitle("혜리 은행");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 500);
		setLayout(new GridLayout(0, 2, 5, 5)); // 레이아웃이 표로 바뀜

		JPanel p1 = new JPanel(); // 최초의 패널
		p1.setLayout(new BorderLayout());

		JPanel p11 = new JPanel();
		p11.add(new Label("        홍길동        "));

		p11.add(new Label("계좌번호 : "));
		number1 = new JTextField(num1, 5);
		p11.add(number1);

		p11.add(new Label("잔액 : "));
		cash1 = new JTextField(cashA, 5);
		p11.add(cash1);

		p11.add(new Label("이체계좌 : "));
		number2 = new JTextField(Number2, 5);
		p11.add(number2);

		p11.add(new Label("이체금액 : "));
		transfer1 = new JTextField(Integer.toString(Transfer1), 5);
		p11.add(transfer1);

		p11.add(new Label("메시지 : "));
		msg1 = new JTextArea(1, 10);
		p11.add(msg1);

		p1.add(p11, BorderLayout.CENTER);

		JPanel p12 = new JPanel(); // 두번째 패널
		JButton enter1 = new JButton("조회1");
		JButton reset1 = new JButton("이체1");

		enter1.addActionListener(this);
		reset1.addActionListener(this);

		p12.add(enter1);
		p12.add(reset1);

		p1.add(p12, BorderLayout.SOUTH);

		////////////////////////////////////////////////////////

		JPanel p2 = new JPanel(); // 최초의 패널
		p2.setLayout(new BorderLayout());

		JPanel p21 = new JPanel();
		p21.add(new Label("        홍길순        "));

		p21.add(new Label("계좌번호 : "));
		number3 = new JTextField(num2, 5);
		p21.add(number3);

		p21.add(new Label("잔액 : "));
		cash2 = new JTextField(cashB, 5);
		p21.add(cash2);

		p21.add(new Label("이체계좌 : "));
		number4 = new JTextField(5);
		p21.add(number4);

		p21.add(new Label("이체금액 : "));
		transfer2 = new JTextField(Integer.toString(Transfer2), 5);
		p21.add(transfer2);

		p21.add(new Label("메시지 : "));
		msg2 = new JTextArea(1, 10);
		p21.add(msg2);

		p2.add(p21, BorderLayout.CENTER);

		JPanel p22 = new JPanel(); // 두번째 패널
		JButton enter2 = new JButton("조회2");
		JButton reset2 = new JButton("이체2");

		enter2.addActionListener(this);
		reset2.addActionListener(this);

		p22.add(enter2);
		p22.add(reset2);

		p2.add(p22, BorderLayout.SOUTH);

		////////////////////////////////////////////////////////

		add(p1);
		add(p2);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
		String s = e.getActionCommand();

		////////////// 조회 버튼 //////////////////////////////////
		String cashA = "1000";
		int Cash1 = Integer.parseInt(cashA);

		String cashB = "2000";
		int Cash2 = Integer.parseInt(cashB);
		if (s.equals("조회1")) {
			cash1.setText(cashA);
		}
		if (s.equals("조회2")) {
			cash2.setText(cashB);
		}
		////////////// 조회버튼 눌렀을때 끝 //////////////////////////////////

		////////////// 이체 버튼 //////////////////////////////////
		
		String Transfer1_ = transfer1.getText();
		int Transfer1 = Integer.parseInt(Transfer1_);
		
		// 이체 상대가 길순이가 맞을때
		// 길동 이체계좌 적는 곳 number2 // 길순 계좌 number3

		String Number2_ = number2.getText();
		int Number2 = Integer.parseInt(Number2_);
//
//		int i = 3;
//		boolean isOdd = i % 2 == 1;
//		System.out.println(isOdd);  // true 출력
		
		
		boolean count = 123456 == 1;
		System.out.println(count);
		
//		String Number3_ = number3.getText();
//		int Number3 = Integer.parseInt(Number3_);
		
		if (Number2 = count) {
			
			System.out.println("??:"+Number2);
			// 길동이가 이체 버튼 눌렀을 때
			if (s.equals("이체1")) {
				// 이체금액transfer1이 잔액cash1보다 낮을경우 이체함 이체금액 <= 잔액
				if (Transfer1 <= Cash1) {
					System.out.println("이체금액 : " + Transfer1);
					msg1.setText("이체가 완료 되었습니다.");
				} else {
					System.out.println("이체금액 : " + Transfer1);
					msg1.setText("잔액이 부족합니다.");
				}
			} 
			
		} 
		else if(number2 != null){
			msg1.setText("계좌번호를 입력해주세요.");
		}// 길동이 이체 끝

		String Transfer2_ = transfer2.getText();
		int Transfer2 = Integer.parseInt(Transfer2_);
		// 길순이가 이체 버튼 눌렀을 때
		if (s.equals("이체2")) {
			// 이체금액transfer1이 잔액cash1보다 낮을경우 이체함 이체금액 <= 잔액
			if (Transfer2 <= Cash2) {
				System.out.println("이체금액 : " + Transfer2);
				msg2.setText("이체가 완료 되었습니다.");
			} else {
				System.out.println("이체금액 : " + Transfer2);
				msg2.setText("잔액이 부족합니다.");
			}
		} // 길순이 이체 끝

		////////////// 이체 버튼 눌렀을때 끝 //////////////////////////////////

	}

}

public class homework05 {

	public static void main(String[] args) {
		new BANK();
	}

}
