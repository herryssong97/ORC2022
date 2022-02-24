package com.simple.polymorphism;

public class TVUser {

	public static void main(String[] args) {
		// 
		TV tv = new SamsungTV();
		
		tv.powerOn();
		tv.volumeUp();
		tv.powerOff();
	}

}
