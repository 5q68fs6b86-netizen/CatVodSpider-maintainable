package com.github.catvod.spider.support.p002A0;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ar */
/* JADX INFO: loaded from: classes.dex */
public class C0132ar {

    /* JADX INFO: renamed from: c */
    @InterfaceC0474ni("username")
    private String f671c;

    /* JADX INFO: renamed from: d */
    @InterfaceC0474ni("password")
    private String f672d;

    /* JADX INFO: renamed from: a */
    public final String m1008a() {
        return TextUtils.isEmpty(this.f672d) ? "" : this.f672d;
    }

    /* JADX INFO: renamed from: b */
    public final String m1009b() {
        return TextUtils.isEmpty(this.f671c) ? "" : this.f671c;
    }
}
