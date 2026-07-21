package com.github.catvod.spider.support.p117b;

import com.github.catvod.spider.support.p001A.C0082a;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.Gj */
/* JADX INFO: loaded from: classes.dex */
public class C2152Gj<T> {

    /* JADX INFO: renamed from: a */
    @SerializedName("msg")
    private String f5110a;

    /* JADX INFO: renamed from: b */
    @SerializedName("data")
    private T f5111b;

    /* JADX INFO: renamed from: b */
    public final void m5546b() {
        if (this.f5110a.equalsIgnoreCase("success")) {
            return;
        }
        C0082a.m820b(new C2145G.g(this));
    }

    /* JADX INFO: renamed from: c */
    public final T m5547c() {
        return this.f5111b;
    }
}
