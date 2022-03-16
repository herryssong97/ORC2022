package com.simple.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugu")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		String num_ = request.getParameter("num");
		String value = request.getParameter("value");

		int num = 0;
		int result = 0;

		num = Integer.parseInt(value);

		// num = Integer.parseInt(num_);

		out.print("<h3>서블릿구구단을 출력한다</h3>");
		for (int i = 0; i < 10; i++) {

			result = num * i;
			out.print(num + "x" + i + "=" + result + "<br>");

		}

	}
}
