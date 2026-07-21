package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p138x.InterfaceC2412b;
import com.github.catvod.spider.support.p138x.InterfaceC2413c;
import com.github.catvod.spider.support.p138x.InterfaceC2416f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.t.u */
/* JADX INFO: loaded from: classes.dex */
public class C2328u extends C2332y {

    /* JADX INFO: renamed from: d */
    public List<InterfaceC2412b> f5787d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2333z f5788e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2333z f5789f;

    public C2328u() {
    }

    public C2328u(C2328u c2328u, int i) {
        super(c2328u, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.x.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.x.b>] */
    @Override // com.github.catvod.spider.support.p134t.C2332y, com.github.catvod.spider.support.p138x.InterfaceC2412b
    /* JADX INFO: renamed from: c */
    public final InterfaceC2412b mo6288c(int i) {
        Object r0 = this.f5787d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (InterfaceC2412b) this.f5787d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.x.b>] */
    @Override // com.github.catvod.spider.support.p134t.C2332y, com.github.catvod.spider.support.p138x.InterfaceC2412b
    /* JADX INFO: renamed from: d */
    public final int mo6289d() {
        Object r0 = this.f5787d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: g */
    public final <T extends InterfaceC2412b> T m6290g(T t) {
        if (this.f5787d == null) {
            this.f5787d = new ArrayList();
        }
        this.f5787d.add(t);
        return t;
    }

    /* JADX INFO: renamed from: h */
    public void mo5283h(InterfaceC2413c interfaceC2413c) {
    }

    /* JADX INFO: renamed from: i */
    public void mo5284i(InterfaceC2413c interfaceC2413c) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.x.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.x.b>] */
    /* JADX INFO: renamed from: j */
    public final C2328u m6291j(Class cls) {
        InterfaceC2412b interfaceC2412b;
        Object r0 = this.f5787d;
        if (r0 == 0 || r0.size() <= 0) {
            interfaceC2412b = null;
        } else {
            for (InterfaceC2412b interfaceC2412b2 : this.f5787d) {
                if (cls.isInstance(interfaceC2412b2)) {
                    interfaceC2412b = (InterfaceC2412b) cls.cast(interfaceC2412b2);
                }
            }
            interfaceC2412b = null;
        }
        return (C2328u) interfaceC2412b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.x.b>] */
    /* JADX INFO: renamed from: k */
    public final <T extends C2328u> List<T> m6292k(Class<? extends T> cls) {
        Object r0 = this.f5787d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (InterfaceC2412b interfaceC2412b : r0) {
            if (cls.isInstance(interfaceC2412b)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(interfaceC2412b));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.x.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.x.b>] */
    /* JADX INFO: renamed from: l */
    public final InterfaceC2416f m6293l(int i) {
        Object r0 = this.f5787d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        for (InterfaceC2412b interfaceC2412b : this.f5787d) {
            if (interfaceC2412b instanceof InterfaceC2416f) {
                InterfaceC2416f interfaceC2416f = (InterfaceC2416f) interfaceC2412b;
                if (interfaceC2416f.mo6430b().getType() == i) {
                    return interfaceC2416f;
                }
            }
        }
        return null;
    }
}
