package com.github.catvod.spider.support.p012C0.p025c;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p025c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1038d {

    /* JADX INFO: renamed from: a */
    @SerializedName("class")
    private List<C1035a> f2525a;

    /* JADX INFO: renamed from: b */
    @SerializedName("list")
    private List<C1041g> f2526b;

    /* JADX INFO: renamed from: c */
    @SerializedName("filters")
    private LinkedHashMap<String, List<C1037c>> f2527c;

    /* JADX INFO: renamed from: d */
    @SerializedName("header")
    private String f2528d;

    /* JADX INFO: renamed from: e */
    @SerializedName("format")
    private String f2529e;

    /* JADX INFO: renamed from: f */
    @SerializedName("url")
    private String f2530f;

    /* JADX INFO: renamed from: g */
    @SerializedName("subs")
    private List<C1039e> f2531g;

    /* JADX INFO: renamed from: h */
    @SerializedName("parse")
    private int f2532h;

    /* JADX INFO: renamed from: i */
    @SerializedName("jx")
    private int f2533i;

    /* JADX INFO: renamed from: j */
    @SerializedName("page")
    private Integer f2534j;

    /* JADX INFO: renamed from: k */
    @SerializedName("pagecount")
    private Integer f2535k;

    /* JADX INFO: renamed from: l */
    @SerializedName("limit")
    private Integer f2536l;

    /* JADX INFO: renamed from: m */
    @SerializedName("total")
    private Integer f2537m;

    /* JADX INFO: renamed from: e */
    public static String m2604e(C1041g c1041g) {
        C1038d c1038d = new C1038d();
        c1038d.f2526b = Arrays.asList(c1041g);
        return c1038d.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m2605f(List<C1041g> list) {
        C1038d c1038d = new C1038d();
        c1038d.f2526b = list;
        return c1038d.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m2606g(List<C1035a> list, LinkedHashMap<String, List<C1037c>> linkedHashMap) {
        C1038d c1038d = new C1038d();
        c1038d.f2525a = list;
        c1038d.f2527c = linkedHashMap;
        return c1038d.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C1038d m2607a(Map<String, String> map) {
        if (!map.isEmpty()) {
            this.f2528d = new Gson().toJson(map);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C1038d m2608b() {
        this.f2533i = 1;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C1038d m2609c() {
        this.f2534j = 1;
        this.f2536l = Integer.MAX_VALUE;
        this.f2537m = 1;
        this.f2535k = 1;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C1038d m2610d() {
        this.f2532h = 1;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C1038d m2611h(List<C1039e> list) {
        this.f2531g = list;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C1038d m2612i(String str) {
        this.f2530f = str;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C1038d m2613j(List<C1041g> list) {
        this.f2526b = list;
        return this;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
