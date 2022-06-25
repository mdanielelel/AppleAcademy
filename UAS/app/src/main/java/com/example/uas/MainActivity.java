package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private TextView textView22;
    private Button button2;
    private ProgressBar progressBar2;
    private static String URL = "http://192.168.1.6/ProgTech/UAS/Login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UAS);
        setContentView(R.layout.activity_main);

        textView22 = findViewById(R.id.textView22);
        button2 = findViewById(R.id.button2);
        username = findViewById(R.id.usernameLogin);
        password = findViewById(R.id.passwordLogin);
        progressBar2 = findViewById(R.id.progressBar2);

        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Loginusername = username.getText().toString().trim();
                String Loginpassword = password.getText().toString().trim();

                if (!Loginusername.isEmpty() || !Loginpassword.isEmpty()){
                    Login(Loginusername, Loginpassword);
                } else {
                    username.setError("Please insert username");
                    password.setError("Please insert password");
                }
            }
        });
    }

    private void Login(String username, String password) {
        progressBar2.setVisibility(View.VISIBLE);
        button2.setVisibility(View.GONE);

        StringRequest request = new StringRequest(Request.Method.POST, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("1")){
                            Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                            startActivity(intent);
                            finish();
                        }else {
                            progressBar2.setVisibility(View.GONE);
                            button2.setVisibility(View.VISIBLE);
                            Toast.makeText(MainActivity.this, "Username or Password is Invalid.", Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressBar2.setVisibility(View.GONE);
                        button2.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this, "Error" + error.toString(), Toast.LENGTH_SHORT).show();
                    }
                })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username", username);
                params.put("password", password);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}