package com.github.catvod.spider.support.p044FM.p075c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1759a {

    /* JADX INFO: renamed from: a */
    @SerializedName("type_id")
    private final String f3872a;

    /* JADX INFO: renamed from: b */
    @SerializedName("type_name")
    private final String f3873b;

    /* JADX INFO: renamed from: c */
    @SerializedName("type_flag")
    private final String f3874c;

    public C1759a(String str, String str2) {
        this.f3872a = str;
        this.f3873b = str2;
        this.f3874c = null;
    }

    public C1759a(String str, String str2, String str3) {
        this.f3872a = str;
        this.f3873b = str2;
        this.f3874c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m4174a() {
        return this.f3872a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1759a) {
            return this.f3872a.equals(((C1759a) obj).f3872a);
        }
        return false;
    }
}
