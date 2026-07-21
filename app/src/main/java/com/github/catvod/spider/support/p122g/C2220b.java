package com.github.catvod.spider.support.p122g;

import com.github.catvod.spider.support.p116a.C2137a;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p122g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2220b {

    /* JADX INFO: renamed from: a */
    @SerializedName("fileListAO")
    private a f5521a;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p122g.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("folderList")
        private List<C2219a> f5522a;

        /* JADX INFO: renamed from: b */
        @SerializedName("fileList")
        private List<C2219a> f5523b;

        /* JADX INFO: renamed from: a */
        public final List<C2219a> m6014a() {
            this.f5522a.addAll(this.f5523b);
            return this.f5522a;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("Data{folderList=");
            sbM5396a.append(this.f5522a);
            sbM5396a.append(", fileList=");
            sbM5396a.append(this.f5523b);
            sbM5396a.append('}');
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m6013a() {
        return this.f5521a;
    }
}
