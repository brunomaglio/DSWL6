package com.example.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.classes.User;

/**
 * Servlet implementation class ServletEx07
 */
@WebServlet("/ServletEx07")
public class ServletEx07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<User> userList = new ArrayList<User>();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
        User existingUser = findUserByName(name);
        
        if (existingUser != null) {
            existingUser.incrementAccessCount();
        } else {
            userList.add(new User(name));
        }
		
        for (User user : userList) {
            response.getWriter().append(user.getName() + ": " + user.getCount() + " acessos \n");
        }
	}

	private User findUserByName(String name) {
		if( !userList.isEmpty()) {
			for (User user : userList) {
	            if (user != null && user.getName() != null && user.getName().equalsIgnoreCase(name)) {
                	return user;
            	}
        	} 
        }
        return null;
    }
	
}
