package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.d.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2206j {

    /* JADX INFO: renamed from: a */
    @SerializedName("responses")
    private List<C2206j> f5381a;

    /* JADX INFO: renamed from: b */
    @SerializedName("body")
    private a f5382b;

    /* JADX INFO: renamed from: c */
    @SerializedName("id")
    private String f5383c;

    /* JADX INFO: renamed from: d */
    @SerializedName("status")
    private int f5384d;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.d.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("domain_id")
        private String f5385a;

        /* JADX INFO: renamed from: b */
        @SerializedName("drive_id")
        private String f5386b;

        /* JADX INFO: renamed from: c */
        @SerializedName("file_id")
        private String f5387c;

        /* JADX INFO: renamed from: d */
        @SerializedName("code")
        private String f5388d;

        /* JADX INFO: renamed from: e */
        @SerializedName("message")
        private String f5389e;

        /* JADX INFO: renamed from: a */
        public final String m5910a() {
            return TextUtils.isEmpty(this.f5387c) ? "" : this.f5387c;
        }

        /* JADX INFO: renamed from: b */
        public final String m5911b() {
            return TextUtils.isEmpty(this.f5389e) ? "" : this.f5389e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m5908a() {
        a aVar = this.f5382b;
        return aVar == null ? new a() : aVar;
    }

    /* JADX INFO: renamed from: b */
    public final C2206j m5909b() {
        List<C2206j> listEmptyList = this.f5381a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return new C2206j();
        }
        List<C2206j> listEmptyList2 = this.f5381a;
        if (listEmptyList2 == null) {
            listEmptyList2 = Collections.emptyList();
        }
        return listEmptyList2.get(0);
    }
}
