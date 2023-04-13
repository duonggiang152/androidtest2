package com.example.afinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.afinal.model.ViewerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        viewPager = findViewById(R.id.viewpager);
        fragmentManager = getSupportFragmentManager();
        ViewerAdapter viewerAdapter = new ViewerAdapter(fragmentManager, 3);
        viewPager.setAdapter(viewerAdapter);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.mDS:
                                viewPager.setCurrentItem(0);
                                return true;
                            case R.id.mTT:
                                viewPager.setCurrentItem(1);
                                return true;
                            case R.id.mFL:
                                viewPager.setCurrentItem(2);
                                return true;
                        }
                        return false;
                    }

                });


    }
}