package com.latte.ec.main;

import android.graphics.Color;


import com.late.core.delegates.bottom.BaseBottomDelegate;
import com.late.core.delegates.bottom.BottomItemDelegate;
import com.late.core.delegates.bottom.BottomTabBean;
import com.late.core.delegates.bottom.ItemBuilder;
import com.latte.ec.main.index.IndexDelegate;
import com.latte.ec.main.personal.PersonalDelegate;
import com.latte.ec.main.sort.SortDelegate;

import java.util.LinkedHashMap;


public class RmcBottomDelegate extends BaseBottomDelegate {

    @Override
    public LinkedHashMap<BottomTabBean, BottomItemDelegate> setItems(ItemBuilder builder) {
        final LinkedHashMap<BottomTabBean, BottomItemDelegate> items = new LinkedHashMap<>();
        items.put(new BottomTabBean("{fa-home}", "首页"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-sort}", "场景"), new SortDelegate());
        items.put(new BottomTabBean("{fa-user}", "我的"), new PersonalDelegate());
        return builder.addItems(items).build();
    }

    @Override
    public int setIndexDelegate() {
        return 0;
    }

    @Override
    public int setClickedColor() {
        return Color.parseColor("#ffff8800");
    }


}
