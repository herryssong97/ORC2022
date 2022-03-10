package com.simple.ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile02 {

	// utf코드가 글자단위로 읽는 것
	
	public static void main(String[] args) throws IOException {

		FileReader in = null; // null로 초기화
		FileWriter out = null;
		// 글자수 카운트
		int count = 0;

		try {
			in = new FileReader("input1.txt");
			out = new FileWriter("output1.txt");

			int c;

			// -1이면 다 읽었다, -1이 되는 동안에는 계속 읽어라
			while ((c = in.read()) != -1) {

				out.write(c);
				count++;
				System.out.println(c);
			}

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

		System.out.println("글자 수:"+count);
			
		}

	}

