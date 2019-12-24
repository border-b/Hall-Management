package com.spacebound.hallmanagement;


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

public class WelcomeStudent extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    private Button menu,admin,complain;
    private MenuItem a,b,c,d,e,f;
    ActionBarDrawerToggle toggle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_student);
        menu = (Button) findViewById(R.id.button5);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(WelcomeStudent.this, TodayMenu.class);
                startActivity(intent4);
            }
        });
        admin = (Button) findViewById(R.id.button4);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(WelcomeStudent.this, HallAuthority.class);
                startActivity(intent5);
            }
        });
        complain = (Button) findViewById(R.id.button6);
        complain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(WelcomeStudent.this, Complain.class);
                startActivity(intent6);
            }
        });
        drawerLayout = findViewById(R.id.drawer);

        NavigationView navigationView = findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {

        Intent intent;

        if(menuItem.getItemId()==R.id.nav_applyforseat)
        {
            intent = new Intent(this,ApplyForSeat.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_submitcomplaints)
        {
            intent = new Intent(this,Complain.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_inbox)
        {
            intent = new Intent(this,Inbox.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_notification)
        {
            intent = new Intent(this,Notification.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_viewadmininfo)
        {
            intent = new Intent(this,HallAuthority.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_viewfoodmenu)
        {
            intent = new Intent(this,TodayMenu.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_requestforchangingseat)
        {
            intent = new Intent(this,ApplyForSeat.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_SP)
        {
            intent = new Intent(this,StudentProfile.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.nav_viewnoticeboard)
        {
            intent = new Intent(this,WelcomeStudent.class);
            startActivity(intent);
        }
        else if(menuItem.getItemId()==R.id.nav_searchstudent)
        {
            intent = new Intent(this,SearchStudent.class);
            startActivity(intent);
        }



        return false;
    }
}
