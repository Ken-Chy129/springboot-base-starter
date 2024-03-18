package cn.ken.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/3/18 23:19
 */
public class JsonUtil {

    private static final Gson GSON = new GsonBuilder().create();

    public static String toJsonString(Object obj) {
        return GSON.toJson(obj);
    }
    
    public static <T> T fromJson(String jsonStr, Class<T> objClass) {
        return GSON.fromJson(jsonStr, objClass);
    }
    
}
