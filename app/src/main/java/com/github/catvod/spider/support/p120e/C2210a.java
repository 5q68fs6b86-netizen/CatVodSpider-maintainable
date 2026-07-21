package com.github.catvod.spider.support.p120e;

import android.text.TextUtils;
import com.github.catvod.spider.support.p001A.C0099l;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2177k;
import com.github.catvod.spider.support.p128m.C2256I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2210a implements Comparable<C2210a> {

    /* JADX INFO: renamed from: a */
    @SerializedName("tkbind_id")
    private int f5420a;

    /* JADX INFO: renamed from: b */
    @SerializedName("server_mtime")
    private long f5421b;

    /* JADX INFO: renamed from: c */
    @SerializedName("category")
    private int f5422c;

    /* JADX INFO: renamed from: d */
    @SerializedName("is_scene")
    private int f5423d;

    /* JADX INFO: renamed from: e */
    @SerializedName("fs_id")
    private long f5424e;

    /* JADX INFO: renamed from: f */
    @SerializedName("from_type")
    private int f5425f;

    /* JADX INFO: renamed from: g */
    @SerializedName("extent_int2")
    private int f5426g;

    /* JADX INFO: renamed from: h */
    @SerializedName("server_atime")
    private long f5427h;

    /* JADX INFO: renamed from: i */
    @SerializedName("server_ctime")
    private long f5428i;

    /* JADX INFO: renamed from: j */
    @SerializedName("extent_int8")
    private long f5429j;

    /* JADX INFO: renamed from: k */
    @SerializedName("wpfile")
    private int f5430k;

    /* JADX INFO: renamed from: l */
    @SerializedName("extent_tinyint7")
    private int f5431l;

    /* JADX INFO: renamed from: m */
    @SerializedName("local_mtime")
    private long f5432m;

    /* JADX INFO: renamed from: n */
    @SerializedName("size")
    private long f5433n;

    /* JADX INFO: renamed from: o */
    @SerializedName("isdir")
    private int f5434o;

    /* JADX INFO: renamed from: p */
    @SerializedName("server_filename")
    private String f5435p;

    /* JADX INFO: renamed from: q */
    @SerializedName("share")
    private int f5436q;

    /* JADX INFO: renamed from: r */
    @SerializedName("owner_type")
    private int f5437r;

    /* JADX INFO: renamed from: s */
    @SerializedName("pl")
    private int f5438s;

    /* JADX INFO: renamed from: t */
    @SerializedName("local_ctime")
    private long f5439t;

    /* JADX INFO: renamed from: u */
    @SerializedName("path")
    private String f5440u;

    /* JADX INFO: renamed from: v */
    @SerializedName("real_category")
    private String f5441v;

    /* JADX INFO: renamed from: w */
    @SerializedName("owner_id")
    private long f5442w;

    /* JADX INFO: renamed from: x */
    @SerializedName("oper_id")
    private long f5443x;

    /* JADX INFO: renamed from: y */
    @SerializedName("unlist")
    private int f5444y;

    /* JADX INFO: renamed from: a */
    public final long m5930a() {
        return this.f5424e;
    }

    /* JADX INFO: renamed from: b */
    public final int m5931b() {
        return this.f5434o;
    }

    /* JADX INFO: renamed from: c */
    public final String m5932c() {
        return this.f5440u;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2210a c2210a) {
        return m5933d().compareTo(c2210a.m5933d());
    }

    /* JADX INFO: renamed from: d */
    public final String m5933d() {
        String str = this.f5435p;
        String str2 = this.f5440u;
        String strSubstring = str2.substring(0, str2.lastIndexOf("/"));
        return "[" + strSubstring.substring(strSubstring.lastIndexOf("/") + 1) + "]" + C0099l.format(this.f5435p, m5936f());
    }

    /* JADX INFO: renamed from: dd */
    public final String m5934dd() {
        return TextUtils.isEmpty(this.f5435p) ? "" : this.f5435p;
    }

    /* JADX INFO: renamed from: e */
    public final String m5935e() {
        return this.f5434o == 1 ? "folder" : "file";
    }

    /* JADX INFO: renamed from: f */
    public final String m5936f() {
        if (this.f5433n == 0) {
            return "";
        }
        return "[" + C2256I.m6111e(this.f5433n) + "]";
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5937f() {
        int i = this.f5422c;
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 6) {
            return this.f5435p.toLowerCase().endsWith(".iso");
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Item{tkbindId=");
        sbM5396a.append(this.f5420a);
        sbM5396a.append(", serverMtime=");
        sbM5396a.append(this.f5421b);
        sbM5396a.append(", category=");
        sbM5396a.append(this.f5422c);
        sbM5396a.append(", isScene=");
        sbM5396a.append(this.f5423d);
        sbM5396a.append(", fsId=");
        sbM5396a.append(this.f5424e);
        sbM5396a.append(", fromType=");
        sbM5396a.append(this.f5425f);
        sbM5396a.append(", extentInt2=");
        sbM5396a.append(this.f5426g);
        sbM5396a.append(", serverAtime=");
        sbM5396a.append(this.f5427h);
        sbM5396a.append(", serverCtime=");
        sbM5396a.append(this.f5428i);
        sbM5396a.append(", extentInt8=");
        sbM5396a.append(this.f5429j);
        sbM5396a.append(", wpfile=");
        sbM5396a.append(this.f5430k);
        sbM5396a.append(", extentTinyint7=");
        sbM5396a.append(this.f5431l);
        sbM5396a.append(", localMtime=");
        sbM5396a.append(this.f5432m);
        sbM5396a.append(", size=");
        sbM5396a.append(this.f5433n);
        sbM5396a.append(", isdir=");
        sbM5396a.append(this.f5434o);
        sbM5396a.append(", serverFilename='");
        C2177k.m5717c(sbM5396a, this.f5435p, '\'', ", share=");
        sbM5396a.append(this.f5436q);
        sbM5396a.append(", ownerType=");
        sbM5396a.append(this.f5437r);
        sbM5396a.append(", pl=");
        sbM5396a.append(this.f5438s);
        sbM5396a.append(", localCtime=");
        sbM5396a.append(this.f5439t);
        sbM5396a.append(", path='");
        C2177k.m5717c(sbM5396a, this.f5440u, '\'', ", realCategory='");
        C2177k.m5717c(sbM5396a, this.f5441v, '\'', ", ownerId=");
        sbM5396a.append(this.f5442w);
        sbM5396a.append(", operId=");
        sbM5396a.append(this.f5443x);
        sbM5396a.append(", unlist=");
        sbM5396a.append(this.f5444y);
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
