package com.cst.whut.srmis.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cst.whut.srmis.R;
import com.cst.whut.srmis.mAdapter.MyRecycleViewAdapter;
import com.cst.whut.srmis.mAdapter.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 12421 on 2017/12/25.
 */

public class FragmentCheck extends Fragment {
    //recycleView的list相关
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private List<Project> projectList;
    private MyRecycleViewAdapter myRecycleViewAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_check, container, false);
        InitView(view);
        //测试数据
        for(int i=0;i<7;i++)
        projectList.add(new Project("测试名称","测试负责人","测试详细信息测试详细信息测试详细信息测试详细信息测试详细信息测试详细信息","2018-1-1"));
        myRecycleViewAdapter.notifyDataSetChanged();
        return view;
    }

    protected void InitView(View view){
        //recycleView相关
        recyclerView = (RecyclerView) view.findViewById(R.id.projectCheck_rv);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        //数据适配器
        projectList = new ArrayList<Project>();
        myRecycleViewAdapter = new MyRecycleViewAdapter(projectList,getActivity());
        recyclerView.setAdapter(myRecycleViewAdapter);

    }
}
