package com.simple.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/mine2")
public class Alone02 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = UTF-8");

		int a = 0;
		int b = 0;
		
		String a_ = request.getParameter("a");
		String b_ = request.getParameter("b");
		String write="화면이 잘 나오는지 확인중입니다.";
		
		a = Integer.parseInt(a_);
		b = Integer.parseInt(b_);

		int tot = a-b;
		PrintWriter out = response.getWriter();


		out.print(write);
		out.print("<h3>a="+a+"</h3>");
		out.print("<h3>b="+b+"</h3>");
		out.print("<h3>뺄셈 ="+tot+"</h3>");
		out.close();
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		System.out.println("dopost실행됨");
//		int a = 100;
//		int b = 2;
//		
//		String write="화면이 잘 나오는지 확인중입니다.";
//		int tot = a*b;
//		PrintWriter out = response.getWriter();
//
//
//		out.print(write);
//		out.print("<h3>a="+a+"</h3>");
//		out.print("<h3>b="+b+"</h3>");
//		out.print("<h3>곱셈 ="+tot+"</h3>");
//		out.close();
		
		
	}
	
	
}
