package com.example.myapplication;

import androidx.annotation.Nullable;
<<<<<<< Updated upstream
import androidx.appcompat.app.ActionBar;
=======
>>>>>>> Stashed changes
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
<<<<<<< Updated upstream
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends MainActivity {
    Toolbar toolbar;

    TextView tvName;//사용자 이름

    TextView tvFirst;//<1순위> 당신은
    TextView tvFirstResult;//1순위 결과값
    TextView tv12; //입니다. 텍스트뷰

    TextView tvsecond;//<1순위> 당신은
    TextView tvSecondResult;//1순위 결과값
    TextView tv; //입니다. 텍스트뷰

    Button btnNext;//next버튼

=======
import android.widget.ArrayAdapter;
import android.widget.Spinner;
//import android.widget.Toolbar;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private Spinner spinner;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    Toolbar toolbar;
>>>>>>> Stashed changes

    public void setSupportActionBar(@Nullable androidx.appcompat.widget.Toolbar toolbar){
        super.setSupportActionBar(toolbar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

<<<<<<< Updated upstream
        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

=======
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
>>>>>>> Stashed changes
    }
}
