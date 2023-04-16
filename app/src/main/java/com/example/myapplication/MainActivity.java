package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button calculateBtn;
    EditText principalGetText, timeGetText, rateGetText;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculateBtn = findViewById(R.id.calculateBtn);
        principalGetText = findViewById(R.id.principal);
        rateGetText = findViewById(R.id.rate);
        timeGetText = findViewById(R.id.time);
        resultText = findViewById(R.id.result);


        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double principal = Double.parseDouble(principalGetText.getText().toString());
                double rate = Double.parseDouble(rateGetText.getText().toString());
                double time = Double.parseDouble(rateGetText.getText().toString());
                double interest = (principal * rate * time) / 100;
                resultText.setText("Simple Interest is : Rs." + interest);

            }
        });


    }
}