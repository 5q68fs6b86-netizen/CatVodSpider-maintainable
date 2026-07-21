package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1220p extends AbstractC1214j {
    public C1220p(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return !this.f2886b.equalsIgnoreCase(c1053l2.mo2747c(this.f2885a));
    }

    public final String toString() {
        return String.format("[%s!=%s]", this.f2885a, this.f2886b);
    }
}
