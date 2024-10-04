package com.example.app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx10
 */
@WebServlet("/ServletEx10")
public class ServletEx10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private ArrayList<String> tasks = new ArrayList<>();
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String task = request.getParameter("task");

        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task);
        }
        
        response.setContentType("text/html");
        response.getWriter().println("<h2>Tarefas</h2>");
        response.getWriter().println("<ul>");

        for (String t : tasks) {
        	response.getWriter().println("<li>" + t + "</li>");
        }

        response.getWriter().println("</ul>");
	}

}
