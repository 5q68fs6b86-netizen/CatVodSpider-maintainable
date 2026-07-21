package com.github.catvod.spider.support.p044FM.p081f;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p081f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1801a implements Comparable<C1801a> {

    /* JADX INFO: renamed from: a */
    @SerializedName("server_filename")
    private String f4058a;

    /* JADX INFO: renamed from: b */
    @SerializedName("tkbind_id")
    private int f4059b;

    /* JADX INFO: renamed from: c */
    @SerializedName("server_mtime")
    private long f4060c;

    /* JADX INFO: renamed from: d */
    @SerializedName("category")
    private int f4061d;

    /* JADX INFO: renamed from: e */
    @SerializedName("is_scene")
    private int f4062e;

    /* JADX INFO: renamed from: f */
    @SerializedName("fs_id")
    private long f4063f;

    /* JADX INFO: renamed from: g */
    @SerializedName("from_type")
    private int f4064g;

    /* JADX INFO: renamed from: h */
    @SerializedName("extent_int2")
    private int f4065h;

    /* JADX INFO: renamed from: i */
    @SerializedName("server_atime")
    private long f4066i;

    /* JADX INFO: renamed from: j */
    @SerializedName("server_ctime")
    private long f4067j;

    /* JADX INFO: renamed from: k */
    @SerializedName("extent_int8")
    private long f4068k;

    /* JADX INFO: renamed from: l */
    @SerializedName("wpfile")
    private int f4069l;

    /* JADX INFO: renamed from: m */
    @SerializedName("extent_tinyint7")
    private int f4070m;

    /* JADX INFO: renamed from: n */
    @SerializedName("local_mtime")
    private long f4071n;

    /* JADX INFO: renamed from: o */
    @SerializedName("size")
    private long f4072o;

    /* JADX INFO: renamed from: p */
    @SerializedName("isdir")
    private int f4073p;

    /* JADX INFO: renamed from: q */
    @SerializedName("share")
    private int f4074q;

    /* JADX INFO: renamed from: r */
    @SerializedName("owner_type")
    private int f4075r;

    /* JADX INFO: renamed from: s */
    @SerializedName("pl")
    private int f4076s;

    /* JADX INFO: renamed from: t */
    @SerializedName("local_ctime")
    private long f4077t;

    /* JADX INFO: renamed from: u */
    @SerializedName("path")
    private String f4078u;

    /* JADX INFO: renamed from: v */
    @SerializedName("real_category")
    private String f4079v;

    /* JADX INFO: renamed from: w */
    @SerializedName("owner_id")
    private long f4080w;

    /* JADX INFO: renamed from: x */
    @SerializedName("oper_id")
    private long f4081x;

    /* JADX INFO: renamed from: y */
    @SerializedName("unlist")
    private int f4082y;

    /* JADX INFO: renamed from: z */
    private String f4083z;

    /* JADX INFO: renamed from: a */
    public final long m4339a() {
        return this.f4063f;
    }

    /* JADX INFO: renamed from: b */
    public final int m4340b() {
        return this.f4073p;
    }

    /* JADX INFO: renamed from: c */
    public final String m4341c() {
        return this.f4078u;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1801a c1801a) {
        return this.f4058a.compareTo(c1801a.f4058a);
    }

    /* JADX INFO: renamed from: d */
    public final String m4342d() {
        return this.f4083z;
    }

    /* JADX INFO: renamed from: e */
    public final String m4343e() {
        return this.f4058a;
    }

    /* JADX INFO: renamed from: f */
    public final String m4344f() {
        if (this.f4072o == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(C1885z.m4568g(this.f4072o));
        return C1434P.m3588a(new byte[]{-78}, new byte[]{-17, -53, 6, -62, -105, -21, -123, 19}, sb);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4345g() {
        return this.f4061d == 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m4346h(long j) {
        this.f4063f = j;
    }

    /* JADX INFO: renamed from: i */
    public final void m4347i(String str) {
        this.f4078u = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m4348j(String str) {
        this.f4083z = str;
    }

    public final String toString() {
        return "Item{tkbindId=" + this.f4059b + ", serverMtime=" + this.f4060c + ", category=" + this.f4061d + ", isScene=" + this.f4062e + ", fsId=" + this.f4063f + ", fromType=" + this.f4064g + ", extentInt2=" + this.f4065h + ", serverAtime=" + this.f4066i + ", serverCtime=" + this.f4067j + ", extentInt8=" + this.f4068k + ", wpfile=" + this.f4069l + ", extentTinyint7=" + this.f4070m + ", localMtime=" + this.f4071n + ", size=" + this.f4072o + ", isdir=" + this.f4073p + ", serverFilename='" + this.f4058a + "', share=" + this.f4074q + ", ownerType=" + this.f4075r + ", pl=" + this.f4076s + ", localCtime=" + this.f4077t + ", path='" + this.f4078u + "', realCategory='" + this.f4079v + "', ownerId=" + this.f4080w + ", operId=" + this.f4081x + ", unlist=" + this.f4082y + '}';
    }
}
