package com.simple.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyFile03 {

	// ���� ���ϸ� img.01.jpg �Է�, ���纻 ���ϸ� img.02.jpg �Է�
	// => img.01�� ���簡 �ȴ�

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("���� ���ϸ� �Է� : ");
		String inputFilename = scan.next();

		System.out.println("���纻 ���ϸ� �Է� : ");
		String outputFilename = scan.next();
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(inputFilename);
			out = new FileOutputStream(outputFilename);
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(inputFilename + "��" + outputFilename + "�� ���� �Ͽ����ϴ�");
	}
}
