package com.spacebound.hallmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnterVerificationCode extends AppCompatActivity {

    private Button verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_verification_code);
        verify =(Button) findViewById(R.id.button8);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(EnterVerificationCode.this, ConfirmNewPassword.class);
                startActivity(intent8);
            }
        });
    }
}

