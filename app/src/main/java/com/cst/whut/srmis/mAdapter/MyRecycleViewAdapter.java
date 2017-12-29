package com.cst.whut.srmis.mAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cst.whut.srmis.R;

import java.util.List;

/**
 * Created by 12421 on 2017/12/29.
 */

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.ViewHolder>  {
    private List<Project> projectList;
    private Context context;
    //构造函数
    public MyRecycleViewAdapter(List<Project> projectList,Context context){
        this.projectList = projectList;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listitem_project,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Project project = projectList.get(position);
        holder.projectName.setText(project.getProjectName());
        holder.projectLeader.setText(project.getProjectLeader());
        holder.projectDetail.setText(project.getProjectDetail());
        holder.projectTime.setText(project.getProjectApplyTime());
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    //视图容器
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView projectName;     //项目名称
        TextView projectLeader;   //项目负责人
        TextView projectDetail;   //项目详细信息
        TextView projectTime;     //项目立项时间

        public ViewHolder(View itemView) {
            super(itemView);
            projectName = (TextView) itemView.findViewById(R.id.projectCheckName_tv);
            projectLeader = (TextView) itemView.findViewById(R.id.projectCheckLeader_tv);
            projectDetail = (TextView) itemView.findViewById(R.id.projectCheckDetail_tv);
            projectTime = (TextView) itemView.findViewById(R.id.projectCheckTime_tv);

        }
    }
}
