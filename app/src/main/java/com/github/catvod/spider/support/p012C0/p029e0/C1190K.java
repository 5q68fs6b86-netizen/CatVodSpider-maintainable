package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1190K extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    private final Pattern f2864a;

    public C1190K(Pattern pattern) {
        this.f2864a = pattern;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return this.f2864a.matcher(c1053l2.m2721p0()).find();
    }

    public final String toString() {
        return String.format(":matches(%s)", this.f2864a);
    }
}
