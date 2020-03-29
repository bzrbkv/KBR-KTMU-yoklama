package com.example.loginactivation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mText_username;
    EditText mText_password;
    Button mButton_login;
    RadioButton mRadio_button;
    TextView mTextView_forgot_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText_username = (EditText)findViewById(R.id.editText_username);
        mText_password = (EditText)findViewById(R.id.editText_password);
        mButton_login = (Button)findViewById(R.id.button_login);
        mRadio_button = (RadioButton)findViewById(R.id.radioButton);
        mTextView_forgot_password = (TextView)findViewById(R.id.textView_forgot_password);

        mTextView_forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent1 = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerIntent1);
            }
        });

        mButton_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mText_username.getText().toString() == "Admin"){
                    Intent registerIntent1 = new Intent(MainActivity.this, Admin_1Activity.class);
                    startActivity(registerIntent1);
                }
                else{
                    Intent registerIntent2 = new Intent(MainActivity.this, User_page_1.class);
                    startActivity(registerIntent2);
                }

            }
        });

    }
}
