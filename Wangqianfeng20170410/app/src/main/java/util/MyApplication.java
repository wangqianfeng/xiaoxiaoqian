package util;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import org.xutils.x;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/10.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
        x.Ext.setDebug(false);

        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(getApplicationContext()).memoryCacheExtraOptions(480,800).build();
        ImageLoader.getInstance().init(configuration);
    }
}
