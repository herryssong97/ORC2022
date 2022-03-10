package com.simple.ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile02 {

	// utf�ڵ尡 ���ڴ����� �д� ��
	
	public static void main(String[] args) throws IOException {

		FileReader in = null; // null�� �ʱ�ȭ
		FileWriter out = null;
		// ���ڼ� ī��Ʈ
		int count = 0;

		try {
			in = new FileReader("input1.txt");
			out = new FileWriter("output1.txt");

			int c;

			// -1�̸� �� �о���, -1�� �Ǵ� ���ȿ��� ��� �о��
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

		System.out.println("���� ��:"+count);
			
		}

	}

