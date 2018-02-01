package com.example.alex.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    public static final int BACKGROUND_CODE = 1;
    private Button button;
    private Intent i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        i = new intent(this, SecondActivity.class);




        button.setOnClickListener(new View.onClickListener()
        {
            public void onClick(View view)
            {
                startActivityForResult(REQUEST_CODE, SecondActivity.class);
            }
        });

    }


    @Override
    public void onClick(View view) {

    }
}
