package com.github.catvod.spider.support.p044FM.p077d;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.d.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1784m {

    /* JADX INFO: renamed from: a */
    @SerializedName("responses")
    private List<C1784m> f3992a;

    /* JADX INFO: renamed from: b */
    @SerializedName("body")
    private C1783l f3993b;

    /* JADX INFO: renamed from: c */
    @SerializedName("id")
    private String f3994c;

    /* JADX INFO: renamed from: d */
    @SerializedName("status")
    private int f3995d;

    /* JADX INFO: renamed from: a */
    public final C1783l m4270a() {
        C1783l c1783l = this.f3993b;
        return c1783l == null ? new C1783l() : c1783l;
    }

    /* JADX INFO: renamed from: b */
    public final C1784m m4271b() {
        List<C1784m> listEmptyList = this.f3992a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return new C1784m();
        }
        List<C1784m> listEmptyList2 = this.f3992a;
        if (listEmptyList2 == null) {
            listEmptyList2 = Collections.emptyList();
        }
        return listEmptyList2.get(0);
    }

    /* JADX INFO: renamed from: c */
    public final int m4272c() {
        return this.f3995d;
    }
}
