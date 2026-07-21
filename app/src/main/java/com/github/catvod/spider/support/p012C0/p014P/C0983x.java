package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b;
import com.github.catvod.spider.support.p012C0.p018T.InterfaceC1007c;
import com.github.catvod.spider.support.p012C0.p018T.InterfaceC1009f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.P.x */
/* JADX INFO: loaded from: classes.dex */
public class C0983x extends C0968C {

    /* JADX INFO: renamed from: d */
    public List<InterfaceC1006b> f2389d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0969D f2390e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0969D f2391f;

    public C0983x() {
    }

    public C0983x(C0983x c0983x, int i) {
        super(c0983x, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    @Override // com.github.catvod.spider.support.p012C0.p014P.C0968C, com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b
    /* JADX INFO: renamed from: b */
    public final InterfaceC1006b mo2389b(int i) {
        Object r0 = this.f2389d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (InterfaceC1006b) this.f2389d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    @Override // com.github.catvod.spider.support.p012C0.p014P.C0968C, com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b
    /* JADX INFO: renamed from: d */
    public final int mo2391d() {
        Object r0 = this.f2389d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: h */
    public final <T extends InterfaceC1006b> T m2448h(T t) {
        if (this.f2389d == null) {
            this.f2389d = new ArrayList();
        }
        this.f2389d.add(t);
        return t;
    }

    /* JADX INFO: renamed from: i */
    public void m2449i(InterfaceC1007c interfaceC1007c) {
    }

    /* JADX INFO: renamed from: j */
    public void m2450j(InterfaceC1007c interfaceC1007c) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    /* JADX INFO: renamed from: k */
    public final C0983x m2451k(Class cls) {
        InterfaceC1006b interfaceC1006b;
        Object r0 = this.f2389d;
        if (r0 == 0 || r0.size() <= 0) {
            interfaceC1006b = null;
        } else {
            for (InterfaceC1006b interfaceC1006b2 : this.f2389d) {
                if (cls.isInstance(interfaceC1006b2)) {
                    interfaceC1006b = (InterfaceC1006b) cls.cast(interfaceC1006b2);
                }
            }
            interfaceC1006b = null;
        }
        return (C0983x) interfaceC1006b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    /* JADX INFO: renamed from: l */
    public final <T extends C0983x> List<T> m2452l(Class<? extends T> cls) {
        Object r1 = this.f2389d;
        if (r1 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (InterfaceC1006b interfaceC1006b : r1) {
            if (cls.isInstance(interfaceC1006b)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(interfaceC1006b));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    /* JADX INFO: renamed from: m */
    public final InterfaceC1009f m2453m(int i) {
        Object r0 = this.f2389d;
        if (r0 != 0 && r0.size() > 0) {
            for (InterfaceC1006b interfaceC1006b : this.f2389d) {
                if (interfaceC1006b instanceof InterfaceC1009f) {
                    InterfaceC1009f interfaceC1009f = (InterfaceC1009f) interfaceC1006b;
                    if (interfaceC1009f.mo2537a().m2399e() == i) {
                        return interfaceC1009f;
                    }
                }
            }
        }
        return null;
    }
}
