package com.example.android.musicalstructureapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by justo on 29/04/17.
 */

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
