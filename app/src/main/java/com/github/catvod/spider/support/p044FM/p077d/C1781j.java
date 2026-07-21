package com.github.catvod.spider.support.p044FM.p077d;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p075c.C1766h;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p077d.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1781j {

    /* JADX INFO: renamed from: a */
    @SerializedName("template_id")
    private String f3980a;

    /* JADX INFO: renamed from: b */
    @SerializedName("language")
    private String f3981b;

    /* JADX INFO: renamed from: c */
    @SerializedName("status")
    private String f3982c;

    /* JADX INFO: renamed from: d */
    @SerializedName("url")
    private String f3983d;

    /* JADX INFO: renamed from: a */
    public final C1766h m4265a() {
        C1766h c1766h = new C1766h();
        c1766h.m4213d(TextUtils.isEmpty(this.f3983d) ? "" : this.f3983d);
        c1766h.m4212c(TextUtils.isEmpty(this.f3981b) ? "" : this.f3981b);
        c1766h.m4211b(TextUtils.isEmpty(this.f3981b) ? "" : this.f3981b);
        return c1766h.m4210a("vtt");
    }

    /* JADX INFO: renamed from: b */
    public final String m4266b() {
        return TextUtils.isEmpty(this.f3980a) ? "" : this.f3980a;
    }

    /* JADX INFO: renamed from: c */
    public final String m4267c() {
        return TextUtils.isEmpty(this.f3983d) ? "" : this.f3983d;
    }
}
