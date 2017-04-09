package com.bawei.wangqianfeng;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ListView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import adapter.SlidingMenuAdapter;

public class Main2Activity extends AppCompatActivity {
    private String[] title = {"好友动态","我的话题","收藏","活动","商城"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final SlidingMenu menu = new SlidingMenu(this);
        //设置侧划方向
        menu.setMode(SlidingMenu.LEFT);

        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        //menu.setShadowWidthRes(R.dimen.shadow_width);//设置阴影图片的宽度
        menu.setShadowDrawable(R.mipmap.ic_launcher);//设置阴影图片

        // 设置滑动菜单视图的宽度
        int i = getWindowManager().getDefaultDisplay().getWidth() / 5;
        menu.setBehindOffset(i);

        //设置渐入渐出效果值
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this,SlidingMenu.SLIDING_CONTENT);
        //为侧滑菜单设置布局
        menu.setMenu(R.layout.left_layout);

        ListView listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(new SlidingMenuAdapter(Main2Activity.this,title));
    }
}

