package com.example.movieworkshoptemplate.controllers;

import com.example.movieworkshoptemplate.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@RestController
public class MovieController {

    /*public MovieController() throws FileNotFoundException {
    }*/

    //Controller methods
    @GetMapping("/") //3.1
    public String index(){
        return "Hello World welcome to my application";
    }

    //få første film fra listen
    @GetMapping("/getFirst") //3.2
    public String getFirstTitle() throws FileNotFoundException {
        MovieService firstMovieTitle = new MovieService();

        String firstTitle = firstMovieTitle.firstMovieFromList();
        return firstTitle;
    }
    //få en random film fra listen
    @GetMapping("/getRandom") //3.3
    public String getRandom() throws FileNotFoundException {
        MovieService randomMovieTitle = new MovieService();
        String randomTitle = randomMovieTitle.randomMovieFromList();

        return randomTitle;
    }

    @GetMapping("/getTenSortByPopularity") //3.4
    public String getTenSortByPopularity() throws FileNotFoundException {
        MovieService tenMoviesSortedByPop = new MovieService();

        String arrayListTenSortedMovies = tenMoviesSortedByPop.tenMoviesSortedByPopularity();

        return arrayListTenSortedMovies;
    }

    @GetMapping("/howManyWonAnAward") //3.5
    public int howManyWonAnAward() throws FileNotFoundException {
        MovieService howManyMoviesWonAnAward = new MovieService();
        int amountOfMovies = howManyMoviesWonAnAward.wonAnAward();

        return amountOfMovies;
    }
}
