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
 * Servlet implementation class ServletEx06
 */
@WebServlet("/ServletEx06")
public class ServletEx06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static List<String> arrayList = new ArrayList<String>();
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String comment = request.getParameter("comment");
		
		arrayList.add(comment);
		
		response.getWriter().println("Comentários da lista: " + arrayList.toString());
	}

}
