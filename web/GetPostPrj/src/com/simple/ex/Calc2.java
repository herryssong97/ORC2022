package com.simple.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2")
public class Calc2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
// Application 저장소 준비
//ServletContext application = req.getServletContext();

//HttpSession session = req.getSession();

		Cookie[] cookies = req.getCookies();


		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		PrintWriter out = resp.getWriter();

		String value_ = req.getParameter("value");
		String op = req.getParameter("operator");

		int value = 0;

		if (!value_.equals(""))
			value = Integer.parseInt(value_);

		if (op.equals("=")) {

			System.out.println("**value :" + value);
			System.out.println("**op :" + op);

			int x = 0;
			for (Cookie c : cookies) {
				if (c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}

			// = (Integer) cookies.getAttribute("value");

			//String operator = (String) session.getAttribute("op");

			int y = value; // value;
			String operator = "";
			for (Cookie c : cookies) {
				if (c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}

			int result = 0;

			if (operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}

			resp.getWriter().printf("결과 값 : %d\n", result);
		} else {

			System.out.println("value :" + value);
			System.out.println("op :" + op);

			Cookie valueCookie = new Cookie("value", String.valueOf(value));
			Cookie opCookie = new Cookie("op", op);

			//valueCookie.setPath("/");
			//opCookie.setPath("/ClacPrj");

			// maxAge 설정 - 24시간 유지
			valueCookie.setMaxAge(365 * 24 * 60 * 60);
			opCookie.setMaxAge(365 * 24 * 60 * 60);

			// 클라이언트 PC에 쿠키값을 저장한다.
			resp.addCookie(valueCookie);
			resp.addCookie(opCookie);
			
			// Redirection
			resp.sendRedirect("calc2.html");
			
			//session.setAttribute("value", value);
			//session.setAttribute("op", op);
		}
	}
}