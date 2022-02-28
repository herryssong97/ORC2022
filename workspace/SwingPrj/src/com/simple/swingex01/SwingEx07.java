package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx07 extends JFrame {
	private String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry",
			"blackberry" };
	private String[] names = { "a", "b", "c", "d","e", "kitae", "jaemoon", "hyosoo", "namyun" };

	public JComponentEx07() {
		setTitle("콤보박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JComboBox<String> strCombo = new JComboBox<String>(fruits); // 문자열 콤보박스 생성
		c.add(strCombo); // 크기에 따라 자동으로 스크롤이 생김

		JComboBox<String> nameCombo = new JComboBox<String>(); // 콤보박스 생성
		for (int i = 0; i < names.length; i++)
			nameCombo.addItem(names[i]); // 콤보박스에 문자열 아이템 삽입

		c.add(nameCombo);
		setSize(300, 300);
		setVisible(true);
	}

}

public class SwingEx07 {

	public static void main(String[] args) {

		JComponentEx07 w1 = new JComponentEx07(); // 여기서 호출을 해줘야 화면구현이 됨

	}
}