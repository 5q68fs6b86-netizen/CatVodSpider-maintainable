package com.github.catvod.spider.support.p044FM.p082g;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1803a {

    /* JADX INFO: renamed from: a */
    @SerializedName("duration")
    private String f4088a;

    /* JADX INFO: renamed from: b */
    @SerializedName("minBufferTime")
    private String f4089b;

    /* JADX INFO: renamed from: c */
    @SerializedName("video")
    private List<C1805c> f4090c;

    /* JADX INFO: renamed from: d */
    @SerializedName("audio")
    private List<C1805c> f4091d;

    /* JADX INFO: renamed from: a */
    public final List<C1805c> m4354a() {
        List<C1805c> list = this.f4091d;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: b */
    public final String m4355b() {
        String str = this.f4088a;
        return str == null ? "0" : str;
    }

    /* JADX INFO: renamed from: c */
    public final String m4356c() {
        String str = this.f4089b;
        return str == null ? "0" : str;
    }

    /* JADX INFO: renamed from: d */
    public final List<C1805c> m4357d() {
        List<C1805c> list = this.f4090c;
        return list == null ? Collections.emptyList() : list;
    }
}
