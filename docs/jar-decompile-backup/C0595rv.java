package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.rv */
/* JADX INFO: loaded from: classes.dex */
public final class C0595rv extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public static final C0188ct f1453a = new C0188ct(0, new C0595rv(3, EnumC0700vs.f1606d));

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1454d;

    /* JADX INFO: renamed from: e */
    public final Object f1455e;

    public /* synthetic */ C0595rv(int i, Object obj) {
        this.f1454d = i;
        this.f1455e = obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        switch (this.f1454d) {
            case 0:
                return new AtomicLong(((Number) ((AbstractC0406kv) this.f1455e).mo900b(c0577rd)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                c0577rd.m1617p();
                while (c0577rd.m1625x()) {
                    arrayList.add(Long.valueOf(((Number) ((AbstractC0406kv) this.f1455e).mo900b(c0577rd)).longValue()));
                }
                c0577rd.m1621t();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            case 2:
                if (c0577rd.m1607ak() != 9) {
                    return ((AbstractC0406kv) this.f1455e).mo900b(c0577rd);
                }
                c0577rd.m1603ag();
                return null;
            default:
                int iM1607ak = c0577rd.m1607ak();
                int iM1764h = AbstractC0710wb.m1764h(iM1607ak);
                if (iM1764h == 5 || iM1764h == 6) {
                    return ((EnumC0700vs) this.f1455e).mo1279a(c0577rd);
                }
                if (iM1764h == 8) {
                    c0577rd.m1603ag();
                    return null;
                }
                throw new C0765yc("Expecting number, got: " + AbstractC0710wb.m1765i(iM1607ak) + "; at path " + c0577rd.m1624w(false));
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        switch (this.f1454d) {
            case 0:
                ((AbstractC0406kv) this.f1455e).mo901c(aagVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                aagVar.m885p();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    ((AbstractC0406kv) this.f1455e).mo901c(aagVar, Long.valueOf(atomicLongArray.get(i)));
                }
                aagVar.m888s();
                break;
            case 2:
                if (obj == null) {
                    aagVar.m892w();
                } else {
                    ((AbstractC0406kv) this.f1455e).mo901c(aagVar, obj);
                }
                break;
            default:
                aagVar.m880ad((Number) obj);
                break;
        }
    }
}
