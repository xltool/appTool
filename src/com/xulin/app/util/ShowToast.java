package com.xulin.app.util;

import android.content.Context;
import android.widget.Toast;


/**
 * 描述: 用于公共显示提示信息类
 * @author 徐林
 * @createT 2015-1-25 下午4:45:59
 */
public class ShowToast {
	
	/**
	 * 用于显示提示的信息消息
	 * @param c 那个类
	 * @param info  提示信息
	 */
	public static void showMakeText(Context c,String info){
		Toast.makeText(c, info, Toast.LENGTH_LONG).show();
	}
	
}
