package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //프래그먼트 교체 보여줌
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return num7_1tap.newinstance();
            case 1:
                return num7_2tap.newinstance();
            case 2:
                return num7_3tap.newinstance();
            case 3:
                return num7_4tap.newinstance();
            case 4:
                return num7_5tap.newinstance();
            default:
                return null;
        }
    }

    //위의 갯수
    @Override
    public int getCount() {
        return 5;
    }

    //상단의 탭 레이아웃 텍스트 선언
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "제작형";
            case 1:
                return "창작형";
            case 2:
                return "감상형";
            case 3:
                return "오락형";
            case 4:
                return "분석형";
            default:
                return null;
        }
    }
}
