package com.github.catvod.spider.support.p044FM.p086k;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p086k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1826b {

    /* JADX INFO: renamed from: a */
    @SerializedName("list")
    private List<C1825a> f4205a;

    /* JADX INFO: renamed from: a */
    public final List<C1825a> m4456a() {
        List<C1825a> list = this.f4205a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String toString() {
        return "Data{items=" + this.f4205a + '}';
    }
}
