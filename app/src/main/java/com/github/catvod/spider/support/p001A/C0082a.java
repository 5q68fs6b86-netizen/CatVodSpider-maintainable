package com.github.catvod.spider.support.p001A;

import com.github.catvod.bean.Vod;
import com.google.gson.JsonObject;
import java.util.*;
import org.json.*;

public class C0082a {
    public static Vod m812b(String str) { return new Vod(str == null ? "" : str, str == null ? "" : str, ""); }
    public static void m845p(LinkedHashMap linkedHashMap, String str, Vod vod, String str2) {}
    public static StringBuilder m833e(String a, String b, String c) { return new StringBuilder().append(a).append(b).append(c); }
    public static StringBuilder m834f(String a, String b, String c, String d, String e) { return new StringBuilder().append(a).append(b).append(c).append(d).append(e); }
    public static JSONArray m827c(String json, String key) { try { return new JSONObject(json).getJSONArray(key); } catch (Exception e) { return new JSONArray(); } }
    public static HashMap m818b() { return new HashMap(); }
    public static String m801a(String a, String b, String c) { return String.valueOf(a)+b+c; }
    public static String m815b(String s) { return s == null ? "" : s; }
    public static String m816b(String a, String b) { return String.valueOf(a)+b; }
    public static Object m813b(int i) { return null; }
    public static String m814b() { return ""; }
    public static void m820b(Runnable r) { if (r != null) r.run(); }
    public static JsonObject m823c(String s) { try { return com.google.gson.JsonParser.parseString(s).getAsJsonObject(); } catch (Exception e) { return new JsonObject(); } }
    public static String m826c(String a, String b) { return String.valueOf(a)+b; }
    public static JSONObject m828c(String a, String b) { return new JSONObject(); }
    public static String m829d(String a, String b) { return String.valueOf(a)+b; }
    public static String m832e(String a, String b) { return String.valueOf(a)+b; }
    public static String m836g(String a, String b, String c, String d, String e) { return ""+a+b+c+d+e; }
    public static String m839i(String s) { return s == null ? "" : s; }
}
