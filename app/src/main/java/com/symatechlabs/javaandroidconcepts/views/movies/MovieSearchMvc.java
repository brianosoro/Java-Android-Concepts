package com.symatechlabs.javaandroidconcepts.views.movies;


import android.Manifest;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.symatechlabs.javaandroidconcepts.databinding.MovieSearchBinding;
import com.symatechlabs.javaandroidconcepts.common.Permissions;

public class MovieSearchMvc implements MovieSearchInterface {

    View rootView;
    MovieSearchBinding movieSearchBinding;
    Permissions permissions;
    String[] PERMISSIONS = {Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE};

    public MovieSearchMvc(LayoutInflater inflater, ViewGroup parent) {
        movieSearchBinding = MovieSearchBinding.inflate(inflater);
        rootView = movieSearchBinding.getRoot();
        permissions = new Permissions(getContext());

    }


    @Override
    public View getRootView(){
        return rootView;
    }
    @Override
    public Context getContext(){
        return rootView.getContext();
    }
}
