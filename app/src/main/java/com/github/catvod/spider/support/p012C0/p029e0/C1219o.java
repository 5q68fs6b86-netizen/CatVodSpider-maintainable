package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1219o extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    String f2889a;

    /* JADX INFO: renamed from: b */
    Pattern f2890b;

    public C1219o(String str, Pattern pattern) {
        this.f2889a = C1263a.m3148d(str);
        this.f2890b = pattern;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return c1053l2.m2757o(this.f2889a) && this.f2890b.matcher(c1053l2.mo2747c(this.f2889a)).find();
    }

    public final String toString() {
        return String.format("[%s~=%s]", this.f2889a, this.f2890b.toString());
    }
}
