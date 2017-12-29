package com.cst.whut.srmis;

import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.cst.whut.srmis.Fragment.FragmentCheck;
import com.cst.whut.srmis.Fragment.FragmentDoing;
import com.cst.whut.srmis.Fragment.FragmentFinished;
import com.cst.whut.srmis.Fragment.FragmentMain;
import com.cst.whut.srmis.Fragment.FragmentProjectApply;
import com.cst.whut.srmis.Util.RippleUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    //界面
    private NavigationView navigationView;
    //替换页面
    private FragmentProjectApply fragmentProjectApply;
    private FragmentMain fragmentMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        //进入登录界面
//        startActivity(new Intent(this,LoginActivity.class));
        setDefaultFragment();
    }

    protected void InitView(){
        //实例化
//        tabLayout = (TabLayout) findViewById(R.id.top_tl);
//        viewPager = (ViewPager) findViewById(R.id.main_vp);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
//        imageButtonMenu = (ImageButton) findViewById(R.id.toolbarMenu_ib);   //toolbar控件

        navigationView = (NavigationView) findViewById(R.id.navagaiontview);
        //替换页面
        fragmentProjectApply = new FragmentProjectApply();
        fragmentMain = new FragmentMain();
        //监听事件
//        imageButtonMenu.setOnClickListener(this);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

           default:
            break;
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (item.getItemId()){
            case R.id.projectMy:
                if(fragmentMain == null){
                    fragmentMain = new FragmentMain();
                }
                fragmentTransaction.replace(R.id.coordinatorLayout,fragmentMain);
                fragmentTransaction.commit();
                break;
            case R.id.projectApply:
                if(fragmentProjectApply == null){
                    fragmentProjectApply = new FragmentProjectApply();
                }
                fragmentTransaction.replace(R.id.coordinatorLayout,fragmentProjectApply);
                fragmentTransaction.commit();
                break;
            default:
                break;
        }
        item.setChecked(true);
        return true;
    }
    protected void setDefaultFragment(){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        fragmentMain = new FragmentMain();
        transaction.replace(R.id.coordinatorLayout,fragmentMain);
        transaction.commit();
    }
}
