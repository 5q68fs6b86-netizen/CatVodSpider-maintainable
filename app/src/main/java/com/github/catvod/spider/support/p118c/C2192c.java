package com.github.catvod.spider.support.p118c;

import com.github.catvod.bean.Vod;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p118c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2192c {

    /* JADX INFO: renamed from: a */
    @SerializedName("class")
    private List<C2190a> f5278a;

    /* JADX INFO: renamed from: b */
    @SerializedName("list")
    private List<Vod> f5279b;

    /* JADX INFO: renamed from: c */
    @SerializedName("filters")
    private LinkedHashMap<String, List<C2191b>> f5280c;

    /* JADX INFO: renamed from: d */
    @SerializedName("header")
    private String f5281d;

    /* JADX INFO: renamed from: e */
    @SerializedName("format")
    private String f5282e;

    /* JADX INFO: renamed from: f */
    @SerializedName("danmaku")
    private String f5283f;

    /* JADX INFO: renamed from: g */
    @SerializedName("url")
    private Object f5284g;

    /* JADX INFO: renamed from: h */
    @SerializedName("subs")
    private List<C2193d> f5285h;

    /* JADX INFO: renamed from: i */
    @SerializedName("parse")
    private int f5286i;

    /* JADX INFO: renamed from: j */
    @SerializedName("jx")
    private int f5287j;

    /* JADX INFO: renamed from: k */
    @SerializedName("page")
    private Integer f5288k;

    /* JADX INFO: renamed from: l */
    @SerializedName("pagecount")
    private Integer f5289l;

    @SerializedName("lrc")
    private String lrc;

    /* JADX INFO: renamed from: m */
    @SerializedName("limit")
    private Integer f5290m;

    /* JADX INFO: renamed from: n */
    @SerializedName("total")
    private Integer f5291n;

    /* JADX INFO: renamed from: o */
    @SerializedName("msg")
    private String f5292o;

    /* JADX INFO: renamed from: p */
    @SerializedName("errMsg")
    private String f5293p;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p118c.c$a */
    class a extends TypeToken<LinkedHashMap<String, List<C2191b>>> {
        a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m5791c(String str) {
        C2192c c2192c = new C2192c();
        c2192c.f5279b = Collections.emptyList();
        c2192c.f5292o = str;
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: e */
    public static C2192c m5792e() {
        return new C2192c();
    }

    /* JADX INFO: renamed from: i */
    public static String m5793i(List list) {
        if (list != null && !list.isEmpty()) {
            if (list.get(0) instanceof Vod) {
                C2192c c2192c = new C2192c();
                c2192c.f5279b = list;
                return c2192c.toString();
            }
            if (list.get(0) instanceof C2190a) {
                C2192c c2192c2 = new C2192c();
                c2192c2.f5278a = list;
                return c2192c2.toString();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: l */
    public static String m5794l(String str) {
        C2192c c2192c = new C2192c();
        c2192c.f5286i = 0;
        c2192c.f5284g = "";
        c2192c.f5292o = str;
        c2192c.f5293p = str;
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m5795m(Vod c2194e) {
        C2192c c2192c = new C2192c();
        c2192c.f5279b = Arrays.asList(c2194e);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m5796m(Integer num, Integer num2, Integer num3, Integer num4, List list) {
        C2192c c2192c = new C2192c();
        c2192c.m5819i(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        c2192c.f5279b = list;
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m5797n(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse", 0);
            jSONObject.put("url", "");
            jSONObject.put("msg", str);
            jSONObject.put("errMsg", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m5798n(List<Vod> list) {
        C2192c c2192c = new C2192c();
        c2192c.f5279b = list;
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m5799o(List<C2190a> list, LinkedHashMap<String, List<C2191b>> linkedHashMap) {
        C2192c c2192c = new C2192c();
        c2192c.f5278a = list;
        c2192c.f5280c = linkedHashMap;
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m5800p(List<C2190a> list, List<Vod> list2) {
        C2192c c2192c = new C2192c();
        c2192c.f5278a = list;
        c2192c.f5279b = list2;
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m5801q(ArrayList arrayList, List list, LinkedHashMap linkedHashMap) {
        C2192c c2192c = new C2192c();
        c2192c.f5278a = arrayList;
        c2192c.f5279b = list;
        c2192c.f5280c = linkedHashMap;
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m5802q(List<C2190a> list, List<Vod> list2, LinkedHashMap<String, List<C2191b>> linkedHashMap) {
        C2192c c2192c = new C2192c();
        c2192c.f5278a = list;
        c2192c.f5279b = list2;
        c2192c.f5280c = linkedHashMap;
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m5803r(List<C2190a> list, List<Vod> list2, JSONObject jSONObject) {
        C2192c c2192c = new C2192c();
        c2192c.f5278a = list;
        c2192c.f5279b = list2;
        c2192c.m5810d(jSONObject);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: s */
    public static String m5804s(Vod c2194e) {
        C2192c c2192c = new C2192c();
        c2192c.f5279b = Collections.singletonList(c2194e);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: s */
    public static String m5805s(List<C2190a> list, JSONObject jSONObject) {
        C2192c c2192c = new C2192c();
        c2192c.f5278a = list;
        c2192c.m5810d(jSONObject);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C2192c m5806a(String str) {
        this.f5283f = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m5807a(boolean z) {
        if (z) {
            this.f5282e = "video/x-iso";
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2192c m5808b() {
        this.f5282e = "application/dash+xml";
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m5809b(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.f5288k = Integer.valueOf(i);
        this.f5290m = Integer.MAX_VALUE;
        this.f5291n = Integer.MAX_VALUE;
        this.f5289l = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public final C2192c m5810d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        this.f5280c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new a().getType());
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C2192c m5811e(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.f5281d = new Gson().toJson(map);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m5812e(Map map) {
        if (map.isEmpty()) {
            return;
        }
        this.f5281d = new Gson().toJson(map);
    }

    /* JADX INFO: renamed from: f */
    public final C2192c m5813f() {
        this.f5287j = 1;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C2192c m5814g() {
        this.f5282e = "application/x-mpegURL";
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C2192c m5815h() {
        this.f5282e = "application/octet-stream";
        return this;
    }

    /* JADX INFO: renamed from: hh */
    public final C2192c m5816hh() {
        this.f5282e = "video/x-iso";
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C2192c m5817i(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.f5288k = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.f5290m = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.f5291n = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.f5289l = Integer.valueOf(i2);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C2192c m5818i(String str) {
        this.lrc = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final void m5819i(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.f5288k = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.f5290m = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.f5291n = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.f5289l = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: j */
    public final C2192c m5820j() {
        this.f5286i = 1;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C2192c m5821k(int i) {
        this.f5286i = i;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C2192c m5822k(String str) {
        this.f5292o = str;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final void m5823l(int i) {
        this.f5286i = i;
    }

    /* JADX INFO: renamed from: o */
    public final String m5824o() {
        return toString();
    }

    /* JADX INFO: renamed from: q */
    public final C2192c m5825q(Vod c2194e) {
        this.f5279b = Arrays.asList(c2194e);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final C2192c m5826t(List<C2193d> list) {
        this.f5285h = list;
        return this;
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    /* JADX INFO: renamed from: u */
    public final C2192c m5827u(String str) {
        this.f5284g = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final C2192c m5828v(List<String> list) {
        this.f5284g = list;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final C2192c m5829w(List<Vod> list) {
        this.f5279b = list;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final void m5830w(String str) {
        this.f5284g = str;
    }

    /* JADX INFO: renamed from: x */
    public final C2192c m5831x(List<C2190a> list) {
        this.f5278a = list;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final void m5832y(List list) {
        this.f5284g = list;
    }

    /* JADX INFO: renamed from: z */
    public final void m5833z(List list) {
        this.f5279b = list;
    }
}
