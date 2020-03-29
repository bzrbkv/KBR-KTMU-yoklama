package com.example.loginactivation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText rText_username_r;
    EditText rText_password_r;
    EditText rText_confirm_password_r;
    Button rButton_save_r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        rText_username_r = (EditText)findViewById(R.id.editText_username_r);
        rText_password_r = (EditText)findViewById(R.id.editText_password_r);
        rText_confirm_password_r = (EditText)findViewById(R.id.editText_confirm_password_r);
        rButton_save_r = (Button)findViewById(R.id.button_save_r);

        rButton_save_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent_save = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(registerIntent_save);
            }
        });
    }
}
