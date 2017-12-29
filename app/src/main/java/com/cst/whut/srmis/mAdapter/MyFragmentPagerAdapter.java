package com.cst.whut.srmis.mAdapter;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 12421 on 2017/12/25.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    String[] titles = {"审核","进行","完成"};
    private List<Fragment> fragmentList;
    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> list){
        super(fm);
        fragmentList = list;
    }
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
