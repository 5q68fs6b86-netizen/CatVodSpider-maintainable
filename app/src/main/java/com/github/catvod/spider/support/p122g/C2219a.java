package com.github.catvod.spider.support.p122g;

import com.github.catvod.spider.support.p001A.C0099l;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2177k;
import com.github.catvod.spider.support.p128m.C2256I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p122g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2219a implements Comparable<C2219a> {

    /* JADX INFO: renamed from: a */
    @SerializedName("createDate")
    private String f5510a;

    /* JADX INFO: renamed from: b */
    @SerializedName("fileCata")
    private int f5511b;

    /* JADX INFO: renamed from: c */
    @SerializedName("fileListSize")
    private int f5512c;

    /* JADX INFO: renamed from: d */
    @SerializedName("id")
    private String f5513d;

    /* JADX INFO: renamed from: e */
    @SerializedName("lastOpTime")
    private String f5514e;

    /* JADX INFO: renamed from: f */
    @SerializedName("name")
    private String f5515f;

    /* JADX INFO: renamed from: g */
    @SerializedName("parentId")
    private String f5516g;

    /* JADX INFO: renamed from: h */
    @SerializedName("rev")
    private String f5517h;

    /* JADX INFO: renamed from: i */
    @SerializedName("starLabel")
    private String f5518i;

    /* JADX INFO: renamed from: j */
    @SerializedName("size")
    private double f5519j;

    /* JADX INFO: renamed from: k */
    @SerializedName("mediaType")
    private int f5520k = -1;

    /* JADX INFO: renamed from: a */
    public final String m6008a() {
        return this.f5513d;
    }

    /* JADX INFO: renamed from: b */
    public final String m6009b() {
        return C0099l.format(this.f5515f, m6012e());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6010c() {
        return this.f5520k == 3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2219a c2219a) {
        return m6009b().compareTo(c2219a.m6009b());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6011d() {
        return this.f5520k == -1;
    }

    /* JADX INFO: renamed from: e */
    public final String m6012e() {
        if (this.f5519j == 0.0d) {
            return "";
        }
        StringBuilder sbM5396a = C2137a.m5396a("[");
        sbM5396a.append(C2256I.m6111e(this.f5519j));
        sbM5396a.append("]");
        return sbM5396a.toString();
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Item{createDate='");
        C2177k.m5717c(sbM5396a, this.f5510a, '\'', ", fileCata=");
        sbM5396a.append(this.f5511b);
        sbM5396a.append(", fileListSize=");
        sbM5396a.append(this.f5512c);
        sbM5396a.append(", id='");
        C2177k.m5717c(sbM5396a, this.f5513d, '\'', ", lastOpTime='");
        C2177k.m5717c(sbM5396a, this.f5514e, '\'', ", name='");
        C2177k.m5717c(sbM5396a, this.f5515f, '\'', ", parentId='");
        C2177k.m5717c(sbM5396a, this.f5516g, '\'', ", rev='");
        C2177k.m5717c(sbM5396a, this.f5517h, '\'', ", starLabel='");
        C2177k.m5717c(sbM5396a, this.f5518i, '\'', ", mediaType='");
        sbM5396a.append(this.f5520k);
        sbM5396a.append('\'');
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
