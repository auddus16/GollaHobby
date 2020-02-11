package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class num2_layout extends AppCompatActivity {
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn1 = findViewById(R.id.button8);
        btn2 = findViewById(R.id.button5);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view1 = getLayoutInflater().inflate(R.layout.num7,null);
            }
        });
    }
}
