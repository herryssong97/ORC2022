package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx03 extends JFrame {

	public JComponentEx03() {

		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 이미지 체크박스에 사용할 2개의 이미지 객체 생성
		ImageIcon cherryIcon = new ImageIcon("img/cherry.jpg"); // 해제 상태 이미지
		ImageIcon selectedCherryIcon = new ImageIcon("img/selectedCherry.jpg"); // 선택 상태 이미지
		ImageIcon carIcon = new ImageIcon("img/car.gif"); // 해제 상태 이미지
		ImageIcon selectedCarIcon = new ImageIcon("img/car1.gif"); // 선택 상태 이미지

		// 3개의 체크박스 생성
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true); // 체크가 되어 있는것은 true
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		JCheckBox car = new JCheckBox("자동차", carIcon);

		cherry.setBorderPainted(true); // 체크박스 외곽선이 보이도록 설정
		cherry.setSelectedIcon(selectedCherryIcon); // 선택 상태 이미지 등록
		car.setBorderPainted(true); // 체크박스 외곽선이 보이도록 설정
		car.setSelectedIcon(selectedCarIcon); // 선택 상태 이미지 등록

		// 컨텐트팬에 3개의 체크박스 부착
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		c.add(car);

		setSize(450, 150);
		setVisible(true);
	}

}

public class SwingEx03 {

	public static void main(String[] args) {

		JComponentEx03 w1 = new JComponentEx03(); // 여기서 호출을 해줘야 화면구현이 됨

	}
}