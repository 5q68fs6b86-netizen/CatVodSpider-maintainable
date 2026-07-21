package com.github.catvod.spider.support.p044FM.p077d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.d.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1785n {

    /* JADX INFO: renamed from: a */
    @SerializedName("share_id")
    private String f3996a;

    /* JADX INFO: renamed from: b */
    @SerializedName("share_token")
    private String f3997b;

    /* JADX INFO: renamed from: c */
    @SerializedName("expire_time")
    private String f3998c;

    /* JADX INFO: renamed from: d */
    @SerializedName("expires_in")
    private int f3999d;

    /* JADX INFO: renamed from: e */
    @SerializedName("creator_id")
    private String f4000e;

    /* JADX INFO: renamed from: f */
    @SerializedName("creator_name")
    private String f4001f;

    /* JADX INFO: renamed from: g */
    @SerializedName("creator_phone")
    private String f4002g;

    /* JADX INFO: renamed from: h */
    @SerializedName("expiration")
    private String f4003h;

    /* JADX INFO: renamed from: i */
    @SerializedName("updated_at")
    private String f4004i;

    /* JADX INFO: renamed from: j */
    @SerializedName("vip")
    private String f4005j;

    /* JADX INFO: renamed from: k */
    @SerializedName("avatar")
    private String f4006k;

    /* JADX INFO: renamed from: l */
    @SerializedName("share_name")
    private String f4007l;

    /* JADX INFO: renamed from: m */
    @SerializedName("display_name")
    private String f4008m;

    /* JADX INFO: renamed from: n */
    @SerializedName("share_title")
    private String f4009n;

    /* JADX INFO: renamed from: o */
    @SerializedName("has_pwd")
    private boolean f4010o;

    /* JADX INFO: renamed from: p */
    @SerializedName("file_infos")
    private List<C1778g> f4011p;

    /* JADX INFO: renamed from: q */
    private long f4012q;

    /* JADX INFO: renamed from: a */
    public final boolean m4273a(String str) {
        return (TextUtils.isEmpty(this.f3996a) ? "" : this.f3996a).equals(str) && System.currentTimeMillis() <= this.f4012q;
    }

    /* JADX INFO: renamed from: b */
    public final String m4274b() {
        return TextUtils.isEmpty(this.f4006k) ? "" : this.f4006k;
    }

    /* JADX INFO: renamed from: c */
    public final List<C1778g> m4275c() {
        List<C1778g> list = this.f4011p;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: d */
    public final String m4276d() {
        return TextUtils.isEmpty(this.f4007l) ? "" : this.f4007l;
    }

    /* JADX INFO: renamed from: e */
    public final String m4277e() {
        return TextUtils.isEmpty(this.f3997b) ? "" : this.f3997b;
    }

    /* JADX INFO: renamed from: f */
    public final C1785n m4278f(String str) {
        this.f3996a = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C1785n m4279g() {
        this.f4012q = System.currentTimeMillis() + 3600000;
        return this;
    }
}
