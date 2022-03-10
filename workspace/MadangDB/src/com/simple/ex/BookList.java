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

		// 1. 드라이버 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		}

		// 2. DB 접속
		try {
			System.out.println("데이터베이스 연결 준비 ...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터베이스 접속 실패");
		}
	}

	// 책이름 조회
	// 3. SQL 명령어 처리
	private void queryBookName() throws SQLException {
		// SQL 명령어 준비
		String inQuery = "";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("찾고싶은 도서의 이름 입력하세요");
		inQuery = keyboard.nextLine();

		String query = "SELECT * FROM Book Where bookname like '%" + inQuery + "%'";
		System.out.println("query :" + query);

		// 1) 문장객체 준비
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("\t도서아이디\t도서명\t출판사\t가격");

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

	// 3. SQL 명령어 처리
	private void sqlRun() throws SQLException {
		// SQL 명령어 준비
		String query = "SELECT * FROM Book";

		// 1) 문장객체 준비
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("\t도서아이디\t도서명\t출판사\t가격");

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
