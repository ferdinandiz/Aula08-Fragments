package com.fer.aula08_fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentController frag;//poderia colocar ADAPTER como nome da VAR.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

    }

    protected void setupViewPager(ViewPager view){
        FragmentController frag = new FragmentController(getSupportFragmentManager(),1);
        frag.addFragment(new Fragment1(), "fragment1");
        frag.addFragment(new Fragment2(), "fragment2");
        view.setAdapter(frag);
    }

    public void setViewPager(int num){
        viewPager.setCurrentItem(num);
    }
}