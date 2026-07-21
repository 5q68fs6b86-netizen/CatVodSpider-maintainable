package com.github.catvod.spider.support.p135u;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.W */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2355W {
    /* JADX INFO: renamed from: a */
    public static boolean m6340a(C2363c c2363c) {
        Iterator<C2361b> it = c2363c.iterator();
        while (it.hasNext()) {
            if (!(it.next().f5846a instanceof C2358Z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Collection<BitSet> m6341b(C2363c c2363c) {
        C2354V c2354v = new C2354V();
        for (C2361b c2361b : c2363c) {
            BitSet bitSet = (BitSet) c2354v.get(c2361b);
            if (bitSet == null) {
                bitSet = new BitSet();
                c2354v.put(c2361b, bitSet);
            }
            bitSet.set(c2361b.f5847b);
        }
        return c2354v.values();
    }

    /* JADX INFO: renamed from: c */
    public static int m6342c(Collection<BitSet> collection) {
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
