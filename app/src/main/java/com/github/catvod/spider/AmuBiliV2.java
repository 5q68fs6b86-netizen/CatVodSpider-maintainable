package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Log;

import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Path;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * B 站 cookie 刷新辅助（jar 中无列表接口，仅 cookie/nav）。
 * 完整 Bili 站点请用 FongMi 原版 {@link Bili}。
 */
public class AmuBiliV2 extends Spider {

    private static final String DEFAULT_COOKIE = "buvid3=9AB9323A-F21B-1A49-93F8-ABBE7738F82787336infoc; b_nut=1730031187; b_lsid=C5DE8ADD_192CDE4F974; _uuid=39F105341-5ABB-297C-E8AC-193910249F69488356infoc; buvid4=3AAE7EBA-A505-6B5F-153E-EEFE17AA68A888888-024102712-wN48cfQQcbzwQQDk0fiimQ%3D%3D; buvid_fp=799be2784f8761d26ecab89ab3c5982f; bili_ticket=eyJhbGciOiJIUzI1NiIsImtpZCI6InMwMyIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MzAyOTAzODksImlhdCI6MTczMDAzMTEyOSwicGx0IjotMX0.XzvRhDap3hcbkoNoOeK8lkWjH_SAUCXk8N0JtAfxGhE; bili_ticket_expires=1730290329";

    private static Map<String, String> headers() {
        Map<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        String cookie = null;
        try {
            String raw = Path.read(getCache());
            if (!TextUtils.isEmpty(raw)) {
                cookie = new JSONObject(raw).optString("cookie");
                if (!TextUtils.isEmpty(cookie)) {
                    map.put("cookie", cookie);
                    Log.d("AmuBiliV2", "Loaded cookie from file");
                }
            }
        } catch (Exception e) {
            Log.e("AmuBiliV2", "Failed to load cookie from file", e);
        }
        if (TextUtils.isEmpty(cookie)) {
            map.put("cookie", DEFAULT_COOKIE);
            Log.d("AmuBiliV2", "Using default cookie");
        }
        map.put("Referer", "https://www.bilibili.com");
        return map;
    }

    public static File getCache() {
        return Path.tv("bili_cookie.txt");
    }

    /**
     * 刷新用户 cookie 并写缓存。完整 WBI 字段写入简化为 cookie + isLogin。
     */
    public static boolean refreshUser(String cookie) {
        try {
            Map<String, String> h = headers();
            h.put("cookie", cookie);
            String body = OkHttp.string("https://api.bilibili.com/x/web-interface/nav", h);
            JsonObject data = JsonParser.parseString(body).getAsJsonObject().getAsJsonObject("data");
            boolean login = data != null && data.has("isLogin") && data.get("isLogin").getAsBoolean();
            JSONObject cache = new JSONObject();
            cache.put("cookie", cookie);
            cache.put("isLogin", login);
            Path.write(getCache(), cache.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
            return login;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
