package com.github.catvod.spider.support.p123h;

import android.text.TextUtils;
import com.github.catvod.spider.support.p001A.C0099l;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2177k;
import com.github.catvod.spider.support.p128m.C2256I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2221a implements Comparable<C2221a> {

    /* JADX INFO: renamed from: a */
    @SerializedName("FileId")
    private String f5524a;

    /* JADX INFO: renamed from: b */
    @SerializedName("FileName")
    private String f5525b;

    /* JADX INFO: renamed from: c */
    @SerializedName("Type")
    private int f5526c;

    /* JADX INFO: renamed from: d */
    @SerializedName("Size")
    private long f5527d;

    /* JADX INFO: renamed from: e */
    @SerializedName("ContentType")
    private String f5528e;

    /* JADX INFO: renamed from: f */
    @SerializedName("S3KeyFlag")
    private String f5529f;

    /* JADX INFO: renamed from: g */
    @SerializedName("CreateAt")
    private String f5530g;

    /* JADX INFO: renamed from: h */
    @SerializedName("UpdateAt")
    private String f5531h;

    /* JADX INFO: renamed from: i */
    @SerializedName("Etag")
    private String f5532i;

    /* JADX INFO: renamed from: j */
    @SerializedName("DownloadUrl")
    private String f5533j;

    /* JADX INFO: renamed from: k */
    @SerializedName("Status")
    private int f5534k;

    /* JADX INFO: renamed from: l */
    @SerializedName("ParentFileId")
    private int f5535l;

    /* JADX INFO: renamed from: m */
    @SerializedName("Category")
    private int f5536m;

    /* JADX INFO: renamed from: n */
    @SerializedName("PunishFlag")
    private int f5537n;

    /* JADX INFO: renamed from: o */
    @SerializedName("StorageNode")
    private String f5538o;

    /* JADX INFO: renamed from: p */
    @SerializedName("PreviewType")
    private String f5539p;

    /* JADX INFO: renamed from: q */
    @SerializedName("pfName")
    private int f5540q;

    /* JADX INFO: renamed from: a */
    public final String m6015a() {
        return this.f5532i;
    }

    /* JADX INFO: renamed from: b */
    public final String m6016b() {
        if (TextUtils.isEmpty(this.f5524a)) {
            this.f5524a = "0";
        }
        return this.f5524a;
    }

    /* JADX INFO: renamed from: c */
    public final String m6017c() {
        return C0099l.format(this.f5525b, "");
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2221a c2221a) {
        return this.f5525b.compareTo(c2221a.f5525b);
    }

    /* JADX INFO: renamed from: d */
    public final String m6018d() {
        return this.f5529f;
    }

    /* JADX INFO: renamed from: e */
    public final long m6019e() {
        return this.f5527d;
    }

    /* JADX INFO: renamed from: f */
    public final String m6020f() {
        if (this.f5527d == 0) {
            return "";
        }
        StringBuilder sbM5396a = C2137a.m5396a("[");
        sbM5396a.append(C2256I.m6111e(this.f5527d));
        sbM5396a.append("]");
        return sbM5396a.toString();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6021g() {
        return this.f5536m == 2;
    }

    public final String getDownloadUrl() {
        return this.f5533j;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6022h() {
        return this.f5536m == 0;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Item{FileId='");
        C2177k.m5717c(sbM5396a, this.f5524a, '\'', ", FileName='");
        C2177k.m5717c(sbM5396a, this.f5525b, '\'', ", Type=");
        sbM5396a.append(this.f5526c);
        sbM5396a.append(", Size=");
        sbM5396a.append(this.f5527d);
        sbM5396a.append(", ContentType='");
        C2177k.m5717c(sbM5396a, this.f5528e, '\'', ", S3KeyFlag='");
        C2177k.m5717c(sbM5396a, this.f5529f, '\'', ", CreateAt='");
        C2177k.m5717c(sbM5396a, this.f5530g, '\'', ", UpdateAt='");
        C2177k.m5717c(sbM5396a, this.f5531h, '\'', ", Etag='");
        C2177k.m5717c(sbM5396a, this.f5532i, '\'', ", DownloadUrl='");
        C2177k.m5717c(sbM5396a, this.f5533j, '\'', ", Status=");
        sbM5396a.append(this.f5534k);
        sbM5396a.append(", ParentFileId=");
        sbM5396a.append(this.f5535l);
        sbM5396a.append(", Category=");
        sbM5396a.append(this.f5536m);
        sbM5396a.append(", PunishFlag=");
        sbM5396a.append(this.f5537n);
        sbM5396a.append(", StorageNode='");
        C2177k.m5717c(sbM5396a, this.f5538o, '\'', ", PreviewType=");
        sbM5396a.append(this.f5540q);
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
