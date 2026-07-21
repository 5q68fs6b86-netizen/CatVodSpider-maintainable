package com.github.catvod.spider.support.p044FM.p082g;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p082g.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1810h {

    /* JADX INFO: renamed from: a */
    @SerializedName("code")
    private Integer f4133a;

    /* JADX INFO: renamed from: b */
    @SerializedName("message")
    private String f4134b;

    /* JADX INFO: renamed from: c */
    @SerializedName("data")
    private C1804b f4135c;

    /* JADX INFO: renamed from: b */
    public static C1810h m4394b(String str) {
        return (C1810h) new Gson().fromJson(str, C1810h.class);
    }

    /* JADX INFO: renamed from: a */
    public final C1804b m4395a() {
        C1804b c1804b = this.f4135c;
        return c1804b == null ? new C1804b() : c1804b;
    }
}
