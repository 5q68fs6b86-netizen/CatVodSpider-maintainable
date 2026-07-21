package com.github.catvod.spider.support.p121f;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.f.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2218g {

    /* JADX INFO: renamed from: a */
    @SerializedName("nickname")
    private String f5504a;

    /* JADX INFO: renamed from: b */
    @SerializedName("mid")
    private String f5505b;

    /* JADX INFO: renamed from: c */
    @SerializedName("cookie")
    private String f5506c;

    /* JADX INFO: renamed from: d */
    @SerializedName("wbiImg")
    private String f5507d;

    /* JADX INFO: renamed from: e */
    @SerializedName("wbiSub")
    private String f5508e;

    /* JADX INFO: renamed from: f */
    @SerializedName("isVip")
    private Boolean f5509f;

    public C2218g() {
    }

    public C2218g(String str) {
        this.f5506c = "";
    }

    /* JADX INFO: renamed from: a */
    public final String m5995a() {
        return TextUtils.isEmpty(this.f5506c) ? "" : this.f5506c;
    }

    /* JADX INFO: renamed from: b */
    public final String m5996b() {
        return TextUtils.isEmpty(this.f5505b) ? "" : this.f5505b;
    }

    /* JADX INFO: renamed from: c */
    public final String m5997c() {
        return TextUtils.isEmpty(this.f5504a) ? "" : this.f5504a;
    }

    /* JADX INFO: renamed from: d */
    public final Boolean m5998d() {
        Boolean bool = this.f5509f;
        return Boolean.valueOf(bool == null ? false : bool.booleanValue());
    }

    /* JADX INFO: renamed from: e */
    public final String m5999e() {
        return TextUtils.isEmpty(this.f5507d) ? "" : this.f5507d;
    }

    /* JADX INFO: renamed from: f */
    public final String m6000f() {
        return TextUtils.isEmpty(this.f5508e) ? "" : this.f5508e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6001g() {
        if (m5995a().length() > 0) {
            if ((TextUtils.isEmpty(this.f5504a) ? "" : this.f5504a).length() > 0 && m5996b().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m6002h(String str) {
        this.f5506c = str;
    }

    /* JADX INFO: renamed from: i */
    public final void m6003i(String str) {
        this.f5505b = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m6004j(String str) {
        this.f5504a = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m6005k(Boolean bool) {
        this.f5509f = bool;
    }

    /* JADX INFO: renamed from: l */
    public final void m6006l(String str) {
        this.f5507d = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m6007m(String str) {
        this.f5508e = str;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
