package com.orancal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class homeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.bottom1).setOnClickListener(this);
        findViewById(R.id.bottom2).setOnClickListener(this);
        findViewById(R.id.bottom3).setOnClickListener(this);
    }

public void navgateTocourseDersils (String course){
Intent intent = new Intent(this,courseActivity.class);
intent.putExtra("course",course);
startActivity(intent);
}

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bottom1){
            navgateTocourseDersils("android");
            return;
        }
        if (view.getId()==R.id.bottom2){
            navgateTocourseDersils("ios");
            return;}
        if (view.getId()==R.id.bottom3){
            navgateTocourseDersils("fullstack");
        }
    }
}