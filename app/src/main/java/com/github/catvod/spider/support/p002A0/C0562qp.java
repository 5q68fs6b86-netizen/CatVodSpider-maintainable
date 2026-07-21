package com.github.catvod.spider.support.p002A0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qp */
/* JADX INFO: loaded from: classes.dex */
public final class C0562qp extends AbstractC0250fa {

    /* JADX INFO: renamed from: a */
    public static final abb f1410a = new abb(new C0605se(7));

    /* JADX INFO: renamed from: i */
    public final boolean f1411i;

    public C0562qp(AbstractC0213dr abstractC0213dr) {
        boolean z;
        super(abstractC0213dr);
        if (abstractC0213dr instanceof AbstractC0637tj) {
            for (AbstractC0213dr abstractC0213dr2 : ((AbstractC0637tj) abstractC0213dr).f1535a) {
                if ((abstractC0213dr2 instanceof C0811zv) || (abstractC0213dr2 instanceof C0480no)) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.f1411i = z;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        return ((AbstractC0213dr) this.f813f).mo1019b() * 10;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        boolean z = this.f1411i;
        AbstractC0213dr abstractC0213dr = (AbstractC0213dr) this.f813f;
        if (z) {
            C0226ed c0226ed3 = (C0226ed) c0226ed2.f846ap;
            for (C0226ed c0226edM1161ac = c0226ed3 != null ? c0226ed3.m1161ac() : c0226ed2; c0226edM1161ac != null; c0226edM1161ac = c0226edM1161ac.m1164af()) {
                if (c0226edM1161ac != c0226ed2 && abstractC0213dr.mo1020c(c0226ed2, c0226edM1161ac)) {
                    return true;
                }
            }
        }
        abb abbVar = f1410a;
        aau aauVar = (aau) abbVar.m910g();
        if (aauVar.f460f.isInstance(c0226ed2)) {
            aauVar.f456b = c0226ed2;
        }
        aauVar.f457c = c0226ed2;
        aauVar.f458d = c0226ed2;
        aauVar.f455a = c0226ed2;
        aauVar.f459e = (C0226ed) c0226ed2.f846ap;
        while (aauVar.hasNext()) {
            try {
                aauVar.m903g();
                AbstractC0272fw abstractC0272fw = aauVar.f456b;
                if (abstractC0272fw == null) {
                    throw new NoSuchElementException();
                }
                aauVar.f458d = aauVar.f457c;
                aauVar.f457c = abstractC0272fw;
                aauVar.f459e = abstractC0272fw.mo1178w();
                aauVar.f456b = null;
                C0226ed c0226ed4 = (C0226ed) abstractC0272fw;
                if (c0226ed4 != c0226ed2 && abstractC0213dr.mo1020c(c0226ed2, c0226ed4)) {
                    abbVar.m912i(aauVar);
                    return true;
                }
            } catch (Throwable th) {
                abbVar.m912i(aauVar);
                throw th;
            }
        }
        abbVar.m912i(aauVar);
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", (AbstractC0213dr) this.f813f);
    }
}
