package com.simple.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/firstWeb")
public class FirstWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = UTF-8");
		
		int a = 100;
		int b = 200;
		int tot = a+b;
		PrintWriter out = response.getWriter();
		out.print("<h3>a="+a+"</h3>");
		out.print("<h3>b="+b+"</h3>");
		out.print("<h3>합계="+tot+"</h3>");
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 실행됨");
		// doGet();
	}

}
