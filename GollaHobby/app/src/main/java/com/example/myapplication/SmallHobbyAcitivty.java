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
            tvHobby.setText("당신은 꼼꼼하고 책임감있는 사람입니다. 계획적이며, 미래에 대비하는 편입니다. 업무에 있어서 개인 감정을 배제하는 것에 익숙하고, 평소 결단력과 실형력을 가지고 있습니다." +
                    "따라서 추천하는 취미는 꽃꽂이입니다. 원예치료라는 것이 있을만큼 식물을 다루는 일이 정서적으로도 큰 도움이 됩니다." +
                    "개인의 취향에 맞는 꽃의 종류와 색상, 질감 등을 선택하여 다양한 스타일을 시도해 볼 수 있어 쉽게 흥미를 잃는 분들께도 좋은 취미활동이 될 수 있습니다." +
                    "좋아하는 꽃, 병 혹은 상자, 꽃가위와 꽃칼만 준비하면 되니 부담없이 시작할 수 있습니다. 혼자서도 충분히 시작할 수 있고 계속 연습하다보면 " +
                    "어느새 플로리스크 못지않은 작품을 만들 수 있습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 꽃꽂이
        } else if(tvTitle.getText().equals("목공예")){ //제작형
            tvHobby.setText("당신은 꼼꼼하고 책임감있는 사람입니다. 계획적이며, 미래에 대비하는 편입니다. 업무에 있어서 개인 감정을 배제하는 것에 익숙하고, 평소 결단력과 실행력을 가지고 있습니다." +
                    "따라서 추천하는 취미는 목공예입니다. 배우는 과정이 까다롭지 않고 스스로 원하는 소품이나 가구를 만들 수 있는 장점이 있습니다. 원목마다 고유의 빛깔과 별이 있기 때문에 개인의 취향에 맞는" +
                    "목재를 이용하여 다양한 연출을 할 수 있습니다. 취미로 목공예를 배우고 싶다면  많은 공방에서 개설중인 강좌를 꼼꼼하게 비교한 뒤 자신에게 맞는 수업을 선택하는 것이 좋습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 목공예
        }else if(tvTitle.getText().equals("디저트 만들기")){  //제작형
            tvHobby.setText("당신은 꼼꼼하고 책임감있는 사람입니다. 계획적이며, 미래에 대비하는 편입니다. 업무에 있어서 개인 감정을 배제하는 것에 익숙하고, 평소 결단력과 실행력을 가지고 있습니다." +
                    "따라서 추천하는 취미는 디저트 만들기입니다. 젤리, 마카롱, 케이크, 쿠키, 푸딩 등 다양한 디저트 종류가 있습니다. 개인의 취향에 맞게 원하는 모양과 맛으로 만들 수 있습니다. "+"집에서도" +
                    "만들 수 있는 디저트 레시피들이 많기 때문에 시작하는데에 부담을 가질 필요가 없습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 디저트 만들기
        }else if(tvTitle.getText().equals("십자수 만들기")){  //제작형
            tvHobby.setText("당신은 꼼꼼하고 책임감있는 사람입니다. 계획적이며, 미래에 대비하는 편입니다. 업무에 있어서 개인 감정을 배제하는 것에 익숙하고, 평소 결단력과 실행력을 가지고 있습니다."+
                    "따라서 추천하는 취미는 십자수 만들기입니다. 비교적 쉽고 간단하며 다양한 소품들을 장소와 시간에 관계없이 생산할 수 있다는 장점이 있습니다. 기본만 익히면 약간의 손재주만으로도 프로 못지 않은 작품에 뿌듯해질 수 있습니다." +
                    "본인만의 작품을 만들 뿐 아니라 누군가에게 선물하기에도 좋습니다. ");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 십자수 만들기
        }else if(tvTitle.getText().equals("사진찍기")){ //창작형
            tvHobby.setText("당신은 이상적인 세상을 만들어 가는 사람입니다. 본인 생각을 말로 전달하는 것보다 글로 적을 때 잘 표현합니다. 평소 미래, 꿈, 가능성에 관심이 많고, 다른 사람의 마음에 잘 공감해주는 편입니다."+"" +
                    "따라서 추천하는 취미는 사진찍기입니다. 풍경사진을 찍기 위해 출사를 가면 더 많은 에너지를 소비하고 사진 찍는 즐거움을 느낄 수 있습니다." +
                    "아름다운 것을 많이 보다 보니 정신 건강에도 좋고, 일상의 소소한 것들까지 관찰해야하기 때문에 집중력을 기르는것에 좋습니다. 모르고 살던 것에 관심이 많아지고 사물을 다른 관점에서 볼 수 있는 시각이 생깁니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 사진찍기
        }else if(tvTitle.getText().equals("벽화 봉사")){ //창작형
            tvHobby.setText("당신은 이상적인 세상을 만들어 가는 사람입니다. 본인 생각을 말로 전달하는 것보다 글로 적을 때 잘 표현합니다. 평소 미래, 꿈, 가능성에 관심이 많고, 다른 사람의 마음에 잘 공감해주는 편입니다." +
                    "따라서 추천하는 취미는 벽화 봉사입니다. 벽화그리기는 미술치료와 통하는 부분이 있습니다. 여럿이 같은 목표를 갖고 작업하다 보면 협동심을 기를 수 있습니다. 각자 자신의 영역에서 개성을 뽐내면서 스스로를 만족시키고," +
                    "공동으로 하나의 그림을 이룬다는 심리적인 성취감을 얻을 수 있습니다. 동료들과 협동 작업을 하면서 그림을 보는 지역사람들과 소통하 ");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 벽화 봉사
        }else if(tvTitle.getText().equals("그림그리기")){ //창작형
            tvHobby.setText("당신은 이상적인 세상을 만들어 가는 사람입니다. 본인 생각을 말로 전달하는 것보다 글로 적을 때 잘 표현합니다. 평소 미래, 꿈, 가능성에 관심이 많고, 다른 사람의 마음에 잘 공감해주는 편입니다." +
                    "따라서 추천하는 취미는 그림그리기입니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 그림그리기
        }else if(tvTitle.getText().equals("뮤지컬 감상")){ //감상형
            tvHobby.setText("당신은 뛰어난 통찰력과 관찰력을 가진 사람입니다. 혼자서 하는 활동을 집중적으로 하는 편이며, 가슴으로 느껴지는 것을 중요시합니다. 평소 심신이 편안하고, 침착하게 행동합니다. 틀에 맞춰 규칙적으로 생활하는 것을 좋아합니다. " +
                    "따라서 추천하는 취미는 뮤지컬 감상입니다. 타인의 경험을 느끼고 이해하는 과정으로 인간의 정서적인 측면에 중요하게 작용합니다. 뮤지컬을 감상하는 동안 본인의 심리 상태나 감정을 재빨리 인식하는 능력이 향상되고," +
                    "심리적 통찰력도 풍부해집니다. 분노나 흥분, 우울, 불안 같은 감정을 조절하는 데에 도움이 됩니다. 집중력이나 창의력이 발달되고, 우울증을 겪고 있는 사람들은 삶의 위안을 얻을 수 있습니다. ");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 뮤지컬 감상
        }else if(tvTitle.getText().equals("향수만들기")){ //감상형
            tvHobby.setText("당신은 뛰어난 통찰력과 관찰력을 가진 사람입니다. 혼자서 하는 활동을 집중적으로 하는 편이며, 가슴으로 느껴지는 것을 중요시합니다. 평소 심신이 편안하고, 침착하게 행동합니다. 틀에 맞춰 규칙적으로 생활하는 것을 좋아합니다. " +
                    "따라서 추천하는 취미는 향수만들기입니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 향수만들기
        }else if(tvTitle.getText().equals("차 체험")){  //감상형
            tvHobby.setText("당신은 뛰어난 통찰력과 관찰력을 가진 사람입니다. 혼자서 하는 활동을 집중적으로 하는 편이며, 가슴으로 느껴지는 것을 중요시합니다. 평소 심신이 편안하고, 침착하게 행동합니다. 틀에 맞춰 규칙적으로 생활하는 것을 좋아합니다. " +
                    "따라서 추천하는 취미는 차 체험입니다. 차는 스트레스를 낮추게 해 주어서 편안하게 잠을 잘 수 있게 수면을 조절합니다. 피부보호는 물론 다양한 위장 장애에도 효과적입니다. 개인의 취향에 맞는 차를 선택하시고 삶의 질을 높이는 것을 추천합니다."
                    );
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 차체험
        }else if(tvTitle.getText().equals("여행하기")){ //감상형
            tvHobby.setText("당신은 뛰어난 통찰력과 관찰력을 가진 사람입니다. 혼자서 하는 활동을 집중적으로 하는 편이며, 가슴으로 느껴지는 것을 중요시합니다. 평소 심신이 편안하고, 침착하게 행동합니다. 틀에 맞춰 규칙적으로 생활하는 것을 좋아합니다. " +
                    "따라서 추천하는 취미는 여행하기입니다. 여행은 자기 계발, 자아 발견하는데에 가장 좋은 방법입니다. 반복되는 일상에서 벗어나 새로운 일상은 삶을 더욱 활기차게 만들어줄 것입니다. " +
                    "낯선 환경에서 길을 찾는 것은 엄청난 성취감을 얻을 수 있고 이러한 성취감은 일상생활에서 자신감으로 이어질 수 있습니다. "
                    );
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 여행하기
        }else if(tvTitle.getText().equals("승마")){ //오락형
            tvHobby.setText("당신은 호기심이 많고 사람을 좋아하는 열정가입니다. 자유분방하고, 재미를 중요시하고, 따뜻한 감성을 가진 겸손한 사람이기도 합니다. 본인의 생각을 다른사람에게 전달할 때 말로 하는 것이 편합니다. " +
                    "따라서 추천하는 취미는 승마입니다. 승마는 남녀노소 누구나 할 수 있는 운동입니다. 우선 정신적으로 스트레스를 줄일 수 있어 정신건강에 좋습니다. 말과 교감함으로서 정서적으로 도움이 됩니다. " +
                    "허리를 펴고 바른 자세를 유지해야 하므로 자세교정에 매우 좋습니다. 이는 근력의 강화, 유연성의 향을 가져오게 합니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 승마
        }else if(tvTitle.getText().equals("검도")){ //오락형
            tvHobby.setText("당신은 호기심이 많고 사람을 좋아하는 열정가입니다. 자유분방하고, 재미를 중요시하고, 따뜻한 감성을 가진 겸손한 사람이기도 합니다. 본인의 생각을 다른사람에게 전달할 때 말로 하는 것이 편합니다. " +
                    "따라서 추천하는 취미는 검도입니다. 검도는 남녀노소 누구나 할 수 있는 운동입니다. 이 운동은 무한한 매력을 가지고 있으며 많은 장점들을 가지고 있습니다. 신체를 강건하게하고 동작을 민첩하고 활발하게 해줍니다. " +
                    "자세가 바로잡히고 태도가 침착해지며 품격이 갖추어집니다. 혼자서 하는 운동이 아니므로 상대의 입장을 존중하며 예의를 지키며 공정한 태도가 양성됩니다. 인내심을 기를 수 있으며 좋은 인격을 만들기에 좋은 활동이므로 추천합니다."
                    );
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 검도
        }else if(tvTitle.getText().equals("클라이밍")){ //오락형
            tvHobby.setText("당신은 호기심이 많고 사람을 좋아하는 열정가입니다. 자유분방하고, 재미를 중요시하고, 따뜻한 감성을 가진 겸손한 사람이기도 합니다. 본인의 생각을 다른사람에게 전달할 때 말로 하는 것이 편합니다. " +
                    "따라서 추천하는 취미는 클라이밍입니다. 클라이밍은 남녀노소 누구나 할 수 있는 운동입니다. 1시간에 약 500칼로리가 소모될 정도로 다이어트 효과가 있습니다. 전신 근육을 이용하는 활동이므로 근력발달, 지구력향상, 유연성 증대에 도움을 줍니다." +
                    "또한 고도의 집중력과 두뇌가 발달됩니다. 많은 준비물이 필요없는 운동이므로 부담없이 시작할 수 있습니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 클라이밍
        }else if(tvTitle.getText().equals("드론")){ //오락형
            tvHobby.setText("당신은 호기심이 많고 사람을 좋아하는 열정가입니다. 자유분방하고, 재미를 중요시하고, 따뜻한 감성을 가진 겸손한 사람이기도 합니다. 본인의 생각을 다른사람에게 전달할 때 말로 하는 것이 편합니다. " +
                    "따라서 추천하는 취미는 드론입니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 드론
        }else if(tvTitle.getText().equals("토론하기")){ //분석형
            tvHobby.setText("당신은 비평적인 관점을 가진 뛰어난 전략가입니다. 이상적인 세상을 만들어 가는 사람이기도합니다. 옳다, 그르다가 중요해서 친구가 잘못하면 지적해주는 편이며, 객관적인 판단이나 생각에 대한 이야기를 많이 합니다. " +
                    "따라서 추천하는 취미는 토론하기입니다. 토론은 언어를 활용하는 모능 능력의 향상을 돕고, 사고력을 확장시켜줍니다. 자료를 조사하는 과정에서 독해력, 분석력을 기를 수 있습니다. 실전 토론을 하는 과정에서 자기 주장을 상대방 또는 청중에게 정확하게 전달하고, 설득하는 표현력, 발표력을" +
                    "기를 수 있습니다. 상대방의 주장을 듣는 과정에서 경청하는 자세를 배우고, 비판적 사고력을 기를 수 있습니다. ");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
                    startActivity(intent3);
                }
            }); // 취미부가설명링크 토론하기
        }else if(tvTitle.getText().equals("외국어공부")){ //분석형
            tvHobby.setText("당신은 비평적인 관점을 가진 뛰어난 전략가입니다. 이상적인 세상을 만들어 가는 사람이기도합니다. 옳다, 그르다가 중요해서 친구가 잘못하면 지적해주는 편이며, 객관적인 판단이나 생각에 대한 이야기를 많이 합니다. " +
                    "따라서 추천하는 취미는 외국어공부입니다. 외국어를 제대로 배우면 두뇌가 발달하고, 치매 예방에도 효과적입니다. 암기력이 향상되고, 계산력, 독해력, 집중력 또한 강해집니다.");
            tvLink.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent3=new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse(""));
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
