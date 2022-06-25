package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MercyActivity extends AppCompatActivity {

    private ImageView imageView15, imageView30, imageView31, imageView32, imageView33, imageView34, imageView35;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UAS);
        setContentView(R.layout.activity_mercy);

        imageView15 = findViewById(R.id.imageView15);
        imageView30 = findViewById(R.id.imageView30);
        imageView31 = findViewById(R.id.imageView31);
        imageView32 = findViewById(R.id.imageView32);
        imageView33 = findViewById(R.id.imageView33);
        imageView34 = findViewById(R.id.imageView34);
        imageView35 = findViewById(R.id.imageView35);

        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AduaratusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AMGgtrActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CLAtigalimaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CtigaratusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SempatlimapuluhActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CempattigaActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}