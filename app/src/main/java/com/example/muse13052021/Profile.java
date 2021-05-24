package com.example.muse13052021;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    TextView tv_EmailUser;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        init();


        Bundle arguments = getIntent().getExtras();
        if(arguments!=null) {
            email = arguments.getString("email");
            tv_EmailUser.setText(email);
        }



    }

    public void init(){
        tv_EmailUser = (TextView)findViewById(R.id.tv_emailUser);
    }


}