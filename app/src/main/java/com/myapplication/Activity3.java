package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Activity3 extends AppCompatActivity {
    @BindView(R.id.bu7)
    Button button7;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.bu7)
    void jump() {

        Intent intent = new Intent(Activity3.this, Activity7.class);
        startActivity(intent);
    }
}