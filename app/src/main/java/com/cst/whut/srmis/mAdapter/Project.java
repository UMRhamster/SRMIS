package com.cst.whut.srmis.mAdapter;

/**
 * Created by 12421 on 2017/12/29.
 */

public class Project {
    private String projectID;          //项目编号
    private String projectName;        //项目名称
    private String projectDetail;      //项目详细信息
    private Double projectMoney;       //项目资金
    private String projectLeader;      //项目负责人
    private String projectApplyTime;   //项目申请时间
    private String projectStartTime;   //项目立项时间
    private String projectFinishedTime;//项目结题时间
    //部分数据构造函数--主要用于测试
    public Project(String projectName, String projectLeader, String projectDetail, String projectApplyTime){
        this.projectName = projectName;
        this.projectLeader = projectLeader;
        this.projectDetail = projectDetail;
        this.projectApplyTime = projectApplyTime;
    }
    //全数据构造函数
    public Project(String projectID, String projectName, String projectDetail, Double projectMoney,
                   String projectLeader, String projectApplyTime, String projectStartTime, String projectFinishedTime){
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDetail = projectDetail;
        this.projectMoney = projectMoney;
        this.projectLeader = projectLeader;
        this.projectApplyTime = projectApplyTime;
        this.projectStartTime = projectStartTime;
        this.projectFinishedTime = projectFinishedTime;
    }
    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail;
    }

    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectMoney(Double projectMoney) {
        this.projectMoney = projectMoney;
    }

    public Double getProjectMoney() {
        return projectMoney;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectApplyTime(String projectApplyTime) {
        this.projectApplyTime = projectApplyTime;
    }

    public String getProjectApplyTime() {
        return projectApplyTime;
    }

    public void setProjectStartTime(String projectStartTime) {
        this.projectStartTime = projectStartTime;
    }

    public String getProjectStartTime() {
        return projectStartTime;
    }

    public void setProjectFinishedTime(String projectFinishedTime) {
        this.projectFinishedTime = projectFinishedTime;
    }

    public String getProjectFinishedTime() {
        return projectFinishedTime;
    }
}
