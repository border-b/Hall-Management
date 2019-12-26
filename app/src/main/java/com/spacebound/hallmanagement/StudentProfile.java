package com.spacebound.hallmanagement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


public class StudentProfile extends AppCompatActivity {

    private static final String TAG = "NewPostActivity";
    private static final String REQUIRED = "Required";

    //ProgressBar progressBar;
    private DatabaseReference mDatabase;
    TextView TextName, TextEmail ,TextDept, TextRegNo, TextPhone;
    FirebaseAuth mAuth;
    FirebaseUser user;

    String name, regNo, email, dept, phone;
    //FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        TextName = (TextView) findViewById(R.id.Name);
        TextEmail = (TextView) findViewById(R.id.Email);
        TextRegNo = (TextView) findViewById(R.id.RegNo);
        TextDept = (TextView) findViewById(R.id.Dept);
        TextPhone = (TextView) findViewById(R.id.Phone);
        //progressBar = (ProgressBar) findViewById(R.id.progressbar);

        //progressBar.setVisibility(View.VISIBLE);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        showUserInfo();
    }

    private void showUserInfo() {

        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        final String userId = user.getUid();

        DatabaseReference userRef=FirebaseDatabase.getInstance().getReference().child("StudentUser").child(userId);
        //Toast.makeText(getApplicationContext(),userId,Toast.LENGTH_LONG).show();


        userRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    name = dataSnapshot.child("name").getValue().toString();
                    email = dataSnapshot.child("email").getValue().toString();
                    regNo = dataSnapshot.child("regNo").getValue().toString();
                    dept = dataSnapshot.child("dept").getValue().toString();
                    phone = dataSnapshot.child("phone").getValue().toString();

                    TextName.setText("Name : " + name);
                    TextEmail.setText("Email : " + email);
                    TextRegNo.setText("Registration No. : " + regNo);
                    TextDept.setText("Department : " + dept);
                    TextPhone.setText("Phone : " + phone);
                }



                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                }
        });

        //progressBar.setVisibility(View.GONE);


        //TextName.setText("sdjfhsdjkfh");

//        mDatabase.child("StudentUser").child(userId).addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                StudentUser Student = dataSnapshot.getValue(StudentUser.class);
//
//                if (Student == null) {
//                    Log.e(TAG, "User " + userId + " is unexpectedly null");
//                    Toast.makeText(StudentProfile.this, "Error: could not fetch user", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    TextName.setText(Student.getName());
//                }
//
//                //String regNo = dataSnapshot.child("regNo").getValue(String.class);
//                //TextRegNo.setText(regNo);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
//            }
//
//        });

    }
}

