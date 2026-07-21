package com.github.catvod.spider.support.p128m;

import android.util.Base64;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.J */
/* JADX INFO: loaded from: classes.dex */
public final class C2257J {

    /* JADX INFO: renamed from: a */
    private final C2271n f5635a = new C2271n("yszyz2024");

    /* JADX INFO: renamed from: a */
    public final String m6122a(String str) {
        C2271n c2271n = this.f5635a;
        c2271n.getClass();
        return c2271n.m6181b(Base64.decode(str, 0));
    }

    /* JADX INFO: renamed from: b */
    public final String m6123b(String str) {
        C2271n c2271n = this.f5635a;
        return c2271n.m6181b(c2271n.m6183d(str));
    }

    /* JADX INFO: renamed from: c */
    public final String m6124c(String str) {
        return this.f5635a.m6182c(str);
    }
}
