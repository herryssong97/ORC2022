package com.simple.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile01 {
	
	// ����Ʈ ������ �д°�

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream in = null; // null �� �ʱ�ȭ
		FileOutputStream out = null;
		int count=0;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int c;

			// -1�̸� �� �о���, -1�� �Ǵ� ���ȿ��� ��� �о��
						
			while((c = in.read()) != -1 ) {	
				out.write(c);
				System.out.println(c);
				count++;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���� ��:"+count);
		}

	}
