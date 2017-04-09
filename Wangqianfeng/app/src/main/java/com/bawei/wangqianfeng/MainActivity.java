package com.bawei.wangqianfeng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import util.AsyncTaskUtil;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    public static final String path = "http://result.eolinker.com/KLn5hSP9f6fed196f92ec0148255a48aebb2c6cc5f97f0e?uri=user";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void initData() {
        AsyncTaskUtil asyTask = new AsyncTaskUtil(this,mListView);
        asyTask.execute(path);
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.list_view);
    }

}
