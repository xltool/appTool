package com.xulin.app.activity;

import com.xulin.app.R;
import com.xulin.app.util.ShowToast;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends Activity implements OnClickListener{
	
	//定义控件
	
	private EditText usernameE;
	private EditText passwordE;
	private Button loginBtn;
	private Button reginBtn;
	
	//定义其他
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initControl();
		InitListenr();
	}
	
	/**
	 * 初始化页面的各个空间参数
	 */
	private void initControl(){
		usernameE = (EditText) this.findViewById(R.id.username_logine_ext);
		passwordE = (EditText) this.findViewById(R.id.password_logine_ext);
		loginBtn = (Button) this.findViewById(R.id.login_loginv_btn);
		reginBtn = (Button) this.findViewById(R.id.regin_loginv_btn);
	}
	
	/**
	 * 初始化监听事件
	 */
	private void InitListenr(){
		loginBtn.setOnClickListener(this);
		reginBtn.setOnClickListener(this);
	}
	
	/**
	 * 进行按钮的单击操作
	 */
	@Override
	public void onClick(View v) {
		//进行单击事件的处理
		switch (v.getId()) {
		//登录事件处理
		case R.id.login_loginv_btn:
			String username = usernameE.getText().toString();
			String password = passwordE.getText().toString();
			if(null != username && !"".equals(username) && null != password && !"".equals(password)){
				if("admin".equals(username) && "123456".equals(password)){
					ShowToast.showMakeText(this, "恭喜，登录系统成功,正在玩命加载......");
					Intent intent = new Intent(this, MainActivity.class);
					startActivity(intent);
					LoginActivity.this.finish();
				}else{
					ShowToast.showMakeText(this, "用户名或密码错误，登录系统失败");
				}
				
			}else{
				ShowToast.showMakeText(this, "用户名或密码为空");
			}
			break;
			
		//注册事件处理
		case R.id.regin_loginv_btn:
			ShowToast.showMakeText(this, "该功能还没有进行开放，敬请期待。");
			break;
			
		default:
			break;
		}
	}
	
	
	
}
