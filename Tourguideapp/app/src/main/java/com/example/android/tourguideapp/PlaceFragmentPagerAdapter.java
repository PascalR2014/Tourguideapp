package com.example.android.tourguideapp;

/**
 * Created by PB on 09/07/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlaceFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public PlaceFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Switch statement instead of if/else statement
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AroundFragment();
            case 1:
                return new DrinkFragment();
            case 2:
                return new ShoppingFragment();
            case 3:
                return new MuseumFragment();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab1);
        } else if (position == 1) {
            return mContext.getString(R.string.tab2);
        } else if (position == 2) {
            return mContext.getString(R.string.tab3);
        } else {
            return mContext.getString(R.string.tab4);
        }
    }
}