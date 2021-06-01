package com.cookandriod.window_remote;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static Button web_go;
    public static String texr;
    private EditText my_ip;

    private static Button open1, close1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //액션바(툴바) 숨김
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //아이피 입력 에디트텍스트
        my_ip = (EditText) findViewById(R.id.my_ip);
        texr=my_ip.getText().toString();

        //웹으로 접속하는 버튼
        web_go=(Button) findViewById(R.id.web_go);

        web_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), web_open.class);
                startActivity(intent);
            }
        });

        open1=(Button) findViewById(R.id.open1);
        close1=(Button) findViewById(R.id.close1);

        open1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Open process1 = new Open();
                process1.execute();

            }
        });

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Close process1 = new Close();
                process1.execute();

            }
        });
    }
}