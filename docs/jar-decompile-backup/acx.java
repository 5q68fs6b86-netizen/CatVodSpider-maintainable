package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class acx extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        boolean zM1597aa;
        BitSet bitSet = new BitSet();
        c0577rd.m1617p();
        int iM1607ak = c0577rd.m1607ak();
        int i = 0;
        while (iM1607ak != 2) {
            int iM1764h = AbstractC0710wb.m1764h(iM1607ak);
            if (iM1764h == 5 || iM1764h == 6) {
                int iM1599ac = c0577rd.m1599ac();
                if (iM1599ac == 0) {
                    zM1597aa = false;
                } else {
                    if (iM1599ac != 1) {
                        throw new C0765yc("Invalid bitset value " + iM1599ac + ", expected 0 or 1; at path " + c0577rd.m1624w(true));
                    }
                    zM1597aa = true;
                }
            } else {
                if (iM1764h != 7) {
                    throw new C0765yc("Invalid bitset value type: " + AbstractC0710wb.m1765i(iM1607ak) + "; at path " + c0577rd.m1624w(false));
                }
                zM1597aa = c0577rd.m1597aa();
            }
            if (zM1597aa) {
                bitSet.set(i);
            }
            i++;
            iM1607ak = c0577rd.m1607ak();
        }
        c0577rd.m1621t();
        return bitSet;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        aagVar.m885p();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            aagVar.m879ac(bitSet.get(i) ? 1L : 0L);
        }
        aagVar.m888s();
    }
}
