package com.simple.ex;
// 우선순위
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame02 extends JFrame {

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
			for (int i = 0; i < 200; i++) {
				x += 10 * Math.random();
				label.setBounds(x, y, 100, 100);
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	
	public CarGame02() {
		//
		setTitle("자동차 경주");
		setSize(1000,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		MyThread car1 = new MyThread("car1.gif", 10, 0); // car1 : 객체 명
		MyThread car2 = new MyThread("car2.gif", 10, 50);
		MyThread car3 = new MyThread("car3.gif", 10, 100);
		
		car1.setPriority(10); // 1~10까지 
		car2.setPriority(Thread.MIN_PRIORITY); 
		car3.setPriority(Thread.NORM_PRIORITY); // 노멀이니까 5
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
	public static void main(String[] args) {
		CarGame02 t = new CarGame02();
	}
	
	
	
}




















