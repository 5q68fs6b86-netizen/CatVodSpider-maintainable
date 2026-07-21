package com.github.catvod.spider.support.p012C0.p025c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p025c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1035a {

    /* JADX INFO: renamed from: a */
    @SerializedName("type_id")
    private String f2517a;

    /* JADX INFO: renamed from: b */
    @SerializedName("type_name")
    private String f2518b;

    /* JADX INFO: renamed from: c */
    @SerializedName("type_flag")
    private String f2519c = "1";

    public C1035a(String str, String str2) {
        this.f2517a = str;
        this.f2518b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m2603a() {
        return this.f2517a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1035a) {
            return this.f2517a.equals(((C1035a) obj).f2517a);
        }
        return false;
    }
}
