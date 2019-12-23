package com.spacebound.hallmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Complain extends AppCompatActivity {

    private Button internet,food,sanitation,others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);
        internet =(Button) findViewById(R.id.button11);
        internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(Complain.this, WriteComplain.class);
                startActivity(intent11);
            }
        });
        food =(Button) findViewById(R.id.button12);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(Complain.this, WriteComplain.class);
                startActivity(intent12);
            }
        });
        sanitation =(Button) findViewById(R.id.button13);
        sanitation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(Complain.this, WriteComplain.class);
                startActivity(intent13);
            }
        });
        others =(Button) findViewById(R.id.button14);
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(Complain.this, WriteComplain.class);
                startActivity(intent14);
            }
        });
    }
}
