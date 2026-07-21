package com.github.catvod.spider.support.p044FM.p098x;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.x.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1939n extends C1928c {
    public C1939n(InterfaceC1921G interfaceC1921G) {
        super(interfaceC1921G);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    @Override // com.github.catvod.spider.support.p044FM.p098x.C1928c, com.github.catvod.spider.support.p044FM.p098x.InterfaceC1922H
    /* JADX INFO: renamed from: g */
    public final InterfaceC1919E mo4647g(int i) {
        m4664m();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return m4684p(-i);
        }
        int iM4665n = this.f4403c;
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iM4665n + 1;
            if (m4666o(i3)) {
                iM4665n = m4665n(i3);
            }
        }
        return (InterfaceC1919E) this.f4402b.get(iM4665n);
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.C1928c
    /* JADX INFO: renamed from: k */
    protected final int mo4662k(int i) {
        return m4665n(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX INFO: renamed from: p */
    protected final InterfaceC1919E m4684p(int i) {
        if (i != 0) {
            int size = this.f4403c;
            if (size - i >= 0) {
                for (int i2 = 1; i2 <= i && size > 0; i2++) {
                    size--;
                    m4666o(size);
                    if (size >= size()) {
                        size = size() - 1;
                    } else {
                        while (size >= 0) {
                            InterfaceC1919E interfaceC1919E = (InterfaceC1919E) this.f4402b.get(size);
                            if (interfaceC1919E.getType() == -1 || interfaceC1919E.mo4641e() == 0) {
                                break;
                            }
                            size--;
                        }
                    }
                }
                if (size < 0) {
                    return null;
                }
                return (InterfaceC1919E) this.f4402b.get(size);
            }
        }
        return null;
    }
}
