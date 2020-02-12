package com.example.myapplication;

// 명연
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvFirst;
    TextView tvFirstResult;
    TextView tvYou1;
    TextView tvEnd1;

    TextView tvSecond;
    TextView tvSecondResult;
    TextView tvYou2;
    TextView tvEnd2;

    Button btnNext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvName=findViewById(R.id.tvName);
        tvFirstResult=findViewById(R.id.tvFirstReult);
        tvSecondResult=findViewById(R.id.tvSecondResult);
        btnNext=findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);
            }
        });
    }
}
