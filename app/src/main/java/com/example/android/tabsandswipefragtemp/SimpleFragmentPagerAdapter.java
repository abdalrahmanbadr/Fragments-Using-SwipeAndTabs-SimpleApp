package com.example.android.tabsandswipefragtemp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by AbdALrahman on 22-Feb-17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    // these 4 lines for tabs to be appear
    private Context mContext;
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

public SimpleFragmentPagerAdapter(FragmentManager fm){
    super(fm);
}

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FirstFragment();
        } else if (position == 1){
            return new SecondFragment();
        } else if (position == 2){
            return new ThirdFragment();
        }
        else{
            return new FourthFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "First Fragment";
        } else if (position == 1) {
            return "Second Fragment";
        } else if (position == 2) {
            return "Third Fragment";
        } else {
            return "Fourth Fragment";
        }
    }
}
