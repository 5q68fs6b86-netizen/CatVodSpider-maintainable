package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p135u.C2363c;
import com.github.catvod.spider.support.p136v.C2396b;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2329v implements InterfaceC2308a {

    /* JADX INFO: renamed from: a */
    private final Collection<? extends InterfaceC2308a> f5790a;

    public C2329v(Collection<? extends InterfaceC2308a> collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.f5790a = collection;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2308a
    /* JADX INFO: renamed from: a */
    public final void mo6227a(AbstractC2327t abstractC2327t, C2396b c2396b, int i, int i2, BitSet bitSet, C2363c c2363c) {
        Iterator<? extends InterfaceC2308a> it = this.f5790a.iterator();
        while (it.hasNext()) {
            it.next().mo6227a(abstractC2327t, c2396b, i, i2, bitSet, c2363c);
        }
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2308a
    /* JADX INFO: renamed from: b */
    public final void mo6228b(AbstractC2327t abstractC2327t, C2396b c2396b, int i, int i2, BitSet bitSet, C2363c c2363c) {
        Iterator<? extends InterfaceC2308a> it = this.f5790a.iterator();
        while (it.hasNext()) {
            it.next().mo6228b(abstractC2327t, c2396b, i, i2, bitSet, c2363c);
        }
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2308a
    /* JADX INFO: renamed from: c */
    public final void mo6229c(AbstractC2327t abstractC2327t, C2396b c2396b, int i, int i2, int i3, C2363c c2363c) {
        Iterator<? extends InterfaceC2308a> it = this.f5790a.iterator();
        while (it.hasNext()) {
            it.next().mo6229c(abstractC2327t, c2396b, i, i2, i3, c2363c);
        }
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2308a
    /* JADX INFO: renamed from: d */
    public final void mo6230d(AbstractC2331x<?, ?> abstractC2331x, Object obj, int i, int i2, String str, C2330w c2330w) {
        Iterator<? extends InterfaceC2308a> it = this.f5790a.iterator();
        while (it.hasNext()) {
            it.next().mo6230d(abstractC2331x, obj, i, i2, str, c2330w);
        }
    }
}
