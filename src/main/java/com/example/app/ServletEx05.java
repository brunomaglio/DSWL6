package com.example.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx05
 */
@WebServlet("/ServletEx05")
public class ServletEx05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<String> arrayList = new ArrayList<String>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("name");
		
		arrayList.add(userName);
		
		// TODO Auto-generated method stub
		response.getWriter().append("Nomes da lista: ").append(arrayList.toString());
	}


}
