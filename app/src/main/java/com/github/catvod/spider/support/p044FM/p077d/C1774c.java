package com.github.catvod.spider.support.p044FM.p077d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p077d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1774c {

    /* JADX INFO: renamed from: a */
    @SerializedName("redirectUri")
    private String f3952a;

    /* JADX INFO: renamed from: a */
    public final String m4239a() {
        return (TextUtils.isEmpty(this.f3952a) ? "" : this.f3952a).split("code=")[1];
    }
}
