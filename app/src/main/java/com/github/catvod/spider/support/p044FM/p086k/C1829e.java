package com.github.catvod.spider.support.p044FM.p086k;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p086k.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1829e {

    /* JADX INFO: renamed from: a */
    @SerializedName("data")
    private C1828d f4209a;

    /* JADX INFO: renamed from: b */
    @SerializedName("time")
    private long f4210b;

    /* JADX INFO: renamed from: c */
    @SerializedName("files")
    private List<C1825a> f4211c;

    /* JADX INFO: renamed from: d */
    private String f4212d;

    /* JADX INFO: renamed from: a */
    public final boolean m4460a(String str) {
        return (TextUtils.isEmpty(this.f4212d) ? "" : this.f4212d).equals(str) && System.currentTimeMillis() <= this.f4210b;
    }

    /* JADX INFO: renamed from: b */
    public final C1828d m4461b() {
        return this.f4209a;
    }

    /* JADX INFO: renamed from: c */
    public final List<C1825a> m4462c() {
        return this.f4211c;
    }

    /* JADX INFO: renamed from: d */
    public final void m4463d(List<C1825a> list) {
        this.f4211c = list;
    }

    /* JADX INFO: renamed from: e */
    public final C1829e m4464e(String str) {
        this.f4212d = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C1829e m4465f() {
        this.f4210b = System.currentTimeMillis() + 3600000;
        return this;
    }
}
