package com.latte.example;

import android.app.Application;

import com.blankj.utilcode.util.Utils;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.late.core.app.Latte;

public class RmcApplication extends Application {
    private static RmcApplication instance;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Latte.init(this)
                .withApiHost("http://192.168.1.101:8080/test/")
                .withIcon(new FontAwesomeModule())
                .withJavascriptInterface("HLL")
                .withWebEvent("test", new TestEvent())
                .configure();
        Utils.init(this);

    }

    public static RmcApplication getInstance() {
        return instance;
    }


}