package com.example.kh.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.kh.myapplication.Module.Fragment_A;
import com.example.kh.myapplication.Module.Fragment_B;
import com.example.kh.myapplication.Module.Fragment_C;

public class MainActivity extends FragmentActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        FragmentManager manager =  getSupportFragmentManager();
        viewPager.setAdapter(new MyFragment(manager));
    }

    private void init() {
        viewPager  = (ViewPager) findViewById(R.id.paper);
    }


}

 class MyFragment extends FragmentPagerAdapter {
    public MyFragment(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position==0){
            fragment = new Fragment_A();
        }
        if(position==1){
            fragment = new Fragment_B();
        }
        if(position==2){
            fragment = new Fragment_C();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
