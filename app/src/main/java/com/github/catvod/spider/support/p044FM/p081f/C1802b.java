package com.github.catvod.spider.support.p044FM.p081f;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1802b {

    /* JADX INFO: renamed from: a */
    @SerializedName("list")
    private List<C1801a> f4084a;

    /* JADX INFO: renamed from: b */
    @SerializedName("uk")
    private String f4085b;

    /* JADX INFO: renamed from: c */
    @SerializedName("share_id")
    private String f4086c;

    /* JADX INFO: renamed from: d */
    @SerializedName("errno")
    private int f4087d;

    /* JADX INFO: renamed from: e */
    public static C1802b m4349e(String str) {
        return (C1802b) new Gson().fromJson(str, C1802b.class);
    }

    /* JADX INFO: renamed from: a */
    public final int m4350a() {
        return this.f4087d;
    }

    /* JADX INFO: renamed from: b */
    public final List<C1801a> m4351b() {
        return this.f4084a;
    }

    /* JADX INFO: renamed from: c */
    public final String m4352c() {
        return this.f4086c;
    }

    /* JADX INFO: renamed from: d */
    public final String m4353d() {
        return this.f4085b;
    }

    public final String toString() {
        return "Resp{list=" + this.f4084a + ", uk='" + this.f4085b + "', shareId='" + this.f4086c + "', errno=" + this.f4087d + '}';
    }
}
