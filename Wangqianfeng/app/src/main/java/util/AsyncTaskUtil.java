package util;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import bean.JsonBean;
import adapter.MyAdapter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/9.
 */
public class AsyncTaskUtil extends AsyncTask<String,Integer,String> {

    private final ListView listview;
    private final Context context;

    public AsyncTaskUtil(Context context,ListView listView) {
        this.context = context;
        this.listview = listView;
    }

    @Override
    protected String doInBackground(String... strings) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(strings[0]);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestMethod("GET");
            /*connection.setDoOutput(true);
            connection.setDoInput(true);*/
            connection.setUseCaches(false);
            int code = connection.getResponseCode();
            if (code==HttpURLConnection.HTTP_OK){
                InputStream inputStream = connection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
                String str ="";
                while ((str=bufferedReader.readLine()) != null){
                    sb.append(str);
                }
                Log.d("xxx",sb.toString());
                inputStream.close();
                bufferedReader.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString().trim();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        //Log.i("xxx",s);

        JsonBean bean = GsonUtil.getBean(s, JsonBean.class);
        final List<JsonBean.ListBean> list = bean.getList();
        final MyAdapter adapter = new MyAdapter(context,list);
        listview.setAdapter(adapter);

        //点击吐司
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context,"id:"+i,Toast.LENGTH_SHORT).show();
            }
        });
        //长按删除
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                list.remove(i);

                adapter.notifyDataSetChanged();

                return true;
            }
        });
    }
}
