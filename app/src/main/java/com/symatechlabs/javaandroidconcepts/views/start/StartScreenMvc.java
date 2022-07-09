package com.symatechlabs.javaandroidconcepts.views.start;


import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.symatechlabs.javaandroidconcepts.databinding.StartScreenBinding;
import com.symatechlabs.javaandroidconcepts.utils.Permissions;
import com.symatechlabs.javaandroidconcepts.views.contacts.ContactsActivity;

public class StartScreenMvc implements StartScreenInterface {

    View rootView;
    StartScreenBinding startScreenBinding;
    Permissions permissions;
    String[] PERMISSIONS = {Manifest.permission.READ_CONTACTS};

    public StartScreenMvc(LayoutInflater inflater, ViewGroup parent) {
        startScreenBinding = StartScreenBinding.inflate(inflater);
        rootView = startScreenBinding.getRoot();
        permissions = new Permissions(getContext());

        startScreenBinding.enable.setOnClickListener( v -> {
            if(!permissions.hasPermissions(PERMISSIONS)){
                permissions.requestPermissions(PERMISSIONS);
            }
        });
        startScreenBinding.proceed.setOnClickListener( v -> {
            getContext().startActivity(new Intent(getContext(), ContactsActivity.class));
        });
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
