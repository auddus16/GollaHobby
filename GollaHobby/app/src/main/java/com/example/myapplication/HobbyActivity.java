package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class HobbyActivity extends AppCompatActivity {

    private FragmentPagerAdapter fragmentPagerAdapter;
    TabLayout.Tab tab;
    ImageButton btnLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num7);

        //뷰페이저 세팅
        ViewPager viewPager = findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        // Intent에 숫자를 받아서 getTabAt에 넣기
        int getIntent = getIntent().getIntExtra("id", -1);
        if(getIntent == -1 || getIntent == 0) {
            tab = tabLayout.getTabAt(0);
            tab.select();
        } else if(getIntent == 1)  {
            tab = tabLayout.getTabAt(1);
            tab.select();
        } else if(getIntent == 2) {
            tab = tabLayout.getTabAt(2);
            tab.select();
        } else if(getIntent == 3) {
            tab = tabLayout.getTabAt(3);
            tab.select();
        } else {
            tab = tabLayout.getTabAt(4);
            tab.select();
        }

        btnLogo = findViewById(R.id.btnLogo);
        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);
            }
        });

    }
}
