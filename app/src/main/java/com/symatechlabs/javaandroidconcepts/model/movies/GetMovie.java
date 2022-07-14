package com.symatechlabs.javaandroidconcepts.model.movies;

import android.util.Log;

import com.symatechlabs.javaandroidconcepts.network.api.OmdbApi;
import com.symatechlabs.javaandroidconcepts.network.model.MovieSchema;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetMovie{

    private final OmdbApi omdbApi;

    public GetMovie(OmdbApi omdbApi) {
        this.omdbApi = omdbApi;
    }

    public void getMovie(String title){

        omdbApi.getMovie(title).enqueue(new Callback<MovieSchema>() {
            @Override
            public void onResponse(Call<MovieSchema> call, Response<MovieSchema> response) {

            }

            @Override
            public void onFailure(Call<MovieSchema> call, Throwable t) {

            }
        });
    }
}
