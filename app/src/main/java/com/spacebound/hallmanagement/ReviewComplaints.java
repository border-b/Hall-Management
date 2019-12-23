package com.spacebound.hallmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReviewComplaints extends AppCompatActivity {

    private Button internet,food,sanitation,others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_complaints);

        internet =(Button) findViewById(R.id.button18);
        internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(ReviewComplaints.this, InternetProblem.class);
                startActivity(intent18);
            }
        });

        food =(Button) findViewById(R.id.button19);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent19 = new Intent(ReviewComplaints.this, FoodProblem.class);
                startActivity(intent19);
            }
        });

        sanitation =(Button) findViewById(R.id.button20);
        sanitation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent20 = new Intent(ReviewComplaints.this, SanitationProblem.class);
                startActivity(intent20);
            }
        });

        others =(Button) findViewById(R.id.button21);
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent21 = new Intent(ReviewComplaints.this, Others.class);
                startActivity(intent21);
            }
        });

    }
}
