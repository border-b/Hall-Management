package com.spacebound.hallmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Starter extends AppCompatActivity {

    private Button student,admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        student = (Button) findViewById(R.id.button24);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent24 = new Intent(Starter.this, MainActivity.class);
                startActivity(intent24);
            }
        });

        admin = (Button) findViewById(R.id.button25);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent25 = new Intent(Starter.this, Main2Activity.class);
                startActivity(intent25);
            }
        });


    }
}
