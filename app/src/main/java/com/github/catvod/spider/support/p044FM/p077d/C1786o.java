package com.github.catvod.spider.support.p044FM.p077d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p077d.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1786o {

    /* JADX INFO: renamed from: a */
    @SerializedName("token_type")
    private String f4013a;

    /* JADX INFO: renamed from: b */
    @SerializedName("access_token")
    private String f4014b;

    /* JADX INFO: renamed from: c */
    @SerializedName("refresh_token")
    private String f4015c;

    /* JADX INFO: renamed from: a */
    public final void m4280a() {
        this.f4015c = "";
        this.f4014b = "";
    }

    /* JADX INFO: renamed from: b */
    public final String m4281b() {
        return TextUtils.isEmpty(this.f4014b) ? "" : this.f4014b;
    }

    /* JADX INFO: renamed from: c */
    public final String m4282c() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.f4013a) ? "" : this.f4013a);
        sb.append(" ");
        sb.append(m4281b());
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final String m4283d() {
        return TextUtils.isEmpty(this.f4015c) ? "" : this.f4015c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4284e() {
        return (TextUtils.isEmpty(this.f4013a) ? "" : this.f4013a).length() > 0 && m4281b().length() > 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m4285f(String str) {
        this.f4015c = str;
    }
}
