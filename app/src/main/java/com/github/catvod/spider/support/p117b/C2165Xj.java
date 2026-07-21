package com.github.catvod.spider.support.p117b;

import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p128m.C2256I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.Xj */
/* JADX INFO: loaded from: classes.dex */
public class C2165Xj {

    /* JADX INFO: renamed from: a */
    @SerializedName("share_status")
    private String f5186a;

    /* JADX INFO: renamed from: b */
    @SerializedName("share_status_text")
    private String f5187b;

    /* JADX INFO: renamed from: c */
    @SerializedName("next_page_token")
    private String f5188c;

    /* JADX INFO: renamed from: b */
    public final void m5653b() {
        if (this.f5186a.equalsIgnoreCase("OK")) {
            return;
        }
        C0082a.m820b(new Runnable() { // from class: com.github.catvod.spider.support.p117b.X.g
            @Override // java.lang.Runnable
            public final void run() {
                C2256I.m6113i(((C2165Xj) this).f5187b);
            }
        });
    }
}
