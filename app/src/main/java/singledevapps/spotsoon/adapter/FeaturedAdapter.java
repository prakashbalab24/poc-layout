package singledevapps.spotsoon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import singledevapps.spotsoon.fragments.FeaturedFragment;

/**
 * Created by prakash on 12/6/17.
 */

public class FeaturedAdapter extends FragmentPagerAdapter {
    public FeaturedAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FeaturedFragment.newInstance(position);
            case 1:
                return FeaturedFragment.newInstance(position);
            case 2:
                return FeaturedFragment.newInstance(position);
            default:
                return FeaturedFragment.newInstance(position);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}