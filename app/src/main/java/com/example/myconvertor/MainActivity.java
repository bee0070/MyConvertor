package com.example.myconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findLength(View view) {
        Intent intent = new Intent(this, Length.class);
        startActivity(intent);
    }

    public void findVolume(View view) {
        Intent intent = new Intent(this, Volume.class);
        startActivity(intent);
    }

    public void findMoney(View view) {
        Intent intent = new Intent(this, Temperature.class);
        startActivity(intent);
    }

    public void findMass(View view) {
        Intent intent = new Intent(this, Mass.class);
        startActivity(intent);
    }
}