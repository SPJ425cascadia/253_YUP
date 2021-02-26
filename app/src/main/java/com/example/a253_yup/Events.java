package com.example.a253_yup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navagation);

        bottomNavigationView.setSelectedItemId(R.id.events);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.events:
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.highlights:
                        startActivity(new Intent(getApplicationContext()
                                , Highlights.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }
}