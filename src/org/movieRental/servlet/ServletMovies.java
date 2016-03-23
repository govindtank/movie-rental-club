package org.movieRental.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.movieRental.entities.Movie;
import org.movieRental.entities.User;
import org.movieRental.model.ModelMovie;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class ServletMovies
 */
public class ServletMovies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ModelMovie model = new ModelMovie();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMovies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		User user= (User) request.getSession().getAttribute("username");
		
		
		ArrayList<Movie> movie = model.ShowMoviesByUser(user.getId());
		request.setAttribute("movie", movie);
		request.getRequestDispatcher("movies.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user= (User) request.getSession().getAttribute("username");
		
		String movie =request.getParameter("txtMovie");
		String release =request.getParameter("txtRelease");
		model.AddMovie(movie, release, user.getId());
		
		Gson gson = new Gson();
		JsonObject myObj = new JsonObject();
		JsonElement movieObj= gson.toJsonTree(movie);
		myObj.addProperty("success", true);
		myObj.add("movie", movieObj);
		
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().println(myObj.toString());
		
	
	}

}
