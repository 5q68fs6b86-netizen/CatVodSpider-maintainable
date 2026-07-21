package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b;
import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1293c;
import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1296f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.x.y */
/* JADX INFO: loaded from: classes.dex */
public class C1950y extends C1918D {

    /* JADX INFO: renamed from: d */
    public List<InterfaceC1292b> f4458d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1919E f4459e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1919E f4460f;

    public C1950y() {
    }

    public C1950y(C1950y c1950y, int i) {
        super(c1950y, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    @Override // com.github.catvod.spider.support.p044FM.p098x.C1918D, com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b
    /* JADX INFO: renamed from: c */
    public final InterfaceC1292b mo3233c(int i) {
        ?? r0 = this.f4458d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (InterfaceC1292b) this.f4458d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    @Override // com.github.catvod.spider.support.p044FM.p098x.C1918D, com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b
    /* JADX INFO: renamed from: d */
    public final int mo3234d() {
        ?? r0 = this.f4458d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: g */
    public final <T extends InterfaceC1292b> T m4709g(T t) {
        if (this.f4458d == null) {
            this.f4458d = new ArrayList();
        }
        this.f4458d.add(t);
        return t;
    }

    /* JADX INFO: renamed from: h */
    public void mo3831h(InterfaceC1293c interfaceC1293c) {
    }

    /* JADX INFO: renamed from: i */
    public void mo3832i(InterfaceC1293c interfaceC1293c) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    /* JADX INFO: renamed from: j */
    public final C1950y m4710j(Class cls) {
        InterfaceC1292b interfaceC1292b;
        ?? r0 = this.f4458d;
        if (r0 == 0 || r0.size() <= 0) {
            interfaceC1292b = null;
        } else {
            for (InterfaceC1292b interfaceC1292b2 : this.f4458d) {
                if (cls.isInstance(interfaceC1292b2)) {
                    interfaceC1292b = (InterfaceC1292b) cls.cast(interfaceC1292b2);
                }
            }
            interfaceC1292b = null;
        }
        return (C1950y) interfaceC1292b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    /* JADX INFO: renamed from: k */
    public final <T extends C1950y> List<T> m4711k(Class<? extends T> cls) {
        ?? r0 = this.f4458d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (InterfaceC1292b interfaceC1292b : r0) {
            if (cls.isInstance(interfaceC1292b)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(interfaceC1292b));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    /* JADX INFO: renamed from: l */
    public final InterfaceC1296f m4712l(int i) {
        ?? r0 = this.f4458d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        for (InterfaceC1292b interfaceC1292b : this.f4458d) {
            if (interfaceC1292b instanceof InterfaceC1296f) {
                InterfaceC1296f interfaceC1296f = (InterfaceC1296f) interfaceC1292b;
                if (interfaceC1296f.mo3239a().getType() == i) {
                    return interfaceC1296f;
                }
            }
        }
        return null;
    }
}
