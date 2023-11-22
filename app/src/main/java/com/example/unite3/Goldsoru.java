package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Goldsoru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldsoru);


        char karakter = 'A';
        int ascii = (int) karakter;

        if (48 >= ascii && 57 <= ascii) {
            System.out.println("rakam girildi");
        } else {
            System.out.println("yazı girildi");
        }
    }
}