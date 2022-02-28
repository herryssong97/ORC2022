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
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JList<String> strList = new JList<String>(fruits); // ���ڿ� ����Ʈ ����
		c.add(new JScrollPane(strList));

		JList<ImageIcon> imageList = new JList<ImageIcon>(); // �̹��� ����Ʈ ����
		imageList.setListData(images);
		c.add(new JScrollPane(imageList));

		JList<String> scrollList = new JList<String>(fruits); // ���ڿ� ����Ʈ ����
		c.add(new JScrollPane(scrollList)); // ����Ʈ�� JScrollPane�� ����
		// JScrollPane*��(scrollList*�ʿ��Ѱ� ������ ����) �� �־�� ��ũ�ѹٰ� ����!!!!!!!!!

		setSize(350, 350);
		setVisible(true);
	}

}

public class SwingEx06 {

	public static void main(String[] args) {

		JComponentEx06 w1 = new JComponentEx06(); // ���⼭ ȣ���� ����� ȭ�鱸���� ��

	}
}