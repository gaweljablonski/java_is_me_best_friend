package com.mojitoproject.waterdelivertyapp;

import static com.airbnb.lottie.L.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.navigation.NavigationView;

public class DrawerBaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;

    @Override
    public void setContentView(View view) {
        drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_drawer_base, null);
        FrameLayout container = drawerLayout.findViewById(R.id.activityContainer);
        container.addView(view);

        super.setContentView(drawerLayout);

        Toolbar toolbar = drawerLayout.findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = drawerLayout.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.menu_drawer_open, R.string.menu_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);


        if(item.getItemId() == R.id.nav_orders){
            startActivity(new Intent(DrawerBaseActivity.this, OrderActivity.class));
            overridePendingTransition(0, 0);
            Log.e("ORDERS", "CLICKED");
        }
        else if(item.getItemId() == R.id.nav_customers){
            startActivity(new Intent(DrawerBaseActivity.this, CustomerActivity.class));
            overridePendingTransition(0, 0);
            Log.e("CUSTOMERS", "CLICKED");
        }
//        else if(item.getItemId() == R.id.nav_riders){
//
//        }
//        else if(item.getItemId() == R.id.nav_brands){
//
//        }
//        else if(item.getItemId() == R.id.nav_sales){
//
//        }
//        else if(item.getItemId() == R.id.nav_deals){
//
//        }

        return false;
    }

    protected void allocateActivityTitle(String titleString){
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(titleString);
        }
    }
}