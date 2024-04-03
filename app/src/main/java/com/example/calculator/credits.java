package com.example.calculator;

import static android.content.Intent.getIntent;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class credits {
    TextView txt1;

    protected void credit(Bundle savedInstanceState){
        txt1=findViewById(R.id.txt1);
    }



    public void goBack(View view) {
        Intent gi = getIntent();
        int x1 = gi.getIntExtra("massage",1);
        txt1.setText(x1);
        finish();


    }
}
