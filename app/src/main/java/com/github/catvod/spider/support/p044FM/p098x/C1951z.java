package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p099y.C1987f;
import com.github.catvod.spider.support.p044FM.p100z.C2025b;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1951z implements InterfaceC1926a {

    /* JADX INFO: renamed from: a */
    private final Collection<? extends InterfaceC1926a> f4461a;

    public C1951z(Collection<? extends InterfaceC1926a> collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.f4461a = collection;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1926a
    /* JADX INFO: renamed from: a */
    public final void mo4652a(AbstractC1949x abstractC1949x, C2025b c2025b, int i, int i2, BitSet bitSet, C1987f c1987f) {
        Iterator<? extends InterfaceC1926a> it = this.f4461a.iterator();
        while (it.hasNext()) {
            it.next().mo4652a(abstractC1949x, c2025b, i, i2, bitSet, c1987f);
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1926a
    /* JADX INFO: renamed from: b */
    public final void mo4653b(AbstractC1917C<?, ?> abstractC1917C, Object obj, int i, int i2, String str, C1915A c1915a) {
        Iterator<? extends InterfaceC1926a> it = this.f4461a.iterator();
        while (it.hasNext()) {
            it.next().mo4653b(abstractC1917C, obj, i, i2, str, c1915a);
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1926a
    /* JADX INFO: renamed from: c */
    public final void mo4654c(AbstractC1949x abstractC1949x, C2025b c2025b, int i, int i2, int i3, C1987f c1987f) {
        Iterator<? extends InterfaceC1926a> it = this.f4461a.iterator();
        while (it.hasNext()) {
            it.next().mo4654c(abstractC1949x, c2025b, i, i2, i3, c1987f);
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1926a
    /* JADX INFO: renamed from: d */
    public final void mo4655d(AbstractC1949x abstractC1949x, C2025b c2025b, int i, int i2, BitSet bitSet, C1987f c1987f) {
        Iterator<? extends InterfaceC1926a> it = this.f4461a.iterator();
        while (it.hasNext()) {
            it.next().mo4655d(abstractC1949x, c2025b, i, i2, bitSet, c1987f);
        }
    }
}
