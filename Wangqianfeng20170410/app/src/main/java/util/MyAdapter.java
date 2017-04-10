package util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.wangqianfeng20170410.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.NewBean;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/10.
 */

public class MyAdapter extends BaseAdapter{

    private final Context context;
    private final List<NewBean.ResultBean.DataBean> list;

    public MyAdapter(Context context, List<NewBean.ResultBean.DataBean> list) {

        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyHoloder holoder;
        if (view == null){
            view = View.inflate(context, R.layout.list_item,null);
            holoder = new MyHoloder();
            holoder.mTextView = (TextView) view.findViewById(R.id.text_title);
            holoder.mTextView2 = (TextView) view.findViewById(R.id.text);
            holoder.mImageView = (ImageView) view.findViewById(R.id.image);
            view.setTag(holoder);
        }else {
            holoder = (MyHoloder) view.getTag();
        }

        holoder.mTextView.setText(list.get(i).getTitle());
        holoder.mTextView2.setText(list.get(i).getAuthor_name());
        ImageLoader.getInstance().displayImage(list.get(i).getThumbnail_pic_s(),holoder.mImageView,new DisplayImageOptions.Builder().showImageForEmptyUri(R.mipmap.ic_launcher).build());

        return view;
    }

    class MyHoloder{
        TextView mTextView,mTextView2;
        ImageView mImageView;
    }
}
