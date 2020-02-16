package com.example.myapplication;

// 윤진
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class LogInActivity extends AppCompatActivity {

    Toolbar toolbar;
    private Spinner spinner;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    Button btnNext;
    EditText etName;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arrayList = new ArrayList<>();
        arrayList.add("10대");
        arrayList.add("20대");
        arrayList.add("30대");
        arrayList.add("40대");
        arrayList.add("50대");
        arrayList.add("60대");
        arrayList.add("70대");
        arrayList.add("80대");
        arrayList.add("90대");

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arrayList);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(arrayAdapter);

        btnNext = findViewById(R.id.btnNext);
        etName = findViewById(R.id.etName);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
                intent.putExtra("Name", etName.getText().toString());
                startActivity(intent);
            }
        });
    }
}
