package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;

public class credits {
    protected void onCreate(Bundle savedInstanceState){
        Intent gi = getIntent();
        int x1 = gi.getIntExtra("n",1);
        finish();
    }




}
