package com.example.myapplication;

// 예진
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SmallHobbyAcitivty extends AppCompatActivity {

    ImageView logoHome; //홈으로 이동하는 로고
    TextView tvTitle; //취미이름타이틀
    ImageView ivHobby; //해당취미사진
    TextView tvHobby; //해당취미설명
    Button btnBack; //Back버튼

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smallhobby);

        logoHome=findViewById(R.id.imageView2);
        tvTitle=findViewById(R.id.tvSb);
        ivHobby=findViewById(R.id.imageView3);
        tvHobby=findViewById(R.id.textView5);
        btnBack=findViewById(R.id.button2);

        GradientDrawable drawable=(GradientDrawable)getApplicationContext().getDrawable(R.drawable.round_background);
        tvHobby.setBackground(drawable);
        tvHobby.setClipToOutline(true);
    }
}
