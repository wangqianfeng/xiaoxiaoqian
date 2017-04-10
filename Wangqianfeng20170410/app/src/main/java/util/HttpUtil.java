package util;

import android.os.Handler;
import android.os.Message;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/10.
 */

public class HttpUtil extends Thread{

    private final Handler handler;
    private final String path;

    public HttpUtil(Handler handler,String path) {
        this.handler = handler;
        this.path = path;
    }

    @Override
    public void run() {
        super.run();

        Message message = new Message();
        message.what = 0;
        message.obj = getData(path);
        handler.sendMessage(message);

    }

    public static String getData(String uri){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK){
                InputStream inputStream = connection.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
                String str = "";
                while ((str = br.readLine()) != null){
                    stringBuilder.append(str);
                }

                inputStream.close();
                br.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString().trim();
    }
}
