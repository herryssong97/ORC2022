package com.simple.classex;

public class Car {
	// 속성, 멤버, 상태(State), 메서드 : behaver (행동, 행위)
	// private
	private String licensePlate; // 번호
	private double speed; // 속도
	private double maxSpeed = 250; // 최고속도
	private int gauge; // 연료량
	private int limitSpeed = 100; // 100km이상일때 과속이라고 표기하기
	private String speedNotify = "정속 주행";

	// 과속 알림 기능 추가
	public void notifySpeed() {
		String message = "정속주행";

		if (speed >= limitSpeed) {
			message = "과속주행";
		}
	}

	public String setSpeedNotify() {
		return speedNotify;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	// 엑셀
	public void accelerate(int delta) {
		this.speed += delta;
		
		setSpeed(speed);
		
		if(this.speed > maxSpeed) {
			//this.speed = maxSpeed;
			setSpeed(maxSpeed);
		}
		if(this.speed < 0.0) {
			//this.speed = 0.0;
			setSpeed(00.);
		}
		
		// setSpeed(speed);
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {

		if (speed >= maxSpeed) {
			this.speed = maxSpeed;
			outGauge(10);
		} else {
			this.speed = speed;
			outGauge(5);
		}

		// 정속주행 여부 감지
		notifySpeed();

	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getGauge() {
		return gauge;
	}

	public void setGauge(int gauge) {
		this.gauge = gauge;
	}

	public void outGauge(int gauge) { // 연료가 빠지는 함수를 새로 만들어줌
		this.gauge -= gauge;
		
		if(this.gauge <= 0) {
			this.gauge = 0;
		}
		
	}

	@Override
	public String toString() {
		return "자동차 [번호 :" + licensePlate + ", 속도 : " + speed + ", 최고속도 : " + maxSpeed + ", 연료량 : " + gauge
				+ ", 정속상태 : " + speedNotify + "]";
	}
}
