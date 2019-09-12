package com.example.evaltobie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCalculette(View v){
        Intent intent = new Intent(this, CalculetteActivity.class);
        startActivity(intent);
    }

    public void goTva(View v){
        Intent intent = new Intent(this, TvaActivity.class);
        startActivity(intent);
    }
}
