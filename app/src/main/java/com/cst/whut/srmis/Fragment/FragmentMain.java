package com.cst.whut.srmis.Fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.cst.whut.srmis.R;
import com.cst.whut.srmis.mAdapter.MyFragmentPagerAdapter;
import com.cst.whut.srmis.mAdapter.MyRecycleViewAdapter;
import com.cst.whut.srmis.mAdapter.Project;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by 12421 on 2017/12/29.
 */

public class FragmentMain extends Fragment implements View.OnClickListener{
    //控件
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragmentList;
    //toolBar上的控件
    private ImageButton imageButtonMenu;
    private DrawerLayout drawerLayout;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        InitView(view);
        return view;
    }
    protected void InitView(View view){
        //实例化
        tabLayout = (TabLayout) view.findViewById(R.id.top_tl);
        viewPager = (ViewPager) view.findViewById(R.id.main_vp);
        imageButtonMenu = (ImageButton) view.findViewById(R.id.toolbarMenu_ib);   //toolbar控件
        drawerLayout = (DrawerLayout) getActivity().findViewById(R.id.drawerLayout);
        //页面数据源
        fragmentList = new ArrayList<>();
        fragmentList.add(new FragmentCheck());
        fragmentList.add(new FragmentDoing());
        fragmentList.add(new FragmentFinished());
        //ViewPager适配器
        viewPager.setAdapter(new MyFragmentPagerAdapter(getActivity().getSupportFragmentManager(),fragmentList));
        tabLayout.setupWithViewPager(viewPager);
        //监听事件
        imageButtonMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toolbarMenu_ib:
                drawerLayout.openDrawer(Gravity.LEFT);
                break;
            default:
                break;
        }
    }
}
