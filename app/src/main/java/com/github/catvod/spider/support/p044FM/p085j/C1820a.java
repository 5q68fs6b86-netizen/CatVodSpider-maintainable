package com.github.catvod.spider.support.p044FM.p085j;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1820a implements Comparable<C1820a> {

    /* JADX INFO: renamed from: a */
    @SerializedName("fid")
    private String f4173a;

    /* JADX INFO: renamed from: b */
    @SerializedName("file_name")
    private String f4174b;

    /* JADX INFO: renamed from: c */
    @SerializedName("pdir_fid")
    private String f4175c;

    /* JADX INFO: renamed from: d */
    @SerializedName("category")
    private int f4176d;

    /* JADX INFO: renamed from: e */
    @SerializedName("file_type")
    private int f4177e;

    /* JADX INFO: renamed from: f */
    @SerializedName("size")
    private double f4178f;

    /* JADX INFO: renamed from: g */
    @SerializedName("format_type")
    private String f4179g;

    /* JADX INFO: renamed from: h */
    @SerializedName("dir")
    private boolean f4180h;

    /* JADX INFO: renamed from: i */
    @SerializedName("file")
    private boolean f4181i;

    /* JADX INFO: renamed from: j */
    @SerializedName("updated_at")
    private String f4182j;

    /* JADX INFO: renamed from: k */
    @SerializedName("share_fid_token")
    private String f4183k;

    /* JADX INFO: renamed from: l */
    @SerializedName("pdir_name")
    private String f4184l;

    /* JADX INFO: renamed from: a */
    public final int m4424a() {
        return this.f4176d;
    }

    /* JADX INFO: renamed from: b */
    public final String m4425b() {
        return this.f4173a;
    }

    /* JADX INFO: renamed from: c */
    public final String m4426c() {
        return TextUtils.isEmpty(this.f4174b) ? "" : this.f4174b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1820a c1820a) {
        return m4426c().compareTo(c1820a.m4426c());
    }

    /* JADX INFO: renamed from: d */
    public final String m4427d() {
        return this.f4179g;
    }

    /* JADX INFO: renamed from: e */
    public final String m4428e() {
        return this.f4184l;
    }

    /* JADX INFO: renamed from: f */
    public final String m4429f() {
        return TextUtils.isEmpty(this.f4183k) ? "" : this.f4183k;
    }

    /* JADX INFO: renamed from: g */
    public final String m4430g() {
        if (this.f4178f == 0.0d) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(C1885z.m4568g(this.f4178f));
        return C1434P.m3588a(new byte[]{-22}, new byte[]{-73, 98, -73, -94, 8, -43, -21, -66}, sb);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4431h() {
        return this.f4180h;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4432i() {
        return this.f4181i;
    }

    /* JADX INFO: renamed from: j */
    public final C1820a m4433j(String str) {
        this.f4173a = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C1820a m4434k(String str) {
        this.f4184l = str;
        return this;
    }

    public final String toString() {
        return "Item{fid='" + this.f4173a + "', fileName='" + this.f4174b + "', pfid='" + this.f4175c + "', category=" + this.f4176d + ", fileType=" + this.f4177e + ", size=" + this.f4178f + ", formatType='" + this.f4179g + "', isDir=" + this.f4180h + ", isFile=" + this.f4181i + ", updatedAt=" + this.f4182j + '}';
    }
}
