package com.mojitoproject.waterdelivertyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mojitoproject.waterdelivertyapp.databinding.ActivityDashboardBinding;

public class CustomerActivity extends DrawerBaseActivity {

    ActivityDashboardBinding activityDashboardBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityDashboardBinding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(activityDashboardBinding.getRoot());

        allocateActivityTitle("Customers");
    }
}