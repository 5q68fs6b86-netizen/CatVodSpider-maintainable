package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.on */
/* JADX INFO: loaded from: classes.dex */
public final class C0506on extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public static final C0188ct f1345a = new C0188ct(1, EnumC0700vs.f1605c);

    /* JADX INFO: renamed from: d */
    public final C0493oa f1346d;

    /* JADX INFO: renamed from: e */
    public final EnumC0700vs f1347e;

    public C0506on(C0493oa c0493oa, EnumC0700vs enumC0700vs) {
        this.f1346d = c0493oa;
        this.f1347e = enumC0700vs;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iM1607ak = c0577rd.m1607ak();
        int iM1764h = AbstractC0710wb.m1764h(iM1607ak);
        if (iM1764h == 0) {
            c0577rd.m1617p();
            arrayList = new ArrayList();
        } else if (iM1764h != 2) {
            arrayList = null;
        } else {
            c0577rd.m1618q();
            arrayList = new C0463my(true);
        }
        if (arrayList == null) {
            return m1502f(c0577rd, iM1607ak);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c0577rd.m1625x()) {
                String strM1601ae = arrayList instanceof Map ? c0577rd.m1601ae() : null;
                int iM1607ak2 = c0577rd.m1607ak();
                int iM1764h2 = AbstractC0710wb.m1764h(iM1607ak2);
                if (iM1764h2 == 0) {
                    c0577rd.m1617p();
                    arrayList2 = new ArrayList();
                } else if (iM1764h2 != 2) {
                    arrayList2 = null;
                } else {
                    c0577rd.m1618q();
                    arrayList2 = new C0463my(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m1502f(c0577rd, iM1607ak2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strM1601ae, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c0577rd.m1621t();
                } else {
                    c0577rd.m1622u();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        if (obj == null) {
            aagVar.m892w();
            return;
        }
        Class<?> cls = obj.getClass();
        C0493oa c0493oa = this.f1346d;
        c0493oa.getClass();
        AbstractC0406kv abstractC0406kvM1471aa = c0493oa.m1471aa(new C0259fj(cls));
        if (!(abstractC0406kvM1471aa instanceof C0506on)) {
            abstractC0406kvM1471aa.mo901c(aagVar, obj);
        } else {
            aagVar.m886q();
            aagVar.m889t();
        }
    }

    /* JADX INFO: renamed from: f */
    public final Serializable m1502f(C0577rd c0577rd, int i) throws IOException {
        int iM1764h = AbstractC0710wb.m1764h(i);
        if (iM1764h == 5) {
            return c0577rd.m1605ai();
        }
        if (iM1764h == 6) {
            return this.f1347e.mo1279a(c0577rd);
        }
        if (iM1764h == 7) {
            return Boolean.valueOf(c0577rd.m1597aa());
        }
        if (iM1764h != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0710wb.m1765i(i)));
        }
        c0577rd.m1603ag();
        return null;
    }
}
