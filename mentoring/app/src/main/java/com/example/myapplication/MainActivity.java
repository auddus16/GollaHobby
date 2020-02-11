package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< Updated upstream
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
=======
import android.os.Handler;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
>>>>>>> Stashed changes

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    Button btnNext;
    TextView tvStart;//설문설명 텍스트뷰

    public void setSupportActionBar(@Nullable androidx.appcompat.widget.Toolbar toolbar){
        super.setSupportActionBar(toolbar);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< Updated upstream

        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

=======
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
>>>>>>> Stashed changes
    }
}
