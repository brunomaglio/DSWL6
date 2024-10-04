package com.example.app;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.classes.Product;

/**
 * Servlet implementation class ServletEx08
 */
@WebServlet("/ServletEx08")
public class ServletEx08 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<Product> productList = new ArrayList<Product>();
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("product");
		String priceString = request.getParameter("price");
		
		BigDecimal price = new BigDecimal(priceString);

		Product product = new Product(name, price);
		productList.add(product);
		
		response.setContentType("text/html");

		StringBuilder htmlResponse = new StringBuilder();
		htmlResponse.append("<html><body>");
		htmlResponse.append("<h1>Lista de Produtos Cadastrados</h1>");
		
		if (productList.isEmpty()) {
			htmlResponse.append("<p>Nenhum produto cadastrado ainda.</p>");
		} else {
			htmlResponse.append("<ul>");
			for (Product p : productList) {
				htmlResponse.append("<li>").append(p.getName()).append(" - R$ ").append(p.getPrice()).append("</li>");
			}
			htmlResponse.append("</ul>");
		}
		
		htmlResponse.append("</body></html>");
		
		response.getWriter().write(htmlResponse.toString());
	}

}
