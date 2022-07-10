package com.symatechlabs.javaandroidconcepts.views.start;


import static com.symatechlabs.javaandroidconcepts.utils.Constants.INTENT_CONTACTS_DATABASE;

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
    String[] PERMISSIONS = {Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE};

    public StartScreenMvc(LayoutInflater inflater, ViewGroup parent) {
        startScreenBinding = StartScreenBinding.inflate(inflater);
        rootView = startScreenBinding.getRoot();
        permissions = new Permissions(getContext());

        startScreenBinding.enable.setOnClickListener( v -> {
            if(!permissions.hasPermissions(PERMISSIONS)){
                permissions.requestPermissions(PERMISSIONS);
            }
        });
        startScreenBinding.contacts.setOnClickListener( v -> {
            getContext().startActivity(new Intent(getContext(), ContactsActivity.class));
        });

        startScreenBinding.contactsDB.setOnClickListener( v -> {
            Intent intent = new Intent(getContext(), ContactsActivity.class);
            intent.putExtra(INTENT_CONTACTS_DATABASE, true);
            getContext().startActivity(intent);
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
