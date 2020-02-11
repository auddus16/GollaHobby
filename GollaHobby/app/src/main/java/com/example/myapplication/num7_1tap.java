package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class num7_1tap extends Fragment {
    private View view;


    //상태저장을 위해
    public static num7_1tap newinstance(){
        num7_1tap num7_1tap = new num7_1tap();
        return num7_1tap;
    }



    //레이아웃과 연동을 해줌
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.num7_1, container, false);

        return view;
    }
}
