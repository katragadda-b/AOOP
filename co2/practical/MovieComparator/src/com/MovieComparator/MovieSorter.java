package com.MovieComparator;
import java.util.*;

public class MovieSorter {

    public static void main(String[] args) {
        // Create a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8));
        movies.add(new Movie("The Shawshank Redemption", 9.3));
        movies.add(new Movie("The Godfather", 9.2));
        movies.add(new Movie("The Dark Knight", 9.0));
        movies.add(new Movie("Pulp Fiction", 8.9));

        // Display the unsorted list
        System.out.println("Unsorted Movie List:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Instantiate the custom comparator
        RatingComparator ratingComparator = new RatingComparator();

        // Sort the movies by rating using the custom comparator
        Collections.sort(movies, ratingComparator);

        // Display the sorted list
        System.out.println("\nSorted Movie List by Rating:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}