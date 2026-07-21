package com.github.catvod.spider.support.p121f;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2212a {

    /* JADX INFO: renamed from: a */
    @SerializedName("duration")
    private String f5449a;

    /* JADX INFO: renamed from: b */
    @SerializedName("minBufferTime")
    private String f5450b;

    /* JADX INFO: renamed from: c */
    @SerializedName("video")
    private List<C2214c> f5451c;

    /* JADX INFO: renamed from: d */
    @SerializedName("audio")
    private List<C2214c> f5452d;

    /* JADX INFO: renamed from: a */
    public final List<C2214c> m5943a() {
        List<C2214c> list = this.f5452d;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: b */
    public final String m5944b() {
        String str = this.f5449a;
        return str == null ? "0" : str;
    }

    /* JADX INFO: renamed from: c */
    public final String m5945c() {
        String str = this.f5450b;
        return str == null ? "0" : str;
    }

    /* JADX INFO: renamed from: d */
    public final List<C2214c> m5946d() {
        List<C2214c> list = this.f5451c;
        return list == null ? Collections.emptyList() : list;
    }
}
