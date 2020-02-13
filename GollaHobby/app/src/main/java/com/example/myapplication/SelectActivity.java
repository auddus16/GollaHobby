package com.example.myapplication;

// 성호
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SelectActivity extends AppCompatActivity {

    Button button8;
    Button button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        button8 = findViewById(R.id.btnStartTest);
        button5 = findViewById(R.id.btnHobbySearching);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExplainActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HobbyActivity.class);
                startActivity(intent);
            }
        });
    }
}
