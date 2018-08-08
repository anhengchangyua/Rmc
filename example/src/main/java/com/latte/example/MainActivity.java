package com.latte.example;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.diabin.fastec.example.R;
import com.late.core.activities.ProxyActivity;
import com.late.core.app.Latte;
import com.late.core.delegates.LatteDelegate;
import com.latte.ec.launcher.LauncherDelegate;
import com.latte.ec.main.RmcBottomDelegate;
import com.latte.ec.sign.ISignListener;
import com.latte.ec.sign.SignInDelegate;
import com.latte.ui.launcher.ILauncherListener;
import com.latte.ui.launcher.OnLauncherFinishTag;

import qiu.niorgai.StatusBarCompat;

public class MainActivity extends ProxyActivity implements ISignListener, ILauncherListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Latte.getConfigurator().withActivity(this);
        StatusBarCompat.translucentStatusBar(this, true);
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }


    @Override
    public void onSignInSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_LONG).show();
        getSupportDelegate().startWithPop(new RmcBottomDelegate());
    }

    @Override
    public void onSignUpSuccess() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onLauncherFinish(OnLauncherFinishTag tag) {
        switch (tag) {
            case SIGNED:
                getSupportDelegate().startWithPop(new RmcBottomDelegate());
                break;
            case NOT_SIGNED:
                getSupportDelegate().startWithPop(new SignInDelegate());
                break;
            default:
                break;
        }
    }
}
