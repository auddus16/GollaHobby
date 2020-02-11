package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
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


    public void setSupportActionBar(@Nullable androidx.appcompat.widget.Toolbar toolbar){
        super.setSupportActionBar(toolbar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}
