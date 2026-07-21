package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xd */
/* JADX INFO: loaded from: classes.dex */
public class C0739xd {

    /* JADX INFO: renamed from: i */
    @InterfaceC0474ni("class")
    private List<C0613sm> f1784i;

    /* JADX INFO: renamed from: j */
    @InterfaceC0474ni("list")
    private List<C0723wo> f1785j;

    /* JADX INFO: renamed from: k */
    @InterfaceC0474ni("filters")
    private LinkedHashMap<String, List<C0138ax>> f1786k;

    /* JADX INFO: renamed from: l */
    @InterfaceC0474ni("header")
    private String f1787l;

    /* JADX INFO: renamed from: m */
    @InterfaceC0474ni("format")
    private String f1788m;

    /* JADX INFO: renamed from: n */
    @InterfaceC0474ni("danmaku")
    private List<Object> f1789n;

    /* JADX INFO: renamed from: o */
    @InterfaceC0474ni("click")
    private String f1790o;

    /* JADX INFO: renamed from: p */
    @InterfaceC0474ni("msg")
    private String f1791p;

    /* JADX INFO: renamed from: q */
    @InterfaceC0474ni("url")
    private Object f1792q;

    /* JADX INFO: renamed from: r */
    @InterfaceC0474ni("subs")
    private List<C0202dg> f1793r;

    /* JADX INFO: renamed from: s */
    @InterfaceC0474ni("parse")
    private int f1794s;

    /* JADX INFO: renamed from: t */
    @InterfaceC0474ni("jx")
    private int f1795t;

    /* JADX INFO: renamed from: u */
    @InterfaceC0474ni("page")
    private Integer f1796u;

    /* JADX INFO: renamed from: v */
    @InterfaceC0474ni("pagecount")
    private Integer f1797v;

    /* JADX INFO: renamed from: w */
    @InterfaceC0474ni("limit")
    private Integer f1798w;

    /* JADX INFO: renamed from: x */
    @InterfaceC0474ni("total")
    private Integer f1799x;

    /* JADX INFO: renamed from: a */
    public static String m1861a(C0723wo c0723wo) {
        C0739xd c0739xd = new C0739xd();
        c0739xd.f1785j = Arrays.asList(c0723wo);
        return c0739xd.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m1862b(ArrayList arrayList) {
        C0739xd c0739xd = new C0739xd();
        c0739xd.f1785j = arrayList;
        return c0739xd.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m1863c(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        C0739xd c0739xd = new C0739xd();
        c0739xd.f1784i = arrayList;
        c0739xd.f1786k = linkedHashMap;
        return c0739xd.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m1864d(HashMap map) {
        if (map.isEmpty()) {
            return;
        }
        this.f1787l = new C0493oa().m1474ad(map);
    }

    /* JADX INFO: renamed from: e */
    public final void m1865e() {
        this.f1796u = 1;
        this.f1798w = Integer.MAX_VALUE;
        this.f1799x = 1;
        this.f1797v = 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m1866f(ArrayList arrayList) {
        this.f1793r = arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m1867g(String str) {
        this.f1792q = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m1868h(ArrayList arrayList) {
        this.f1785j = arrayList;
    }

    public final String toString() {
        C0444mf c0444mf = new C0444mf(new C0493oa());
        c0444mf.f1226i = false;
        return c0444mf.m1424o().m1474ad(this);
    }
}
