package com.github.catvod.spider.support.p012C0.p032h;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p032h.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1236d {

    /* JADX INFO: renamed from: a */
    private final int f2914a;

    /* JADX INFO: renamed from: b */
    private final String f2915b;

    public C1236d() {
        this.f2914a = 500;
        this.f2915b = "";
    }

    public C1236d(int i, String str) {
        this.f2914a = i;
        this.f2915b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m3056a() {
        return TextUtils.isEmpty(this.f2915b) ? "" : this.f2915b;
    }

    /* JADX INFO: renamed from: b */
    public final int m3057b() {
        return this.f2914a;
    }
}
