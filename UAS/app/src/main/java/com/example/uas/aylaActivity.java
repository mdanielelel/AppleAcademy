package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class aylaActivity extends AppCompatActivity {

    private ImageView imageView96;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayla);

        imageView96 = findViewById(R.id.imageView96);

        imageView96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DaihatsuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}