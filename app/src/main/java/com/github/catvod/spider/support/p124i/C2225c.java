package com.github.catvod.spider.support.p124i;

import android.text.TextUtils;
import com.github.catvod.spider.support.p116a.C2137a;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2225c {

    /* JADX INFO: renamed from: a */
    @SerializedName("data")
    private a f5563a;

    /* JADX INFO: renamed from: b */
    @SerializedName("time")
    private long f5564b;

    /* JADX INFO: renamed from: c */
    private String f5565c;

    /* JADX INFO: renamed from: d */
    private String f5566d;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.i.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("stoken")
        private String f5567a;

        /* JADX INFO: renamed from: b */
        @SerializedName("title")
        private String f5568b;

        /* JADX INFO: renamed from: a */
        public final String m6049a() {
            return this.f5567a;
        }

        /* JADX INFO: renamed from: b */
        public final String m6050b() {
            return this.f5568b;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6042a(String str) {
        return (TextUtils.isEmpty(this.f5565c) ? "" : this.f5565c).equals(str) && System.currentTimeMillis() <= this.f5564b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6043b(String str) {
        if ((TextUtils.isEmpty(this.f5565c) ? "" : this.f5565c).equals(str)) {
            if (this.f5563a != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final a m6044c() {
        return this.f5563a;
    }

    /* JADX INFO: renamed from: d */
    public final String m6045d() {
        return this.f5566d;
    }

    /* JADX INFO: renamed from: e */
    public final C2225c m6046e(String str) {
        this.f5566d = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C2225c m6047f(String str) {
        this.f5565c = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C2225c m6048g() {
        this.f5564b = System.currentTimeMillis() + 3600000;
        return this;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Share{data=");
        sbM5396a.append(this.f5563a);
        sbM5396a.append(", time=");
        sbM5396a.append(this.f5564b);
        sbM5396a.append(", shareId='");
        sbM5396a.append(this.f5565c);
        sbM5396a.append('\'');
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
