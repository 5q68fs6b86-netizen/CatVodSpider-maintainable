package com.github.catvod.spider.support.p118c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2193d {

    /* JADX INFO: renamed from: a */
    @SerializedName("url")
    private String f5294a;

    /* JADX INFO: renamed from: b */
    @SerializedName("name")
    private String f5295b;

    /* JADX INFO: renamed from: c */
    @SerializedName("lang")
    private String f5296c;

    /* JADX INFO: renamed from: d */
    @SerializedName("format")
    private String f5297d;

    /* JADX INFO: renamed from: a */
    public final C2193d m5834a(String str) {
        String str2;
        switch (str) {
            case "ass":
            case "ssa":
                str2 = "text/x-ssa";
                break;
            case "vtt":
                str2 = "text/vtt";
                break;
            default:
                str2 = "application/x-subrip";
                break;
        }
        this.f5297d = str2;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2193d m5835b(String str) {
        this.f5295b = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C2193d m5836c(String str) {
        this.f5294a = str;
        return this;
    }
}
