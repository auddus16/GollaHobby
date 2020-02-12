package com.example.myapplication;

// 예진
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SmallHobbyAcitivty extends AppCompatActivity {

    TextView tvTitle; //취미이름타이틀
    ImageView ivHobby; //해당취미사진
    TextView tvHobby; //해당취미설명
    Button btnBack; //Back버튼

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smallhobby);

        tvTitle=findViewById(R.id.tvTitle);
        ivHobby=findViewById(R.id.ivHobby);
        tvHobby=findViewById(R.id.tvHobby);
        btnBack=findViewById(R.id.btnBack);

        GradientDrawable drawable=(GradientDrawable)getApplicationContext().getDrawable(R.drawable.round_background);
        tvHobby.setBackground(drawable);
        tvHobby.setClipToOutline(true);
    }
}
