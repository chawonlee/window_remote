package com.cookandriod.window_remote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText myip;
    private static Button open1, close1;

    public static String texr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myip = (EditText) findViewById(R.id.ipadd);
        texr=myip.getText().toString();

        open1=(Button) findViewById(R.id.open1);
        close1=(Button) findViewById(R.id.close1);

        open1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1 process1 = new open1();
                process1.execute();

            }
        });

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                close1 process1 = new close1();
                process1.execute();

            }
        });
    }
}
