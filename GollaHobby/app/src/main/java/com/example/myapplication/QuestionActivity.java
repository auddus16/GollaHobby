package com.example.myapplication;

// 예진
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity<context> extends AppCompatActivity {

    SeekBar sbProgress; //진행률 seekbar
    TextView tvQues; //본인은 다음 질문에 대해 얼마나 해당하나요?
    TextView tvQNum; //Q1,,,
    TextView tvQ; //설문지내용
    TextView tvSb; //seekbar에 해당하는 숫자
    SeekBar sb; //seekbar
    TextView tv0; //seekbar값 0표시
    TextView tv100; //seekbar값 100표시
    Button btnNext; //Next버튼

    int productiontype=0; //제작형
    int creationtype=0; //창작형
    int appreciationtype=0; //감상형
    int entertainmenttype=0; //오락형
    int analysistype=0; //분석형

    int count;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
//sds

        sbProgress=findViewById(R.id.sbProgress);
        tvQues=findViewById(R.id.tvQues);
        tvQNum=findViewById(R.id.tvQNum);
        tvQ=findViewById(R.id.tvQ);
        tvSb=findViewById(R.id.tvSb);
        sb=findViewById(R.id.sb);
        tv0=findViewById(R.id.tvHobby);
        tv100=findViewById(R.id.tv100);
        btnNext=findViewById(R.id.btnStart);

        count=1;
        tvQNum.setText("Q"+String.valueOf(count));

//        Intent intent=getIntent(); //윤진이 intent
//        Toast.makeText(QuestionActivity.this,intent.getStringExtra("Name"),Toast.LENGTH_SHORT).show();

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSb.setText("현재 값 : "+progress); //seekbar값 설정
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvSb.getText().equals("")){
                    Toast.makeText(QuestionActivity.this,"슬라이드해주세요.",Toast.LENGTH_SHORT).show();
                } //seekbar 설정하지 않으면 toast가 나오고 다음화면으로 넘어가지 않는다
                if((count!=10)&&!(tvSb.getText().equals(""))){
                    sbProgress.incrementProgressBy(1); //next버튼 누르면 상위seekbar 증가
                    switch (count){
                        case 1:
                            productiontype+=sb.getProgress(); //제작형 add
                            break;
                        case 2:
                            productiontype+=sb.getProgress(); //제작형 add
                            break;
                        case 3:
                            creationtype+=sb.getProgress(); //창작형 add
                            break;
                        case 4:
                            creationtype+=sb.getProgress(); //창작형 add
                            break;
                        case 5:
                            appreciationtype+=sb.getProgress(); //감상형
                            break;
                        case 6:
                            appreciationtype+=sb.getProgress(); //감상형
                            break;
                        case 7:
                            entertainmenttype+=sb.getProgress(); //오락형
                            break;
                        case 8:
                            entertainmenttype+=sb.getProgress(); //오락형
                            break;
                        case 9:
                            analysistype+=sb.getProgress(); //분석형
                            break;
                        case 10:
                            analysistype+=sb.getProgress(); //분석형
                            break;
                    } //제작형, 창작형, 감상형, 오락형, 분석형 합 구하기
                    tvQNum.setText("Q"+String.valueOf(++count)); //next버튼 누르면 Q1 Q2,,, 질문숫자 증가
                    switch (count){  //next버튼 누르면 질문변경
                        case 2:
                            tvQ.setText("나는 레고를 좋아한다."); //제작형
                            break;
                        case 3:
                            tvQ.setText("나는 아이디어내기를 좋아한다."); //창작형
                            break;
                        case 4:
                            tvQ.setText("나는 미적감각이 뛰어나다."); //창작형
                            break;
                        case 5:
                            tvQ.setText("나는 혼자 깊게 생각하는 경향이 있다."); //감상형
                            break;
                        case 6:
                            tvQ.setText("나는 오감을 사용하는 활동을 좋아한다."); //감상형
                            break;
                        case 7:
                            tvQ.setText("나는 관계지향적이다."); //오락형
                            break;
                        case 8:
                            tvQ.setText("나는 성취감을 느끼는 것을 좋아한다."); //오락형
                            break;
                        case 9:
                            tvQ.setText("나는 토론을 좋아한다."); //분석형
                            break;
                        case 10:
                            tvQ.setText("나는 비평하는 것을 좋아한다."); //분석형
                            break;
                    }
                    sb.incrementProgressBy(-50); //next버튼 누르면 seekbar 0으로 초기화
                    tvSb.setText(null);
                } //seekbar를 설정하고, Q10이하일 때 다음 화면으로 넘어간다.
                if((count==10)&&!(tvSb.getText().equals(""))){
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    //intent.putExtra("Name",intent.getStringExtra("Name"));
                    intent.putExtra("productiontype",productiontype); //제작형 합
                    intent.putExtra("creationtype",creationtype); //창작형 합
                    intent.putExtra("appreciationtype",appreciationtype); //감상형 합
                    intent.putExtra("entertainmenttype",entertainmenttype); //오락형 합
                    intent.putExtra("analysistype",analysistype); //분석형 합
                    startActivity(intent);
                } //seekbar를 설정하고, Q11이상일 때 제작형, 창작형, 감상형, 오락형 합과 함께 ResultActivity로 넘어간다.
            }
        });



    }// End onCreate
}// End class
