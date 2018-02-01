package com.example.alex.intentdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class SecondActivity extends AppCompatActivity
{
    private ImageView supermoonImg;
    private ImageView waterfallImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        supermoonImg = findViewById(R.id.supermoonImg);
        waterfallImg = findViewById(R.id.waterfallImg);

    }

    supermoonImg.setOnClickListener(new View.onCnlickListener()
    {
        @Override
        public view onClick(View view)
        {

        }
    }
}
