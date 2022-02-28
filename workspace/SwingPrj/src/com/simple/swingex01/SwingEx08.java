package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx08 extends JFrame {
	
	private String [] fruits = { "500", "100", "1", "0" }; // 콤보박스의 아이템
	private ImageIcon [] images = { // 이미지 객체 배열
			new ImageIcon("img/apple.jpg"), 
			new ImageIcon("img/banana.jpg"), 
			new ImageIcon("img/kiwi.jpg"),
			new ImageIcon("img/mango.jpg") };
	private JLabel imgLabel = new JLabel("동전선택"); // 이미지 레이블 컴포넌트
	private JComboBox<String> strCombo = new JComboBox<String>(fruits); // 문자열 콤보박스

	public JComponentEx08() {
		
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);

		// Action 리스너 등록
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource(); // Action 이벤트가 발생한 콤보박스 알아내기
				int index = cb.getSelectedIndex(); // 콤보박스의 선택된 아이템의 인덱스 번호 알아내기
				imgLabel.setText(fruits[index] + "원 선택"); // 인덱스의 이미지를 이미지 레이블 컴포넌트에 출력
			}
		});

		setSize(300, 250);
		setVisible(true);
	}
}

public class SwingEx08 {

	public static void main(String[] args) {

		JComponentEx08 w1 = new JComponentEx08(); // 여기서 호출을 해줘야 화면구현이 됨

	}

}