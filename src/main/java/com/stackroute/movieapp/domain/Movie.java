package com.stackroute.movieapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;


@Document(value = "movie")
public class Movie {
    @Id
    private int movieid;
    private String moviename;
    private String moviedetails;

    public Movie() {
    }

    public Movie(int movieid, String moviename, String moviedetails) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.moviedetails = moviedetails;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviedetails() {
        return moviedetails;
    }

    public void setMoviedetails(String moviedetails) {
        this.moviedetails = moviedetails;
    }
}

