package com.github.catvod.spider.support.p012C0.p025c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p025c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1039e {

    /* JADX INFO: renamed from: a */
    @SerializedName("url")
    private String f2538a;

    /* JADX INFO: renamed from: b */
    @SerializedName("name")
    private String f2539b;

    /* JADX INFO: renamed from: c */
    @SerializedName("lang")
    private String f2540c;

    /* JADX INFO: renamed from: d */
    @SerializedName("format")
    private String f2541d;

    /* JADX INFO: renamed from: a */
    public final C1039e m2614a(String str) {
        str.getClass();
        switch (str) {
            case "ass":
            case "ssa":
                this.f2541d = "text/x-ssa";
                return this;
            case "vtt":
                this.f2541d = "text/vtt";
                return this;
            default:
                this.f2541d = "application/x-subrip";
                return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1039e m2615b(String str) {
        this.f2540c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C1039e m2616c(String str) {
        this.f2539b = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C1039e m2617d(String str) {
        this.f2538a = str;
        return this;
    }
}
