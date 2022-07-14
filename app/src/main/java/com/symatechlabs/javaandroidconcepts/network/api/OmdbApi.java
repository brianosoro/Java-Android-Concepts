package com.symatechlabs.javaandroidconcepts.network.api;

import com.symatechlabs.javaandroidconcepts.common.Constants;
import com.symatechlabs.javaandroidconcepts.network.model.MovieSchema;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface OmdbApi {

    @POST("/?apikey="+ Constants.OMDB_API_KEY)
    Call<MovieSchema> getMovie(@Query("t") String title);


}
