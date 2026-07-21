package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p026c0.C1042a;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1215k extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    public final int f2887a;

    /* JADX INFO: renamed from: b */
    private final String f2888b;

    public C1215k(String str, int i) {
        this.f2887a = i;
        if (i == 1) {
            this.f2888b = C1263a.m3147c(str);
        } else {
            C0966a.m2374i(str);
            this.f2888b = C1263a.m3147c(str);
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        switch (this.f2887a) {
            case 0:
                Iterator<C1042a> it = c1053l2.mo2705d().m2642f().iterator();
                while (it.hasNext()) {
                    if (C1263a.m3147c(it.next().m2631a()).startsWith(this.f2888b)) {
                        return true;
                    }
                }
                return false;
            default:
                return C1263a.m3147c(c1053l2.m2696T()).contains(this.f2888b);
        }
    }

    public final String toString() {
        switch (this.f2887a) {
            case 0:
                return String.format("[^%s]", this.f2888b);
            default:
                return String.format(":containsData(%s)", this.f2888b);
        }
    }
}
