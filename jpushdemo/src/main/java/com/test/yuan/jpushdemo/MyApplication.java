package com.test.yuan.jpushdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * date:2018/11/15
 * author:yml(123)
 * function:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.init(this);
    }
}
