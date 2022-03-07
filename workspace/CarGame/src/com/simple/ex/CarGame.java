package com.simple.ex;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	class MyThread extends Thread {
		private JLabel label;
		private int x, y;

		public MyThread(String fname, int x, int y) {
			this.x = x;// 자동차 위치 x,y
			this.y = y;
			label = new JLabel();
			label.setIcon(new ImageIcon(fname));
			label.setBounds(x, y, 100, 100); // 크기
			add(label);
		}

		// 쓰레드 동작기술
		public void run() {
			for (int i = 0; i < 100; i++) {
				x += 100 * Math.random();
				label.setBounds(x, y, 100, 100);
				repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	
	public CarGame() {
		//
		setTitle("자동차 경주");
		setSize(600,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		(new MyThread("car1.gif", 100, 0)).start();
		(new MyThread("car2.gif", 100, 50)).start();
		(new MyThread("car3.gif", 100, 100)).start();
		(new MyThread("car1.gif", 100, 150)).start();
		
		setVisible(true);
	}
	public static void main(String[] args) {
		CarGame t = new CarGame();
	}
	
	
	
}




















