package com.example.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx09
 */
@WebServlet("/ServletEx09")
public class ServletEx09 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArrayList<String> nomes = new ArrayList<>();

	public ServletEx09() {
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Ana");
		nomes.add("Carlos");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");

		String nomeRemover = request.getParameter("nome");

		if (nomes.removeIf(nome -> nome.equalsIgnoreCase(nomeRemover))) {
			response.getWriter().println("<h3>Nome '" + nomeRemover + "' removido com sucesso.</h3>");
		} else {
			response.getWriter().println("<h3>Nome '" + nomeRemover + "' não encontrado.</h3>");
		}

		response.getWriter().println("<h4>Nomes restantes:</h4>");
		response.getWriter().println("<ul>");
		for (String nome : nomes) {
			response.getWriter().println("<li>" + nome + "</li>");
		}
		response.getWriter().println("</ul>");

	}

}
