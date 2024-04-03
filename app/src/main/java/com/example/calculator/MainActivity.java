package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int sum=0;
    private EditText display;
    private Button plus;
    private Button minus;
    private Button divide;
    private Button multiply;
    private Button ac;
    private Button equal;
    private Button credits;
    public String st;
    public int x;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        display=findViewById(R.id.display);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.multiply);
        ac=findViewById(R.id.ac);
        equal=findViewById(R.id.equal);
        credits=findViewById(R.id.credits);


        display.setText(null);
        st=display.getText().toString();
        sum=Integer.parseInt(st);
    }

    public void plus (View view){
        display.setText(null);
        st=display.getText().toString();
        x=Integer.parseInt(st);
        sum=sum+x;
    }

    public void minus (View view){
        display.setText(null);
        st=display.getText().toString();
        x=Integer.parseInt(st);
        sum=sum-x;
    }
    public void divide (View view){
        display.setText(null);
        st=display.getText().toString();
        x=Integer.parseInt(st);
        if (x==0)
            display.setText("error");
        else
            sum=sum/x;
    }

    public void multiply (View view){
        display.setText(null);
        st=display.getText().toString();
        x=Integer.parseInt(st);
        sum=sum*x;
    }

    public void equal (View view){
        display.setText(sum);
    }
    public void ac (View view){
        display.setText(null);
        sum=0;
    }

    public void credits (View view) {
        Intent si = new Intent( this, credits.class);
        si.putExtra("message", "sum:" + sum);
        startActivity(si);
    }
}