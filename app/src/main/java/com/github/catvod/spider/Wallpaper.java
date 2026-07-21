package com.github.catvod.spider;

import android.app.Application;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.Util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 壁纸代理：对接本地 1314 壁纸服务。
 * 从单线路 spider.jar 逆向后重写。
 */
public class Wallpaper extends Spider {

    public static Object[] proxyLocal(Map<String, String> params) {
        boolean landscape = false;
        try {
            Application app = Init.context();
            if (app != null) {
                Display display = ((WindowManager) app.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                display.getRealSize(point);
                landscape = point.x > point.y;
            }
        } catch (Exception ignored) {
        }

        String url = landscape ? "http://127.0.0.1:1314/wallpaper/tv" : "http://127.0.0.1:1314/wallpaper";
        try {
            Request request = new Request.Builder()
                    .url(url)
                    .header("User-Agent", Util.CHROME)
                    .get()
                    .build();
            Response response = new OkHttpClient().newCall(request).execute();
            InputStream stream = response.body() != null ? response.body().byteStream() : new ByteArrayInputStream(new byte[0]);
            return new Object[]{200, "image/jpeg", stream};
        } catch (Exception e) {
            return new Object[]{200, "image/jpeg", new ByteArrayInputStream(new byte[0])};
        }
    }
}
