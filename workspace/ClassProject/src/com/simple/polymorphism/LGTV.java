package com.simple.polymorphism;

public class LGTV implements TV{

	public void powerOn() {
		System.out.println("LGTV 전원 켠다 ..");
	}
	
	public void powerOff() {
		System.out.println("LGTV 전원 끈다 ..");
	}

	public void volumeUp() {
		System.out.println("LGTV 소리 올린다 ..");
	}

	public void volumeDown() {
		System.out.println("LGTV 소리 내린다 ..");
	}

}
