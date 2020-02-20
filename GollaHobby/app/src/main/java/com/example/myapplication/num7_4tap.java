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

public class num7_4tap extends Fragment {
    private View view;
    ImageView ivHorse;
    ImageView ivSword;
    ImageView ivClimb;
    ImageView ivDron;
    TextView tvHorse;
    TextView tvSword;
    TextView tvClimb;
    TextView tvDron;
    TextView tvHorseEx;
    TextView tvSwordEx;
    TextView tvClimbEx;
    TextView tvDronEx;

    public static num7_4tap newinstance(){
        num7_4tap num7_4tap = new num7_4tap();
        return num7_4tap;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.num7_4, container, false);
        ivHorse = view.findViewById(R.id.ivHorse);
        ivSword = view.findViewById(R.id.ivSword);
        ivClimb = view.findViewById(R.id.ivClimb);
        ivDron = view.findViewById(R.id.ivDron);
        tvHorse = view.findViewById(R.id.tvHorse);
        tvSword = view.findViewById(R.id.tvSword);
        tvClimb = view.findViewById(R.id.tvClimb);
        tvDron = view.findViewById(R.id.tvDron);
        tvHorseEx = view.findViewById(R.id.tvHorseEx);
        tvSwordEx = view.findViewById(R.id.tvSwordEx);
        tvClimbEx = view.findViewById(R.id.tvClimbEx);
        tvDronEx = view.findViewById(R.id.tvDronEx);

        GotoSmallHobby gotoSmallHobby = new GotoSmallHobby();
        ivHorse.setOnClickListener(gotoSmallHobby);
        ivSword.setOnClickListener(gotoSmallHobby);
        ivDron.setOnClickListener(gotoSmallHobby);
        ivClimb.setOnClickListener(gotoSmallHobby);

        tvHorse.setOnClickListener(gotoSmallHobby);
        tvSword.setOnClickListener(gotoSmallHobby);
        tvDron.setOnClickListener(gotoSmallHobby);
        tvClimb.setOnClickListener(gotoSmallHobby);

        tvHorseEx.setOnClickListener(gotoSmallHobby);
        tvSwordEx.setOnClickListener(gotoSmallHobby);
        tvDronEx.setOnClickListener(gotoSmallHobby);
        tvClimbEx.setOnClickListener(gotoSmallHobby);

        return view;
    }
    class GotoSmallHobby implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ivDron:
                case R.id.tvDron:
                case R.id.tvDronEx:
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    Bitmap bitmap =((BitmapDrawable)ivDron.getDrawable()).getBitmap();
                    float scale = (1024/(float)bitmap.getWidth());
                    int image_w = (int)(bitmap.getWidth()*scale);
                    int image_h = (int)(bitmap.getHeight()*scale);
                    Bitmap resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byte[] byteArray = stream.toByteArray();

                    Intent intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvDron.getText());
                    startActivity(intent);
                    break;
                case R.id.ivClimb:
                case R.id.tvClimb:
                case R.id.tvClimbEx:
                    stream = new ByteArrayOutputStream();
                    bitmap =((BitmapDrawable)ivClimb.getDrawable()).getBitmap();
                    scale = (1024/(float)bitmap.getWidth());
                    image_w = (int)(bitmap.getWidth()*scale);
                    image_h = (int)(bitmap.getHeight()*scale);
                    resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byteArray = stream.toByteArray();

                    intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvClimb.getText());
                    startActivity(intent);
                    break;
                case R.id.ivHorse:
                case R.id.tvHorse:
                case R.id.tvHorseEx:
                    stream = new ByteArrayOutputStream();
                    bitmap =((BitmapDrawable)ivHorse.getDrawable()).getBitmap();
                    scale = (1024/(float)bitmap.getWidth());
                    image_w = (int)(bitmap.getWidth()*scale);
                    image_h = (int)(bitmap.getHeight()*scale);
                    resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byteArray = stream.toByteArray();

                    intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvHorse.getText());
                    startActivity(intent);
                    break;
                case R.id.ivSword:
                case R.id.tvSword:
                case R.id.tvSwordEx:
                    stream = new ByteArrayOutputStream();
                    bitmap =((BitmapDrawable)ivSword.getDrawable()).getBitmap();
                    scale = (1024/(float)bitmap.getWidth());
                    image_w = (int)(bitmap.getWidth()*scale);
                    image_h = (int)(bitmap.getHeight()*scale);
                    resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byteArray = stream.toByteArray();

                    intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvSword.getText());
                    startActivity(intent);
                    break;
            }
        }
    }
}
