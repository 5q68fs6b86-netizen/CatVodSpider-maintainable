package com.github.catvod.spider.support.p044FM.p079e;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.e.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1796d {

    /* JADX INFO: renamed from: a */
    @SerializedName("username")
    private String f4047a;

    /* JADX INFO: renamed from: b */
    @SerializedName("password")
    private String f4048b;

    /* JADX INFO: renamed from: a */
    public final String m4331a() {
        return TextUtils.isEmpty(this.f4048b) ? "" : this.f4048b;
    }

    /* JADX INFO: renamed from: b */
    public final String m4332b() {
        return TextUtils.isEmpty(this.f4047a) ? "" : this.f4047a;
    }
}
