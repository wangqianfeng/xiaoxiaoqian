package com.bawei.wangqianfeng20170410;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import bean.NewBean;
import util.GsonUtil;
import util.HttpUtil;
import util.MyAdapter;
import util.MyXutils;
import xlistview.bawei.com.xlistviewlibrary.XListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    private View mView;
    private MyAdapter mAdapter ;
    private Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);


        }
    };
    private XListView xlist;

    public static MyFragment getFragment(String uri) {
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("uri", uri);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_my, container, false);

        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();

    }
    private void initData() {
        Bundle bundle = getArguments();
        String str = bundle.getString("uri");
        new MyXutils(getActivity(),xlist,mHandler).getData(str);

    }

    private void initView() {
        xlist = (XListView) mView.findViewById(R.id.xlist);
    }
}
