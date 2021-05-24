package com.example.muse13052021;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Authorization extends AppCompatActivity {

    Button knopkavoiti;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization_layout);
        knopkavoiti = (Button) findViewById(R.id.voiti);
        knopkavoiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Authorization.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}