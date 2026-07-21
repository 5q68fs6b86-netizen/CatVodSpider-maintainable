package com.github.catvod.spider.support.p128m;

import android.text.TextUtils;
import android.util.TypedValue;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p117b.RunnableC2173g;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.I */
/* JADX INFO: loaded from: classes.dex */
public final class C2256I {

    /* JADX INFO: renamed from: a */
    public static final List<String> f5633a = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "mp3", "aac", "flac", "m4a");

    /* JADX INFO: renamed from: b */
    public static final Pattern f5634b = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http((?!http).)*?video/tos*");

    /* JADX INFO: renamed from: a */
    public static String m6109a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m6110c(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: e */
    public static String m6111e(double d) {
        if (d <= 0.0d) {
            return "";
        }
        if (d > 1.099511627776E12d) {
            return String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB");
        }
        if (d > 1.073741824E9d) {
            return String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB");
        }
        return d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6112f() {
        for (Method method : Spider.class.getDeclaredMethods()) {
            if ("action".equals(method.getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m6113i(String str) {
        if (str.equals(".aliyun")) {
            str = "已清除阿里Token";
        } else if (str.equals("quark_cookie.txt")) {
            str = "已清除夸克Cookie";
        } else if (str.equals("uc_cookie.txt")) {
            str = "已清除UC Cookie";
        } else if (str.equals("uc_token.txt")) {
            str = "已清除UC TV Token";
        } else if (str.equals("cloud189.txt")) {
            str = "已清除天翼Cookie";
        } else if (str.equals("cloud123.txt")) {
            str = "已清除123 Cookie";
        } else if (str.equals("baidu.txt")) {
            str = "已清除百度Cookie";
        } else if (str.equals("xunlei.txt")) {
            str = "已清除迅雷Token";
        } else if (str.equals("guangya.txt")) {
            str = "已清除光鸭Token";
        } else if (str.equals("bili_cookie.txt")) {
            str = "已清除哔哩Cookie";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Init.run(new RunnableC2173g(str, 4));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6114i(String str) {
        return f5633a.contains(m6117m(str));
    }

    /* JADX INFO: renamed from: j */
    private static HashMap<String, String> m6115j(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf != -1) {
                map.put(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static String m6116k(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m6117m(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    /* JADX INFO: renamed from: n */
    public static String m6118n(String str, String str2, String str3) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", str);
            jSONObject.put("folder", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("sharePwd", str3);
            }
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m6119o(String str, String str2, String str3, String str4) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", str);
            jSONObject.put("folder", str2);
            jSONObject.put("parentId", str3);
            jSONObject.put("fileToken", str4);
            if (!TextUtils.isEmpty("")) {
                jSONObject.put("sharePwd", "");
            }
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m6120q(String str, String str2) {
        try {
            HashMap<String, String> mapM6121r = m6121r(str);
            mapM6121r.putAll(m6121r(str2.split(";")[0]));
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : mapM6121r.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    private static HashMap<String, String> m6121r(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf != -1) {
                map.put(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }
}
