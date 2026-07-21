package com.github.catvod.spider.support.p134t;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2318k extends C2310c {
    public C2318k(InterfaceC2303B interfaceC2303B) {
        super(interfaceC2303B);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p134t.z>] */
    @Override // com.github.catvod.spider.support.p134t.C2310c, com.github.catvod.spider.support.p134t.InterfaceC2304C
    /* JADX INFO: renamed from: f */
    public final InterfaceC2333z mo6222f(int i) {
        m6238l();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return m6262o(-i);
        }
        int iM6239m = this.f5732c;
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iM6239m + 1;
            if (m6240n(i3)) {
                iM6239m = m6239m(i3);
            }
        }
        return (InterfaceC2333z) this.f5731b.get(iM6239m);
    }

    @Override // com.github.catvod.spider.support.p134t.C2310c
    /* JADX INFO: renamed from: j */
    protected final int mo6236j(int i) {
        return m6239m(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p134t.z>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p134t.z>] */
    /* JADX INFO: renamed from: o */
    protected final InterfaceC2333z m6262o(int i) {
        if (i != 0) {
            int size = this.f5732c;
            if (size - i >= 0) {
                for (int i2 = 1; i2 <= i && size > 0; i2++) {
                    size--;
                    m6240n(size);
                    if (size >= size()) {
                        size = size() - 1;
                    } else {
                        while (size >= 0) {
                            InterfaceC2333z interfaceC2333z = (InterfaceC2333z) this.f5731b.get(size);
                            if (interfaceC2333z.getType() == -1 || interfaceC2333z.mo6260e() == 0) {
                                break;
                            }
                            size--;
                        }
                    }
                }
                if (size < 0) {
                    return null;
                }
                return (InterfaceC2333z) this.f5731b.get(size);
            }
        }
        return null;
    }
}
