package com.spacebound.hallmanagement;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class WelcomeAdmin extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private Button todaymenu,reviewcomplain;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_admin);

        todaymenu =(Button) findViewById(R.id.button15);
        todaymenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(WelcomeAdmin.this, TodayMenu.class);
                startActivity(intent15);
            }
        });

        reviewcomplain =(Button) findViewById(R.id.button16);
        reviewcomplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(WelcomeAdmin.this, ReviewComplaints.class);
                startActivity(intent16);
            }
        });
        drawerLayout = findViewById(R.id.drawer2);

        NavigationView navigationView = findViewById(R.id.navigationId2);
        navigationView.setNavigationItemSelectedListener(this);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Intent intent;

        if(menuItem.getItemId()==R.id.nav_vacantseats)
        {
            intent = new Intent(this,VacantSeats.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_allocateseats)
        {
            intent = new Intent(this,AllocateSeat.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_viewnoticeboard)
        {
            intent = new Intent(this,WelcomeAdmin.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_searchstudent)
        {
            intent = new Intent(this,SearchStudent.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_reviewcomplaints)
        {
            intent = new Intent(this,ReviewComplaints.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_updatenotice)
        {
            intent = new Intent(this,UpdateNoticeBoard.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_sendnotification)
        {
            intent = new Intent(this,Notification.class);
            startActivity(intent);
        }

        return false;
    }
}
