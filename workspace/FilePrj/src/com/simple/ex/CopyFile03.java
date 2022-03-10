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

	// 원본 파일명에 img.01.jpg 입력, 복사본 파일명에 img.02.jpg 입력
	// => img.01이 복사가 된다

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("원본 파일명 입력 : ");
		String inputFilename = scan.next();

		System.out.println("복사본 파일명 입력 : ");
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

		System.out.println(inputFilename + "을" + outputFilename + "로 복사 하였습니다");
	}
}
