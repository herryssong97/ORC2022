package com.simple.stringex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringEx03 {

	public static void main(String[] args) {

		String id = "990205-103619";
		int baseYear = 2000;
		String gen = "��";

		// ���� ���ϱ�
		System.out.println();
		String year_ = id.substring(0, 2);
		String gender = id.substring(7, 8);

		if (gender.equals("1") || gender.equals("2")) {
			baseYear = 1900;
		}

		// ������ ���Ͻÿ�

		if (gender.equals("2") || gender.equals("4")) {
			gen = "��";
		}

		int year = Integer.parseInt(year_)+baseYear;

		//
		//
		//
		LocalDate now = LocalDate.now();
		// ��������
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy��MM��dd��");

		// ���� ����
		String formatedNow = now.format(formatter);
		int currentYear = now.getYear();

		int age = currentYear - year;

		System.out.println("����� :" + gen + "��");
		System.out.println("����� ���̴� :" + age);

	}
}
