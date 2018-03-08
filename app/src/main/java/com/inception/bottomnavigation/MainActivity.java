package com.inception.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottom_navigation_view = findViewById(R.id.bottom_navigation);

        BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               if( item.getItemId() == R.id.home_btn )
               {
                   FragmentManager fm = getSupportFragmentManager();

                   FragmentTransaction ft = fm.beginTransaction();

                   HomeFragment home_fragment = new HomeFragment();

                   ft.replace(R.id.main_frame , home_fragment );

                   ft.commit();


               }
               else if (item.getItemId() == R.id.trending_btn)
               {
                   FragmentManager fm = getSupportFragmentManager();

                   FragmentTransaction ft = fm.beginTransaction();

                   TrendingFragment trendingFragment = new TrendingFragment();

                   ft.replace(R.id.main_frame , trendingFragment );

                   ft.commit();

               }

               else {

               }

                return false;
            }
        };

        bottom_navigation_view.setOnNavigationItemSelectedListener(listener);

    }
}
