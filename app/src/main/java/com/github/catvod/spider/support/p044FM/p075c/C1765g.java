package com.github.catvod.spider.support.p044FM.p075c;

import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p075c.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1765g {

    /* JADX INFO: renamed from: a */
    @SerializedName("class")
    private List<C1759a> f3886a;

    /* JADX INFO: renamed from: b */
    @SerializedName("list")
    private List<C1768j> f3887b;

    /* JADX INFO: renamed from: c */
    @SerializedName("filters")
    private LinkedHashMap<String, List<C1761c>> f3888c;

    /* JADX INFO: renamed from: d */
    @SerializedName("header")
    private String f3889d;

    /* JADX INFO: renamed from: e */
    @SerializedName("format")
    private String f3890e;

    /* JADX INFO: renamed from: f */
    @SerializedName("danmaku")
    private String f3891f;

    /* JADX INFO: renamed from: g */
    @SerializedName("click")
    private String f3892g;

    /* JADX INFO: renamed from: h */
    @SerializedName("msg")
    private String f3893h;

    /* JADX INFO: renamed from: i */
    @SerializedName("url")
    private Object f3894i;

    /* JADX INFO: renamed from: j */
    @SerializedName("subs")
    private List<C1766h> f3895j;

    /* JADX INFO: renamed from: k */
    @SerializedName("parse")
    private int f3896k;

    /* JADX INFO: renamed from: l */
    @SerializedName("jx")
    private int f3897l;

    /* JADX INFO: renamed from: m */
    @SerializedName("page")
    private Integer f3898m;

    /* JADX INFO: renamed from: n */
    @SerializedName("pagecount")
    private Integer f3899n;

    /* JADX INFO: renamed from: o */
    @SerializedName("limit")
    private Integer f3900o;

    /* JADX INFO: renamed from: p */
    @SerializedName("total")
    private Integer f3901p;

    /* JADX INFO: renamed from: c */
    public static String m4184c(String str) {
        C1765g c1765g = new C1765g();
        c1765g.f3887b = Collections.emptyList();
        c1765g.f3893h = str;
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: e */
    public static C1765g m4185e() {
        return new C1765g();
    }

    /* JADX INFO: renamed from: i */
    public static String m4186i(String str) {
        C1765g c1765g = new C1765g();
        c1765g.f3893h = str;
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m4187n(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1711a.m3992b(new byte[]{77, -35, 124, -84, 4}, new byte[]{61, -68, 14, -33, 97, 111, 42, -22}), 0);
            jSONObject.put("url", "");
            jSONObject.put("msg", str);
            jSONObject.put("errMsg", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m4188p(C1768j c1768j) {
        C1765g c1765g = new C1765g();
        c1765g.f3887b = Collections.singletonList(c1768j);
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m4189q(List<C1768j> list) {
        C1765g c1765g = new C1765g();
        c1765g.f3887b = list;
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m4190r(List<C1759a> list, LinkedHashMap<String, List<C1761c>> linkedHashMap) {
        C1765g c1765g = new C1765g();
        c1765g.f3886a = list;
        c1765g.f3888c = linkedHashMap;
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: s */
    public static String m4191s(List<C1759a> list, List<C1768j> list2) {
        C1765g c1765g = new C1765g();
        c1765g.f3886a = list;
        c1765g.f3887b = list2;
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: t */
    public static String m4192t(List<C1759a> list, List<C1768j> list2, LinkedHashMap<String, List<C1761c>> linkedHashMap) {
        C1765g c1765g = new C1765g();
        c1765g.f3886a = list;
        c1765g.f3887b = list2;
        c1765g.f3888c = linkedHashMap;
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: u */
    public static String m4193u(List<C1759a> list, List<C1768j> list2, JSONObject jSONObject) {
        C1765g c1765g = new C1765g();
        c1765g.f3886a = list;
        c1765g.f3887b = list2;
        c1765g.m4197d(jSONObject);
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: v */
    public static String m4194v(List<C1759a> list, JSONObject jSONObject) {
        C1765g c1765g = new C1765g();
        c1765g.f3886a = list;
        c1765g.m4197d(jSONObject);
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C1765g m4195a(String str) {
        this.f3891f = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C1765g m4196b() {
        this.f3890e = "application/dash+xml";
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C1765g m4197d(JSONObject jSONObject) {
        this.f3888c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new C1764f().getType());
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C1765g m4198f(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.f3889d = new Gson().toJson(map);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C1765g m4199g() {
        this.f3897l = 1;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C1765g m4200h() {
        this.f3890e = "application/x-mpegURL";
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C1765g m4201j() {
        this.f3890e = "application/octet-stream";
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C1765g m4202k(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.f3898m = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.f3900o = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.f3901p = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.f3899n = Integer.valueOf(i2);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C1765g m4203l() {
        this.f3896k = 1;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final C1765g m4204m(int i) {
        this.f3896k = i;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final String m4205o() {
        return toString();
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }

    /* JADX INFO: renamed from: w */
    public final C1765g m4206w(List<C1766h> list) {
        this.f3895j = list;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final C1765g m4207x(String str) {
        this.f3894i = str;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final C1765g m4208y(List<String> list) {
        this.f3894i = list;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final C1765g m4209z(List<C1768j> list) {
        this.f3887b = list;
        return this;
    }
}
