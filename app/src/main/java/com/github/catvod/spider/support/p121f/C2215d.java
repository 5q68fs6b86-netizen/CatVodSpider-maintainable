package com.github.catvod.spider.support.p121f;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p121f.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2215d {

    /* JADX INFO: renamed from: a */
    @SerializedName("cid")
    private String f5485a;

    /* JADX INFO: renamed from: b */
    @SerializedName("part")
    private String f5486b;

    /* JADX INFO: renamed from: a */
    public final String m5979a() {
        return TextUtils.isEmpty(this.f5485a) ? "" : this.f5485a;
    }

    /* JADX INFO: renamed from: b */
    public final String m5980b() {
        return TextUtils.isEmpty(this.f5486b) ? "" : this.f5486b;
    }
}
