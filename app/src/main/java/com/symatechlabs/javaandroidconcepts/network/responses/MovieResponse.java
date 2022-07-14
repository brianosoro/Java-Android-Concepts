package com.symatechlabs.javaandroidconcepts.network.responses;

import com.symatechlabs.javaandroidconcepts.network.model.MovieSchema;

import java.util.List;

public class MovieResponse {

    List<MovieSchema> movie;

    public MovieResponse(List<MovieSchema> movie) {
        this.movie = movie;
    }

    public List<MovieSchema> getMovie(){
        return movie;
    }
}
