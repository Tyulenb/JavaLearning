package com.example.a3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a3activity.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain3Binding binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                intent.putExtra("from", "FromA3");
                startActivity(intent);
            }
        });

        binding.to2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                intent.putExtra("from", "FromA3");
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
                        case "FromA1":
                            intent = new Intent(MainActivity3.this, MainActivity.class);
                            intent.putExtra("from", "FromA3");
                            startActivity(intent);
                            break;
                        case "FromA2":
                            intent = new Intent(MainActivity3.this, MainActivity2.class);
                            intent.putExtra("from", "FromA3");
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