package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Activity2 extends AppCompatActivity {
    @BindView(R.id.bu6)
    Button button6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.bu6)
    void jump() {

        Intent intent = new Intent(Activity2.this, Activity6.class);
        startActivity(intent);

    }
}
