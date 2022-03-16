package com.simple.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getPost")
public class GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		String name = config.getServletName();
		System.out.println(name + "서블릿 생성시 호출됨!!");
	}

	public void destroy() {
		System.out.println("서블릿 소멸시 호출됨");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//
		System.out.println("서비스는 매번 호출됨");
		super.service(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("Get 방식으로 호출 되었음");
		PrintWriter out = response.getWriter();

		String num1_ = request.getParameter("num1");
		String num2_ = request.getParameter("num2");
		String operator =request.getParameter("operator");

		int num1 = 0;
		int num2 = 0;

		if (num1_ != null 
				&& !num1_.equals("") ) {
			num1 = Integer.parseInt(num1_);
		}

		if (num2_ != null 
				&& !num2_.equals("") ) {
			num2 = Integer.parseInt(num2_);
		}
		
		int result = 0; 
		
		out.write("<h3>덧셈 계산결과</h3>");
		out.write("<h3>num1 :"+num1+"</h3>");
		out.write("<h3>num2 :"+num2+"</h3>");
		
		if(operator.equals("덧셈")) {
			result = num1+num2;
			out.write("<h3>합계 :"+result+"</h3>");
		}
		if(operator.equals("뺄셈")) {
			result = num1-num2;
			out.write("<h3>차 :"+result+"</h3>");
		}
		if(operator.equals("곱셈")) {
			result = num1*num2;
			out.write("<h3>곱 :"+result+"</h3>");
		}
		if(operator.equals("나눗셈")) {
			result = num1/num2;
			out.write("<h3>몫 :"+result+"</h3>");
		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Post 방식으로 호출 되었음");
		doGet(request, response);
	}

}
