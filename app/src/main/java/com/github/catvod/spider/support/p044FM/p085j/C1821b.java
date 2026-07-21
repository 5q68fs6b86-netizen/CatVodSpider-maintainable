package com.github.catvod.spider.support.p044FM.p085j;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p085j.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1821b {

    /* JADX INFO: renamed from: a */
    @SerializedName("list")
    private List<C1820a> f4185a;

    /* JADX INFO: renamed from: a */
    public final List<C1820a> m4435a() {
        List<C1820a> list = this.f4185a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String toString() {
        return "Data{items=" + this.f4185a + '}';
    }
}
