package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx08 extends JFrame {
	
	private String [] fruits = { "500", "100", "1", "0" }; // �޺��ڽ��� ������
	private ImageIcon [] images = { // �̹��� ��ü �迭
			new ImageIcon("img/apple.jpg"), 
			new ImageIcon("img/banana.jpg"), 
			new ImageIcon("img/kiwi.jpg"),
			new ImageIcon("img/mango.jpg") };
	private JLabel imgLabel = new JLabel("��������"); // �̹��� ���̺� ������Ʈ
	private JComboBox<String> strCombo = new JComboBox<String>(fruits); // ���ڿ� �޺��ڽ�

	public JComponentEx08() {
		
		setTitle("�޺��ڽ� Ȱ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);

		// Action ������ ���
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource(); // Action �̺�Ʈ�� �߻��� �޺��ڽ� �˾Ƴ���
				int index = cb.getSelectedIndex(); // �޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
				imgLabel.setText(fruits[index] + "�� ����"); // �ε����� �̹����� �̹��� ���̺� ������Ʈ�� ���
			}
		});

		setSize(300, 250);
		setVisible(true);
	}
}

public class SwingEx08 {

	public static void main(String[] args) {

		JComponentEx08 w1 = new JComponentEx08(); // ���⼭ ȣ���� ����� ȭ�鱸���� ��

	}

}