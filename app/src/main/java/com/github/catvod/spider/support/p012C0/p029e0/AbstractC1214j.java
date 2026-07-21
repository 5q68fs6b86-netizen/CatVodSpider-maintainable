package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1214j extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    String f2885a;

    /* JADX INFO: renamed from: b */
    String f2886b;

    public AbstractC1214j(String str, String str2, boolean z) {
        C0966a.m2374i(str);
        C0966a.m2374i(str2);
        this.f2885a = C1263a.m3148d(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strM3147c = (!z && z2) ? C1263a.m3147c(str2) : C1263a.m3148d(str2);
        this.f2886b = strM3147c;
    }
}
