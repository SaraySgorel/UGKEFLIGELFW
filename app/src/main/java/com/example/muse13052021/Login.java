package com.example.muse13052021;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {

    DatabaseReference myBD; //объект, который хранит ссылку на базу данных
    String GROUP = "USER"; //название группы для базы данных

    FirebaseAuth myAuth;
    TextView textView2, textView;
    EditText et_email, et_password, et_password3;
    Button containedButton, save, read;
    public String userEmail;
    public EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_email = (EditText) findViewById(R.id.et_email);
        et_password = (EditText) findViewById(R.id.et_password);
        et_password3 = (EditText) findViewById(R.id.et_password3);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        containedButton = (Button) findViewById(R.id.containedButton);
        myBD = FirebaseDatabase.getInstance().getReference(GROUP);// получили бд

        // уже  есть аккаунт
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Authorization.class);
                startActivity(intent);
            }
        });


        //  кнопка  регистрации
        containedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass1 = String.valueOf(et_password.getText());
                String pass3 = String.valueOf(et_password3.getText());
                String et_email1 = String.valueOf(et_email.getText());
                if (pass1.equals(pass3)) {
                    // запись в базу данных логин и пароль
                    String id = myBD.getKey();
                    User user = new User(id, et_email1, pass1);
                    if (!TextUtils.isEmpty(id) && !TextUtils.isEmpty(et_email1) && !TextUtils.isEmpty(pass1)) { //проверка, что поля не пустые
                        //myBD.push().setValue(user);
                    }

                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "Введённые пароли не совпадают", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //initialization FireBaseAuth
        myAuth = FirebaseAuth.getInstance();

        //initialization
        init();
    }

    public void init() {
    }

    public void isAdmin() {
        //get email
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            userEmail = user.getEmail();
        }
    }


    //при повторном заходе в приложение проверяем, был ли пользователь авторизован
    public void onStart() {
        super.onStart();
        //Check if user is signed in (non-null) and update Contacts.Intents.UI accordingly.
        FirebaseUser currentUser = myAuth.getCurrentUser();
        //нет
        if (currentUser != null) {
            Toast.makeText(this, "user not authenticated", Toast.LENGTH_SHORT).show();
        } else {  //да
            Toast.makeText(this, "user authentication", Toast.LENGTH_SHORT).show();
        }
    }


    //авторизация
    public void onClickSignIn(View view) {
        if (!TextUtils.isEmpty(et_email.getText().toString()) && !TextUtils.isEmpty(et_password.getText().toString())) {
            myAuth.signInWithEmailAndPassword(et_email.getText().toString(), et_password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Authentication  successful", Toast.LENGTH_SHORT).show();
                        //переходим на новую активность
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                        isAdmin();
                    } else {
                        Toast.makeText(getApplicationContext(), "Authentication  failed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}