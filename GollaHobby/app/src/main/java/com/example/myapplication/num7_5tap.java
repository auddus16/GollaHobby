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
    TextView tvDebateEx;
    TextView tvStudyFLEx;
    TextView tvType;

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
        tvDebateEx = view.findViewById(R.id.tvDebateEx);
        tvStudyFLEx = view.findViewById(R.id.tvStudyFLEx);
        tvType = view.findViewById(R.id.tvType);
        tvType.setText("\"당신은 비평적인 관점을 가진 뛰어난 전략가입니다.\"\n" +
                "\"이상적인 세상을 만들어 가는 사람이기도합니다.\"\n" +
                "\"시비가 중요해서 친구가 잘못하면 지적해주는 편이며,\n" +
                "                객관적인 의견에 대한 이야기를 많이 합니다.\"");

        GotoSmallHobby gotoSmallHobby =new GotoSmallHobby();
        ivStudyFL.setOnClickListener(gotoSmallHobby);
        ivDebate.setOnClickListener(gotoSmallHobby);
        tvDebate.setOnClickListener(gotoSmallHobby);
        tvStudyFL.setOnClickListener(gotoSmallHobby);
        tvDebateEx.setOnClickListener(gotoSmallHobby);
        tvStudyFLEx.setOnClickListener(gotoSmallHobby);


        return view;
    }
    class GotoSmallHobby implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ivDebate:
                case R.id.tvDebate:
                case R.id.tvDebateEx:
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
                    break;
                case R.id.ivStudyFL:
                case R.id.tvStudyFL:
                case R.id.tvStudyFLEx:
                    stream = new ByteArrayOutputStream();
                    bitmap =((BitmapDrawable)ivStudyFL.getDrawable()).getBitmap();
                    scale = (1024/(float)bitmap.getWidth());
                    image_w = (int)(bitmap.getWidth()*scale);
                    image_h = (int)(bitmap.getHeight()*scale);
                    resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byteArray = stream.toByteArray();

                    intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvStudyFL.getText());
                    startActivity(intent);
                    break;
            }
        }
    }
}
