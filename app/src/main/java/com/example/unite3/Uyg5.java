package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Uyg5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg5);

        float ondalik1 = 1f / 3f;
        double ondalik2 = 1d / 3d;
        System.out.println("float: (1/3)" + ondalik1);
        System.out.println("double: (1/3)" + ondalik2);

    }


    public void geri(View view) {
        Intent i = new Intent(Uyg5.this, MainActivity.class);
        startActivity(i);
    }
}
