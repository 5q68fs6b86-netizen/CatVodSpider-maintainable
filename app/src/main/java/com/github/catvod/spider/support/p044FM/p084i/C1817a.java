package com.github.catvod.spider.support.p044FM.p084i;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1817a {

    /* JADX INFO: renamed from: a */
    @SerializedName("Next")
    private String f4148a;

    /* JADX INFO: renamed from: b */
    @SerializedName("Len")
    private int f4149b;

    /* JADX INFO: renamed from: c */
    @SerializedName("IsFirst")
    private Boolean f4150c;

    /* JADX INFO: renamed from: d */
    @SerializedName("Expired")
    private Boolean f4151d;

    /* JADX INFO: renamed from: e */
    @SerializedName("InfoList")
    private List<C1818b> f4152e;

    /* JADX INFO: renamed from: a */
    public final List<C1818b> m4409a() {
        return this.f4152e;
    }

    /* JADX INFO: renamed from: b */
    public final int m4410b() {
        return this.f4149b;
    }

    /* JADX INFO: renamed from: c */
    public final String m4411c() {
        return this.f4148a;
    }

    public final String toString() {
        return "Data{Next='" + this.f4148a + "', Len=" + this.f4149b + ", IsFirst=" + this.f4150c + ", Expired=" + this.f4151d + ", InfoList=" + this.f4152e + '}';
    }
}
