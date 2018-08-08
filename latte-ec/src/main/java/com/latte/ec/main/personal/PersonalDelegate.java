package com.latte.ec.main.personal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.view.View;


import com.late.core.delegates.bottom.BottomItemDelegate;
import com.latte.ec.R;


public class PersonalDelegate extends BottomItemDelegate {

    public static final String ORDER_TYPE = "ORDER_TYPE";
    private Bundle mArgs = null;

    @Override
    public Object setLayout() {
        return R.layout.delegate_personal;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mArgs = new Bundle();
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {


    }


}
