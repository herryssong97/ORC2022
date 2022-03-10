package com.simple.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyFile04 {

	// 글자 출력하기

	public static void main(String[] args) throws IOException {

		DataInputStream in = null;
		DataOutputStream out = null;

		try {
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
			int c;
			out.writeDouble(3.14);
			out.writeInt(123);
			out.writeUTF("안녕하세요");
			out.writeUTF("자바입니다");
			out.flush();

			in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.bin")));
			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			System.out.println(in.readUTF());

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}
}
