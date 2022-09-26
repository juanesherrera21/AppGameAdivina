package com.example.mainactivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class creditos extends AppCompatActivity {

    public void onClick(View view){

        Intent miIntent = new Intent(creditos.this,MainActivity.class);

        startActivity(miIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);


    }
}
