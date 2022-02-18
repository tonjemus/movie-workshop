package com.example.movieworkshoptemplate.repositories;

import com.example.movieworkshoptemplate.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDataRepository {
    //Methods to get data from file

    public ArrayList<Movie> allMovies() throws FileNotFoundException {
        ArrayList<Movie> movieArrayList = new ArrayList<Movie>();

        File movieData = new File("resources/imdb-data.csv");
        Scanner scan = new Scanner(movieData);
        scan.nextLine(); //springer første linje over, da den er String hele vejen

        while(scan.hasNextLine()){
            String movieFromLine = scan.nextLine();
            String[] movieStringArray = movieFromLine.split(";");
            Movie currentMovie = new Movie(
                    Integer.parseInt(movieStringArray[0]),
                    Integer.parseInt(movieStringArray[1]),
                    movieStringArray[2],
                    movieStringArray[3],
                    Integer.parseInt(movieStringArray[4]),
                    movieStringArray[5]
            );
            movieArrayList.add(currentMovie);
        }
        return movieArrayList;
    }
}
