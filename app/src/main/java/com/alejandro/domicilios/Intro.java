package com.alejandro.domicilios;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.R.anim;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Intro extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private ViewFlipper viewFlipper;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        textView = findViewById(R.id.tvtitulo);
        button = findViewById(R.id.btncontinuar);
        viewFlipper = findViewById(R.id.vf);

        int imagenes [] = {R.drawable.tamales, R.drawable.hamburguesas,R.drawable.alcohol, R.drawable.pizza, R.drawable.empanadas, R.drawable.adhajdh, R.drawable.alcoholicas};

       // for (int i = 0; i<imagenes.length; i++){
       //     flipperImages(imagenes[i]);

        for (int i: imagenes ){
            flipperImages(i);
        }
    }
    public void continuar (View view){
        Intent intent = new Intent (this, MapsActivity.class);
        startActivity(intent);

    }


    public void flipperImages (int i){
        ImageView imageView  = new ImageView(this);
        imageView.setBackgroundResource(i);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(1000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }


}
