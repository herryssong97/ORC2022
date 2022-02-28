package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx02 extends JFrame {

	public JComponentEx02() {

		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 문자열 레이블 생성
		JLabel textLabel = new JLabel("사랑합니다.");

		// 이미지 레이블 생성
		ImageIcon beauty = new ImageIcon("img/beauty.jpg"); // 이미지 로딩
		JLabel imageLabel = new JLabel(beauty); // 이미지 레이블 생성

		// 문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("img/normalIcon.gif"); // 이미지 로딩
		JLabel label = new JLabel("보고싶으면 전화하세요", 
			normalIcon, SwingConstants.CENTER); // 레이블 생성 SwingConstants.CENTER


		// 컨텐트팬에 3개의 레이블 부착
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);

		setSize(1000, 600);
		setVisible(true);
	}

}

public class SwingEx02 {

	public static void main(String[] args) {

		JComponentEx02 w1 = new JComponentEx02(); // 여기서 호출을 해줘야 화면구현이 됨

	}
}