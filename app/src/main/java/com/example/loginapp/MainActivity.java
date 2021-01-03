package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import static com.example.loginapp.R.id.signInButtonId;
import static com.example.loginapp.R.id.signUpTextViewId;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText signInEmailEditText, signInPasswordEditText;
    private Button signInButton;
    private TextView signUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Sign In Activity");


        signInEmailEditText = (EditText) findViewById(R.id.signInEmailEditTextId);
        signInPasswordEditText = (EditText) findViewById(R.id.signInPasswordEditTextId);

        signInButton = (Button) findViewById(signInButtonId);
        signUpTextView = (TextView) findViewById(R.id.signUpTextViewId);

        signInButton.setOnClickListener(this);
        signUpTextView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.signInButtonId :

                break;

            case R.id.signUpTextViewId :

                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);

                break;
        }

    }
}