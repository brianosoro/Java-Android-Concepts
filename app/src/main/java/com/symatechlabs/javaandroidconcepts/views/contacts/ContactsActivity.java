package com.symatechlabs.javaandroidconcepts.views.contacts;

import android.Manifest;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class ContactsActivity extends AppCompatActivity {

    ContactsMvc contactsMvc;
    String[] PERMISSIONS = {Manifest.permission.READ_CONTACTS};
    Bundle bundle;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getIntent().getExtras();
        contactsMvc = new ContactsMvc(LayoutInflater.from(this), null, bundle);
        setContentView(contactsMvc.getRootView());





    }




}
