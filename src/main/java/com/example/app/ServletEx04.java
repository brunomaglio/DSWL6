package com.example.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx04
 */
@WebServlet("/ServletEx04")
public class ServletEx04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static int count = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		count += 1;
		response.getWriter().printf("Número de acessos: %d", count);
	}

}
