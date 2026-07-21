package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.kq */
/* JADX INFO: loaded from: classes.dex */
public class C0401kq extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        ArrayList arrayList = new ArrayList();
        c0577rd.m1617p();
        while (c0577rd.m1625x()) {
            try {
                arrayList.add(Integer.valueOf(c0577rd.m1599ac()));
            } catch (NumberFormatException e) {
                throw new C0765yc(e);
            }
        }
        c0577rd.m1621t();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        aagVar.m885p();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            aagVar.m879ac(atomicIntegerArray.get(i));
        }
        aagVar.m888s();
    }
}
