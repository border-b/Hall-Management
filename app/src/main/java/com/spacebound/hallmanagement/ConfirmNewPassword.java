package com.spacebound.hallmanagement;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmNewPassword extends AppCompatActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_new_password);
        submit =(Button) findViewById(R.id.button9);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(ConfirmNewPassword.this, MainActivity.class);
                startActivity(intent9);
            }
        });
    }
}
