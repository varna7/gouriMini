package com.example.maju.mazdor.App;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;



public class App  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //set database to persist
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

}