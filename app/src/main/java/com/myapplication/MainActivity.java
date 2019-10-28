package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.bu1)
    Button button1;
    @BindView(R.id.bu2)
    Button button2;
    @BindView(R.id.bu3)
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }
   @OnClick(R.id.bu1)
    void jump(){

       Intent intent=new Intent(MainActivity.this,Activity1.class);
startActivity(intent);
   }
    @OnClick(R.id.bu2)
    void jump1(){

        Intent intent=new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);
    }
    @OnClick(R.id.bu3)
    void jump3(){

        Intent intent=new Intent(MainActivity.this,Activity3.class);
        startActivity(intent);
    }


}
