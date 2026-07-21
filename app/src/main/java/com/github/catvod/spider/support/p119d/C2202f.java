package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p119d.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2202f {

    /* JADX INFO: renamed from: a */
    @SerializedName("default_drive_id")
    private String f5354a;

    /* JADX INFO: renamed from: b */
    @SerializedName("resource_drive_id")
    private String f5355b;

    /* JADX INFO: renamed from: a */
    public final String m5884a() {
        if ((TextUtils.isEmpty(this.f5355b) ? "" : this.f5355b).isEmpty()) {
            return TextUtils.isEmpty(this.f5354a) ? "" : this.f5354a;
        }
        return TextUtils.isEmpty(this.f5355b) ? "" : this.f5355b;
    }
}
