package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.p012C0.p014P.a;
import com.github.catvod.spider.support.p012C0.p015Q.C0991f;
import com.github.catvod.spider.support.p012C0.p016R.C0997b;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p014P.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0984y implements a {

    /* JADX INFO: renamed from: a */
    private final Collection<? extends a> f2392a;

    public C0984y(Collection<? extends a> collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.f2392a = collection;
    }

    /* JADX INFO: renamed from: a */
    public final void m2454a(AbstractC0967B<?, ?> abstractC0967B, Object obj, int i, int i2, String str, C0985z c0985z) {
        Iterator<? extends a> it = this.f2392a.iterator();
        while (it.hasNext()) {
            it.next().a(abstractC0967B, obj, i, i2, str, c0985z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2455b(AbstractC0982w abstractC0982w, C0997b c0997b, int i, int i2, BitSet bitSet, C0991f c0991f) {
        Iterator<? extends a> it = this.f2392a.iterator();
        while (it.hasNext()) {
            it.next().b(abstractC0982w, c0997b, i, i2, bitSet, c0991f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2456c(AbstractC0982w abstractC0982w, C0997b c0997b, int i, int i2, BitSet bitSet, C0991f c0991f) {
        Iterator<? extends a> it = this.f2392a.iterator();
        while (it.hasNext()) {
            it.next().c(abstractC0982w, c0997b, i, i2, bitSet, c0991f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2457d(AbstractC0982w abstractC0982w, C0997b c0997b, int i, int i2, int i3, C0991f c0991f) {
        Iterator<? extends a> it = this.f2392a.iterator();
        while (it.hasNext()) {
            it.next().d(abstractC0982w, c0997b, i, i2, i3, c0991f);
        }
    }
}
