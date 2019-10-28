package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Activity1 extends AppCompatActivity {
    @BindView(R.id.bu4)
    Button button4;
    @BindView(R.id.bu5)
    Button button5;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bu4)
    void jump() {

        Intent intent = new Intent(Activity1.this, Activity4.class);
        startActivity(intent);

    }

    @OnClick(R.id.bu5)
    void jump1() {

        Intent intent = new Intent(Activity1.this, Activity5.class);
        startActivity(intent);

    }

}