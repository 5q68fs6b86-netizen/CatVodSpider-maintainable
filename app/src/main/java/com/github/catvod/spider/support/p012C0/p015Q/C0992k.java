package com.github.catvod.spider.support.p012C0.p015Q;

import com.github.catvod.spider.support.C0.Q.C;
import com.github.catvod.spider.support.C0.Q.E;
import com.github.catvod.spider.support.C0.Q.F;
import com.github.catvod.spider.support.C0.Q.G;
import com.github.catvod.spider.support.C0.Q.I;
import com.github.catvod.spider.support.C0.Q.J;
import com.github.catvod.spider.support.C0.Q.K;
import com.github.catvod.spider.support.C0.Q.L;
import com.github.catvod.spider.support.C0.Q.M;
import com.github.catvod.spider.support.C0.Q.N;
import com.github.catvod.spider.support.C0.Q.O;
import com.github.catvod.spider.support.C0.Q.P;
import com.github.catvod.spider.support.C0.Q.T;
import com.github.catvod.spider.support.C0.Q.U;
import com.github.catvod.spider.support.C0.Q.V;
import com.github.catvod.spider.support.C0.Q.W;
import com.github.catvod.spider.support.C0.Q.c0;
import com.github.catvod.spider.support.C0.Q.d0;
import com.github.catvod.spider.support.C0.Q.e0;
import com.github.catvod.spider.support.C0.Q.f0;
import com.github.catvod.spider.support.C0.Q.g;
import com.github.catvod.spider.support.C0.Q.h;
import com.github.catvod.spider.support.C0.Q.i;
import com.github.catvod.spider.support.C0.Q.j;
import com.github.catvod.spider.support.C0.Q.m;
import com.github.catvod.spider.support.C0.Q.m0;
import com.github.catvod.spider.support.C0.Q.o;
import com.github.catvod.spider.support.C0.Q.o0;
import com.github.catvod.spider.support.C0.Q.q;
import com.github.catvod.spider.support.C0.Q.q0;
import com.github.catvod.spider.support.C0.Q.r;
import com.github.catvod.spider.support.C0.Q.r0;
import com.github.catvod.spider.support.C0.Q.s;
import com.github.catvod.spider.support.C0.Q.t;
import com.github.catvod.spider.support.C0.Q.t0;
import com.github.catvod.spider.support.C0.Q.u;
import com.github.catvod.spider.support.C0.Q.u0;
import com.github.catvod.spider.support.C0.Q.x;
import com.github.catvod.spider.support.p012C0.p017S.C1003j;
import com.github.catvod.spider.support.p012C0.p017S.C1004l;
import com.github.catvod.spider.support.p012C0.p037l.C1257a;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.Q.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0992k {

    /* JADX INFO: renamed from: b */
    private static final UUID f2434b;

    /* JADX INFO: renamed from: c */
    private static final UUID f2435c;

    /* JADX INFO: renamed from: d */
    private static final UUID f2436d;

    /* JADX INFO: renamed from: e */
    private static final List<UUID> f2437e;

    /* JADX INFO: renamed from: f */
    public static final UUID f2438f;

    /* JADX INFO: renamed from: a */
    private final g f2439a = g.a();

    static {
        UUID uuidFromString = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");
        UUID uuidFromString2 = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");
        f2434b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");
        f2435c = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");
        f2436d = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        f2437e = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        f2438f = uuidFromString4;
    }

    /* JADX INFO: renamed from: c */
    private int m2501c(char[] cArr, int i, List<C1003j> list, j jVar) {
        int size = i + 1;
        char c = cArr[i];
        for (int i2 = 0; i2 < c; i2++) {
            char c2 = cArr[size];
            int i3 = size + 1;
            C1003j c1003j = new C1003j(new int[0]);
            list.add(c1003j);
            if (cArr[i3] != 0) {
                c1003j.m2523a(-1);
            }
            size = i3 + 1;
            for (int i4 = 0; i4 < c2; i4++) {
                int iA = jVar.a(cArr, size);
                int size2 = size + jVar.size();
                int iA2 = jVar.a(cArr, size2);
                size = size2 + jVar.size();
                c1003j.m2524b(iA, iA2);
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX INFO: renamed from: d */
    protected static boolean m2502d(UUID uuid, UUID uuid2) {
        Object r1 = f2437e;
        int iIndexOf = r1.indexOf(uuid);
        return iIndexOf >= 0 && r1.indexOf(uuid2) >= iIndexOf;
    }

    /* JADX INFO: renamed from: e */
    protected static long m2503e(char[] cArr, int i) {
        int i2 = i + 2;
        return ((cArr[i] | (cArr[i + 1] << 16)) & 4294967295L) | (((long) ((cArr[i2 + 1] << 16) | cArr[i2])) << 32);
    }

    /* JADX INFO: renamed from: a */
    protected final void m2504a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x0570  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.r0>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.v>] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX INFO: renamed from: b */
    public final C0990a m2505b(char[] cArr) {
        int i;
        int i2;
        J f;
        c0 xVar;
        int i3;
        int i4;
        O o;
        O sVar;
        char[] cArr2 = (char[]) cArr.clone();
        for (int i5 = 1; i5 < cArr2.length; i5++) {
            cArr2[i5] = (char) (cArr2[i5] - 2);
        }
        char c = cArr2[0];
        if (c != 3) {
            throw new UnsupportedOperationException(new InvalidClassException(C0990a.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(c), 3)));
        }
        UUID uuid = new UUID(m2503e(cArr2, 5), m2503e(cArr2, 1));
        if (!f2437e.contains(uuid)) {
            throw new UnsupportedOperationException(new InvalidClassException(C0990a.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with UUID %s (expected %s or a legacy UUID).", uuid, f2438f)));
        }
        boolean zM2502d = m2502d(f2434b, uuid);
        boolean zM2502d2 = m2502d(f2435c, uuid);
        C0990a c0990a = new C0990a(C1257a.m3132b(2)[cArr2[9]], cArr2[10]);
        ArrayList<C1004l> arrayList = new ArrayList();
        ArrayList<C1004l> arrayList2 = new ArrayList();
        char c2 = cArr2[11];
        int i6 = 0;
        int i7 = 12;
        while (i6 < c2) {
            int i8 = i7 + 1;
            char c3 = cArr2[i7];
            if (c3 == 0) {
                c0990a.m2493a(null);
            } else {
                int i9 = i8 + 1;
                char c4 = cArr2[i8];
                char c5 = c4 == 65535 ? (char) 65535 : c4;
                switch (c3) {
                    case 0:
                        o = null;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case 1:
                        sVar = new s();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case 2:
                        sVar = new d0();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case 3:
                        sVar = new r();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case 4:
                        sVar = new T();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case 5:
                        sVar = new o0();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case 6:
                        sVar = new r0();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case 7:
                        sVar = new e0();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case '\b':
                        sVar = new t();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case '\t':
                        sVar = new q0();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case '\n':
                        sVar = new C0995p0();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case 11:
                        sVar = new U();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    case '\f':
                        sVar = new O();
                        ((m) sVar).c = c5;
                        o = sVar;
                        if (c3 == '\f') {
                            arrayList.add(new C1004l(o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else if (o instanceof u) {
                            arrayList2.add(new C1004l((u) o, Integer.valueOf(cArr2[i9])));
                            i8 = i9 + 1;
                        } else {
                            i8 = i9;
                        }
                        c0990a.m2493a(o);
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(c3)));
                }
            }
            i6++;
            i7 = i8;
        }
        for (C1004l c1004l : arrayList) {
            ((O) c1004l.f2469c).g = (m) c0990a.f2416a.get(((Integer) c1004l.f2470d).intValue());
        }
        for (C1004l c1004l2 : arrayList2) {
            ((u) c1004l2.f2469c).i = (t) c0990a.f2416a.get(((Integer) c1004l2.f2470d).intValue());
        }
        int i10 = i7 + 1;
        char c6 = cArr2[i7];
        for (int i11 = 0; i11 < c6; i11++) {
            ((AbstractC0996v) c0990a.f2416a.get(cArr2[i10])).f2447h = true;
            i10++;
        }
        if (zM2502d) {
            char c7 = cArr2[i10];
            int i12 = i10 + 1;
            for (int i13 = 0; i13 < c7; i13++) {
                ((d0) c0990a.f2416a.get(cArr2[i12])).h = true;
                i12++;
            }
            i = i12;
        } else {
            i = i10;
        }
        int i14 = i + 1;
        char c8 = cArr2[i];
        if (c0990a.f2420e == 1) {
            c0990a.f2422g = new int[c8];
        }
        c0990a.f2418c = new d0[c8];
        int i15 = 0;
        int i16 = i14;
        while (i15 < c8) {
            int i17 = i16 + 1;
            c0990a.f2418c[i15] = (d0) c0990a.f2416a.get(cArr2[i16]);
            if (c0990a.f2420e == 1) {
                int i18 = i17 + 1;
                char c9 = cArr2[i17];
                if (c9 == 65535) {
                    i4 = c9;
                    i4 = -1;
                }
                i4 = c9;
                c0990a.f2422g[i15] = i4;
                if (m2502d(f2435c, uuid)) {
                    i3 = i18;
                } else {
                    i3 = i18 + 1;
                    char c10 = cArr2[i18];
                }
            } else {
                i3 = i17;
            }
            i15++;
            i16 = i3;
        }
        c0990a.f2419d = new e0[c8];
        for (e0 e0Var : c0990a.f2416a) {
            if (e0Var instanceof e0) {
                e0 e0Var2 = e0Var;
                e0[] e0VarArr = c0990a.f2419d;
                int i19 = ((m) e0Var).c;
                e0VarArr[i19] = e0Var2;
                c0990a.f2418c[i19].g = e0Var2;
            }
        }
        int i20 = i16 + 1;
        char c11 = cArr2[i16];
        for (int i21 = 0; i21 < c11; i21++) {
            c0990a.f2424i.add((r0) c0990a.f2416a.get(cArr2[i20]));
            i20++;
        }
        ArrayList arrayList3 = new ArrayList();
        int iM2501c = m2501c(cArr2, i20, arrayList3, new h());
        if (m2502d(f2436d, uuid)) {
            iM2501c = m2501c(cArr2, iM2501c, arrayList3, new i());
        }
        char c12 = cArr2[iM2501c];
        int i22 = 0;
        int i23 = iM2501c + 1;
        while (i22 < c12) {
            char c13 = cArr2[i23];
            char c14 = cArr2[i23 + 1];
            char c15 = cArr2[i23 + 2];
            char c16 = cArr2[i23 + 3];
            char c17 = cArr2[i23 + 4];
            char c18 = cArr2[i23 + 5];
            m mVar = (m) c0990a.f2416a.get(c14);
            switch (c15) {
                case 1:
                    xVar = new x(mVar);
                    break;
                case 2:
                    xVar = c18 != 0 ? new c0(mVar, -1, c17) : new c0(mVar, c16, c17);
                    break;
                case 3:
                    xVar = new f0((d0) c0990a.f2416a.get(c16), c18, mVar);
                    break;
                case 4:
                    xVar = new W(mVar, c16, c17, c18 != 0);
                    break;
                case 5:
                    xVar = c18 != 0 ? new q(mVar, -1) : new q(mVar, c16);
                    break;
                case 6:
                    xVar = new o(mVar, c16, c17);
                    break;
                case 7:
                    xVar = new m0(mVar, (C1003j) arrayList3.get(c16));
                    break;
                case '\b':
                    xVar = new P(mVar, (C1003j) arrayList3.get(c16));
                    break;
                case '\t':
                    xVar = new u0(mVar);
                    break;
                case '\n':
                    xVar = new V(mVar, c16);
                    break;
                default:
                    throw new IllegalArgumentException("The specified transition type is not valid.");
            }
            ((m) c0990a.f2416a.get(c13)).a(xVar);
            i22++;
            i23 += 6;
        }
        for (m mVar2 : c0990a.f2416a) {
            int i24 = 0;
            while (true) {
                int i25 = i24;
                if (i25 < mVar2.b()) {
                    f0 f0VarD = mVar2.d(i25);
                    if (f0VarD instanceof f0) {
                        f0 f0Var = f0VarD;
                        d0[] d0VarArr = c0990a.f2418c;
                        int i26 = ((t0) f0Var).a.c;
                        if (!d0VarArr[i26].h || f0Var.b != 0) {
                            i26 = -1;
                        }
                        c0990a.f2419d[((t0) f0Var).a.c].a(new x(f0Var.c, i26));
                    }
                    i24 = i25 + 1;
                }
            }
        }
        for (u uVar : c0990a.f2416a) {
            if (uVar instanceof u) {
                u uVar2 = uVar;
                t tVar = uVar2.i;
                if (tVar == null) {
                    throw new IllegalStateException();
                }
                if (tVar.g != null) {
                    throw new IllegalStateException();
                }
                tVar.g = uVar2;
            }
            if (uVar instanceof U) {
                U u = (U) uVar;
                int i27 = 0;
                while (true) {
                    int i28 = i27;
                    if (i28 < u.b()) {
                        T t = u.d(i28).a;
                        if (t instanceof T) {
                            t.j = u;
                        }
                        i27 = i28 + 1;
                    }
                }
            } else if (uVar instanceof q0) {
                q0 q0Var = (q0) uVar;
                int i29 = 0;
                while (true) {
                    int i30 = i29;
                    if (i30 < q0Var.b()) {
                        m mVar3 = q0Var.d(i30).a;
                        if (mVar3 instanceof C0995p0) {
                            ((C0995p0) mVar3).f2444i = q0Var;
                        }
                        i29 = i30 + 1;
                    }
                }
            }
        }
        int i31 = i23 + 1;
        char c19 = cArr2[i23];
        for (int i32 = 1; i32 <= c19; i32++) {
            AbstractC0996v abstractC0996v = (AbstractC0996v) c0990a.f2416a.get(cArr2[i31]);
            c0990a.f2417b.add(abstractC0996v);
            abstractC0996v.f2446g = i32 - 1;
            i31++;
        }
        if (c0990a.f2420e == 1) {
            if (zM2502d2) {
                int i33 = i31 + 1;
                c0990a.f2423h = new C[cArr2[i31]];
                int i34 = 0;
                while (i34 < c0990a.f2423h.length) {
                    int i35 = i33 + 1;
                    Enum r5 = E.values()[cArr2[i33]];
                    int i36 = i35 + 1;
                    char c20 = cArr2[i35];
                    if (c20 == 65535) {
                        i2 = c20;
                        i2 = -1;
                    }
                    i2 = c20;
                    char c21 = cArr2[i36];
                    int i37 = c21;
                    if (c21 == 65535) {
                        i37 = -1;
                    }
                    switch (r5.ordinal()) {
                        case 0:
                            f = new F(i2);
                            break;
                        case 1:
                            f = new G(i2, i37);
                            break;
                        case 2:
                            f = new I(i2);
                            break;
                        case 3:
                            f = J.a;
                            break;
                        case 4:
                            f = K.a;
                            break;
                        case 5:
                            f = new L(i2);
                            break;
                        case 6:
                            f = M.a;
                            break;
                        case 7:
                            f = new N(i2);
                            break;
                        default:
                            throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified lexer action type %d is not valid.", r5));
                    }
                    c0990a.f2423h[i34] = f;
                    i34++;
                    i33 = i36 + 1;
                }
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (m mVar4 : c0990a.f2416a) {
                    int i38 = 0;
                    while (true) {
                        int i39 = i38;
                        if (i39 < mVar4.b()) {
                            o oVarD = mVar4.d(i39);
                            if (oVarD instanceof o) {
                                o oVar = oVarD;
                                int i40 = oVar.b;
                                G g = new G(i40, oVar.c);
                                mVar4.e.set(i39, new o(((t0) oVarD).a, i40, arrayList4.size()));
                                arrayList4.add(g);
                            }
                            i38 = i39 + 1;
                        }
                    }
                }
                c0990a.f2423h = (C[]) arrayList4.toArray(new C[arrayList4.size()]);
            }
        }
        for (m mVar5 : c0990a.f2416a) {
            if ((mVar5 instanceof C0995p0) && c0990a.f2418c[mVar5.c].h) {
                m mVar6 = mVar5.d(mVar5.b() - 1).a;
                if ((mVar6 instanceof O) && mVar6.d && (mVar6.d(0).a instanceof e0)) {
                    ((C0995p0) mVar5).f2445j = true;
                }
            }
        }
        this.f2439a.getClass();
        m2506f(c0990a);
        this.f2439a.getClass();
        return c0990a;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX INFO: renamed from: f */
    protected final void m2506f(C0990a c0990a) {
        boolean z;
        boolean z2;
        for (T t : c0990a.f2416a) {
            if (t != null) {
                m2504a(((m) t).d || t.b() <= 1);
                if (t instanceof T) {
                    m2504a(t.j != null);
                }
                if (t instanceof C0995p0) {
                    C0995p0 c0995p0 = (C0995p0) t;
                    m2504a(c0995p0.f2444i != null);
                    m2504a(c0995p0.b() == 2);
                    if (c0995p0.d(0).a instanceof o0) {
                        m2504a(c0995p0.d(1).a instanceof O);
                        z2 = !c0995p0.f2447h;
                    } else {
                        if (!(c0995p0.d(0).a instanceof O)) {
                            throw new IllegalStateException();
                        }
                        m2504a(c0995p0.d(1).a instanceof o0);
                        z2 = c0995p0.f2447h;
                    }
                    m2504a(z2);
                }
                if (t instanceof q0) {
                    m2504a(t.b() == 1);
                    m2504a(t.d(0).a instanceof C0995p0);
                }
                if (t instanceof O) {
                    m2504a(((O) t).g != null);
                }
                if (t instanceof d0) {
                    m2504a(((d0) t).g != null);
                }
                if (t instanceof u) {
                    m2504a(((u) t).i != null);
                }
                if (t instanceof t) {
                    m2504a(((t) t).g != null);
                }
                if (t instanceof AbstractC0996v) {
                    AbstractC0996v abstractC0996v = (AbstractC0996v) t;
                    if (abstractC0996v.b() <= 1 || abstractC0996v.f2446g >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (t.b() <= 1 || (t instanceof e0)) {
                    z = true;
                } else {
                    z = false;
                }
                m2504a(z);
            }
        }
    }
}
