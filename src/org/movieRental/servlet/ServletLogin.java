package org.movieRental.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.movieRental.entities.User;
import org.movieRental.model.ModelUser;

/**
 * Servlet implementation class ServletLogin
 */
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ModelUser model =new ModelUser();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getSession().invalidate();
		response.sendRedirect("login.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(true);
		
		String username = request.getParameter("txtUser");
		String password = request.getParameter("txtPassword");
		boolean result = model.Autenticate(username, password);
		User user = model.getUserByName(username);
		
		if (result == true){
			session.setAttribute("username", user);
			response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("True");
		}else{
			response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("false");
			
		}	
		
		
	}

}
