package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int sum=0;
    private TextView display;
    private Button plus;
    private Button minus;
    private Button divide;
    private Button multiply;
    private Button ac;
    private Button equal;
    private Button credits;

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
    }
    public void credits (View view) {
        Intent si = new Intent( this, credits.class);
        si.putExtra("last number:",sum);
        startActivity(si);

    }
}