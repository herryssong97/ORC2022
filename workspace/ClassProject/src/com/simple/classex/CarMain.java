package com.simple.classex;

public class CarMain {

	public static void main(String[] args) {
		// 객체생성
		Car03 c1, c2, c3;
		//c1 = new Car(); // 인스턴스 생성됨
		// c2 = new Car02("29바 7683", 10, 250, 20, 110, "정속 주행");
		c3 = new Car03("임시 번호", 10, 12, "정상 주행");

		// 초기설정
		// c1 = c2; // 객체를 공유한다.
//		c1.setLicensePlate("16모 6061");
//		c1.setSpeed(150.0);
//		c1.setMaxSpeed(240);
//		c1.setGauge(50);
//		c1.setSpeedNotify();
		
		System.out.println("c3 : " + c3);
		System.out.println("현재속도 : " + c3.getSpeed() + "km/h");
		System.out.println("연료량 : " + c3.getGauge() + "Liter");
		
		// 엑셀을 10초간 유지
		for (int i = 0; i < 15; i++) {
			c3.accelerate(10);
			System.out.println("c3 : " + c3);
		}
		
		
		
	}

}
