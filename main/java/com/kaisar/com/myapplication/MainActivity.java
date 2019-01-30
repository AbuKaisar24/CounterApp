package com.kaisar.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private TextView textview;
   private Button  plus;
   private Button  reset;
   private Button  minus;
   private int c=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textview);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        reset=findViewById(R.id.reset);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                textview.setText(String.valueOf(c));

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c--;
                textview.setText(String.valueOf(c));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=0;
                textview.setText(String.valueOf(c) );
            }
        });

    }
}
