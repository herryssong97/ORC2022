package com.simple.stringex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringEx03 {

	public static void main(String[] args) {

		String id = "990205-103619";
		int baseYear = 2000;
		String gen = "남";

		// 나이 구하기
		System.out.println();
		String year_ = id.substring(0, 2);
		String gender = id.substring(7, 8);

		if (gender.equals("1") || gender.equals("2")) {
			baseYear = 1900;
		}

		// 성별을 구하시오

		if (gender.equals("2") || gender.equals("4")) {
			gen = "여";
		}

		int year = Integer.parseInt(year_)+baseYear;

		//
		//
		//
		LocalDate now = LocalDate.now();
		// 포맷정의
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일");

		// 포맷 적용
		String formatedNow = now.format(formatter);
		int currentYear = now.getYear();

		int age = currentYear - year;

		System.out.println("당신의 :" + gen + "성");
		System.out.println("당신의 나이는 :" + age);

	}
}
