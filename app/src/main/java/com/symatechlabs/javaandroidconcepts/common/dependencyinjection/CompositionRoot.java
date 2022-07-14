package com.symatechlabs.javaandroidconcepts.common.dependencyinjection;

import com.symatechlabs.javaandroidconcepts.common.Constants;
import com.symatechlabs.javaandroidconcepts.network.api.OmdbApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CompositionRoot {

    private Retrofit retrofit;

    private Retrofit getRetrofit(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public OmdbApi getOmdbApi(){
        return getRetrofit().create(OmdbApi.class);
    }

}
