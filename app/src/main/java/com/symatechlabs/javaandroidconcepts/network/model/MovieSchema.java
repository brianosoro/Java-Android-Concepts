package com.symatechlabs.javaandroidconcepts.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class MovieSchema{

    @SerializedName("Title")
    @Expose
    String movieTitle;
    @SerializedName("Year")
    @Expose
    String year;
    @SerializedName("Runtime")
    @Expose
    String runtime;
    @SerializedName("Genre")
    @Expose
    String genre;
    @SerializedName("Language")
    @Expose
    String language;
    @SerializedName("Director")
    @Expose
    String director;
    @SerializedName("Writer")
    @Expose
    String writer;
    @SerializedName("Actors")
    @Expose
    String actors;
    @SerializedName("Plot")
    @Expose
    String plot;
    @SerializedName("imdbRating")
    @Expose
    String imdbRating;
    @SerializedName("Metascore")
    @Expose
    String metaScore;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getMetaScore() {
        return metaScore;
    }

    public void setMetaScore(String metaScore) {
        this.metaScore = metaScore;
    }




}
