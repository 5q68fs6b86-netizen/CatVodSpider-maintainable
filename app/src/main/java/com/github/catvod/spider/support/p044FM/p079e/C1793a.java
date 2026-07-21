package com.github.catvod.spider.support.p044FM.p079e;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p079e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1793a {

    /* JADX INFO: renamed from: a */
    @SerializedName("drives")
    private List<C1793a> f4029a;

    /* JADX INFO: renamed from: b */
    @SerializedName("params")
    private List<C1797e> f4030b;

    /* JADX INFO: renamed from: c */
    @SerializedName("login")
    private C1796d f4031c;

    /* JADX INFO: renamed from: d */
    @SerializedName("vodPic")
    private String f4032d;

    /* JADX INFO: renamed from: e */
    @SerializedName("name")
    private final String f4033e;

    /* JADX INFO: renamed from: f */
    @SerializedName("server")
    private String f4034f;

    /* JADX INFO: renamed from: g */
    @SerializedName("version")
    private int f4035g;

    /* JADX INFO: renamed from: h */
    @SerializedName("path")
    private String f4036h;

    /* JADX INFO: renamed from: i */
    @SerializedName("token")
    private String f4037i;

    /* JADX INFO: renamed from: j */
    @SerializedName("search")
    private Boolean f4038j;

    /* JADX INFO: renamed from: k */
    @SerializedName("hidden")
    private Boolean f4039k;

    public C1793a(String str) {
        this.f4033e = str;
    }

    /* JADX INFO: renamed from: a */
    public final C1793a m4298a() {
        if (this.f4036h == null) {
            String path = Uri.parse(TextUtils.isEmpty(this.f4034f) ? "" : this.f4034f).getPath();
            this.f4036h = TextUtils.isEmpty(path) ? "" : path;
        }
        if (this.f4035g == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(m4303f());
            sb.append("/api/public/settings");
            this.f4035g = C1840c.m4479n(sb.toString(), null).contains("v2.") ? 2 : 3;
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final String m4299b(String str) {
        List<C1797e> arrayList = this.f4030b;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (C1797e c1797e : arrayList) {
            if (str.startsWith(c1797e.m4334b())) {
                return c1797e.m4333a();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public final String m4300c() {
        StringBuilder sb = new StringBuilder();
        sb.append(m4303f());
        sb.append(m4309l() ? "/api/fs/get" : "/api/public/path");
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final List<C1793a> m4301d() {
        List<C1793a> list = this.f4029a;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: e */
    public final HashMap<String, String> m4302e() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        if (!(TextUtils.isEmpty(this.f4037i) ? "" : this.f4037i).isEmpty()) {
            map.put("Authorization", this.f4037i);
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1793a) {
            return m4305h().equals(((C1793a) obj).m4305h());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m4303f() {
        return (TextUtils.isEmpty(this.f4034f) ? "" : this.f4034f).replace(m4306i(), "");
    }

    /* JADX INFO: renamed from: g */
    public final C1796d m4304g() {
        return this.f4031c;
    }

    /* JADX INFO: renamed from: h */
    public final String m4305h() {
        return TextUtils.isEmpty(this.f4033e) ? "" : this.f4033e;
    }

    /* JADX INFO: renamed from: i */
    public final String m4306i() {
        return TextUtils.isEmpty(this.f4036h) ? "" : this.f4036h;
    }

    /* JADX INFO: renamed from: j */
    public final String m4307j() {
        return TextUtils.isEmpty(this.f4032d) ? "https://x.imgs.ovh/x/2023/09/05/64f680bb030b4.png" : this.f4032d;
    }

    /* JADX INFO: renamed from: k */
    public final Boolean m4308k() {
        Boolean bool = this.f4039k;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4309l() {
        return this.f4035g == 3;
    }

    /* JADX INFO: renamed from: m */
    public final String m4310m() {
        StringBuilder sb = new StringBuilder();
        sb.append(m4303f());
        sb.append(m4309l() ? "/api/fs/list" : "/api/public/path");
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public final String m4311n(String str) {
        HashMap map;
        Gson gson;
        if (m4309l()) {
            map = new HashMap();
            map.put("keywords", str);
            map.put("page", 1);
            map.put("parent", "/");
            map.put("per_page", 100);
            gson = new Gson();
        } else {
            map = new HashMap();
            map.put("keyword", str);
            map.put("path", "/");
            gson = new Gson();
        }
        return gson.toJson(map);
    }

    /* JADX INFO: renamed from: o */
    public final Boolean m4312o() {
        Boolean bool = this.f4038j;
        return Boolean.valueOf(bool == null || bool.booleanValue());
    }

    /* JADX INFO: renamed from: p */
    public final String m4313p() {
        StringBuilder sb = new StringBuilder();
        sb.append(m4303f());
        sb.append(m4309l() ? "/api/fs/search" : "/api/public/search");
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public final void m4314q(String str) {
        this.f4037i = str;
    }
}
