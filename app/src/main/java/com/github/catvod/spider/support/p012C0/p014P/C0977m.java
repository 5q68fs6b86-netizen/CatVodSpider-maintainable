package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.C0.P.F;
import com.github.catvod.spider.support.C0.P.c;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.P.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0977m extends c {
    public C0977m(F f) {
        super(f);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0969D m2425e(int i) {
        m();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return m2427p(-i);
        }
        int iN = ((c) this).c;
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iN + 1;
            if (o(i3)) {
                iN = n(i3);
            }
        }
        return (InterfaceC0969D) ((c) this).b.get(iN);
    }

    /* JADX INFO: renamed from: k */
    protected final int m2426k(int i) {
        return n(i);
    }

    /* JADX INFO: renamed from: p */
    protected final InterfaceC0969D m2427p(int i) {
        int size;
        if (i != 0) {
            int i2 = ((c) this).c;
            if (i2 - i >= 0) {
                int i3 = 1;
                int i4 = i2;
                while (i3 <= i && i4 > 0) {
                    int i5 = i4 - 1;
                    o(i5);
                    if (i5 < size()) {
                        while (true) {
                            if (i5 >= 0) {
                                InterfaceC0969D interfaceC0969D = (InterfaceC0969D) ((c) this).b.get(i5);
                                if (interfaceC0969D.m2399e() != -1) {
                                    if (interfaceC0969D.getChannel() == 0) {
                                        size = i5;
                                        break;
                                    }
                                    i5--;
                                }
                            }
                            size = i5;
                            break;
                        }
                    } else {
                        size = size() - 1;
                    }
                    i3++;
                    i4 = size;
                }
                if (i4 < 0) {
                    return null;
                }
                return (InterfaceC0969D) ((c) this).b.get(i4);
            }
        }
        return null;
    }
}
