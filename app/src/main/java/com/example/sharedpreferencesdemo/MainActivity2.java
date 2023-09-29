package com.example.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences p=getSharedPreferences("cocsit",MODE_PRIVATE);
        String name= p.getString("name","");
        String email= p.getString("email","");

        TextView t1=findViewById(R.id.txt3);
        TextView t2=findViewById(R.id.txt4);
        t1.setText("Name=" + name);
        t2.setText("Email=" + email);


    }
}