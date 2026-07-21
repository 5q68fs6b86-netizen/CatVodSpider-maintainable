package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2177k;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p119d.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2208l {

    /* JADX INFO: renamed from: a */
    @SerializedName("token_type")
    private String f5407a;

    /* JADX INFO: renamed from: b */
    @SerializedName("access_token")
    private String f5408b;

    /* JADX INFO: renamed from: c */
    @SerializedName("refresh_token")
    private String f5409c;

    /* JADX INFO: renamed from: d */
    @SerializedName("user_id")
    private String f5410d;

    /* JADX INFO: renamed from: e */
    @SerializedName("device_id")
    private String f5411e;

    /* JADX INFO: renamed from: f */
    @SerializedName("nick_name")
    private String f5412f;

    /* JADX INFO: renamed from: g */
    @SerializedName("user_name")
    private String f5413g;

    /* JADX INFO: renamed from: a */
    public final String m5918a() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.f5407a) ? "" : this.f5407a);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.f5408b) ? "" : this.f5408b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m5919b() {
        return TextUtils.isEmpty(this.f5412f) ? this.f5413g : this.f5412f;
    }

    /* JADX INFO: renamed from: c */
    public final String m5920c() {
        return TextUtils.isEmpty(this.f5409c) ? "" : this.f5409c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5921d() {
        if ((TextUtils.isEmpty(this.f5407a) ? "" : this.f5407a).length() > 0) {
            if ((TextUtils.isEmpty(this.f5408b) ? "" : this.f5408b).length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("User{tokenType='");
        C2177k.m5717c(sbM5396a, this.f5407a, '\'', ", accessToken='");
        C2177k.m5717c(sbM5396a, this.f5408b, '\'', ", refreshToken='");
        C2177k.m5717c(sbM5396a, this.f5409c, '\'', ", userId='");
        C2177k.m5717c(sbM5396a, this.f5410d, '\'', ", deviceId='");
        sbM5396a.append(this.f5411e);
        sbM5396a.append('\'');
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
