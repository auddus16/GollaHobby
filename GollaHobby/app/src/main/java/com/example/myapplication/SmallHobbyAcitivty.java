package com.example.myapplication;

// 예진
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
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
    TextView tvLink; //링크연결
    Button btnBack; //Back버튼

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smallhobby);

        tvTitle=findViewById(R.id.tvTitle);
        ivHobby=findViewById(R.id.ivHobby);
        tvHobby=findViewById(R.id.tvHobby);
        btnBack=findViewById(R.id.btnBack);
        tvLink=findViewById(R.id.tvLink);

        Intent intent=getIntent(); //num7 intent
        byte[] arr =intent.getByteArrayExtra("image"); //hobby image intent
        Bitmap bm= BitmapFactory.decodeByteArray(arr,0,arr.length);;

        Intent intent2=getIntent(); //num7 intent
        String Title =intent2.getStringExtra("Title"); //hobby title intent


        ivHobby.setImageBitmap(bm); //사진
        tvTitle.setText(Title);  //타이틀


        GradientDrawable drawable=(GradientDrawable)getApplicationContext().getDrawable(R.drawable.round_background);
        ivHobby.setBackground(drawable);
        ivHobby.setClipToOutline(true);

        //취미설명
        if(tvTitle.getText().equals("꽃꽂이")){ //제작형
            tvHobby.setText(
                    "       원예치료라는 것이 있을만큼 식물을 다루는 일은 정서적으로 큰 도움이 됩니다. 꽃의 종류와 색상, 질감 등을 선택하여 개인의 취향에 맞는 결과물을 얻을 수 있습니다. 어느새 플로리스트처럼 다양한 스타일의 작품을 만들어 성취감을 느낄 수 있습니다. "
                    );
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=fcn3N-deRrY"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 꽃꽂이
        } else if(tvTitle.getText().equals("목공예")){ //제작형
            tvHobby.setText(
                    "       배우는 과정이 까다롭지 않고 개인의 취향에 맞는 가구와 소품을 만들 수 있습니다. 원목마다 고유의 빛깔과 결이 있기 때문에 다양한 연출을 시도하기에 좋습니다. 공방에서 개설중인 강좌를 꼼꼼하게 비교한 뒤 자신에게 맞는 수업을 들어보는 것을 추천합니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=KkJ-IG1rjX8"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 목공예
        }else if(tvTitle.getText().equals("디저트 만들기")){  //제작형
            tvHobby.setText(
                    "       개인의 취향에 맞는 맛과 모양의 디저트를 만들 수 있습니다. 달콤한 디저트를 만들어 주변 지인들과 나눠 먹는 즐거움을 느낄 수 있습니다. 집에서 만들 수 있는 디저트 레시피들이 많기 때문에 부담없이 시작하기 좋습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=GCHdCV3w2EY"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 디저트 만들기
        }else if(tvTitle.getText().equals("십자수 만들기")){  //제작형
            tvHobby.setText(
                    "       비교적 쉽고 간단하며 장소와 시간에 관계없이 만들 수 있습니다. 기본만 익히면 약간의 손재주만으로도 프로 못지 않은 작품을 만들어 성취감을 얻을 수 있습니다. 자신의 작품을 누군가에게 선물하기에도 좋습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=dfDobzh_zWM"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 십자수 만들기
        }else if(tvTitle.getText().equals("사진찍기")){ //창작형
            tvHobby.setText(
                    "       출사를 가면서 사진 찍는 즐거움을 느낄 수 있습니다. 아름다운 것들을 볼 수 있어 정신 건강에 좋고, 일상의 소소한 것들까지 관찰해야하기 때문에 집중력을 기르는것에 좋습니다. 모르고 살던 것에 관심이 많아지고 사물을 다른 관점에서 볼 수 있는 시각이 생깁니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=dOZFQQcWbeY"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 사진찍기
        }else if(tvTitle.getText().equals("벽화 봉사")){ //창작형
            tvHobby.setText(
                    "       여럿이 같은 목표를 갖고 작업하다 보면 협동심을 기를 수 있습니다. 자신의 영역에서 개성을 뽐내면서 스스로를 만족시키고, 공동으로 하나의 그림을 완성한다는 성취감을 얻을 수 있습니다. 그림을 보는 지역사람들과 소통하고 보람을 느끼고 싶다면 이 활동을 추천합니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=X6Ig2zOc4z0"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 벽화 봉사
        }else if(tvTitle.getText().equals("그림그리기")){ //창작형
            tvHobby.setText(
                    "       시간이 날 때마다 그림을 조금씩 그려서 어느새 완성해가는 성취감을 느낄 수 있습니다. 차분해지는 기분을 느끼며 힐링을 경험해보길 추천합니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=nit-4VdaYZg"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 그림그리기
        }else if(tvTitle.getText().equals("뮤지컬 감상")){ //감상형
            tvHobby.setText(
                    "       타인의 경험을 느끼고 이해하는 과정으로, 인간의 정서적인 측면에 중요하게 작용합니다. 본인의 심리 상태나 감정을 재빨리 인식하는 능력이 향상되고, 심리적 통찰력도 풍부해집니다. 우울증을 겪고 있는 사람들은 삶의 위안을 얻을 수 있습니다. ");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=HIQODOM2c5w&list=PL9nbiuMI5_Kq9puZnhSFJa7NxP-3ZvZe0"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 뮤지컬 감상
        }else if(tvTitle.getText().equals("향수만들기")){ //감상형
            tvHobby.setText(
                    "       세상에는 다양한 향이 있고, 그 향은 각자의 경험을 담고 있습니다. 스스로의 향을 찾아가며 행복했던 추억을 떠올리고, 미소짓게 만드는 본인만의 향수 만들기를 체험해보길 추천합니다."
            );
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=Yi2Y_R_LyXw"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 향수만들기
        }else if(tvTitle.getText().equals("차 체험")){  //감상형
            tvHobby.setText(
                    "       차는 스트레스를 낮춰줌으로써 편안하게 잘 수 있게 수면을 조절합니다. 피부보호는 물론 다양한 위장 장애에도 효과적입니다. 개인의 취향에 맞는 차를 선택하시고, 삶의 질을 높이는 것을 추천합니다."
                    );
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=NnnrnDf6tLw"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 차체험
        }else if(tvTitle.getText().equals("여행하기")){ //감상형
            tvHobby.setText(
                    "       자기 계발, 자아 발견에 좋은 방법입니다. 반복되는 일상에서 벗어나 삶을 활기차게 만들어줄 것입니다. 낯선 환경에서 길을 찾는 것은 성취감을 얻을 수 있고, 이러한 성취감은 일상생활에서 자신감으로 이어질 수 있습니다. "
                    );
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=CVNB5y54j9A"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 여행하기
        }else if(tvTitle.getText().equals("승마")){ //오락형
            tvHobby.setText(
                    "       남녀노소 누구나 할 수 있는 운동입니다. 스트레스를 줄일 수 있어서 정신 건강에 좋으며, 말과 교감함으로써 정서적으로 도움이 됩니다. 허리를 펴고 바른 자세를 유지해야 하므로 자세교정에 매우 좋습니다.\n");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=YTWDIs5FeFM"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 승마
        }else if(tvTitle.getText().equals("검도")){ //오락형
            tvHobby.setText(
                    "       동작을 민첩하고 활발하게 해줍니다. 혼자서 하는 운동이 아니므로 상대방의 입장을 존중하고 예의를 지키는 태도를 양성할 수 있습니다. 인내심을 기를 수 있어 인격 성장에 도움이 되는 활동입니다."



            );
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=dW_xlLi5oM8"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 검도
        }else if(tvTitle.getText().equals("클라이밍")){ //오락형
            tvHobby.setText(
                    "       전신 근육을 이용하는 활동이므로 근력발달, 지구력향상, 유연성 증대에 효과적입니다. 고도의 집중력을 필요로 하기 때문에 두뇌발달에 도움이 됩니다. 많은 준비물이 필요없는 운동이므로 부담없이 시작할 수 있습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=AqRErmnSOio"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 클라이밍
        }else if(tvTitle.getText().equals("드론")){ //오락형
            tvHobby.setText(
                    "       섬세한 조종실력으로 드론을 조종하고, 원하는 곳에 대한 넓은 시야를 얻을 수 있다는 것에 쾌감을 느낄 수 있습니다. 답답한 실내에서 벗어나 상쾌한 공기를 마시면서 힐링을 할 수 있습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=H0dMVDxMOVA"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 드론
        }else if(tvTitle.getText().equals("토론하기")){ //분석형
            tvHobby.setText(
                    "       전반적인 언어 능력을 향상시킬 수 있습니다. 실전 토론 과정에서 자기 주장을 상대방 또는 청중에게 정확하게 전달하는 능력과 표현력, 발표력을 기를 수 있습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=X7oz-kAQ-Iw"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 토론하기
        }else if(tvTitle.getText().equals("외국어공부")){ //분석형
            tvHobby.setText(
                    "       단어와 문법을 공부하여 암기력과 집중력을 향상시킬 수 있고, 이는 두뇌 발달과 치매 예방에 효과적입니다. 외국인과의 의사소통이 가능해지면서 다른 나라의 문화를 간접적으로 체험할 수 있습니다. ");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/watch?v=UhTJHcNn-pQ"));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 외국어공부
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //이전페이지로 이동
            }
        });

    }//end onCreate
}//end class
