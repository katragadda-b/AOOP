package com.MovieComparator;

class Movie {
 private String title;
 private double rating;


 public Movie(String title, double rating) {
     this.title = title;
     this.rating = rating;
 }

 public String getTitle() {
     return title;
 }

 public double getRating() {
     return rating;
 }

 @Override
 public String toString() {
     return "Movie{" +
             "title='" + title + '\'' +
             ", rating=" + rating +
             '}';
 }
}
