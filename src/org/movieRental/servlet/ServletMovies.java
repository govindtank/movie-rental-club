package org.movieRental.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.movieRental.entities.Movie;

import org.movieRental.model.ModelMovie;

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
		
		ArrayList<Movie> movie = model.ShowMovies();
		request.setAttribute("movie", movie);
		request.getRequestDispatcher("movies.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	}

}
