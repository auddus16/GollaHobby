package com.example.myapplication;

// 예진
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {

    ImageView logoHome; //홈으로 돌아가는 로고
    SeekBar sbprogress; //진행률 seekbar
    TextView tvQues; //본인은 다음 질문에 대해 얼마나 해당하나요?
    TextView tvQNum; //Q1,,,
    TextView tvQ; //설문지내용
    TextView tvsb; //seekbar에 해당하는 숫자
    SeekBar sb; //seekbar
    TextView tv0; //seekbar값 0표시
    TextView tv100; //seekbar값 100표시
    Button btnNext; //Next버튼

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        logoHome=findViewById(R.id.imageView1);
        sbprogress=findViewById(R.id.seekBar2);
        tvQues=findViewById(R.id.textView1);
        tvQNum=findViewById(R.id.textView2);
        tvQ=findViewById(R.id.textView3);
        tvsb=findViewById(R.id.textView4);
        sb=findViewById(R.id.seekBar);
        tv0=findViewById(R.id.textView5);
        tv100=findViewById(R.id.textView6);
        btnNext=findViewById(R.id.button);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                startActivity(intent);
            }
        });
    }
}
