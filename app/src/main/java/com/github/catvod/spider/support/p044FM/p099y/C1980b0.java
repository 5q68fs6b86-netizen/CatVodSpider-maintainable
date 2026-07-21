package com.github.catvod.spider.support.p044FM.p099y;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.b0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1980b0 {
    /* JADX INFO: renamed from: a */
    public static boolean m4768a(C1987f c1987f) {
        Iterator<C1979b> it = c1987f.iterator();
        while (it.hasNext()) {
            if (!(it.next().f4522a instanceof C1986e0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Collection<BitSet> m4769b(C1987f c1987f) {
        C1978a0 c1978a0 = new C1978a0();
        for (C1979b c1979b : c1987f) {
            BitSet bitSet = (BitSet) c1978a0.get(c1979b);
            if (bitSet == null) {
                bitSet = new BitSet();
                c1978a0.put(c1979b, bitSet);
            }
            bitSet.set(c1979b.f4523b);
        }
        return c1978a0.values();
    }

    /* JADX INFO: renamed from: c */
    public static int m4770c(Collection<BitSet> collection) {
        BitSet bitSet = new BitSet();
        Iterator<BitSet> it = collection.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().nextSetBit(0));
            if (bitSet.cardinality() > 1) {
                return 0;
            }
        }
        return bitSet.nextSetBit(0);
    }
}
