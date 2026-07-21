package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1554j extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    String f3501a;

    /* JADX INFO: renamed from: b */
    String f3502b;

    public AbstractC1554j(String str, String str2, boolean z) {
        C1377c.m3358e(str);
        C1377c.m3358e(str2);
        this.f3501a = C1286l.m3220e(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strM3219d = (!z && z2) ? C1286l.m3219d(str2) : C1286l.m3220e(str2);
        this.f3502b = strM3219d;
    }
}
