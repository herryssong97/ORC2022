package com.simple.classex;

public class CarMain {

	public static void main(String[] args) {
		// ��ü����
		Car03 c1, c2, c3;
		//c1 = new Car(); // �ν��Ͻ� ������
		// c2 = new Car02("29�� 7683", 10, 250, 20, 110, "���� ����");
		c3 = new Car03("�ӽ� ��ȣ", 10, 12, "���� ����");

		// �ʱ⼳��
		// c1 = c2; // ��ü�� �����Ѵ�.
//		c1.setLicensePlate("16�� 6061");
//		c1.setSpeed(150.0);
//		c1.setMaxSpeed(240);
//		c1.setGauge(50);
//		c1.setSpeedNotify();
		
		System.out.println("c3 : " + c3);
		System.out.println("����ӵ� : " + c3.getSpeed() + "km/h");
		System.out.println("���ᷮ : " + c3.getGauge() + "Liter");
		
		// ������ 10�ʰ� ����
		for (int i = 0; i < 15; i++) {
			c3.accelerate(10);
			System.out.println("c3 : " + c3);
		}
		
		
		
	}

}
