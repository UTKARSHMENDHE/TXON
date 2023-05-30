package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText input;
    Button gram;
    Button pound;
    Button ton;
    Button milligram;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        input = findViewById(R.id.input);
        gram = findViewById(R.id.gram);
        pound = findViewById(R.id.pound);
        ton = findViewById(R.id.ton);
        milligram = findViewById(R.id.milligram);

        gram.setOnClickListener(v -> {
            String num = input.getText().toString();
            int number = Integer.parseInt(num);
            float gram = (number * 1000);
            output.setText("Value in grams : " + gram);
        });
        pound.setOnClickListener(v -> {
            String num = input.getText().toString();
            int number = Integer.parseInt(num);
            float pound = (float) (number * 2.20);
            output.setText("Value in pounds : " + pound);
        });
        ton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String num = input.getText().toString();
                int number = Integer.parseInt(num);
                double ton = (number * 0.001);
                output.setText("Value in tons : " + ton);
            }
        });
        milligram.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String num = input.getText().toString();
                int number = Integer.parseInt(num);
                float milligram = (number * 1000000);
                output.setText("Value in milligrams : " + milligram);
            }
        });

    }
}