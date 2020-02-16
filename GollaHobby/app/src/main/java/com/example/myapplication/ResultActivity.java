package com.example.myapplication;

// 명연
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity{

    TextView tvName;
    TextView tvFirst;
    TextView tvYou1;
    TextView tvEnd1;
    Button btnResult1;
    Button btnResult2;

    TextView tvSecond;
    TextView tvYou2;
    TextView tvEnd2;

    Button btnNext;

    RadarChart radarChart;

    ImageButton btnLogo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvName=findViewById(R.id.tvName);
        btnResult1=findViewById(R.id.btnResult1);
        btnResult2=findViewById(R.id.btnResult2);
        btnNext=findViewById(R.id.btnStart);

        btnNext=findViewById(R.id.btnStart);
        btnResult1=findViewById(R.id.btnResult1);
        btnResult2=findViewById(R.id.btnResult2);

        radarChart=findViewById(R.id.mapsearchdetail_radar_chart);

        /*Intent intent = getIntent();
        String data = intent.getStringExtra("Name");
        tvName.setText(data+ "님");
*/
        dataValue();
        makeChart();


        /*btnLogo = findViewById(R.id.btnLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);

            }
        });*/


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);
            }
        });

        btnResult1.setOnClickListener(new View.OnClickListener() {//첫번째 결과값 클릭이벤트
            Intent intent;
            @Override
            public void onClick(View v) {
                switch (btnResult2.getText().toString()){
                    case "분석형":
                        intent = new Intent(getApplicationContext(), SelectActivity.class);
                        startActivity(intent);
                        break;
                    case "오락형":
                        intent = new Intent(getApplicationContext(), LogInActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        btnResult2.setOnClickListener(new View.OnClickListener() {//두번째 결과값 클릭이벤트
            Intent intent;
            @Override
            public void onClick(View v) {
                switch (btnResult2.getText().toString()){
                    case "분석형":
                        intent = new Intent(getApplicationContext(), SelectActivity.class);
                        startActivity(intent);
                        break;
                    case "오락형":
                        intent = new Intent(getApplicationContext(), LogInActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }//end of onCreate


    public ArrayList<RadarEntry> dataValue(){
        ArrayList<RadarEntry> dataVals = new ArrayList<>();

        dataVals.add(new RadarEntry(50));
        dataVals.add(new RadarEntry(30));
        dataVals.add(new RadarEntry(40));
        dataVals.add(new RadarEntry(20));
        dataVals.add(new RadarEntry(100));

        return dataVals;
    }

    public void makeChart(){
        RadarDataSet dataSet= new RadarDataSet(dataValue(),"DATA");
        dataSet.setColor(Color.BLUE);

        RadarData data = new RadarData();
        data.addDataSet(dataSet);
        String[] labels={"분석형", "오락형", "감상형", "제작형", "창작형"};
        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));
        radarChart.setData(data);
    }
}
