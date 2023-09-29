package com.example.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void savefun1(View view) {
        SharedPreferences p=getSharedPreferences("cocsit",MODE_PRIVATE);
        SharedPreferences.Editor ed=p.edit();
        EditText ed1=findViewById(R.id.txt1);
        EditText ed2=findViewById(R.id.txt2);
        ed.putString("name",ed1.getText().toString());
        ed.putString("email",ed2.getText().toString());
        ed.commit();
        Toast.makeText(this, "Data Saved ", Toast.LENGTH_SHORT).show();
    }

    public void nextfun1(View view) {

        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);


    }
}