package com.github.catvod.spider.support.p002A0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.mf */
/* JADX INFO: loaded from: classes.dex */
public final class C0444mf {

    /* JADX INFO: renamed from: a */
    public final C0434lw f1218a;

    /* JADX INFO: renamed from: b */
    public final int f1219b;

    /* JADX INFO: renamed from: c */
    public final EnumC0252fc f1220c;

    /* JADX INFO: renamed from: d */
    public final HashMap f1221d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1222e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f1223f;

    /* JADX INFO: renamed from: g */
    public final int f1224g;

    /* JADX INFO: renamed from: h */
    public final int f1225h;

    /* JADX INFO: renamed from: i */
    public boolean f1226i;

    /* JADX INFO: renamed from: j */
    public final aba f1227j;

    /* JADX INFO: renamed from: k */
    public final boolean f1228k;

    /* JADX INFO: renamed from: l */
    public final EnumC0700vs f1229l;

    /* JADX INFO: renamed from: m */
    public final EnumC0700vs f1230m;

    /* JADX INFO: renamed from: n */
    public final ArrayDeque f1231n;

    public C0444mf() {
        this.f1218a = C0434lw.f1204b;
        this.f1219b = 1;
        this.f1220c = EnumC0252fc.f815b;
        this.f1221d = new HashMap();
        this.f1222e = new ArrayList();
        this.f1223f = new ArrayList();
        aba abaVar = C0493oa.f1298a;
        this.f1224g = 2;
        this.f1225h = 2;
        this.f1226i = true;
        this.f1227j = C0493oa.f1298a;
        this.f1228k = true;
        this.f1229l = C0493oa.f1300c;
        this.f1230m = C0493oa.f1301d;
        this.f1231n = new ArrayDeque();
    }

    public C0444mf(C0493oa c0493oa) {
        this.f1218a = C0434lw.f1204b;
        this.f1219b = 1;
        this.f1220c = EnumC0252fc.f815b;
        HashMap map = new HashMap();
        this.f1221d = map;
        ArrayList arrayList = new ArrayList();
        this.f1222e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1223f = arrayList2;
        aba abaVar = C0493oa.f1298a;
        this.f1224g = 2;
        this.f1225h = 2;
        this.f1226i = true;
        this.f1227j = C0493oa.f1298a;
        this.f1228k = true;
        this.f1229l = C0493oa.f1300c;
        this.f1230m = C0493oa.f1301d;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1231n = arrayDeque;
        this.f1218a = c0493oa.f1307j;
        this.f1220c = c0493oa.f1308k;
        map.putAll(c0493oa.f1309l);
        this.f1226i = c0493oa.f1310m;
        this.f1227j = c0493oa.f1311n;
        this.f1219b = c0493oa.f1320w;
        this.f1224g = c0493oa.f1313p;
        this.f1225h = c0493oa.f1314q;
        arrayList.addAll(c0493oa.f1315r);
        arrayList2.addAll(c0493oa.f1316s);
        this.f1228k = c0493oa.f1312o;
        this.f1229l = c0493oa.f1317t;
        this.f1230m = c0493oa.f1318u;
        arrayDeque.addAll(c0493oa.f1319v);
    }

    /* JADX INFO: renamed from: o */
    public final C0493oa m1424o() {
        C0730wv c0730wv;
        C0730wv c0730wv2;
        ArrayList arrayList = this.f1222e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1223f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = AbstractC0308he.f886a;
        acf acfVar = acg.f551c;
        int i = this.f1224g;
        int i2 = this.f1225h;
        if (i != 2 || i2 != 2) {
            ach achVar = new ach(acfVar, i, i2);
            C0730wv c0730wv3 = ado.f616a;
            C0730wv c0730wv4 = new C0730wv(Date.class, achVar, 0);
            if (z) {
                C0268fs c0268fs = AbstractC0308he.f888c;
                c0268fs.getClass();
                c0730wv = new C0730wv(c0268fs.f552d, new ach(c0268fs, i, i2), 0);
                C0268fs c0268fs2 = AbstractC0308he.f887b;
                c0268fs2.getClass();
                c0730wv2 = new C0730wv(c0268fs2.f552d, new ach(c0268fs2, i, i2), 0);
            } else {
                c0730wv = null;
                c0730wv2 = null;
            }
            arrayList3.add(c0730wv4);
            if (z) {
                arrayList3.add(c0730wv);
                arrayList3.add(c0730wv2);
            }
        }
        return new C0493oa(this.f1218a, this.f1220c, new HashMap(this.f1221d), this.f1226i, this.f1227j, this.f1228k, this.f1219b, this.f1224g, this.f1225h, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f1229l, this.f1230m, new ArrayList(this.f1231n));
    }

    /* JADX INFO: renamed from: p */
    public final void m1425p(Class cls, Object obj) {
        if (cls == Object.class || AbstractC0342il.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + cls);
        }
        ArrayList arrayList = this.f1222e;
        C0259fj c0259fj = new C0259fj(cls);
        arrayList.add(new C0211dp(obj, c0259fj, c0259fj.f828b == c0259fj.f827a));
        if (obj instanceof AbstractC0406kv) {
            C0730wv c0730wv = ado.f616a;
            arrayList.add(new C0730wv(new C0259fj(cls), (AbstractC0406kv) obj, 2));
        }
    }
}
