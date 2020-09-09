package com.example.tourguideapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private CategoryAdapter mCategoryAdapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeFields();

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);

        mViewPager.setAdapter(mCategoryAdapter);

        mTabLayout.setupWithViewPager(mViewPager);

    }

    /**
     * this method for initialize field
     */
    private void initializeFields() {
        toolbar = findViewById(R.id.toolbar);
        mTabLayout = findViewById(R.id.tabLayout);
        mViewPager = findViewById(R.id.viewPager);
        mCategoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());
    }
}
