package com.example.myapplication;

// 윤진
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class LogInActivity extends AppCompatActivity {

//    Toolbar toolbar;
    private Spinner spinner;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    Button btnStart;
    EditText etName;
    RadioGroup radioGroup;
    RadioButton rbMan;
    RadioButton rbWoman;
    ImageButton btnLogo;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        toolbar = (Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);                   //툴바 이거 안해도됨 ;;

        arrayList = new ArrayList<>();
        arrayList.add("선택하세요");
        arrayList.add("10대");
        arrayList.add("20대");
        arrayList.add("30대");
        arrayList.add("40대");
        arrayList.add("50대");
        arrayList.add("60대");
        arrayList.add("70대");
        arrayList.add("80대");
        arrayList.add("90대");

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arrayList);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(arrayAdapter);               //스피너

        btnStart = findViewById(R.id.btnStart);
        etName = findViewById(R.id.etName);
        radioGroup = findViewById(R.id.radioGroup);
        rbMan = findViewById(R.id.rbMan);
        rbWoman = findViewById(R.id.rbWoman);
        btnLogo = findViewById(R.id.btnLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);
            }
        });




        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (etName.getText().toString().equals("") && (rbMan.isChecked()==false) && (rbWoman.isChecked()==false) && spinner.getSelectedItem() == "선택하세요"){
                    Toast.makeText(LogInActivity.this, "정보를 입력해주세요", Toast.LENGTH_LONG).show();
                }

                else if(etName.getText().toString().equals("")){
                    if((rbMan.isChecked()==false) && (rbWoman.isChecked()==false)){
                        Toast.makeText(LogInActivity.this, "이름과 성별을 입력해주세요", Toast.LENGTH_LONG).show();
                    }
                    else if(spinner.getSelectedItem() == "선택하세요"){
                        Toast.makeText(LogInActivity.this, "이름과 나이를 입력해주세요", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(LogInActivity.this, "이름을 입력해주세요", Toast.LENGTH_LONG).show();
                    }
                }               //이름 입력 안했을 때

                else if((rbMan.isChecked()==false) && (rbWoman.isChecked()==false)){
                    if(spinner.getSelectedItem() == "선택하세요"){
                        Toast.makeText(LogInActivity.this, "성별과 나이를 선택해주세요", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(LogInActivity.this, "성별을 선택해주세요", Toast.LENGTH_LONG).show();
                    }
                }               //성별 선택 안했을 때

                else if(spinner.getSelectedItem() == "선택하세요"){
                    Toast.makeText(LogInActivity.this, "나이를 선택해주세요", Toast.LENGTH_LONG).show();
                }               //나이 선택 안했을 때

                else{
                    Toast.makeText(LogInActivity.this, "테스트를 시작합니다!!!!!!", Toast.LENGTH_SHORT).show();
                                    //테스트 시작
                    Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    intent.putExtra("Name", etName.getText().toString());

                    startActivity(intent);
                }

            }
        });
    }
}
