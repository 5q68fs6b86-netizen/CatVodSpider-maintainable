package com.github.catvod.spider.support.p044FM.p085j;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p085j.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1824e {

    /* JADX INFO: renamed from: a */
    @SerializedName("data")
    private C1823d f4189a;

    /* JADX INFO: renamed from: b */
    @SerializedName("time")
    private long f4190b;

    /* JADX INFO: renamed from: c */
    @SerializedName("files")
    private List<C1820a> f4191c;

    /* JADX INFO: renamed from: d */
    private String f4192d;

    /* JADX INFO: renamed from: a */
    public final boolean m4439a(String str) {
        return (TextUtils.isEmpty(this.f4192d) ? "" : this.f4192d).equals(str) && System.currentTimeMillis() <= this.f4190b;
    }

    /* JADX INFO: renamed from: b */
    public final C1823d m4440b() {
        return this.f4189a;
    }

    /* JADX INFO: renamed from: c */
    public final List<C1820a> m4441c() {
        return this.f4191c;
    }

    /* JADX INFO: renamed from: d */
    public final void m4442d(List<C1820a> list) {
        this.f4191c = list;
    }

    /* JADX INFO: renamed from: e */
    public final C1824e m4443e(String str) {
        this.f4192d = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C1824e m4444f() {
        this.f4190b = System.currentTimeMillis() + 3600000;
        return this;
    }
}
