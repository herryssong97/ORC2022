package com.simple.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile01 {
	
	// 바이트 단위로 읽는것

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream in = null; // null 로 초기화
		FileOutputStream out = null;
		int count=0;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int c;

			// -1이면 다 읽었다, -1이 되는 동안에는 계속 읽어라
						
			while((c = in.read()) != -1 ) {	
				out.write(c);
				System.out.println(c);
				count++;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("글자 수:"+count);
		}

	}
