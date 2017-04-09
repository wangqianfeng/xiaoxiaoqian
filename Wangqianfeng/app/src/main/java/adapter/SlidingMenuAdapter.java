package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bawei.wangqianfeng.R;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/9.
 */

public class SlidingMenuAdapter extends BaseAdapter {
    private final Context context;
    private final String[] title;

    public SlidingMenuAdapter(Context context, String[] title) {
        this.context = context;
        this.title = title;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return title[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = View.inflate(context, R.layout.list_layout,null);
        TextView textView = (TextView) view.findViewById(R.id.text_view);

        textView.setText(title[i]);
        return view;
    }
}
