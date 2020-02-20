package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.ByteArrayOutputStream;

public class num7_5tap extends Fragment {
    private View view;
    ImageView ivDebate;
    ImageView ivStudyFL;
    TextView tvDebate;
    TextView tvStudyFL;

    public static num7_5tap newinstance(){
        num7_5tap num7_5tap = new num7_5tap();
        return num7_5tap;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.num7_5, container, false);
        ivStudyFL = view.findViewById(R.id.ivStudyFL);
        ivDebate = view.findViewById(R.id.ivDebate);
        tvDebate = view.findViewById(R.id.tvDebate);
        tvStudyFL = view.findViewById(R.id.tvStudyFL);

        ivStudyFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                Bitmap bitmap =((BitmapDrawable)ivStudyFL.getDrawable()).getBitmap();
                float scale = (1024/(float)bitmap.getWidth());
                int image_w = (int)(bitmap.getWidth()*scale);
                int image_h = (int)(bitmap.getHeight()*scale);
                Bitmap resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                byte[] byteArray = stream.toByteArray();

                Intent intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                intent.putExtra("image",byteArray);
                intent.putExtra("Title",tvStudyFL.getText());
                startActivity(intent);
            }
        });

        ivDebate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                Bitmap bitmap =((BitmapDrawable)ivDebate.getDrawable()).getBitmap();
                float scale = (1024/(float)bitmap.getWidth());
                int image_w = (int)(bitmap.getWidth()*scale);
                int image_h = (int)(bitmap.getHeight()*scale);
                Bitmap resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                byte[] byteArray = stream.toByteArray();

                Intent intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                intent.putExtra("image",byteArray);
                intent.putExtra("Title",tvDebate.getText());
                startActivity(intent);
            }
        });


        return view;
    }
}
