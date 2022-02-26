package com.example.movieworkshoptemplate.services;

import com.example.movieworkshoptemplate.models.Movie;
import com.example.movieworkshoptemplate.repositories.MovieDataRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MovieService{
    //Services called from controllers that returns what the client requests
    MovieDataRepository movieRepository = new MovieDataRepository();

    public String firstMovieFromList() throws FileNotFoundException{ //3.2
        ArrayList<Movie> movieLibrary = movieRepository.allMovies();
        String firstMovie = movieLibrary.get(0).getTitle();

        return firstMovie;
    }

    public String randomMovieFromList() throws FileNotFoundException { //3.3
        ArrayList<Movie> movieLibrary = movieRepository.allMovies();
        Random rand = new Random();
        int randomNumber = rand.nextInt(movieLibrary.size());

        String randomMovie = movieLibrary.get(randomNumber).getTitle();

        return randomMovie;
    }

    public int wonAnAward() throws FileNotFoundException { //3.5
        ArrayList<Movie> movieLibrary = movieRepository.allMovies();
        int howManyMoviesWon = 0;

        for (int i = 0; i < movieLibrary.size(); i++) {
            if(movieLibrary.get(i).isWonAwards()){ // == true
                howManyMoviesWon++;
            }
        }

        return howManyMoviesWon;
    }

    public String tenMoviesSortedByPopularity() throws FileNotFoundException {
        ArrayList<Movie> movieLibrary = movieRepository.allMovies();
        Random rand = new Random();
        ArrayList<Movie> tenMovies = new ArrayList<Movie>();
        Movie toStringMovie = new Movie();

        for(int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(movieLibrary.size());

            tenMovies.add(movieLibrary.get(randomNumber));
        }

        Collections.sort(tenMovies);

        String tenMoviesString = "";

        for(int i = 0; i < tenMovies.size(); i++) {
            tenMoviesString = tenMoviesString + tenMovies.get(i).toString();
        }

        return tenMoviesString;
    }

    public String longestMovie2Genres() throws FileNotFoundException {
        ArrayList<Movie> movieLibrary = movieRepository.allMovies();
        int genreCount1 = 0;
        int genreLenght1 = 0;
        int genreCount2 = 0;
        int genreLength2 = 0;

        for(int i = 0; i < movieLibrary.size(); i++) {
            if(movieLibrary.get(i).getSubject() == genre1){
                genreLenght1 += movieLibrary.get(i).getLength();
                genreCount1++;

            }else if(movieLibrary.get(i).getSubject() == genre2){
                genreLength2 += movieLibrary.get(i).getLength();
                genreCount2++;
            }

        double averageLengthGenre1 = (double) genreLenght1/genreCount1;
        double averageLengthGenre2 = (double) genreLength2/genreCount2;

        }

        return null;
    }

}
