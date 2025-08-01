package com.aurinpro.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/rating")
public class MovieRatingServlet extends HttpServlet {

    private static final Map<String, Movie> movieData = new HashMap<>();

    // Static block to hardcode movie data
    static {
        movieData.put("inception", new Movie("Inception", "Sci-Fi", "8.8/10", "Mind-blowing, great visuals!"));
        movieData.put("interstellar", new Movie("Interstellar", "Sci-Fi", "8.6/10", "Emotional and scientific journey."));
        movieData.put("avatar", new Movie("Avatar", "Action/Fantasy", "7.9/10", "Visually stunning epic."));
        movieData.put("dangal", new Movie("Dangal", "Drama", "8.4/10", "Inspiring story with powerful acting."));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String movieName = request.getParameter("movieName");

        if (movieName == null || movieName.trim().isEmpty()) {
            out.println("<h3 style='color:red;'>Movie name cannot be empty!</h3>");
            return;
        }

        movieName = movieName.trim().toLowerCase();

        if (movieData.containsKey(movieName)) {
            Movie m = movieData.get(movieName);

            out.println("<h2>Movie Rating Summary</h2>");
            out.println("<ul>");
            out.println("<li><strong>Title:</strong> " + m.name + "</li>");
            out.println("<li><strong>Genre:</strong> " + m.genre + "</li>");
            out.println("<li><strong>Rating:</strong> " + m.rating + "</li>");
            out.println("<li><strong>Review:</strong> " + m.review + "</li>");
            out.println("</ul>");
        } else {
            out.println("<h3 style='color:red;'>Sorry, no data available for the movie: " + movieName + "</h3>");
        }
    }

    // Inner class to hold movie data
    static class Movie {
        String name;
        String genre;
        String rating;
        String review;

        public Movie(String name, String genre, String rating, String review) {
            this.name = name;
            this.genre = genre;
            this.rating = rating;
            this.review = review;
        }
    }
}

