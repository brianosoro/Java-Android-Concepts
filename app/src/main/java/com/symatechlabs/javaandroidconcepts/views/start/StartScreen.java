package com.symatechlabs.javaandroidconcepts.views.start;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.symatechlabs.javaandroidconcepts.views.contacts.ContactsActivity;

public class StartScreen extends AppCompatActivity {

    StartScreenMvc startScreenMvc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startScreenMvc = new StartScreenMvc(LayoutInflater.from(this), null);
        setContentView(startScreenMvc.getRootView());

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }
}
