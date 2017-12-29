package com.cst.whut.srmis;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dd.CircularProgressButton;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    //登录控件
    private CoordinatorLayout coordinatorLayout;
    private EditText editTextAccount;
    private EditText editTextPassword;
    private CircularProgressButton circularProgressButtonLogin;
    private TextView textViewForgetPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //初始化
        InitView();
    }
    //初始化视图
    private void InitView(){
        coordinatorLayout = (CoordinatorLayout)findViewById(R.id.activity_login);
        editTextAccount = (EditText) findViewById(R.id.loginAccount_et);
        editTextPassword = (EditText) findViewById(R.id.loginPassword_et);
        circularProgressButtonLogin = (CircularProgressButton) findViewById(R.id.login_btn);
        circularProgressButtonLogin.setIndeterminateProgressMode(true);
        circularProgressButtonLogin.setOnClickListener(this);
        textViewForgetPassword = (TextView) findViewById(R.id.forgetPassword_tv);
        textViewForgetPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_btn:
                CircularProgressButton btn = (CircularProgressButton) v;
                int progress = btn.getProgress();
                // Toast.makeText(this,progress,Toast.LENGTH_SHORT).show();
                if (progress == 0) { // 初始时progress = 0
                    circularProgressButtonLogin.setProgress(50); // 点击后开始不精准进度，不精准进度的进度值一直为50
                } else if (progress == -1) { // 如果当前进度为100，即完成状态，那么重新回到未完成的状态
                    circularProgressButtonLogin.setProgress(0);
                } else if (progress == 50) { // 如果当前进度为50，那么点击后就显示完成的状态
                    circularProgressButtonLogin.setProgress(-1); // -1表示出错，显示出错的图片和背景，100表示完成，显示完成的图片和背景
                }
                break;
            case R.id.forgetPassword_tv:
                Snackbar.make(coordinatorLayout,"点击登录按钮！",Snackbar.LENGTH_SHORT).setAction("UNDO",this).show();
                break;
            default:
                break;
        }
    }
}
