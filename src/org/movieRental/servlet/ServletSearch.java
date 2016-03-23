package org.movieRental.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.movieRental.model.ModelMovie;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class ServletSearch
 */
public class ServletSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ModelMovie model = new ModelMovie();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("txtSearch");
		model.searchMovie(name);
		
		Gson gson = new Gson();
		JsonObject myObj = new JsonObject();
		JsonElement moviename = gson.toJsonTree(model);
		myObj.addProperty("success", true);
		myObj.add("name", moviename);
		
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().println(myObj.toString());
		
	}

}
