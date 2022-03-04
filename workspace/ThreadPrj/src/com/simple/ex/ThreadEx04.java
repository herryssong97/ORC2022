package com.simple.ex;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class CountDownTest extends JFrame {
	private JLabel label;

	public CountDownTest() {
		setTitle("ī��Ʈ �ٿ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100)); // �۲�, ���ϰ�, 100pt
		
		add(label);
		// ���� Ŭ���� ��ü ���� �� ������ ����
		(new MyThread()).start();
		
		//
		setVisible(true);
	}

	class MyThread extends Thread {
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000); // 1�� �������� ī��Ʈ �ٿ� �ض�
				} catch (Exception e) {
					e.printStackTrace();
				}
				label.setText(i + "");
			}
		}
	}
}

public class ThreadEx04 {

	public static void main(String[] args) {
		CountDownTest c1 = new CountDownTest();
		CountDownTest c2 = new CountDownTest();
	}

}
