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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Scanner;

public class CopyFile06 {

	// C:\\Temp\\ 추가해보기

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream in = null;
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(
					new FileOutputStream("C:\\Temp\\object.bin"));
			
			Date date = new Date();
			
			System.out.println("생성된 날짜 : "+date);
			out.writeObject(date);
			out.flush();

			in = new ObjectInputStream(
					new FileInputStream("object.bin"));
			
			Date d = (Date)in.readObject();
			System.out.println("읽어온 날짜 : "+d);
			

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
