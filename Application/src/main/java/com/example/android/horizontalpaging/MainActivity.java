package com.example.android.horizontalpaging;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity{
    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_main);
        final ActionBar actionBar = getActionBar();
        actionBar.hide();
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {


        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            //if user is on first page open f1() else if user is on second page open f2()... so on..
            //GOOD LUCK DUM DUM... :)
            switch (position)
            {
                case 0:
                    return new f1();
                case 1:
                    return new f2();
                case 2:
                    return new f3();
                case 3:
                    return new f4();
                default:
                    return new f1();
            }
        }
        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }
    }
}
