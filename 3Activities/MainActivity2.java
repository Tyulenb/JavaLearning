package com.example.a3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.a3activity.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain2Binding binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("from", "FromA2");
                startActivity(intent);
            }
        });

        binding.to3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("from", "FromA2");
                startActivity(intent);
            }
        });
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = getIntent().getStringExtra("from");
                Log.d("MAIN", str);
                Intent intent;
                switch (str){
                    case "FromA1":
                        intent = new Intent(MainActivity2.this, MainActivity.class);
                        intent.putExtra("from", "FromA2");
                        startActivity(intent);
                        break;
                    case "FromA3":
                        intent =  new Intent(MainActivity2.this, MainActivity3.class);
                        intent.putExtra("from", "FromA2");
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}