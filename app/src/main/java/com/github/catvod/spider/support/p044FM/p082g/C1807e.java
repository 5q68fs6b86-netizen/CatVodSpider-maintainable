package com.github.catvod.spider.support.p044FM.p082g;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1807e {

    /* JADX INFO: renamed from: a */
    @SerializedName("cid")
    private String f4125a;

    /* JADX INFO: renamed from: b */
    @SerializedName("part")
    private String f4126b;

    /* JADX INFO: renamed from: a */
    public final String m4389a() {
        return TextUtils.isEmpty(this.f4125a) ? "" : this.f4125a;
    }

    /* JADX INFO: renamed from: b */
    public final String m4390b() {
        return TextUtils.isEmpty(this.f4126b) ? "" : this.f4126b.replace("#", "");
    }
}
