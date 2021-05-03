package com.ishuinzu.tabsdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPagerFragments;

    private List<Fragment> fragments;
    private List<CharSequence> titles;
    private FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPagerFragments = findViewById(R.id.viewPagerFragments);

        loadFragments();
    }

    private void loadFragments() {
        fragments = new ArrayList<>();
        titles = new ArrayList<>();

        fragments.add(new FragmentOne());
        fragments.add(new FragmentTwo());
        fragments.add(new FragmentThree());
        fragments.add(new FragmentFour());
        fragments.add(new FragmentFive());
        fragments.add(new FragmentSix());
        fragments.add(new FragmentSeven());
        fragments.add(new FragmentEight());
        fragments.add(new FragmentNine());

        titles.add("One");
        titles.add("Two");
        titles.add("Three");
        titles.add("Four");
        titles.add("Five");
        titles.add("Six");
        titles.add("Seven");
        titles.add("Eight");
        titles.add("Nine");

        adapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        viewPagerFragments.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPagerFragments);

        //Adding Icons
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_android);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_android);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_android);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_android);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_android);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_android);
        tabLayout.getTabAt(6).setIcon(R.drawable.ic_android);
        tabLayout.getTabAt(7).setIcon(R.drawable.ic_android);
        tabLayout.getTabAt(8).setIcon(R.drawable.ic_android);
    }
}