package com.example.view_task_itc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
    {
    TextView descText;
    ImageButton plus, minus;
    Button install, close;

    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descText = (TextView) findViewById(R.id.tv_descriptiontext);
        plus = (ImageButton) findViewById(R.id.btn_more);
        minus = (ImageButton) findViewById(R.id.btn_less);

        plus.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v)
                {
                plus.setVisibility(View.GONE);
                minus.setVisibility(View.VISIBLE);
                descText.setMaxLines(Integer.MAX_VALUE);
                }
            });

        minus.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v)
                {
                minus.setVisibility(View.GONE);
                plus.setVisibility(View.VISIBLE);
                descText.setMaxLines(5);
                }
            });


        install = (Button) findViewById(R.id.btn_install);
        close = (Button) findViewById(R.id.btn_close);

        install.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(install.getText()=="SUBMIT AND INSTALL") {
                    install.setText("INSTALL SUCCESS");
                    close.setText("UNINSTALL");
                    install.setTextColor(Color.GREEN);
                    close.setTextColor(Color.RED);
                }

                else if(install.getText()=="OK")
                {
                    install.setText("SUBMIT AND INSTALL");
                    close.setText("CLOSE");
                    install.setTextColor(Color.WHITE);
                    close.setTextColor(Color.WHITE);
                }
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(close.getText()=="CLOSE")
                {
                    System.exit(0);
                }

                else if(close.getText()=="UNINSTALL")
                {
                    install.setText("OK");
                    close.setText("UNINSTALL SUCCESS");
                    install.setTextColor(Color.WHITE);
                    close.setTextColor(Color.GREEN);
                }
            }
        });

        }

    }


