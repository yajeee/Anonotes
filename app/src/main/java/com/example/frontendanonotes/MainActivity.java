package com.example.frontendanonotes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    //Variables
        RecyclerView featuredRecycler, mostViewedRecycler, categoriesRecycler;
        RecyclerView.Adapter adapter;
        private GradientDrawable gradient1, gradient2, gradient3, gradient4;

    //Drawer menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hooks


      drawerLayout = findViewById(R.id.drawer_layout);
      navigationView = findViewById(R.id.nav);










    }
}