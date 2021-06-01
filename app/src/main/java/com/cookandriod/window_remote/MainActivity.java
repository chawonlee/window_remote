package com.cookandriod.window_remote;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static Button web_go;
    public static String texr;
    private EditText my_ip;


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

    }
}
