package com.symatechlabs.javaandroidconcepts.views.movies;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.symatechlabs.javaandroidconcepts.common.dependencyinjection.CompositionRoot;
import com.symatechlabs.javaandroidconcepts.model.movies.GetMovie;
import com.symatechlabs.javaandroidconcepts.network.api.OmdbApi;

public class MovieSearch extends AppCompatActivity {

    MovieSearchMvc movieSearchMvc;
    GetMovie getMovie;
    CompositionRoot compositionRoot;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movieSearchMvc = new MovieSearchMvc(LayoutInflater.from(this), null);
        setContentView(movieSearchMvc.getRootView());
        compositionRoot = new CompositionRoot();
        getMovie = new GetMovie(compositionRoot.getOmdbApi());

        getMovie.getMovie("The Godfather");
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }
}
