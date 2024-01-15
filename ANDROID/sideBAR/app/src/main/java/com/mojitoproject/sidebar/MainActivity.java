package com.mojitoproject.sidebar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.webkit.WebViewFragment;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.mojitoproject.sidebar.databinding.ActivityMainBinding;
import com.mojitoproject.sidebar.ui.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);


//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        setSupportActionBar(binding.appBarMain.toolbar);
//        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//        DrawerLayout drawer = binding.drawerLayout;
//        NavigationView navigationView = binding.navView;
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_insert_data)
//                .setOpenableLayout(drawer)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);
    }
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        Fragment fragment = null;
        Bundle bundle = new Bundle();
        if (id == R.id.home) {
            fragment = new HomeFragment();
        } else if (id == R.id.timeTable) {
//            fragment = new TimeTableFragment();
        } else if (id == R.id.examSchedule) {
//            fragment = new ExamScheduleFragment();
        } else if (id == R.id.attendence) {
//            fragment = new AttendenceFragment();
        } else if (id == R.id.result) {
//            fragment = new ResultFragment();
        } else if (id == R.id.fb) {
            bundle.putString("url", "https://www.facebook.com/androidhungerAH");
//            fragment = new WebViewFragment();
            fragment.setArguments(bundle);
        } else if (id == R.id.gplus) {
            bundle.putString("url", "https://plus.google.com/+Androidhunger");
//            fragment = new WebViewFragment();
            fragment.setArguments(bundle);
        } else if (id == R.id.twitter) {
            bundle.putString("url", "https://www.twitter.com/android_hunger");
//            fragment = new WebViewFragment();
            fragment.setArguments(bundle);
        } else if (id == R.id.github) {
            bundle.putString("url", "https://github.com/avinashn/androidhunger.com");
//            fragment = new WebViewFragment();
            fragment.setArguments(bundle);
        } else if (id == R.id.youtube) {
            bundle.putString("url", "https://www.youtube.com/androidhunger");
//            fragment = new WebViewFragment();
            fragment.setArguments(bundle);
        }
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
}