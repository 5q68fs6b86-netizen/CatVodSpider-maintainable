package com.github.catvod.spider.support.p044FM.p084i;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p084i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1819c {

    /* JADX INFO: renamed from: a */
    @SerializedName("code")
    private Integer f4170a;

    /* JADX INFO: renamed from: b */
    @SerializedName("message")
    private String f4171b;

    /* JADX INFO: renamed from: c */
    @SerializedName("data")
    private C1817a f4172c;

    /* JADX INFO: renamed from: b */
    public static C1819c m4422b(String str) {
        return (C1819c) new Gson().fromJson(str, C1819c.class);
    }

    /* JADX INFO: renamed from: a */
    public final C1817a m4423a() {
        C1817a c1817a = this.f4172c;
        return c1817a == null ? new C1817a() : c1817a;
    }
}
