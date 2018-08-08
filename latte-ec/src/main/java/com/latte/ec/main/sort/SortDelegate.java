package com.latte.ec.main.sort;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.late.core.delegates.bottom.BottomItemDelegate;
import com.latte.ec.R;


public class SortDelegate extends BottomItemDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_sort;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
    }


    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);

    }
}
