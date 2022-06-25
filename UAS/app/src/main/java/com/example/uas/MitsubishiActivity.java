package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MitsubishiActivity extends AppCompatActivity {

    private ImageView imageView25, imageView37, imageView38, imageView39, imageView40, imageView41, imageView42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UAS);
        setContentView(R.layout.activity_mitsubishi);

        imageView25 = findViewById(R.id.imageView25);
        imageView37 = findViewById(R.id.imageView37);
        imageView38 = findViewById(R.id.imageView38);
        imageView39 = findViewById(R.id.imageView39);
        imageView40 = findViewById(R.id.imageView40);
        imageView41 = findViewById(R.id.imageView41);
        imageView42 = findViewById(R.id.imageView42);

        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EclipseActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OutlanderActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PajeroActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), xpanderActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), xpancrossActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TritonActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}