package com.github.catvod.spider.support.p044FM.p088m;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.m.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1842e {

    /* JADX INFO: renamed from: a */
    private final int f4234a;

    /* JADX INFO: renamed from: b */
    private final String f4235b;

    /* JADX INFO: renamed from: c */
    private final Map<String, List<String>> f4236c;

    public C1842e() {
        this.f4234a = 500;
        this.f4235b = "";
        this.f4236c = new HashMap();
    }

    public C1842e(int i, String str, Map<String, List<String>> map) {
        this.f4234a = i;
        this.f4235b = str;
        this.f4236c = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m4481a() {
        return TextUtils.isEmpty(this.f4235b) ? "" : this.f4235b;
    }

    /* JADX INFO: renamed from: b */
    public final int m4482b() {
        return this.f4234a;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> m4483c() {
        return this.f4236c;
    }
}
