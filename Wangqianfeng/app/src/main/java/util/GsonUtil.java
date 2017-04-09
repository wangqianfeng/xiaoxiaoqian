package util;

import com.google.gson.Gson;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/9.
 */
public class GsonUtil {
    public static <T>T getBean(String jsonStr,Class<T> cla){
        Gson gson = new Gson();
        T bean = gson.fromJson(jsonStr, cla);
        return bean;
    }
}
