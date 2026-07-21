package com.github.catvod.spider.support.p120e;

import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2177k;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p120e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2211b {

    /* JADX INFO: renamed from: a */
    @SerializedName("list")
    private List<C2210a> f5445a;

    /* JADX INFO: renamed from: b */
    @SerializedName("uk")
    private String f5446b;

    /* JADX INFO: renamed from: c */
    @SerializedName("share_id")
    private String f5447c;

    /* JADX INFO: renamed from: d */
    @SerializedName("errno")
    private int f5448d;

    /* JADX INFO: renamed from: e */
    public static C2211b m5938e(String str) {
        return (C2211b) new Gson().fromJson(str, C2211b.class);
    }

    /* JADX INFO: renamed from: a */
    public final int m5939a() {
        return this.f5448d;
    }

    /* JADX INFO: renamed from: b */
    public final List<C2210a> m5940b() {
        return this.f5445a;
    }

    /* JADX INFO: renamed from: c */
    public final String m5941c() {
        return this.f5447c;
    }

    /* JADX INFO: renamed from: d */
    public final String m5942d() {
        return this.f5446b;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Resp{list=");
        sbM5396a.append(this.f5445a);
        sbM5396a.append(", uk='");
        C2177k.m5717c(sbM5396a, this.f5446b, '\'', ", shareId='");
        C2177k.m5717c(sbM5396a, this.f5447c, '\'', ", errno=");
        sbM5396a.append(this.f5448d);
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
