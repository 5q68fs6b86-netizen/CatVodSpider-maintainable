package com.github.catvod.spider.support.p044FM.p086k;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1825a implements Comparable<C1825a> {

    /* JADX INFO: renamed from: a */
    @SerializedName("fid")
    private String f4193a;

    /* JADX INFO: renamed from: b */
    @SerializedName("file_name")
    private String f4194b;

    /* JADX INFO: renamed from: c */
    @SerializedName("pdir_fid")
    private String f4195c;

    /* JADX INFO: renamed from: d */
    @SerializedName("pdir_name")
    private String f4196d;

    /* JADX INFO: renamed from: e */
    @SerializedName("category")
    private int f4197e;

    /* JADX INFO: renamed from: f */
    @SerializedName("file_type")
    private int f4198f;

    /* JADX INFO: renamed from: g */
    @SerializedName("size")
    private double f4199g;

    /* JADX INFO: renamed from: h */
    @SerializedName("format_type")
    private String f4200h;

    /* JADX INFO: renamed from: i */
    @SerializedName("dir")
    private boolean f4201i;

    /* JADX INFO: renamed from: j */
    @SerializedName("file")
    private boolean f4202j;

    /* JADX INFO: renamed from: k */
    @SerializedName("updated_at")
    private String f4203k;

    /* JADX INFO: renamed from: l */
    @SerializedName("share_fid_token")
    private String f4204l;

    /* JADX INFO: renamed from: a */
    public final int m4445a() {
        return this.f4197e;
    }

    /* JADX INFO: renamed from: b */
    public final String m4446b() {
        return this.f4193a;
    }

    /* JADX INFO: renamed from: c */
    public final String m4447c() {
        return TextUtils.isEmpty(this.f4194b) ? "" : this.f4194b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1825a c1825a) {
        return m4447c().compareTo(c1825a.m4447c());
    }

    /* JADX INFO: renamed from: d */
    public final String m4448d() {
        return this.f4200h;
    }

    /* JADX INFO: renamed from: e */
    public final String m4449e() {
        return this.f4196d;
    }

    /* JADX INFO: renamed from: f */
    public final String m4450f() {
        return TextUtils.isEmpty(this.f4204l) ? "" : this.f4204l;
    }

    /* JADX INFO: renamed from: g */
    public final String m4451g() {
        if (this.f4199g == 0.0d) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(C1885z.m4568g(this.f4199g));
        return C1434P.m3588a(new byte[]{16}, new byte[]{77, -72, 16, -121, 103, 107, -92, -15}, sb);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4452h() {
        return this.f4201i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4453i() {
        return this.f4202j;
    }

    /* JADX INFO: renamed from: j */
    public final C1825a m4454j(String str) {
        this.f4193a = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C1825a m4455k(String str) {
        this.f4196d = str;
        return this;
    }

    public final String toString() {
        return "Item{fid='" + this.f4193a + "', fileName='" + this.f4194b + "', pfid='" + this.f4195c + "', category=" + this.f4197e + ", fileType=" + this.f4198f + ", size=" + this.f4199g + ", formatType='" + this.f4200h + "', isDir=" + this.f4201i + ", isFile=" + this.f4202j + ", updatedAt=" + this.f4203k + '}';
    }
}
