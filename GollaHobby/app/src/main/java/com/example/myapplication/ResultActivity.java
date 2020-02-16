package com.example.myapplication;

// 명연
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvFirst;
    TextView tvFirstResult;
    TextView tvYou1;
    TextView tvEnd1;

    TextView tvSecond;
    TextView tvSecondResult;
    TextView tvYou2;
    TextView tvEnd2;

    Button btnNext;

    RadarChart radarChart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvName=findViewById(R.id.tvName);
        tvFirstResult=findViewById(R.id.tvFirstReult);
        tvSecondResult=findViewById(R.id.tvSecondResult);
        btnNext=findViewById(R.id.btnStart);

        radarChart=findViewById(R.id.mapsearchdetail_radar_chart);

        /*Intent intent = getIntent();
        String data = intent.getStringExtra("Name");
        tvName.setText(data+ "님");
*/
        dataValue();
        makeChart();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<RadarEntry> dataValue(){
        ArrayList<RadarEntry> dataVals = new ArrayList<>();

        dataVals.add(new RadarEntry(50));
        dataVals.add(new RadarEntry(30));
        dataVals.add(new RadarEntry(40));
        dataVals.add(new RadarEntry(20));
        dataVals.add(new RadarEntry(100));

        return dataVals;
    }

    private void makeChart(){
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
