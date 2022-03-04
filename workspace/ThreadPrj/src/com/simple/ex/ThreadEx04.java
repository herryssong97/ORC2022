package com.simple.ex;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class CountDownTest extends JFrame {
	private JLabel label;

	public CountDownTest() {
		setTitle("카운트 다운");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100)); // 글꼴, 진하게, 100pt
		
		add(label);
		// 내부 클래스 객체 생성 및 쓰레드 시작
		(new MyThread()).start();
		
		//
		setVisible(true);
	}

	class MyThread extends Thread {
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000); // 1초 간격으로 카운트 다운 해라
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
