package com.github.catvod.spider.support.p044FM.p077d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.d.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1777f {

    /* JADX INFO: renamed from: a */
    @SerializedName("default_drive_id")
    private String f3963a;

    /* JADX INFO: renamed from: b */
    @SerializedName("resource_drive_id")
    private String f3964b;

    /* JADX INFO: renamed from: a */
    public final String m4248a() {
        if ((TextUtils.isEmpty(this.f3964b) ? "" : this.f3964b).isEmpty()) {
            return TextUtils.isEmpty(this.f3963a) ? "" : this.f3963a;
        }
        return TextUtils.isEmpty(this.f3964b) ? "" : this.f3964b;
    }
}
