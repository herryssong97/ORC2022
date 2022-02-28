package com.simple.swingex01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComponentEx extends JFrame {
	
	
	public JComponentEx() {
		super("JComponent�� ���� �޼ҵ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("    Disabled Button    ");
		JButton b3 = new JButton("getX(), getY()");

		b1.setBackground(Color.RED); // ���� ����
		b1.setForeground(Color.WHITE); // ���ڻ� ����
		b1.setFont(new Font("����ü", Font.BOLD, 50)); // Arial, 20�ȼ� ��Ʈ ����

		b1.setEnabled(false); // ��ư ��Ȱ��ȭ

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY()); // Ÿ��Ʋ�� ��ư ��ǥ ���
			}
		});

		c.add(b1);
		c.add(b2);
		c.add(b3); // ����Ʈ�ҿ� ��ư ����

		setSize(560, 200);
		setVisible(true);
	}

}

public class SwingEx01 {

	public static void main(String[] args) {

		new JComponentEx(); // ���⼭ ȣ���� ����� ȭ�鱸���� ��
		
	}
}