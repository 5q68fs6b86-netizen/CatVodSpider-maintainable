package com.github.catvod.spider.support.p118c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p118c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2194e {

    /* JADX INFO: renamed from: a */
    @SerializedName("type_name")
    private String f5298a;

    /* JADX INFO: renamed from: b */
    @SerializedName("vod_id")
    private String f5299b;

    /* JADX INFO: renamed from: c */
    @SerializedName("vod_name")
    private String f5300c;

    /* JADX INFO: renamed from: d */
    @SerializedName("vod_pic")
    private String f5301d;

    /* JADX INFO: renamed from: e */
    @SerializedName("vod_remarks")
    private String f5302e;

    /* JADX INFO: renamed from: f */
    @SerializedName("vod_year")
    private String f5303f;

    /* JADX INFO: renamed from: g */
    @SerializedName("vod_area")
    private String f5304g;

    /* JADX INFO: renamed from: h */
    @SerializedName("vod_actor")
    private String f5305h;

    /* JADX INFO: renamed from: i */
    @SerializedName("vod_director")
    private String f5306i;

    /* JADX INFO: renamed from: j */
    @SerializedName("vod_content")
    private String f5307j;

    /* JADX INFO: renamed from: k */
    @SerializedName("vod_play_from")
    private String f5308k;

    /* JADX INFO: renamed from: l */
    @SerializedName("vod_play_url")
    private String f5309l;

    /* JADX INFO: renamed from: m */
    @SerializedName("vod_tag")
    private String f5310m;

    /* JADX INFO: renamed from: n */
    @SerializedName("action")
    private String f5311n;

    /* JADX INFO: renamed from: o */
    @SerializedName("style")
    private a f5312o;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p118c.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("type")
        private final String f5313a;

        /* JADX INFO: renamed from: b */
        @SerializedName("ratio")
        private Float f5314b;

        public a(String str, Float f) {
            this.f5313a = str;
            this.f5314b = f;
        }

        /* JADX INFO: renamed from: a */
        public static a m5857a() {
            return new a("oval", Float.valueOf(1.0f));
        }

        /* JADX INFO: renamed from: b */
        public static a m5858b(float f) {
            return new a("rect", Float.valueOf(f));
        }
    }

    public C2194e() {
    }

    public C2194e(String str, String str2, String str3) {
        this.f5299b = str;
        this.f5300c = str2;
        this.f5301d = str3;
    }

    public C2194e(String str, String str2, String str3, String str4) {
        this.f5299b = str;
        this.f5300c = str2;
        this.f5301d = str3;
        this.f5302e = str4;
    }

    public C2194e(String str, String str2, String str3, String str4, String str5) {
        this.f5299b = str;
        this.f5300c = str2;
        this.f5301d = str3;
        this.f5302e = str4;
        this.f5311n = str5;
    }

    public C2194e(String str, String str2, String str3, String str4, boolean z) {
        this.f5299b = str;
        this.f5300c = str2;
        this.f5301d = str3;
        this.f5302e = str4;
        this.f5310m = z ? "folder" : "file";
    }

    /* JADX INFO: renamed from: e */
    public static String m5837e(C2194e c2194e) {
        C2192c c2192c = new C2192c();
        com.github.catvod.bean.Vod v = new com.github.catvod.bean.Vod();
        if (c2194e != null) {
            try {
                v.m5848j(c2194e.m5838a());
                v.m5849k(c2194e.m5839b());
                v.m5852n(c2194e.m5840c());
            } catch (Throwable ignored) {}
        }
        c2192c.m5825q(v);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m5838a() {
        return this.f5299b;
    }

    /* JADX INFO: renamed from: b */
    public final String m5839b() {
        return this.f5300c;
    }

    /* JADX INFO: renamed from: c */
    public final String m5840c() {
        return this.f5309l;
    }

    /* JADX INFO: renamed from: d */
    public final void m5841d(a aVar) {
        this.f5312o = aVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m5842e(String str) {
        this.f5298a = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m5843f(String str) {
        this.f5305h = str;
    }

    /* JADX INFO: renamed from: g */
    public final String m5844g() {
        return this.f5309l;
    }

    /* JADX INFO: renamed from: g */
    public final void m5845g(String str) {
        this.f5304g = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m5846h(String str) {
        this.f5307j = str;
    }

    /* JADX INFO: renamed from: i */
    public final void m5847i(String str) {
        this.f5306i = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m5848j(String str) {
        this.f5299b = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m5849k(String str) {
        this.f5300c = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m5850l(String str) {
        this.f5301d = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m5851m(String str) {
        this.f5308k = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m5852n(String str) {
        this.f5309l = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m5853o(String str) {
        this.f5302e = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m5854p(String str) {
        this.f5310m = str;
    }

    /* JADX INFO: renamed from: q */
    public final void m5855q(String str) {
        this.f5303f = str;
    }

    /* JADX INFO: renamed from: r */
    public final void m5856r(String str) {
        this.f5311n = str;
    }
}
