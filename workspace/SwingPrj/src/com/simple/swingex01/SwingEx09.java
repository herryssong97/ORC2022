package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.simple.swingex01.JComponentEx04.MyItemListener;

class JComponentEx09 extends JFrame {

//	private JTextField[] txt = new JTextField[6];
//	private String[] names = { "수령액 입력", "만원", "오천원", "천원", "오백원", "백원" };

	private int man = 0; // 만원
	private int ocheon = 0; // 오천원
	private int mill = 0; // 천원
	private int five = 0; // 오백원
	private int one = 0; // 백원
	private int result = 0; // 결과
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void showResult(String msg) {
		
		this.result = result;
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 만원 메서드 (기능)
	public int man(int Total) {
		result = (int) (Total * 0.0001);
		System.out.println("만원 :" + result);
		// showResult("만원 : ");
		return result;
	}

	// 오천원 메서드 (기능)
	public int ocheon(int Total) {
		result = (int) ((Total / 10^(1-1))%10 );
		showResult("오천원 :");
		// showResult("만원 : ");
		return result;
	}
	
	//....
	
	
	public JComponentEx09() {

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		setTitle("급여계산기 숙제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 문자열 레이블 생성
		JLabel textLabel = new JLabel("급여계산기");
		JLabel total = new JLabel("급여입력 : ", Label.RIGHT);// 급여수령액 입력칸
		final TextField Total = new TextField(10);// JTextField total = new JTextField(10); // 급여수령액 입력칸

		JLabel man = new JLabel("만원 : ", Label.RIGHT); // 만원
		JLabel ocheon = new JLabel("오천원 : ", Label.RIGHT); // 오천원
		JLabel mill = new JLabel("천원 : ", Label.RIGHT); // 천원
		JLabel five = new JLabel("오백원 : ", Label.RIGHT); // 오백원
		JLabel one = new JLabel("백원 : ", Label.RIGHT); // 백원

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/* 폰트 크기 설정 */
		textLabel.setFont(new Font("굴림체", Font.BOLD, 50));

		total.setFont(new Font("굴림체", Font.BOLD, 50));
		man.setFont(new Font("굴림체", Font.BOLD, 50));
		ocheon.setFont(new Font("굴림체", Font.BOLD, 50));
		mill.setFont(new Font("굴림체", Font.BOLD, 50));
		five.setFont(new Font("굴림체", Font.BOLD, 50));
		one.setFont(new Font("굴림체", Font.BOLD, 50));

		JButton btn = new JButton("계산");
		btn.setBackground(Color.RED); // 배경색 설정
		btn.setForeground(Color.WHITE); // 글자색 설정
		Total.setFont(new Font("굴림체", Font.BOLD, 50)); // Arial, 20픽셀 폰트 설정
		btn.setFont(new Font("굴림체", Font.BOLD, 50)); // Arial, 20픽셀 폰트 설정
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// 컨텐트팬에 3개의 레이블 부착
		c.add(textLabel);

		c.add(total);
		c.add(Total); /// 숫자 입력

		c.add(man);
		c.add(ocheon);
		c.add(mill);
		c.add(five);
		c.add(one);

		c.add(btn);

		setSize(500, 1000);
		setVisible(true);

	}

//	@Override
//	public String toString() {
//		return "급여계산기 [만원 =" + man + ", 오천원=" + ocheon + ", 천원=" + mill + ", 오백원=" + five + ", 백원" + one + "]";
//	}
}

public class SwingEx09 {

	public static void main(String[] args) {

		JComponentEx09 hw1 = new JComponentEx09(); // 여기서 호출을 해줘야 화면구현이 됨

		
		
	}

}
