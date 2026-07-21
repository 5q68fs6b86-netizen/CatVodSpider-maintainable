package com.github.catvod.spider.support.p044FM.p082g;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1806d {

    /* JADX INFO: renamed from: a */
    @SerializedName("mid")
    private String f4123a;

    /* JADX INFO: renamed from: b */
    @SerializedName("name")
    private String f4124b;

    /* JADX INFO: renamed from: a */
    public final String m4388a() {
        Object[] objArr = new Object[3];
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.f4123a) ? "" : this.f4123a);
        objArr[0] = C1434P.m3588a(new byte[]{51, -34, -88, -97, -123}, new byte[]{28, -91, -40, -8, -8, -113, 51, 58}, sb);
        objArr[1] = TextUtils.isEmpty(this.f4124b) ? "" : this.f4124b;
        objArr[2] = TextUtils.isEmpty(this.f4124b) ? "" : this.f4124b;
        return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", objArr);
    }
}
