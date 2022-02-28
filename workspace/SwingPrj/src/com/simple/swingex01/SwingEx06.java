package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx06 extends JFrame {
	private String[] fruits = { "apple", "banana", "kiwi", 
			"mango", "pear", "peach", "berry", "strawberry",
			"blackberry" };
	private ImageIcon[] images = { new ImageIcon("img/icon1.png"), 
			new ImageIcon("img/icon2.png"),
			new ImageIcon("img/icon3.png"), 
			new ImageIcon("img/icon4.png") };

	public JComponentEx06() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JList<String> strList = new JList<String>(fruits); // 문자열 리스트 생성
		c.add(new JScrollPane(strList));

		JList<ImageIcon> imageList = new JList<ImageIcon>(); // 이미지 리스트 생성
		imageList.setListData(images);
		c.add(new JScrollPane(imageList));

		JList<String> scrollList = new JList<String>(fruits); // 문자열 리스트 생성
		c.add(new JScrollPane(scrollList)); // 리스트를 JScrollPane에 부착
		// JScrollPane*주(scrollList*필요한게 안으로 들어옴) 가 있어야 스크롤바가 생성!!!!!!!!!

		setSize(350, 350);
		setVisible(true);
	}

}

public class SwingEx06 {

	public static void main(String[] args) {

		JComponentEx06 w1 = new JComponentEx06(); // 여기서 호출을 해줘야 화면구현이 됨

	}
}