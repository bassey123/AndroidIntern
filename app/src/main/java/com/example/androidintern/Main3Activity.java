package com.example.androidintern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void three1(View V) {
        tv1 = findViewById(R.id.textView3);
        String tx = tv1.getText().toString();
        int add = Integer.parseInt(tx);
        add += 3;
        tv1.setText(String.valueOf(add));
    }

    public void three2(View View) {
        tv2 = findViewById(R.id.textView4);
        String tx = tv2.getText().toString();
        int add = Integer.parseInt(tx);
        add += 3;
        tv2.setText(Integer.toString(add));
    }

    public void two1(View V) {
        tv1 = findViewById(R.id.textView3);
        String tx = tv1.getText().toString();
        int add = Integer.parseInt(tx);
        add += 2;
        tv1.setText(String.format("%d", add));
    }

    public void two2(View View) {
        tv2 = findViewById(R.id.textView4);
        String tx = tv2.getText().toString();
        int add = Integer.parseInt(tx);
        add += 2;
        tv2.setText(String.valueOf(add));
    }

    public void one1(View V) {
        tv1 = findViewById(R.id.textView3);
        String tx = tv1.getText().toString();
        int add = Integer.parseInt(tx);
        add += 1;
        tv1.setText("" + add);
    }

    public void one2(View View) {
        tv2 = findViewById(R.id.textView4);
        String tx = tv2.getText().toString();
        int add = Integer.parseInt(tx);
        add += 1;
        tv2.setText(String.valueOf(add));
    }

    public void reset(View V) {
        tv1 = findViewById(R.id.textView3);
        tv2 = findViewById(R.id.textView4);
        tv1.setText("0");
        tv2.setText("0");
    }
}
