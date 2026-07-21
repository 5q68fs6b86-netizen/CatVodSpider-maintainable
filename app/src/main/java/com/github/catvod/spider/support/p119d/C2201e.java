package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2201e {

    /* JADX INFO: renamed from: a */
    @SerializedName("url")
    private String f5351a;

    /* JADX INFO: renamed from: b */
    @SerializedName("file_id")
    private String f5352b;

    /* JADX INFO: renamed from: c */
    @SerializedName("expiration")
    private String f5353c;

    /* JADX INFO: renamed from: a */
    public final String m5883a() {
        return TextUtils.isEmpty(this.f5351a) ? "" : this.f5351a;
    }
}
