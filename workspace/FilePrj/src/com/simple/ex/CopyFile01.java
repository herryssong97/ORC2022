package com.simple.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream in = null; // null �� �ʱ�ȭ
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int c;

			// -1�̸� �� �о���, -1�� �Ǵ� ���ȿ��� ��� �о��
			while ((c = in.read()) != -1) {
				if(c == 13) {
					out.write(c);
					out.write(49);
					out.write(58);
				}
				out.write(c);
				System.out.println(c);
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
