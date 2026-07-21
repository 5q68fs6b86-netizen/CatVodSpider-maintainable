package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p137w.C2407i;
import java.util.BitSet;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2389u {

    /* JADX INFO: renamed from: a */
    public final C2359a f5900a;

    public C2389u(C2359a c2359a) {
        this.f5900a = c2359a;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX INFO: renamed from: a */
    protected final void m6376a(AbstractC2375i abstractC2375i, AbstractC2351S abstractC2351S, C2407i c2407i, Set set, BitSet bitSet) {
        if (set.add(new C2361b(abstractC2375i, 0, abstractC2351S, AbstractC2362b0.f5851a))) {
            if (abstractC2375i == null) {
                if (abstractC2351S == null) {
                    c2407i.m6416a(-2);
                    return;
                } else if (abstractC2351S.mo6335f()) {
                    c2407i.m6416a(-1);
                    return;
                }
            }
            if (abstractC2375i instanceof C2358Z) {
                if (abstractC2351S == null) {
                    c2407i.m6416a(-2);
                    return;
                }
                if (abstractC2351S.mo6335f()) {
                    c2407i.m6416a(-1);
                    return;
                }
                if (abstractC2351S != AbstractC2351S.f5827b) {
                    boolean z = bitSet.get(abstractC2375i.f5885c);
                    try {
                        bitSet.clear(abstractC2375i.f5885c);
                        for (int i = 0; i < abstractC2351S.mo6336h(); i++) {
                            m6376a((AbstractC2375i) this.f5900a.f5835a.get(abstractC2351S.mo6333d(i)), abstractC2351S.mo6332c(i), c2407i, set, bitSet);
                        }
                        if (z) {
                            bitSet.set(abstractC2375i.f5885c);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (z) {
                            bitSet.set(abstractC2375i.f5885c);
                        }
                        throw th;
                    }
                }
            }
            int iM6373b = abstractC2375i.m6373b();
            for (int i2 = 0; i2 < iM6373b; i2++) {
                AbstractC2376i0 abstractC2376i0M6374d = abstractC2375i.m6374d(i2);
                if (abstractC2376i0M6374d.getClass() == C2360a0.class) {
                    C2360a0 c2360a0 = (C2360a0) abstractC2376i0M6374d;
                    if (bitSet.get(c2360a0.f5889a.f5885c)) {
                        continue;
                    } else {
                        C2366d0 c2366d0M6364i = C2366d0.m6364i(abstractC2351S, c2360a0.f5845c.f5884b);
                        try {
                            bitSet.set(((C2360a0) abstractC2376i0M6374d).f5889a.f5885c);
                            m6376a(abstractC2376i0M6374d.f5889a, c2366d0M6364i, c2407i, set, bitSet);
                            bitSet.clear(c2360a0.f5889a.f5885c);
                        } catch (Throwable th2) {
                            bitSet.clear(c2360a0.f5889a.f5885c);
                            throw th2;
                        }
                    }
                } else if ((abstractC2376i0M6374d instanceof AbstractC2377j) || abstractC2376i0M6374d.mo6328b()) {
                    m6376a(abstractC2376i0M6374d.f5889a, abstractC2351S, c2407i, set, bitSet);
                } else if (abstractC2376i0M6374d.getClass() == C2378j0.class) {
                    c2407i.m6418c(C2407i.m6414g(1, this.f5900a.f5840f));
                } else {
                    C2407i c2407iMo6343c = abstractC2376i0M6374d.mo6343c();
                    if (c2407iMo6343c != null) {
                        if (abstractC2376i0M6374d instanceof C2344K) {
                            C2407i c2407iM6414g = C2407i.m6414g(1, this.f5900a.f5840f);
                            if (c2407iM6414g.m6421f()) {
                                c2407iMo6343c = null;
                            } else if (c2407iMo6343c.m6421f()) {
                                c2407iMo6343c = new C2407i(new int[0]);
                                c2407iMo6343c.m6418c(c2407iM6414g);
                            } else {
                                c2407iMo6343c = C2407i.m6415k(c2407iM6414g, c2407iMo6343c);
                            }
                        }
                        c2407i.m6418c(c2407iMo6343c);
                    }
                }
            }
        }
    }
}
