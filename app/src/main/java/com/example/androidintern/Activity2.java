package com.example.androidintern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button btn;
    EditText t1;
    EditText t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btn = findViewById(R.id.sub);
        t1 = findViewById(R.id.email);
        t2 = findViewById(R.id.phone);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String email = t1.getText().toString().trim();
                final String phone = t2.getText().toString().trim();

                if (email.isEmpty() || phone.isEmpty()) {
                    return;
                } else {
                    Toast.makeText(Activity2.this, "Your Email is: " + email + " " + "Your Phone Number is: " + phone, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
