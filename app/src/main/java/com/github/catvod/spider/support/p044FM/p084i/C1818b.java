package com.github.catvod.spider.support.p044FM.p084i;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1818b {

    /* JADX INFO: renamed from: a */
    @SerializedName("FileId")
    private String f4153a;

    /* JADX INFO: renamed from: b */
    @SerializedName("FileName")
    private String f4154b;

    /* JADX INFO: renamed from: c */
    @SerializedName("Type")
    private int f4155c;

    /* JADX INFO: renamed from: d */
    @SerializedName("Size")
    private long f4156d;

    /* JADX INFO: renamed from: e */
    @SerializedName("ContentType")
    private String f4157e;

    /* JADX INFO: renamed from: f */
    @SerializedName("S3KeyFlag")
    private String f4158f;

    /* JADX INFO: renamed from: g */
    @SerializedName("CreateAt")
    private String f4159g;

    /* JADX INFO: renamed from: h */
    @SerializedName("UpdateAt")
    private String f4160h;

    /* JADX INFO: renamed from: i */
    @SerializedName("Etag")
    private String f4161i;

    /* JADX INFO: renamed from: j */
    @SerializedName("DownloadUrl")
    private String f4162j;

    /* JADX INFO: renamed from: k */
    @SerializedName("Status")
    private int f4163k;

    /* JADX INFO: renamed from: l */
    @SerializedName("ParentFileId")
    private int f4164l;

    /* JADX INFO: renamed from: m */
    @SerializedName("Category")
    private int f4165m;

    /* JADX INFO: renamed from: n */
    @SerializedName("PunishFlag")
    private int f4166n;

    /* JADX INFO: renamed from: o */
    @SerializedName("StorageNode")
    private String f4167o;

    /* JADX INFO: renamed from: p */
    @SerializedName("PreviewType")
    private String f4168p;

    /* JADX INFO: renamed from: q */
    @SerializedName("pfName")
    private int f4169q;

    /* JADX INFO: renamed from: a */
    public final int m4412a() {
        return this.f4165m;
    }

    /* JADX INFO: renamed from: b */
    public final String m4413b() {
        return this.f4159g;
    }

    /* JADX INFO: renamed from: c */
    public final String m4414c() {
        return this.f4161i;
    }

    /* JADX INFO: renamed from: d */
    public final String m4415d() {
        if (TextUtils.isEmpty(this.f4153a)) {
            this.f4153a = "0";
        }
        return this.f4153a;
    }

    /* JADX INFO: renamed from: e */
    public final String m4416e() {
        return this.f4154b;
    }

    /* JADX INFO: renamed from: f */
    public final String m4417f() {
        return this.f4168p;
    }

    /* JADX INFO: renamed from: g */
    public final String m4418g() {
        return this.f4158f;
    }

    /* JADX INFO: renamed from: h */
    public final long m4419h() {
        return this.f4156d;
    }

    /* JADX INFO: renamed from: i */
    public final String m4420i() {
        if (this.f4156d == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(C1885z.m4568g(this.f4156d));
        return C1434P.m3588a(new byte[]{109}, new byte[]{48, 92, -114, 80, 47, 64, -84, 18}, sb);
    }

    /* JADX INFO: renamed from: j */
    public final void m4421j(String str) {
        this.f4168p = str;
    }

    public final String toString() {
        return "Item{FileId='" + this.f4153a + "', FileName='" + this.f4154b + "', Type=" + this.f4155c + ", Size=" + this.f4156d + ", ContentType='" + this.f4157e + "', S3KeyFlag='" + this.f4158f + "', CreateAt='" + this.f4159g + "', UpdateAt='" + this.f4160h + "', Etag='" + this.f4161i + "', DownloadUrl='" + this.f4162j + "', Status=" + this.f4163k + ", ParentFileId=" + this.f4164l + ", Category=" + this.f4165m + ", PunishFlag=" + this.f4166n + ", StorageNode='" + this.f4167o + "', PreviewType=" + this.f4169q + '}';
    }
}
