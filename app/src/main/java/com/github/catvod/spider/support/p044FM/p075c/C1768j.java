package com.github.catvod.spider.support.p044FM.p075c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p075c.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1768j {

    /* JADX INFO: renamed from: a */
    @SerializedName("type_name")
    private String f3908a;

    /* JADX INFO: renamed from: b */
    @SerializedName("vod_id")
    private String f3909b;

    /* JADX INFO: renamed from: c */
    @SerializedName("vod_name")
    private String f3910c;

    /* JADX INFO: renamed from: d */
    @SerializedName("vod_pic")
    private String f3911d;

    /* JADX INFO: renamed from: e */
    @SerializedName("vod_remarks")
    private String f3912e;

    /* JADX INFO: renamed from: f */
    @SerializedName("vod_year")
    private String f3913f;

    /* JADX INFO: renamed from: g */
    @SerializedName("vod_area")
    private String f3914g;

    /* JADX INFO: renamed from: h */
    @SerializedName("vod_actor")
    private String f3915h;

    /* JADX INFO: renamed from: i */
    @SerializedName("vod_director")
    private String f3916i;

    /* JADX INFO: renamed from: j */
    @SerializedName("vod_content")
    private String f3917j;

    /* JADX INFO: renamed from: k */
    @SerializedName("vod_play_from")
    private String f3918k;

    /* JADX INFO: renamed from: l */
    @SerializedName("vod_play_url")
    private String f3919l;

    /* JADX INFO: renamed from: m */
    @SerializedName("vod_tag")
    private String f3920m;

    /* JADX INFO: renamed from: n */
    @SerializedName("action")
    private String f3921n;

    /* JADX INFO: renamed from: o */
    @SerializedName("style")
    private C1767i f3922o;

    public C1768j() {
    }

    public C1768j(String str, String str2, String str3) {
        this.f3909b = str;
        this.f3910c = str2;
        this.f3911d = str3;
    }

    public C1768j(String str, String str2, String str3, String str4) {
        this.f3909b = str;
        this.f3910c = str2;
        this.f3911d = str3;
        this.f3912e = str4;
    }

    public C1768j(String str, String str2, String str3, String str4, C1767i c1767i, String str5) {
        this.f3909b = str;
        this.f3910c = str2;
        this.f3911d = str3;
        this.f3912e = str4;
        this.f3922o = c1767i;
        this.f3921n = str5;
    }

    public C1768j(String str, String str2, String str3, String str4, boolean z) {
        this.f3909b = str;
        this.f3910c = str2;
        this.f3911d = str3;
        this.f3912e = str4;
        this.f3920m = z ? "folder" : "file";
    }

    /* JADX INFO: renamed from: a */
    public final String m4215a() {
        return this.f3919l;
    }

    /* JADX INFO: renamed from: b */
    public final void m4216b(String str) {
        this.f3908a = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m4217c(String str) {
        this.f3915h = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m4218d(String str) {
        this.f3914g = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m4219e(String str) {
        this.f3917j = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m4220f(String str) {
        this.f3916i = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m4221g(String str) {
        this.f3909b = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m4222h(String str) {
        this.f3910c = str;
    }

    /* JADX INFO: renamed from: i */
    public final void m4223i(String str) {
        this.f3911d = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m4224j(String str) {
        this.f3918k = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m4225k(String str) {
        this.f3919l = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m4226l(String str) {
        this.f3912e = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m4227m(String str) {
        this.f3920m = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m4228n(String str) {
        this.f3913f = str;
    }
}
