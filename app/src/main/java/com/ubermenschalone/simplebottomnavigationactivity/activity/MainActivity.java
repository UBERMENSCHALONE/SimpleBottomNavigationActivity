package com.ubermenschalone.simplebottomnavigationactivity.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ubermenschalone.simplebottomnavigationactivity.R;
import com.ubermenschalone.simplebottomnavigationactivity.SwitchFragment;
import com.ubermenschalone.simplebottomnavigationactivity.fragment.FragmentFive;
import com.ubermenschalone.simplebottomnavigationactivity.fragment.FragmentFour;
import com.ubermenschalone.simplebottomnavigationactivity.fragment.FragmentOne;
import com.ubermenschalone.simplebottomnavigationactivity.fragment.FragmentThree;
import com.ubermenschalone.simplebottomnavigationactivity.fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity implements SwitchFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFragment(FragmentOne.newInstance(), "Tab 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        BottomNavigationView bottomNavigationView = findViewById(R.id.buttomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.tab_1:
                        setFragment(FragmentOne.newInstance(), "Tab 1");
                        break;
                    case R.id.tab_2:
                        setFragment(FragmentTwo.newInstance(), "Tab 2");
                        break;
                    case R.id.tab_3:
                        setFragment(FragmentThree.newInstance(), "Tab 3");
                        break;
                    case R.id.tab_4:
                        setFragment(FragmentFour.newInstance(), "Tab 4");
                        break;
                    case R.id.tab_5:
                        setFragment(FragmentFive.newInstance(), "Tab 5");
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void setFragment(Fragment fragment, String title) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }
}
