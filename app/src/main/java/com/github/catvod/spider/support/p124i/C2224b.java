package com.github.catvod.spider.support.p124i;

import com.github.catvod.spider.support.p116a.C2137a;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2224b {

    /* JADX INFO: renamed from: a */
    @SerializedName("data")
    private a f5557a;

    /* JADX INFO: renamed from: b */
    @SerializedName("metadata")
    private b f5558b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.i.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("list")
        private List<C2223a> f5559a;

        /* JADX INFO: renamed from: a */
        public final List<C2223a> m6040a() {
            List<C2223a> list = this.f5559a;
            return list == null ? Collections.emptyList() : list;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("Data{items=");
            sbM5396a.append(this.f5559a);
            sbM5396a.append('}');
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.i.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        @SerializedName("_total")
        private int f5560a;

        /* JADX INFO: renamed from: b */
        @SerializedName("_size")
        private int f5561b;

        /* JADX INFO: renamed from: c */
        @SerializedName("_page")
        private int f5562c;

        /* JADX INFO: renamed from: a */
        public final boolean m6041a() {
            return Math.ceil((double) (this.f5560a / this.f5561b)) > ((double) this.f5562c);
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("Meta{total=");
            sbM5396a.append(this.f5560a);
            sbM5396a.append(", size=");
            sbM5396a.append(this.f5561b);
            sbM5396a.append(", currentPage=");
            sbM5396a.append(this.f5562c);
            sbM5396a.append('}');
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2224b m6037c(String str) {
        return (C2224b) new Gson().fromJson(str, C2224b.class);
    }

    /* JADX INFO: renamed from: a */
    public final a m6038a() {
        return this.f5557a;
    }

    /* JADX INFO: renamed from: b */
    public final b m6039b() {
        return this.f5558b;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Resp{data=");
        sbM5396a.append(this.f5557a);
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
