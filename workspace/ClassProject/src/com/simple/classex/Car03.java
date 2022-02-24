package com.simple.classex;

public class Car03 {
	// �Ӽ�, ���, ����(State), �޼��� : behaver (�ൿ, ����)
	// private
	private String licensePlate; // ��ȣ
	private double speed; // �ӵ�
	private double maxSpeed = 250; // �ְ�ӵ�
	private int gauge; // ���ᷮ
	private int limitSpeed = 110; // 100km�̻��϶� �����̶�� ǥ���ϱ�
	private String speedNotify;
	
	public Car03() {
		// ������ ������
	}
		
	public Car03(String licensePlate, double speed, 
			int gauge, String speedNotify) {
		// super(); �̹� ���� public Car03() {} �� ������ ������ �����ϴ�
		this.licensePlate = licensePlate;
		this.speed = speed;
		if(gauge > 10 && gauge <= 30 ) { // �������� 11~30������ �Է°��� �� �ܿ��� �� 20
			this.gauge = gauge;
		} else {
			this.gauge = 20;
		}
		this.speedNotify = speedNotify;
	}


	public Car03(String licensePlate, double speed, double maxSpeed, int gauge, int limitSpeed, String speedNotify) {
		super(); // ���۴� ������Ʈ Ŭ������ ���鶧�� ���
		this.licensePlate = licensePlate;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.gauge = gauge;	// ���ᷮ
		this.limitSpeed = limitSpeed;
		this.speedNotify = speedNotify;
	}


	// ���� �˸� ��� �߰�
	public void notifySpeed() {
		String message = "��������";

		if (speed >= limitSpeed) {
			message = "��������";
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

	// ����
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

		// �������� ���� ����
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

	public void outGauge(int gauge) { // ���ᰡ ������ �Լ��� ���� �������
		this.gauge -= gauge;
		
		if(this.gauge <= 0) {
			this.gauge = 0;
		}
		
	}

	@Override
	public String toString() {
		return "�ڵ��� [��ȣ :" + licensePlate + ", �ӵ� : " + speed + ", �ְ�ӵ� : " + maxSpeed + ", ���ᷮ : " + gauge
				+ ", ���ӻ��� : " + speedNotify + "]";
	}
}
