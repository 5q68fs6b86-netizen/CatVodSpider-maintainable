package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2177k;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.d.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2207k {

    /* JADX INFO: renamed from: a */
    @SerializedName("share_id")
    private String f5390a;

    /* JADX INFO: renamed from: b */
    @SerializedName("share_token")
    private String f5391b;

    /* JADX INFO: renamed from: c */
    @SerializedName("expire_time")
    private String f5392c;

    /* JADX INFO: renamed from: d */
    @SerializedName("expires_in")
    private int f5393d;

    /* JADX INFO: renamed from: e */
    @SerializedName("creator_id")
    private String f5394e;

    /* JADX INFO: renamed from: f */
    @SerializedName("creator_name")
    private String f5395f;

    /* JADX INFO: renamed from: g */
    @SerializedName("creator_phone")
    private String f5396g;

    /* JADX INFO: renamed from: h */
    @SerializedName("expiration")
    private String f5397h;

    /* JADX INFO: renamed from: i */
    @SerializedName("updated_at")
    private String f5398i;

    /* JADX INFO: renamed from: j */
    @SerializedName("vip")
    private String f5399j;

    /* JADX INFO: renamed from: k */
    @SerializedName("avatar")
    private String f5400k;

    /* JADX INFO: renamed from: l */
    @SerializedName("share_name")
    private String f5401l;

    /* JADX INFO: renamed from: m */
    @SerializedName("display_name")
    private String f5402m;

    /* JADX INFO: renamed from: n */
    @SerializedName("share_title")
    private String f5403n;

    /* JADX INFO: renamed from: o */
    @SerializedName("has_pwd")
    private boolean f5404o;

    /* JADX INFO: renamed from: p */
    @SerializedName("file_infos")
    private List<C2203g> f5405p;

    /* JADX INFO: renamed from: q */
    @SerializedName("time")
    private long f5406q;

    /* JADX INFO: renamed from: d */
    public static C2207k m5912d(String str) {
        return (C2207k) new Gson().fromJson(str, C2207k.class);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5913a(String str) {
        return (TextUtils.isEmpty(this.f5390a) ? "" : this.f5390a).equals(str) && System.currentTimeMillis() <= this.f5406q;
    }

    /* JADX INFO: renamed from: b */
    public final String m5914b() {
        return TextUtils.isEmpty(this.f5401l) ? "" : this.f5401l;
    }

    /* JADX INFO: renamed from: c */
    public final String m5915c() {
        return TextUtils.isEmpty(this.f5391b) ? "" : this.f5391b;
    }

    /* JADX INFO: renamed from: e */
    public final C2207k m5916e(String str) {
        this.f5390a = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C2207k m5917f() {
        this.f5406q = System.currentTimeMillis() + 3600000;
        return this;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("{share_id='");
        C2177k.m5717c(sbM5396a, this.f5390a, '\'', ", share_token='");
        C2177k.m5717c(sbM5396a, this.f5391b, '\'', ", expireTime='");
        C2177k.m5717c(sbM5396a, this.f5392c, '\'', ", expiresIn=");
        sbM5396a.append(this.f5393d);
        sbM5396a.append(", creatorId='");
        C2177k.m5717c(sbM5396a, this.f5394e, '\'', ", creatorName='");
        C2177k.m5717c(sbM5396a, this.f5395f, '\'', ", creatorPhone='");
        C2177k.m5717c(sbM5396a, this.f5396g, '\'', ", expiration='");
        C2177k.m5717c(sbM5396a, this.f5397h, '\'', ", updatedAt='");
        C2177k.m5717c(sbM5396a, this.f5398i, '\'', ", vip='");
        C2177k.m5717c(sbM5396a, this.f5399j, '\'', ", avatar='");
        C2177k.m5717c(sbM5396a, this.f5400k, '\'', ", shareName='");
        C2177k.m5717c(sbM5396a, this.f5401l, '\'', ", displayName='");
        C2177k.m5717c(sbM5396a, this.f5402m, '\'', ", shareTitle='");
        C2177k.m5717c(sbM5396a, this.f5403n, '\'', ", hasPwd=");
        sbM5396a.append(this.f5404o);
        sbM5396a.append(", fileInfos=");
        sbM5396a.append(this.f5405p);
        sbM5396a.append(", time=");
        sbM5396a.append(this.f5406q);
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
