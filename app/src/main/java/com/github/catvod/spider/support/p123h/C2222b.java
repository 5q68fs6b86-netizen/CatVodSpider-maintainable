package com.github.catvod.spider.support.p123h;

import com.github.catvod.spider.support.p116a.C2137a;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p123h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2222b {

    /* JADX INFO: renamed from: a */
    @SerializedName("data")
    private a f5541a;

    /* JADX INFO: renamed from: b */
    @SerializedName("message")
    private String f5542b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p123h.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("InfoList")
        private List<C2221a> f5543a;

        /* JADX INFO: renamed from: b */
        @SerializedName("Next")
        private String f5544b;

        /* JADX INFO: renamed from: a */
        public final List<C2221a> m6025a() {
            return this.f5543a;
        }

        /* JADX INFO: renamed from: b */
        public final String m6026b() {
            return this.f5544b;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("Data{InfoList=");
            sbM5396a.append(this.f5543a);
            sbM5396a.append(", Next='");
            sbM5396a.append(this.f5544b);
            sbM5396a.append('\'');
            sbM5396a.append('}');
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m6023a() {
        return this.f5541a;
    }

    /* JADX INFO: renamed from: b */
    public final String m6024b() {
        return this.f5542b;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Resp{data=");
        sbM5396a.append(this.f5541a);
        sbM5396a.append(", message='");
        sbM5396a.append(this.f5542b);
        sbM5396a.append('\'');
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
