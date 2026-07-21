package com.github.catvod.spider.support.p044FM.p075c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p075c.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1766h {

    /* JADX INFO: renamed from: a */
    @SerializedName("url")
    private String f3902a;

    /* JADX INFO: renamed from: b */
    @SerializedName("name")
    private String f3903b;

    /* JADX INFO: renamed from: c */
    @SerializedName("lang")
    private String f3904c;

    /* JADX INFO: renamed from: d */
    @SerializedName("format")
    private String f3905d;

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX INFO: renamed from: a */
    public final C1766h m4210a(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != 96897) {
            if (iHashCode != 114177) {
                if (iHashCode == 117110 && str.equals("vtt")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("ssa")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("ass")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            this.f3905d = "text/vtt";
            return this;
        }
        if (b == 1 || b == 2) {
            this.f3905d = "text/x-ssa";
            return this;
        }
        this.f3905d = "application/x-subrip";
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C1766h m4211b(String str) {
        this.f3904c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C1766h m4212c(String str) {
        this.f3903b = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C1766h m4213d(String str) {
        this.f3902a = str;
        return this;
    }
}
