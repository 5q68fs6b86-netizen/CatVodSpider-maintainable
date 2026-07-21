package com.github.catvod.spider.support.p118c;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p118c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2191b {

    /* JADX INFO: renamed from: a */
    @SerializedName("key")
    private String f5273a;

    /* JADX INFO: renamed from: b */
    @SerializedName("name")
    private String f5274b;

    /* JADX INFO: renamed from: c */
    @SerializedName("value")
    private List<a> f5275c;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p118c.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("n")
        private String f5276a;

        /* JADX INFO: renamed from: b */
        @SerializedName("v")
        private String f5277b;

        public a(String str, String str2) {
            this.f5276a = str;
            this.f5277b = str2;
        }
    }

    public C2191b(String str, String str2, List<a> list) {
        this.f5273a = str;
        this.f5274b = str2;
        this.f5275c = list;
    }
}
