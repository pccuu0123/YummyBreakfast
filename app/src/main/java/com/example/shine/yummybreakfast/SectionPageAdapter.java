package com.example.shine.yummybreakfast;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by first on 2017/5/9.
 */

public class SectionPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> myFragment =new ArrayList<>();
    private final List<String> myFragmentTitleList =new ArrayList<>();

    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment,String title){
        myFragment.add(fragment);
        myFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return myFragmentTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return myFragment.get(position);
    }

    @Override
    public int getCount() {
        return myFragment.size();
    }
}
