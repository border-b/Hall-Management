package com.example.hallmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TodayMenu extends AppCompatActivity implements View.OnClickListener {

    private CardView breakfast,lunch,dinner,snacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_menu);

        breakfast = findViewById(R.id.breakfast);
        lunch = findViewById(R.id.lunch);
        dinner = findViewById(R.id.dinner);
        snacks = findViewById(R.id.Snacks);

        breakfast.setOnClickListener(this);
        lunch.setOnClickListener(this);
        dinner.setOnClickListener(this);
        snacks.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intent;

        switch (view.getId()){

            case R.id.breakfast:
            {
                intent = new Intent(this,Breakfast.class);
                startActivity(intent);
                break;
            }

            case R.id.lunch:
            {
                intent = new Intent(this,Lunch.class);
                startActivity(intent);
                break;
            }

            case R.id.dinner:
            {
                intent = new Intent(this,Dinner.class);
                startActivity(intent);
                break;
            }

            case R.id.Snacks:
            {
                intent = new Intent(this,Snacks.class);
                startActivity(intent);
                break;
            }

        }

    }
}

