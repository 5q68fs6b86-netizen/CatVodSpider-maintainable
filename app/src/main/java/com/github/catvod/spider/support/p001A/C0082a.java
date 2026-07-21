package com.github.catvod.spider.support.p001A;
import com.github.catvod.bean.Vod;
import com.google.gson.JsonObject;
import java.util.*;
import org.json.*;
public class C0082a {
    public static int m800a(int i, int i2, int i3, int i4) { return 0; }
    public static String m801a(String str, String str2, String str3) { return null; }
    public static String m802a(String str, ArrayList arrayList) { return null; }
    public static String m803a(String str, Map<String, String> map) { return null; }
    public static String m804a(String str, Object[] objArr, StringBuilder sb) { return null; }
    public static String m805a(JSONObject jSONObject, String str, StringBuilder sb, String str2, String str3) { return null; }
    public static String m806a(byte[] bArr, byte[] bArr2) { return null; }
    public static String m807ad(int i) { return null; }
    public static String m808af(String str) { return null; }
    public static String m809an(String str, String str2, String str3) { return null; }
    public static String m810ao(int i) { return null; }
    public static String m811at(String str) { return null; }
    public static com.github.catvod.bean.Vod m812b(String str) { return null; }
    public static Object m813b(int i) { return null; }
    public static String m814b() { return null; }
    public static String m815b(String str) { return null; }
    public static String m816b(String str, String str2) { return null; }
    public static String m817b(Throwable th) { return null; }
    public static HashMap m818b() { return null; }
    public static JSONArray m819b(String str, String str2, String str3) { return null; }
    public static void m820b(Runnable runnable) {  }
    public static void m821b(LinkedHashMap linkedHashMap, String str, Vod c2194e, String str2) {  }
    public static String m822bo(String str, String str2, String str3) { return null; }
    public static JsonObject m823c(String str) { return null; }
    public static String m824c(int i, String str, String str2) { return null; }
    public static String m825c(String str, int i) { return null; }
    public static String m826c(String str, String str2) { return null; }
    public static JSONArray m827c(String str, String str2) { return null; }
    public static JSONObject m828c(String str, String str2) { return null; }
    public static String m829d(String str, String str2) { return null; }
    public static String m830d(ArrayList arrayList, int i, int i2, int i3, int i4) { return null; }
    public static String m831d(byte[] bArr, byte[] bArr2) { return null; }
    public static String m832e(String str, String str2) { return null; }
    public static StringBuilder m833e(String str, String str2, String str3) { return null; }
    public static StringBuilder m834f(String str, String str2, String str3, String str4, String str5) { return null; }
    public static StringBuilder m835f(StringBuilder sb, String str, String str2, String str3, String str4) { return null; }
    public static String m836g(String str, String str2, String str3, String str4, String str5) { return null; }
    public static String m837h(StringBuilder sb, String str, String str2, String str3, String str4) { return null; }
    public static byte[] m838h(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) { return null; }
    public static String m839i(String str) { return null; }
    public static String m840j(String str) { return null; }
    public static String m841j(String str, String str2, String str3) { return null; }
    public static byte[] m842j(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) { return null; }
    public static String m843k(Object obj) { return null; }
    public static String m844m(String str, String str2, String str3) { return null; }
    public static void m845p(LinkedHashMap linkedHashMap, String str, Vod c2194e, String str2) {  }
    public static byte[] m846q(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, String str2) { return null; }
    public static void m847r(Exception exc, StringBuilder sb) {  }
    public static void m848s(String str, String str2, String str3, ArrayList arrayList) {  }
    public static C2192c m849z(String str) { return null; }

    public static Vod m812b(String str) { return new Vod(str, str, ""); }
    public static void m845p(LinkedHashMap linkedHashMap, String str, Vod vod, String str2) {
        if (linkedHashMap == null || vod == null) return;
        try {
            String from = String.join(str, linkedHashMap.keySet());
            String url = String.join(str2, linkedHashMap.values().stream().map(String::valueOf).toList());
        } catch (Throwable ignored) {}
    }
    public static StringBuilder m833e(String a, String b, String c) { return new StringBuilder().append(a).append(b).append(c); }
    public static StringBuilder m834f(String a, String b, String c, String d, String e) { return new StringBuilder().append(a).append(b).append(c).append(d).append(e); }
    public static JSONArray m827c(String json, String key) {
        try { return new JSONObject(json).getJSONArray(key); } catch (Exception e) { return new JSONArray(); }
    }
}
