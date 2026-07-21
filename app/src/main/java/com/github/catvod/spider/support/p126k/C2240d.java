package com.github.catvod.spider.support.p126k;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2240d {

    /* JADX INFO: renamed from: a */
    private final int f5593a;

    /* JADX INFO: renamed from: b */
    private final String f5594b;

    /* JADX INFO: renamed from: c */
    private final Map<String, List<String>> f5595c;

    public C2240d() {
        this.f5593a = 500;
        this.f5594b = "";
        this.f5595c = new HashMap();
    }

    public C2240d(int i, String str, Map<String, List<String>> map) {
        this.f5593a = i;
        this.f5594b = str;
        this.f5595c = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m6076a() {
        return TextUtils.isEmpty(this.f5594b) ? "" : this.f5594b;
    }

    /* JADX INFO: renamed from: b */
    public final int m6077b() {
        return this.f5593a;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> m6078c() {
        return this.f5595c;
    }
}
