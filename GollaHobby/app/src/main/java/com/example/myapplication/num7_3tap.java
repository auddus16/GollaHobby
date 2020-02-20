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

public class num7_3tap extends Fragment {
    private View view;
    ImageView ivMusical;
    ImageView ivTea;
    ImageView ivTravel;
    ImageView ivPerfume;
    TextView tvMusical;
    TextView tvTea;
    TextView tvTravel;
    TextView tvPerfume;
    TextView tvMusicalEx;
    TextView tvTeaEx;
    TextView tvTravelEx;
    TextView tvPerfumeEx;

    public static num7_3tap newinstance(){
        num7_3tap num7_3tap = new num7_3tap();
        return num7_3tap;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.num7_3, container, false);
        ivMusical = view.findViewById(R.id.ivMusical);
        ivTea = view.findViewById(R.id.ivTea);
        ivTravel = view.findViewById(R.id.ivTravel);
        ivPerfume = view.findViewById(R.id.ivPerfume);
        tvMusical = view.findViewById(R.id.tvMusical);
        tvPerfume = view.findViewById(R.id.tvPerfume);
        tvTea = view.findViewById(R.id.tvTea);
        tvTravel = view.findViewById(R.id.tvTravel);
        tvMusicalEx = view.findViewById(R.id.tvMusicalEx);
        tvPerfumeEx = view.findViewById(R.id.tvPerfumeEx);
        tvTeaEx = view.findViewById(R.id.tvTeaEx);
        tvTravelEx = view.findViewById(R.id.tvTravelEx);

        GotoSmallHobby gotoSmallHobby = new GotoSmallHobby();
        ivMusical.setOnClickListener(gotoSmallHobby);
        ivTravel.setOnClickListener(gotoSmallHobby);
        ivTea.setOnClickListener(gotoSmallHobby);
        ivPerfume.setOnClickListener(gotoSmallHobby);

        tvMusical.setOnClickListener(gotoSmallHobby);
        tvTravel.setOnClickListener(gotoSmallHobby);
        tvTea.setOnClickListener(gotoSmallHobby);
        tvPerfume.setOnClickListener(gotoSmallHobby);

        tvMusicalEx.setOnClickListener(gotoSmallHobby);
        tvTravelEx.setOnClickListener(gotoSmallHobby);
        tvTeaEx.setOnClickListener(gotoSmallHobby);
        tvPerfumeEx.setOnClickListener(gotoSmallHobby);

        return view;
    }
    class GotoSmallHobby implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ivMusical:
                case R.id.tvMusical:
                case R.id.tvMusicalEx:
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    Bitmap bitmap =((BitmapDrawable)ivMusical.getDrawable()).getBitmap();
                    float scale = (1024/(float)bitmap.getWidth());
                    int image_w = (int)(bitmap.getWidth()*scale);
                    int image_h = (int)(bitmap.getHeight()*scale);
                    Bitmap resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byte[] byteArray = stream.toByteArray();

                    Intent intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvMusical.getText());
                    startActivity(intent);
                    break;
                case R.id.ivTea:
                case R.id.tvTea:
                case R.id.tvTeaEx:
                    stream = new ByteArrayOutputStream();
                    bitmap =((BitmapDrawable)ivTea.getDrawable()).getBitmap();
                    scale = (1024/(float)bitmap.getWidth());
                    image_w = (int)(bitmap.getWidth()*scale);
                    image_h = (int)(bitmap.getHeight()*scale);
                    resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byteArray = stream.toByteArray();

                    intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvTea.getText());
                    startActivity(intent);
                    break;
                case R.id.ivTravel:
                case R.id.tvTravel:
                case R.id.tvTravelEx:
                    stream = new ByteArrayOutputStream();
                    bitmap =((BitmapDrawable)ivTravel.getDrawable()).getBitmap();
                    scale = (1024/(float)bitmap.getWidth());
                    image_w = (int)(bitmap.getWidth()*scale);
                    image_h = (int)(bitmap.getHeight()*scale);
                    resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byteArray = stream.toByteArray();

                    intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvTravel.getText());
                    startActivity(intent);
                    break;
                case R.id.ivPerfume:
                case R.id.tvPerfume:
                case R.id.tvPerfumeEx:
                    stream = new ByteArrayOutputStream();
                    bitmap =((BitmapDrawable)ivPerfume.getDrawable()).getBitmap();
                    scale = (1024/(float)bitmap.getWidth());
                    image_w = (int)(bitmap.getWidth()*scale);
                    image_h = (int)(bitmap.getHeight()*scale);
                    resize = Bitmap.createScaledBitmap(bitmap,image_w,image_h,true);
                    resize.compress(Bitmap.CompressFormat.JPEG,100,stream);
                    byteArray = stream.toByteArray();

                    intent = new Intent(getActivity(),SmallHobbyAcitivty.class);
                    intent.putExtra("image",byteArray);
                    intent.putExtra("Title",tvPerfume.getText());
                    startActivity(intent);
                    break;
            }
        }
    }
}
