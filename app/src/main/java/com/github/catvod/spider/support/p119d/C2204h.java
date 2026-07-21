package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.d.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2204h {

    /* JADX INFO: renamed from: a */
    @SerializedName("token_type")
    private String f5368a;

    /* JADX INFO: renamed from: b */
    @SerializedName("access_token")
    private String f5369b;

    /* JADX INFO: renamed from: c */
    @SerializedName("refresh_token")
    private String f5370c;

    /* JADX INFO: renamed from: d */
    public static C2204h m5899d(String str) {
        C2204h c2204h = (C2204h) new Gson().fromJson(str, C2204h.class);
        return c2204h == null ? new C2204h() : c2204h;
    }

    /* JADX INFO: renamed from: a */
    public final String m5900a() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.f5368a) ? "" : this.f5368a);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.f5369b) ? "" : this.f5369b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m5901b() {
        return TextUtils.isEmpty(this.f5370c) ? "" : this.f5370c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5902c() {
        if ((TextUtils.isEmpty(this.f5368a) ? "" : this.f5368a).length() > 0) {
            if ((TextUtils.isEmpty(this.f5369b) ? "" : this.f5369b).length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5903d() {
        return (TextUtils.isEmpty(this.f5369b) ? "" : this.f5369b).length() > 0;
    }
}
