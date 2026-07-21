package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1191L extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    private final Pattern f2865a;

    public C1191L(Pattern pattern) {
        this.f2865a = pattern;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return this.f2865a.matcher(c1053l2.m2708e0()).find();
    }

    public final String toString() {
        return String.format(":matchesOwn(%s)", this.f2865a);
    }
}
