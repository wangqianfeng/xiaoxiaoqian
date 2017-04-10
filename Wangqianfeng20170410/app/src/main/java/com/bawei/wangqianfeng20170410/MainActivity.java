package com.bawei.wangqianfeng20170410;

import android.graphics.Color;
import android.media.DrmInitData;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;

import org.w3c.dom.Text;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import util.UriUtil;
import util.VpAdapter;

public class MainActivity extends FragmentActivity {

    private LinearLayout mLinearLayout;
    private ViewPager mVp;
    private List<Fragment> listf = new ArrayList<Fragment>();
    private HorizontalScrollView mHsv;
    private int index = 0;
    private String[] mTitle;
    private TextView mTextView;
    private TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x.view().inject(this);

        initView();
        initData();

    }

    private void initData() {

        mTitle = new String[]{"头条","时尚","财经","科技","军事","体育","娱乐","国内","社会","国际"};
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabLayout.setTabTextColors(Color.BLACK,Color.RED);


        listf.add(MyFragment.getFragment("tt"));
        listf.add(MyFragment.getFragment("ss"));
        listf.add(MyFragment.getFragment("cj"));
        listf.add(MyFragment.getFragment("kj"));
        listf.add(MyFragment.getFragment("js"));
        listf.add(MyFragment.getFragment("ty"));
        listf.add(MyFragment.getFragment("yl"));
        listf.add(MyFragment.getFragment("gn"));
        listf.add(MyFragment.getFragment("shehui"));
        listf.add(MyFragment.getFragment("gj"));


        mTabLayout.setupWithViewPager(mVp);
        mVp.setAdapter(new VpAdapter(getSupportFragmentManager(),listf,mTitle));

        mVp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mTabLayout.setTabTextColors(Color.BLACK,Color.RED);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private void initView() {

        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mVp = (ViewPager) findViewById(R.id.vp);
    }
}
