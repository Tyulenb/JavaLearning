package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shop.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
public static String cart = "Ваш заказ:\n";
public static String delivery = "Способ получения: ";
public static String comment = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        EditText editText = binding.ET;
        CheckBox beef = binding.beef;
        CheckBox pork = binding.pork;
        CheckBox lamb = binding.lamb;
        CheckBox chicken = binding.chicken;
        CheckBox turkey = binding.turkey;
        CheckBox duck = binding.duck;

        RadioGroup radioGroup = findViewById(R.id.RG);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.RB1 == checkedId){
                    delivery="Способ получения: ";
                    delivery+="Доставка\n";
                }
                if(R.id.RB2 == checkedId){
                    delivery="Способ получения: ";
                    delivery+="Самовывоз\n";
                }
            }
        });

        Button purchase = binding.purchase;
        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(beef.isChecked()){
                    cart+="Говядина\n";
                }
                if(pork.isChecked()){
                    cart += "Свинина\n";
                }
                if(lamb.isChecked()){
                    cart += "Баранина\n";
                }
                if(chicken.isChecked()) {
                    cart += "Курица\n";
                }
                if(turkey.isChecked()){
                    cart += "Индейка\n";
                }
                if(duck.isChecked()) {
                    cart += "Утка\n";
                }
                comment = String.valueOf(editText.getText());
                if(!comment.isEmpty()){
                    cart+="Ваш комментарий: '" + comment + "' будет учтен\n";
                }
                if(Objects.equals(delivery, "Способ получения: ")){
                    delivery = "Способ получения: не указан";
                }
                cart+=delivery;
                Toast toast = Toast.makeText(MainActivity.this, "Заказ оформлен!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.FILL_HORIZONTAL, 0, 0);
                toast.show();
                TextView txt = binding.cart;
                txt.setText(cart);
                cart = "Ваш заказ:\n";
            }
        });

        Button clear = binding.clear;
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart = "Ваш заказ:\n"; delivery = "Способ получения: ";
                if(beef.isChecked()) beef.toggle();
                if(pork.isChecked()) pork.toggle();
                if(lamb.isChecked()) lamb.toggle();
                if(chicken.isChecked()) chicken.toggle();
                if(turkey.isChecked()) turkey.toggle();
                if(duck.isChecked()) duck.toggle();
                radioGroup.clearCheck();
                TextView txt = binding.cart;
                txt.setText("");
                editText.getText().clear();
            }
        });
    }
}