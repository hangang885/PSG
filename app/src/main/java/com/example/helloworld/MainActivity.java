package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        TextView tv= (TextView)findViewById(R.id.textView);
        tv.setText("Hi!"); // 화면에 보이는 텍스트를 "Hi"로 바꾸기
    }
}