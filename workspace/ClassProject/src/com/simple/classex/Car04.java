package com.simple.classex;

class Cars {
	// �Ӽ�, ���, ����(State), �޼��� : behaver (�ൿ, ����)
	// private:���� �����	protected:ȣ���ϸ� ����
	static int numOfCars; // ����Ҷ��� Cars.numOfCars=9; ���� ���� ����
	
	private String licensePlate; // ��ȣ
	private double speed; // �ӵ�
	protected double maxSpeed = 250; // �ְ�ӵ�
	private int gauge; // ���ᷮ
	protected int limitSpeed = 110; // 110km�̻��϶� �����̶�� ǥ���ϱ�
	protected String speedNotify;
	protected int numOfSeet;

	public int getNumOfSeet() {
		return numOfSeet;
	}

	public Cars() {
		// �⺻������
		System.out.println("Cars ��ü ������ ... ");
	}

	// ���� �˸� ��� �߰�
	public void notifySpeed() {
		speedNotify = "��������";

		if (speed >= limitSpeed) {
			speedNotify = "��������";
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

		if (this.speed > maxSpeed) {
			// this.speed = maxSpeed;
			setSpeed(maxSpeed);
		}
		if (this.speed < 0.0) {
			// this.speed = 0.0;
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

		if (this.gauge <= 0) {
			this.gauge = 0;
		}

	}

	@Override
	public String toString() {
		return "Cars [licensePlate=" + licensePlate + ", speed=" + speed + ", maxSpeed=" + maxSpeed + ", gauge=" + gauge
				+ ", limitSpeed=" + limitSpeed + ", speedNotify=" + speedNotify + ", numOfSeet=" + numOfSeet + "]";
	}

}

/* extends Cars : Ŭ���� Cars �� Ȯ���ϰڴٴ� �ǹ� */
class CarBann extends Cars {
	// Cars�� ��� ����� �޼��带 �����ϰ� �����Ƿ� ���� ������ �ٽ� ������ �ʿ䰡 ����.
	// int numOfSeet = 12;

	int seet;

	public CarBann() {
		// ��ü ����
		System.out.println("CarBann ��ü ������ ...");
	}

	public void extNumOfSeet(int num) {
		seet = num;
	}

	public CarBann(int numOfSeet) {
		// ��ü ����
		this.numOfSeet = numOfSeet;

		System.out.println("CarBann ��ü ������ ...");
	}

	// ���� �˸� ��� �߰�
	@Override
	public void notifySpeed() {
		speedNotify = "��������";
		int speed = (int) super.getSpeed();
		if (speed >= 80) {
			speedNotify = "��������";
		}
	}

	@Override
	public String toString() {
		return "CarBann [seet=" + seet + ", maxSpeed=" + maxSpeed + ", limitSpeed=" + limitSpeed + ", speedNotify="
				+ speedNotify + ", numOfSeet=" + numOfSeet + "]";
	}
	
	
}

public class Car04 {

	public static void main(String[] args) {
		
		Cars.numOfCars=0; // static �� ����ó�� ����� �����ϴ�.
		
		CarBann ban1 = new CarBann(12);

		Cars car1 = new Cars();
		
		ban1.numOfCars=1;

		// ������ ����ϱ�
		System.out.println(ban1.getSpeed());
		System.out.println(ban1.getNumOfSeet());

		car1.numOfCars=2;
		System.out.println("�ڵ��� �� : " + Cars.numOfCars);
		
		int num = car1.numOfSeet;
		System.out.println("�¼��� : " + num);
		
		car1.setSpeed(90);
		ban1.setSpeed(90);
		
		System.out.println("car1 " + car1);
		System.out.println("ban1" + ban1);

	}

}
