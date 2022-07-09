package com.symatechlabs.javaandroidconcepts.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.core.app.ActivityCompat;

public class Permissions {

    Context context;

    public Permissions(Context context) {
        this.context = context;
    }

    public boolean hasPermissions(String... permissions) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && this.context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(this.context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    public void requestPermissions(String... PERMISSIONS){
        ActivityCompat.requestPermissions((Activity) context, PERMISSIONS, 1); //Could later on update this part
    }

}
