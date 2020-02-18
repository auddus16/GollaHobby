package com.example.myapplication;

// 예진
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
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

        Intent intent=getIntent(); //num7 intent
        byte[] arr =getIntent().getByteArrayExtra("image"); //hobby image intent
        Bitmap bm= BitmapFactory.decodeByteArray(arr,0,arr.length);;
        Intent intent2=getIntent(); //num7 intent
        String Title =intent2.getStringExtra("Title"); //hobby title intent


        ivHobby.setImageBitmap(bm);
        tvTitle.setText(Title);


        GradientDrawable drawable=(GradientDrawable)getApplicationContext().getDrawable(R.drawable.round_background);
        ivHobby.setBackground(drawable);
        ivHobby.setClipToOutline(true);

        //취미설명
        if(tvTitle.getText().equals("꽃꽂이")){ //제작형
            tvHobby.setText("꽃꽂이");
        } else if(tvTitle.getText().equals("목공예")){ //제작형
            tvHobby.setText("목공예");
        }else if(tvTitle.getText().equals("디저트 만들기")){  //제작형
            tvHobby.setText("디저트 만들기");
        }else if(tvTitle.getText().equals("십자수 만들기")){  //제작형
            tvHobby.setText("십자수 만들기");
        }else if(tvTitle.getText().equals("꽃꽂이")){ //제작형
            tvHobby.setText("꽃꽂이");
        }else if(tvTitle.getText().equals("사진찍기")){ //창작형
            tvHobby.setText("사진찍기");
        }else if(tvTitle.getText().equals("벽화 봉사")){ //창작형
            tvHobby.setText("벽화 봉사");
        }else if(tvTitle.getText().equals("그림그리기")){ //창작형
            tvHobby.setText("그림그리기");
        }else if(tvTitle.getText().equals("뮤지컬 감상")){ //감상형
            tvHobby.setText("뮤지컬 감상");
        }else if(tvTitle.getText().equals("향수만들기")){ //감상형
            tvHobby.setText("향수만들기");
        }else if(tvTitle.getText().equals("차 체험")){  //감상형
            tvHobby.setText("차 체험");
        }else if(tvTitle.getText().equals("여행하기")){ //감상형
            tvHobby.setText("여행하기");
        }else if(tvTitle.getText().equals("승마")){ //오락형
            tvHobby.setText("승마");
        }else if(tvTitle.getText().equals("검도")){ //오락형
            tvHobby.setText("검도");
        }else if(tvTitle.getText().equals("클라이밍")){ //오락형
            tvHobby.setText("클라이밍");
        }else if(tvTitle.getText().equals("드론")){ //오락형
            tvHobby.setText("드론");
        }else if(tvTitle.getText().equals("토론하기")){ //분석형
            tvHobby.setText("토론하기");
        }else if(tvTitle.getText().equals("외국어공부")){ //분석형
            tvHobby.setText("외국어공부");
        }


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ex.class); //btnBack을 누르면 select hobbysearching 화면으로 이동
                startActivity(intent);
            }
        });

    }//end onCreate
}//end class
