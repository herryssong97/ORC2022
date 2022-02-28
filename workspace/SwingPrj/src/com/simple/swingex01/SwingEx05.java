package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx05 extends JFrame {
	
	public JComponentEx05() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		// 이미지 라디오버튼을 만들기 위해 2개의 이미지 객체 생성
		ImageIcon cherryIcon = new ImageIcon("img/cherry.jpg"); // 해제 상태를 나태는 이미지
		ImageIcon selectedCherryIcon = new ImageIcon("img/selectedCherry.jpg"); // 선택 상태를 나타내는 이미지
		
		// 버튼 그룹 객체 생성
		// 이걸 밑에서 호출해줘야 버튼이 따로논다 !!!!!!!
		ButtonGroup g = new ButtonGroup();
		ButtonGroup g1 = new ButtonGroup();
		
		// 라디오버튼 3개 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon); // 이미지 라디오버튼
		
		// 선호하는 커피의 종류를 선택하시오.
		JRadioButton milk = new JRadioButton("밀크커피");
		JRadioButton cream = new JRadioButton("크림커피");
		JRadioButton black = new JRadioButton("블랙커피"); // 이미지 라디오버튼
		
		
		
		
		
		cherry.setBorderPainted(true); // 이미지 라디오버튼의 외곽선 출력
		cherry.setSelectedIcon(selectedCherryIcon); // 선택 상태 이미지 등록
		
		// 버튼 그룹에 3개의 라디오버튼 삽입
		// 이걸 여기서 호출해줘야 버튼이 따로논다 !!!!!!!
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		g1.add(milk);
		g1.add(cream);
		g1.add(black);

		
		// 컨텐트팬에 3개의 라디오버튼 삽입
		// panel1 / panel2 윈도우 프레임 크기에 따라 패널 단위로 묶어서 올라가고 떨어짐
		panel1.add(apple);
		panel1.add(pear);
		panel1.add(cherry);

		panel2.add(milk);
		panel2.add(cream);
		panel2.add(black);
		
		c.add(panel1);
		c.add(panel2);	
		
		setResizable(false); // 윈도우 프레임 고정
		setSize(350,200);
		setVisible(true);
		
	}

	}

public class SwingEx05 {

	public static void main(String[] args) {

		JComponentEx05 w1 = new JComponentEx05(); // 여기서 호출을 해줘야 화면구현이 됨

	}
}