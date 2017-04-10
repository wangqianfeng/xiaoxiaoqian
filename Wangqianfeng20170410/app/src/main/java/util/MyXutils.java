package util;

import android.content.Context;
import android.location.GnssClock;
import android.os.Handler;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import bean.NewBean;
import xlistview.bawei.com.xlistviewlibrary.XListView;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/10.
 */

public class MyXutils {

    private final Context context;
    private final XListView xlistview;
    private final Handler mHandler;


    public MyXutils(Context context, XListView xListView,Handler mHandler) {
        this.context = context;
        this.xlistview = xListView;
        this.mHandler = mHandler;
    }

    public void getData(String str){

        RequestParams params = new RequestParams(UriUtil.uri);
        params.addQueryStringParameter("uri", str);
        x.http().get(params, new Callback.CacheCallback<String>() {
            public String result;

            @Override
            public void onSuccess(String result) {
                //如果服务返回304或onCache选择了信任缓存,这时result为null
                NewBean bean = GsonUtil.getBean(result, NewBean.class);
                List<NewBean.ResultBean.DataBean> mList = bean.getResult().getData();
                final MyAdapter adapter = new MyAdapter(context, mList);
                xlistview.setAdapter(adapter);

                xlistview.setPullRefreshEnable(true);//下拉刷新
                xlistview.setPullLoadEnable(true);//上拉加载更多

                xlistview.setXListViewListener(new XListView.IXListViewListener() {
                    @Override
                    public void onRefresh() {
                        mHandler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                adapter.notifyDataSetChanged();
                                onLoad();
                            }
                        }, 2000);
                    }

                    @Override
                    public void onLoadMore() {

                    }
                });
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }

            @Override
            public boolean onCache(String result) {//得到缓存数据，过期后不会进入
                this.result = result;
                return false;//true: 信任缓存数据, 不再发起网络请求; false不信任缓存数据
            }
        });
    }

    private void onLoad() {
        xlistview.stopRefresh();//停止刷新
        xlistview.stopLoadMore();//停止加载更多
        xlistview.setRefreshTime(setXlistTime());
    }
    public String setXlistTime(){
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");//设置时间格式
        String format = sdf.format(date);
        return format;
    }
}
