package com.simple.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BookList {

	Connection con;

	public BookList() {

		String url = "jdbc:mysql://localhost:3306/madang";
		String userid = "root";
		String pwd = "Qpqp1356!!";

		// 1. ����̹� �ε�
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("����̹� �ε� ����");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� �ε� ����");
		}

		// 2. DB ����
		try {
			System.out.println("�����ͺ��̽� ���� �غ� ...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ����");
		}
	}

	// å�̸� ��ȸ
	// 3. SQL ��ɾ� ó��
	private void queryBookName() throws SQLException {
		// SQL ��ɾ� �غ�
		String inQuery = "";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("ã����� ������ �̸� �Է��ϼ���");
		inQuery = keyboard.nextLine();

		String query = "SELECT * FROM Book Where bookname like '%" + inQuery + "%'";
		System.out.println("query :" + query);

		// 1) ���尴ü �غ�
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("\t�������̵�\t������\t���ǻ�\t����");

			while (rs.next()) {
				System.out.print("\t" + rs.getInt("bookid"));
				System.out.print("\t" + rs.getString("bookname"));
				System.out.print("\t" + rs.getString("publisher"));
				System.out.print("\t" + rs.getInt("price"));
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//con.close();
		}
	}

	// 3. SQL ��ɾ� ó��
	private void sqlRun() throws SQLException {
		// SQL ��ɾ� �غ�
		String query = "SELECT * FROM Book";

		// 1) ���尴ü �غ�
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("\t�������̵�\t������\t���ǻ�\t����");

			while (rs.next()) {
				System.out.print("\t" + rs.getInt("bookid"));
				System.out.print("\t" + rs.getString("bookname"));
				System.out.print("\t" + rs.getString("publisher"));
				System.out.print("\t" + rs.getInt("price"));
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//con.close();
		}
	}

	public static void main(String[] args) /* throws SQLException */ {
		BookList book = new BookList();

		try {
			book.sqlRun();
			book.queryBookName();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
