package com.github.catvod.spider.support.p044FM.p077d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p077d.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1779h {

    /* JADX INFO: renamed from: a */
    @SerializedName("token_type")
    private String f3975a;

    /* JADX INFO: renamed from: b */
    @SerializedName("access_token")
    private String f3976b;

    /* JADX INFO: renamed from: c */
    @SerializedName("refresh_token")
    private String f3977c;

    /* JADX INFO: renamed from: a */
    public final void m4260a() {
        this.f3977c = "";
        this.f3976b = "";
    }

    /* JADX INFO: renamed from: b */
    public final String m4261b() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.f3975a) ? "" : this.f3975a);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.f3976b) ? "" : this.f3976b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final String m4262c() {
        return TextUtils.isEmpty(this.f3977c) ? "" : this.f3977c;
    }
}
