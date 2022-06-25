package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class sigraActivity extends AppCompatActivity {

    private ImageView imageView98;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigra);

        imageView98 = findViewById(R.id.imageView98);

        imageView98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DaihatsuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}