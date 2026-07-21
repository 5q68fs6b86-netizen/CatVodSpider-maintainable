package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2199c {

    /* JADX INFO: renamed from: a */
    @SerializedName("redirectUri")
    private String f5343a;

    /* JADX INFO: renamed from: a */
    public final String m5875a() throws IllegalArgumentException {
        String str = this.f5343a;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.contains("code=")) {
            throw new IllegalArgumentException("Redirect URI does not contain authorization code");
        }
        String[] strArrSplit = str.split("code=");
        if (strArrSplit.length < 1) {
            throw new IllegalArgumentException("Invalid redirect URI format");
        }
        String str2 = strArrSplit[1];
        int iIndexOf = str2.indexOf("&");
        return iIndexOf >= 0 ? str2.substring(0, iIndexOf) : str2;
    }
}
