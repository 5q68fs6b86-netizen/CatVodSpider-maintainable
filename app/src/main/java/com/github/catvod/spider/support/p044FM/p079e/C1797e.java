package com.github.catvod.spider.support.p044FM.p079e;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p079e.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1797e {

    /* JADX INFO: renamed from: a */
    @SerializedName("path")
    private String f4049a;

    /* JADX INFO: renamed from: b */
    @SerializedName("pass")
    private String f4050b;

    /* JADX INFO: renamed from: a */
    public final String m4333a() {
        return TextUtils.isEmpty(this.f4050b) ? "" : this.f4050b;
    }

    /* JADX INFO: renamed from: b */
    public final String m4334b() {
        return TextUtils.isEmpty(this.f4049a) ? "" : this.f4049a;
    }
}
