package com.simple.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi") // 이 방식을 제일 많이 사용한다. 많이 안바뀌는 경우
// 매핑과 이 안에서 이름을 정해줄 수 있다.
// 외부에서 이름을 설정해주면 소스를 건드리는 일을 최소로 할 수 있다.
public class SecondWeb extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = UTF-8");
		// int a = 100;
		// int b = 200;
		// 쿼리 스트링은 전체 형식을 부르는 말 a(변수명)=(값)&(연산자) 모두 포함하여 하는 말!
		// 파라미터는 a의 값, b의 값 따로 부르는 말
		String a_ = request.getParameter("a");
		String b_ = request.getParameter("b");
		int a = 0; // 기본값을 설정해 줘야한다
		int b = 0;
		a = Integer.parseInt(a_);
		b = Integer.parseInt(b_);
		
		int tot = a+b;
		PrintWriter out = response.getWriter();
		out.print("<h3>a="+a+"</h3>");
		out.print("<h3>b="+b+"</h3>");
		out.print("<h3>합계="+tot+"</h3>");
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		int a = 100;
		int b = 200;
		int tot = a+b;
		PrintWriter out = response.getWriter();
		out.print("<h3>a="+a+"</h3>");
		out.print("<h3>b="+b+"</h3>");
		out.print("<h3>합계="+tot+"</h3>");
		out.close();
	}
	
}
