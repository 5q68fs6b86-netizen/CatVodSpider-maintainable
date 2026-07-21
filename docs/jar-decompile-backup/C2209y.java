package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p119d.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2209y {

    /* JADX INFO: renamed from: a */
    @SerializedName("token_type")
    private String f5414a;

    /* JADX INFO: renamed from: b */
    @SerializedName("access_token")
    private String f5415b;

    /* JADX INFO: renamed from: c */
    @SerializedName("refresh_token")
    private String f5416c;

    /* JADX INFO: renamed from: d */
    @SerializedName("expires_in")
    private long f5417d;

    /* JADX INFO: renamed from: f */
    @SerializedName("sub")
    private String f5418f;

    /* JADX INFO: renamed from: k */
    @SerializedName("expires_end")
    private long f5419k;

    /* JADX INFO: renamed from: a */
    public final String m5922a() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.f5414a) ? "" : this.f5414a);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.f5415b) ? "" : this.f5415b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m5923b() {
        return TextUtils.isEmpty(this.f5416c) ? "" : this.f5416c;
    }

    /* JADX INFO: renamed from: c */
    public final long m5924c() {
        return this.f5417d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5925d() {
        return (TextUtils.isEmpty(this.f5414a) || TextUtils.isEmpty(this.f5415b)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final String m5926e() {
        return new Gson().toJson(this);
    }

    /* JADX INFO: renamed from: f */
    public final String m5927f() {
        return TextUtils.isEmpty(this.f5418f) ? "" : this.f5418f;
    }

    /* JADX INFO: renamed from: k */
    public final void m5928k(String str) {
        this.f5418f = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m5929p(long j) {
        this.f5419k = j;
    }

    public final String toString() {
        return "XunleiUser{tokenType='" + this.f5414a + "', accessToken='" + this.f5415b + "', refreshToken='" + this.f5416c + "', expiresIn=" + this.f5417d + ", sub='" + this.f5418f + "', expiresEnd=" + this.f5419k + '}';
    }
}
