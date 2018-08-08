package com.latte.ec.main.index;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.view.View;

import com.late.core.delegates.bottom.BottomItemDelegate;
import com.latte.ec.R;


public class IndexDelegate extends BottomItemDelegate implements View.OnFocusChangeListener {


    @Override
    public Object setLayout() {
        return R.layout.delegate_index;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus) {
            getParentDelegate().start(new SearchDelegate());
        }
    }
}
