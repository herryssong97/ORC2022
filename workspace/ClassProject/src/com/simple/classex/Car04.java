package com.simple.classex;

class Cars {
	// 속성, 멤버, 상태(State), 메서드 : behaver (행동, 행위)
	// private:절대 비공개	protected:호출하면 공개
	static int numOfCars; // 사용할때는 Cars.numOfCars=9; 값은 변경 가능
	
	private String licensePlate; // 번호
	private double speed; // 속도
	protected double maxSpeed = 250; // 최고속도
	private int gauge; // 연료량
	protected int limitSpeed = 110; // 110km이상일때 과속이라고 표기하기
	protected String speedNotify;
	protected int numOfSeet;

	public int getNumOfSeet() {
		return numOfSeet;
	}

	public Cars() {
		// 기본생성자
		System.out.println("Cars 객체 생성됨 ... ");
	}

	// 과속 알림 기능 추가
	public void notifySpeed() {
		speedNotify = "정속주행";

		if (speed >= limitSpeed) {
			speedNotify = "과속주행";
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

/* extends Cars : 클래스 Cars 를 확장하겠다는 의미 */
class CarBann extends Cars {
	// Cars의 모든 멤버와 메서드를 동일하게 가지므로 위의 내용을 다시 적어줄 필요가 없다.
	// int numOfSeet = 12;

	int seet;

	public CarBann() {
		// 객체 생성
		System.out.println("CarBann 객체 생성됨 ...");
	}

	public void extNumOfSeet(int num) {
		seet = num;
	}

	public CarBann(int numOfSeet) {
		// 객체 생성
		this.numOfSeet = numOfSeet;

		System.out.println("CarBann 객체 생성됨 ...");
	}

	// 과속 알림 기능 추가
	@Override
	public void notifySpeed() {
		speedNotify = "정속주행";
		int speed = (int) super.getSpeed();
		if (speed >= 80) {
			speedNotify = "과속주행";
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
		
		Cars.numOfCars=0; // static 은 변수처럼 사용이 가능하다.
		
		CarBann ban1 = new CarBann(12);

		Cars car1 = new Cars();
		
		ban1.numOfCars=1;

		// 승합차 사용하기
		System.out.println(ban1.getSpeed());
		System.out.println(ban1.getNumOfSeet());

		car1.numOfCars=2;
		System.out.println("자동차 수 : " + Cars.numOfCars);
		
		int num = car1.numOfSeet;
		System.out.println("좌석수 : " + num);
		
		car1.setSpeed(90);
		ban1.setSpeed(90);
		
		System.out.println("car1 " + car1);
		System.out.println("ban1" + ban1);

	}

}
