package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bawei.wangqianfeng.R;

import java.util.List;

import bean.JsonBean;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/9.
 */
public class MyAdapter extends BaseAdapter {

    private final Context context;
    private final List<JsonBean.ListBean> list;

    public MyAdapter(Context context, List<JsonBean.ListBean> list) {
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
        MyHolder holder;
        if(view == null){
            view = View.inflate(context, R.layout.list_item,null);
            holder = new MyHolder();
            holder.mTextView = (TextView) view.findViewById(R.id.textView);
            holder.mTextView2 = (TextView) view.findViewById(R.id.textView2);

            view.setTag(holder);
        }else {
            holder = (MyHolder)view.getTag();
        }
        holder.mTextView.setText("地点名："+list.get(i).getSite_name());
        holder.mTextView2.setText("地点："+list.get(i).getAddress());

        return view;
    }

    class MyHolder{
        TextView mTextView,mTextView2;
    }
}

