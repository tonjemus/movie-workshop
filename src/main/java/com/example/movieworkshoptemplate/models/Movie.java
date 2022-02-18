package com.example.movieworkshoptemplate.models;

import java.util.ArrayList;

//Movie POJO
public class Movie implements Comparable<Movie>{
    //Year, Length, Title, Subject, Popularity & Awards (opdelt af ; i filen)
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private boolean wonAwards; //Yes = true & No = false

    public Movie(int year, int length, String title, String subject, int popularity, String wonAwards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        if(wonAwards.equals("Yes")) {
            this.wonAwards = true;
        }else{
            this.wonAwards = false;
        }
    }

    public Movie(int year, String title, int popularity) {
        this.year = year;
        this.title = title;
        this.popularity = popularity;
    }

    public Movie() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public boolean isWonAwards() {
        return wonAwards;
    }

    public void setWonAwards(boolean wonAwards) {
        this.wonAwards = wonAwards;
    }

    @Override
    public String toString(){
        return "<h3>Title: " + title + " (" + year + ") " + "Popularity: " + popularity + "<h3>";
    }

    @Override
    public int compareTo(Movie o) {
        if(popularity == o.popularity){
            return 0;
        }else if(popularity > o.popularity){
            return 1;
        }else{
            return -1;
        }

    }
}
