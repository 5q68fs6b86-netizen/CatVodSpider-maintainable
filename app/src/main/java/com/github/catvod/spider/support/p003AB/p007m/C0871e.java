package com.github.catvod.spider.support.p003AB.p007m;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.m.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0871e {

    /* JADX INFO: renamed from: a */
    private final int f2050a;

    /* JADX INFO: renamed from: b */
    private final String f2051b;

    /* JADX INFO: renamed from: c */
    private final Map<String, List<String>> f2052c;

    public C0871e() {
        this.f2050a = 500;
        this.f2051b = "";
        this.f2052c = new HashMap();
    }

    public C0871e(int i, String str, Map<String, List<String>> map) {
        this.f2050a = i;
        this.f2051b = str;
        this.f2052c = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m2134a() {
        return TextUtils.isEmpty(this.f2051b) ? "" : this.f2051b;
    }

    /* JADX INFO: renamed from: b */
    public final int m2135b() {
        return this.f2050a;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> m2136c() {
        return this.f2052c;
    }
}
