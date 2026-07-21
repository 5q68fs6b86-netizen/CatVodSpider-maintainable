package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.jj */
/* JADX INFO: loaded from: classes.dex */
public final class C0367jj {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1037a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f1038b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C0478nm[] f1039c;

    /* JADX INFO: renamed from: d */
    public C0328hy[] f1040d;

    /* JADX INFO: renamed from: e */
    public final int f1041e;

    /* JADX INFO: renamed from: f */
    public final int f1042f;

    /* JADX INFO: renamed from: g */
    public int[] f1043g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0573r[] f1044h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f1045i;

    public C0367jj(int i, int i2) {
        new LinkedHashMap();
        this.f1045i = new ArrayList();
        this.f1041e = i;
        this.f1042f = i2;
    }

    /* JADX INFO: renamed from: j */
    public final acc m1324j(int i) {
        ArrayList arrayList = this.f1038b;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (acc) arrayList.get(i);
    }

    /* JADX INFO: renamed from: k */
    public final C0339ii m1325k(int i, C0579rf c0579rf) {
        if (i >= 0) {
            ArrayList arrayList = this.f1037a;
            if (i < arrayList.size()) {
                C0339ii c0339iiM1326l = m1326l((AbstractC0428lq) arrayList.get(i));
                if (!c0339iiM1326l.m1305f(-2)) {
                    return c0339iiM1326l;
                }
                C0339ii c0339ii = new C0339ii(new int[0]);
                c0339ii.m1304e(c0339iiM1326l);
                c0339ii.m1307h();
                while (c0579rf != null) {
                    int i2 = c0579rf.f1436f;
                    if (i2 < 0 || !c0339iiM1326l.m1305f(-2)) {
                        break;
                    }
                    c0339iiM1326l = m1326l(((abw) ((AbstractC0428lq) arrayList.get(i2)).m1406k(0)).f541f);
                    c0339ii.m1304e(c0339iiM1326l);
                    c0339ii.m1307h();
                    c0579rf = c0579rf.f1435e;
                }
                if (c0339iiM1326l.m1305f(-2)) {
                    c0339ii.m1302c(-1);
                }
                return c0339ii;
            }
        }
        throw new IllegalArgumentException("Invalid state number.");
    }

    /* JADX INFO: renamed from: l */
    public final C0339ii m1326l(AbstractC0428lq abstractC0428lq) {
        C0339ii c0339ii = abstractC0428lq.f1168i;
        if (c0339ii != null) {
            return c0339ii;
        }
        C0339ii c0339iiM1327m = m1327m(abstractC0428lq, null);
        abstractC0428lq.f1168i = c0339iiM1327m;
        c0339iiM1327m.f1009b = true;
        return c0339iiM1327m;
    }

    /* JADX INFO: renamed from: m */
    public final C0339ii m1327m(AbstractC0428lq abstractC0428lq, C0579rf c0579rf) {
        C0736xa c0736xa = new C0736xa(5, this);
        C0339ii c0339ii = new C0339ii(new int[0]);
        c0736xa.m1857e(abstractC0428lq, c0579rf != null ? AbstractC0753xr.m1875j(abstractC0428lq.f1163d, c0579rf) : null, c0339ii, new HashSet(), new BitSet());
        return c0339ii;
    }
}
