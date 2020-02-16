package com.example.myapplication;
//명연
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ToolbarActivity extends AppCompatActivity {

    ImageButton btnLogo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);

        btnLogo = findViewById(R.id.btnLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);

            }
        });
    }
}
