package com.github.catvod.spider.support.p002A0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.mr */
/* JADX INFO: loaded from: classes.dex */
public class C0456mr {

    /* JADX INFO: renamed from: o */
    @InterfaceC0474ni("drives")
    private List<C0456mr> f1242o;

    /* JADX INFO: renamed from: p */
    @InterfaceC0474ni("params")
    private List<C0812zw> f1243p;

    /* JADX INFO: renamed from: q */
    @InterfaceC0474ni("login")
    private C0132ar f1244q;

    /* JADX INFO: renamed from: r */
    @InterfaceC0474ni("vodPic")
    private String f1245r;

    /* JADX INFO: renamed from: s */
    @InterfaceC0474ni("name")
    private String f1246s;

    /* JADX INFO: renamed from: t */
    @InterfaceC0474ni("server")
    private String f1247t;

    /* JADX INFO: renamed from: u */
    @InterfaceC0474ni("version")
    private int f1248u;

    /* JADX INFO: renamed from: v */
    @InterfaceC0474ni("path")
    private String f1249v;

    /* JADX INFO: renamed from: w */
    @InterfaceC0474ni("token")
    private String f1250w;

    /* JADX INFO: renamed from: x */
    @InterfaceC0474ni("search")
    private Boolean f1251x;

    /* JADX INFO: renamed from: y */
    @InterfaceC0474ni("hidden")
    private Boolean f1252y;

    public C0456mr(String str) {
        this.f1246s = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m1426a() {
        if (this.f1249v == null) {
            String path = Uri.parse(TextUtils.isEmpty(this.f1247t) ? "" : this.f1247t).getPath();
            this.f1249v = TextUtils.isEmpty(path) ? "" : path;
        }
        if (this.f1248u == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(m1430e());
            sb.append("/api/public/settings");
            this.f1248u = AbstractC0771yi.m1889k(sb.toString(), null).contains("v2.") ? 2 : 3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m1427b(String str) {
        List<C0812zw> arrayList = this.f1243p;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (C0812zw c0812zw : arrayList) {
            if (str.startsWith(c0812zw.m1963b())) {
                return c0812zw.m1962a();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public final List m1428c() {
        List<C0456mr> list = this.f1242o;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: d */
    public final HashMap m1429d() {
        HashMap mapM1762f = AbstractC0710wb.m1762f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
        if (!(TextUtils.isEmpty(this.f1250w) ? "" : this.f1250w).isEmpty()) {
            mapM1762f.put("Authorization", this.f1250w);
        }
        return mapM1762f;
    }

    /* JADX INFO: renamed from: e */
    public final String m1430e() {
        return (TextUtils.isEmpty(this.f1247t) ? "" : this.f1247t).replace(m1433h(), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0456mr) {
            return m1432g().equals(((C0456mr) obj).m1432g());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final C0132ar m1431f() {
        return this.f1244q;
    }

    /* JADX INFO: renamed from: g */
    public final String m1432g() {
        return TextUtils.isEmpty(this.f1246s) ? "" : this.f1246s;
    }

    /* JADX INFO: renamed from: h */
    public final String m1433h() {
        return TextUtils.isEmpty(this.f1249v) ? "" : this.f1249v;
    }

    /* JADX INFO: renamed from: i */
    public final String m1434i() {
        return TextUtils.isEmpty(this.f1245r) ? "https://x.imgs.ovh/x/2023/09/05/64f680bb030b4.png" : this.f1245r;
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m1435j() {
        Boolean bool = this.f1252y;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1436k() {
        return this.f1248u == 3;
    }

    /* JADX INFO: renamed from: l */
    public final String m1437l(String str) {
        if (!m1436k()) {
            HashMap map = new HashMap();
            map.put("keyword", str);
            map.put("path", "/");
            return new C0493oa().m1474ad(map);
        }
        HashMap mapM1762f = AbstractC0710wb.m1762f("keywords", str);
        mapM1762f.put("page", 1);
        mapM1762f.put("parent", "/");
        mapM1762f.put("per_page", 100);
        return new C0493oa().m1474ad(mapM1762f);
    }

    /* JADX INFO: renamed from: m */
    public final Boolean m1438m() {
        Boolean bool = this.f1251x;
        return Boolean.valueOf(bool == null || bool.booleanValue());
    }

    /* JADX INFO: renamed from: n */
    public final void m1439n(String str) {
        this.f1250w = str;
    }
}
