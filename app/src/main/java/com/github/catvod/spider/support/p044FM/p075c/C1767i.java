package com.github.catvod.spider.support.p044FM.p075c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p075c.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1767i {

    /* JADX INFO: renamed from: a */
    @SerializedName("type")
    private final String f3906a;

    /* JADX INFO: renamed from: b */
    @SerializedName("ratio")
    private Float f3907b;

    public C1767i(String str, Float f) {
        this.f3906a = str;
        this.f3907b = f;
    }

    /* JADX INFO: renamed from: a */
    public static C1767i m4214a(float f) {
        return new C1767i("rect", Float.valueOf(f));
    }
}
