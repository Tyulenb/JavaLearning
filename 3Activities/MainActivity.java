package com.example.a3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.a3activity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    final static String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.to2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("from", "FromA1");
                startActivity(intent);
            }
        });

        binding.to3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra("from", "FromA1");
                startActivity(intent);
            }
        });
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = getIntent().getStringExtra("from");
                Intent intent;
                if (str != null) {
                    switch (str) {
                        case "FromA2":
                            intent = new Intent(MainActivity.this, MainActivity2.class);
                            intent.putExtra("from", "FromA1");
                            startActivity(intent);
                            break;
                        case "FromA3":
                            intent = new Intent(MainActivity.this, MainActivity3.class);
                            intent.putExtra("from", "FromA1");
                            startActivity(intent);
                            break;
                        default:
                            break;
                    }
                }
            }
        });
    }
}