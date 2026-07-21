package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;
import com.github.catvod.spider.support.p044FM.p045A.C1288n;
import com.github.catvod.spider.support.p044FM.p098x.C1932g;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1997k {

    /* JADX INFO: renamed from: b */
    private static final UUID f4547b;

    /* JADX INFO: renamed from: c */
    private static final UUID f4548c;

    /* JADX INFO: renamed from: d */
    private static final UUID f4549d;

    /* JADX INFO: renamed from: e */
    private static final List<UUID> f4550e;

    /* JADX INFO: renamed from: f */
    public static final UUID f4551f;

    /* JADX INFO: renamed from: a */
    private final C1989g f4552a = C1989g.m4774a();

    static {
        UUID uuidFromString = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");
        UUID uuidFromString2 = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");
        f4547b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");
        f4548c = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");
        f4549d = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        f4550e = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        f4551f = uuidFromString4;
    }

    /* JADX INFO: renamed from: c */
    private int m4778c(char[] cArr, int i, List<C1285k> list, InterfaceC1995j interfaceC1995j) {
        int size = i + 1;
        char c = cArr[i];
        for (int i2 = 0; i2 < c; i2++) {
            char c2 = cArr[size];
            int i3 = size + 1;
            C1285k c1285k = new C1285k(new int[0]);
            list.add(c1285k);
            int i4 = i3 + 1;
            if (cArr[i3] != 0) {
                c1285k.m3206a(-1);
            }
            size = i4;
            for (int i5 = 0; i5 < c2; i5++) {
                int iMo4777a = interfaceC1995j.mo4777a(cArr, size);
                int size2 = size + interfaceC1995j.size();
                int iMo4777a2 = interfaceC1995j.mo4777a(cArr, size2);
                size = size2 + interfaceC1995j.size();
                c1285k.m3207b(iMo4777a, iMo4777a2);
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX INFO: renamed from: d */
    protected static boolean m4779d(UUID uuid, UUID uuid2) {
        Object r0 = f4550e;
        int iIndexOf = r0.indexOf(uuid);
        return iIndexOf >= 0 && r0.indexOf(uuid2) >= iIndexOf;
    }

    /* JADX INFO: renamed from: e */
    protected static long m4780e(char[] cArr, int i) {
        long j = ((long) (cArr[i] | (cArr[i + 1] << 16))) & 4294967295L;
        int i2 = i + 2;
        return (((long) ((cArr[i2 + 1] << 16) | cArr[i2])) << 32) | j;
    }

    /* JADX INFO: renamed from: a */
    protected final void m4781a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r11v26, types: [com.github.catvod.spider.support.p044FM.p099y.q] */
    /* JADX WARN: Type inference failed for: r11v27, types: [com.github.catvod.spider.support.p044FM.p099y.q] */
    /* JADX WARN: Type inference failed for: r11v28, types: [com.github.catvod.spider.support.p044FM.p099y.c0] */
    /* JADX WARN: Type inference failed for: r11v29, types: [com.github.catvod.spider.support.p044FM.p099y.c0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.t0>] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.v>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.r0>] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public final C1977a m4782b(char[] cArr) {
        int i;
        InterfaceC1954C c1957f;
        AbstractC2016t0 c2021x;
        int i2;
        int i3;
        AbstractC2001m abstractC2001m;
        AbstractC2001m c2013s;
        char[] cArr2 = (char[]) cArr.clone();
        for (int i4 = 1; i4 < cArr2.length; i4++) {
            cArr2[i4] = (char) (cArr2[i4] - 2);
        }
        char c = cArr2[0];
        if (c != 3) {
            throw new UnsupportedOperationException(new InvalidClassException(C1977a.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(c), 3)));
        }
        UUID uuid = new UUID(m4780e(cArr2, 5), m4780e(cArr2, 1));
        if (!f4550e.contains(uuid)) {
            throw new UnsupportedOperationException(new InvalidClassException(C1977a.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with UUID %s (expected %s or a legacy UUID).", uuid, f4551f)));
        }
        boolean zM4779d = m4779d(f4547b, uuid);
        boolean zM4779d2 = m4779d(f4548c, uuid);
        C1977a c1977a = new C1977a(C1932g.m4676b(2)[cArr2[9]], cArr2[10]);
        ArrayList<C1288n> arrayList = new ArrayList();
        ArrayList<C1288n> arrayList2 = new ArrayList();
        char c2 = cArr2[11];
        char c3 = '\f';
        int i5 = 0;
        int i6 = 12;
        while (i5 < c2) {
            int i7 = i6 + 1;
            char c4 = cArr2[i6];
            if (c4 == 0) {
                c1977a.m4759a(null);
                i6 = i7;
            } else {
                int i8 = i7 + 1;
                char c5 = cArr2[i7];
                if (c5 == 65535) {
                    i3 = c5;
                    i3 = -1;
                }
                switch (c4) {
                    case 0:
                        abstractC2001m = null;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case 1:
                        c2013s = new C2013s();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case 2:
                        c2013s = new C1984d0();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case 3:
                        c2013s = new C2011r();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case 4:
                        c2013s = new C1970T();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case 5:
                        c2013s = new C2006o0();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case 6:
                        c2013s = new C2012r0();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case 7:
                        c2013s = new C1986e0();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case '\b':
                        c2013s = new C2015t();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case '\t':
                        c2013s = new C2010q0();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case '\n':
                        c2013s = new C2008p0();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case 11:
                        c2013s = new C1971U();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    case '\f':
                        c2013s = new C1966O();
                        c2013s.f4562c = i3;
                        abstractC2001m = c2013s;
                        if (c4 == c3) {
                            arrayList.add(new C1288n((C1966O) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2001m instanceof AbstractC2017u) {
                            arrayList2.add(new C1288n((AbstractC2017u) abstractC2001m, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c1977a.m4759a(abstractC2001m);
                        i6 = i8;
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(c4)));
                }
            }
            i5++;
            c3 = '\f';
        }
        for (C1288n c1288n : arrayList) {
            ((C1966O) c1288n.f3014a).f4495g = (AbstractC2001m) c1977a.f4513a.get(((Integer) c1288n.f3015b).intValue());
        }
        for (C1288n c1288n2 : arrayList2) {
            ((AbstractC2017u) c1288n2.f3014a).f4578i = (C2015t) c1977a.f4513a.get(((Integer) c1288n2.f3015b).intValue());
        }
        int i9 = i6 + 1;
        char c6 = cArr2[i6];
        int i10 = 0;
        while (i10 < c6) {
            ((AbstractC2019v) c1977a.f4513a.get(cArr2[i9])).f4580h = true;
            i10++;
            i9++;
        }
        if (zM4779d) {
            int i11 = i9 + 1;
            char c7 = cArr2[i9];
            int i12 = 0;
            while (i12 < c7) {
                ((C1984d0) c1977a.f4513a.get(cArr2[i11])).f4531h = true;
                i12++;
                i11++;
            }
            i9 = i11;
        }
        int i13 = i9 + 1;
        char c8 = cArr2[i9];
        if (c1977a.f4517e == 1) {
            c1977a.f4519g = new int[c8];
        }
        c1977a.f4515c = new C1984d0[c8];
        for (int i14 = 0; i14 < c8; i14++) {
            int i15 = i13 + 1;
            c1977a.f4515c[i14] = (C1984d0) c1977a.f4513a.get(cArr2[i13]);
            if (c1977a.f4517e == 1) {
                i13 = i15 + 1;
                char c9 = cArr2[i15];
                if (c9 == 65535) {
                    i2 = c9;
                    i2 = -1;
                }
                i2 = c9;
                c1977a.f4519g[i14] = i2;
                if (!m4779d(f4548c, uuid)) {
                    i15 = i13 + 1;
                    char c10 = cArr2[i13];
                    i13 = i15;
                }
            } else {
                i13 = i15;
            }
        }
        c1977a.f4516d = new C1986e0[c8];
        for (AbstractC2001m abstractC2001m2 : c1977a.f4513a) {
            if (abstractC2001m2 instanceof C1986e0) {
                C1986e0 c1986e0 = (C1986e0) abstractC2001m2;
                C1986e0[] c1986e0Arr = c1977a.f4516d;
                int i16 = abstractC2001m2.f4562c;
                c1986e0Arr[i16] = c1986e0;
                c1977a.f4515c[i16].f4530g = c1986e0;
            }
        }
        int i17 = i13 + 1;
        char c11 = cArr2[i13];
        int i18 = 0;
        while (i18 < c11) {
            c1977a.f4521i.add((C2012r0) c1977a.f4513a.get(cArr2[i17]));
            i18++;
            i17++;
        }
        ArrayList arrayList3 = new ArrayList();
        int iM4778c = m4778c(cArr2, i17, arrayList3, new C1991h());
        if (m4779d(f4549d, uuid)) {
            iM4778c = m4778c(cArr2, iM4778c, arrayList3, new C1993i());
        }
        int i19 = iM4778c + 1;
        char c12 = cArr2[iM4778c];
        for (int i20 = 0; i20 < c12; i20++) {
            char c13 = cArr2[i19];
            char c14 = cArr2[i19 + 1];
            char c15 = cArr2[i19 + 2];
            char c16 = cArr2[i19 + 3];
            char c17 = cArr2[i19 + 4];
            char c18 = cArr2[i19 + 5];
            AbstractC2001m abstractC2001m3 = (AbstractC2001m) c1977a.f4513a.get(c14);
            switch (c15) {
                case 1:
                    c2021x = new C2021x(abstractC2001m3);
                    break;
                case 2:
                    c2021x = c18 != 0 ? new C1982c0(abstractC2001m3, -1, c17) : new C1982c0(abstractC2001m3, c16, c17);
                    break;
                case 3:
                    c2021x = new C1988f0((C1984d0) c1977a.f4513a.get(c16), c18, abstractC2001m3);
                    break;
                case 4:
                    c2021x = new C1973W(abstractC2001m3, c16, c17, c18 != 0);
                    break;
                case 5:
                    c2021x = c18 != 0 ? new C2009q(abstractC2001m3, -1) : new C2009q(abstractC2001m3, c16);
                    break;
                case 6:
                    c2021x = new C2005o(abstractC2001m3, c16, c17);
                    break;
                case 7:
                    c2021x = new C2002m0(abstractC2001m3, (C1285k) arrayList3.get(c16));
                    break;
                case '\b':
                    c2021x = new C1967P(abstractC2001m3, (C1285k) arrayList3.get(c16));
                    break;
                case '\t':
                    c2021x = new C2018u0(abstractC2001m3);
                    break;
                case '\n':
                    c2021x = new C1972V(abstractC2001m3, c16);
                    break;
                default:
                    throw new IllegalArgumentException("The specified transition type is not valid.");
            }
            ((AbstractC2001m) c1977a.f4513a.get(c13)).m4787a(c2021x);
            i19 += 6;
        }
        for (AbstractC2001m abstractC2001m4 : c1977a.f4513a) {
            for (int i21 = 0; i21 < abstractC2001m4.m4788b(); i21++) {
                AbstractC2016t0 abstractC2016t0M4789d = abstractC2001m4.m4789d(i21);
                if (abstractC2016t0M4789d instanceof C1988f0) {
                    C1988f0 c1988f0 = (C1988f0) abstractC2016t0M4789d;
                    C1984d0[] c1984d0Arr = c1977a.f4515c;
                    int i22 = c1988f0.f4577a.f4562c;
                    if (!c1984d0Arr[i22].f4531h || c1988f0.f4541b != 0) {
                        i22 = -1;
                    }
                    c1977a.f4516d[c1988f0.f4577a.f4562c].m4787a(new C2021x(c1988f0.f4542c, i22));
                }
            }
        }
        for (AbstractC2001m abstractC2001m5 : c1977a.f4513a) {
            if (abstractC2001m5 instanceof AbstractC2017u) {
                AbstractC2017u abstractC2017u = (AbstractC2017u) abstractC2001m5;
                C2015t c2015t = abstractC2017u.f4578i;
                if (c2015t == null) {
                    throw new IllegalStateException();
                }
                if (c2015t.f4576g != null) {
                    throw new IllegalStateException();
                }
                c2015t.f4576g = abstractC2017u;
            }
            if (abstractC2001m5 instanceof C1971U) {
                C1971U c1971u = (C1971U) abstractC2001m5;
                for (int i23 = 0; i23 < c1971u.m4788b(); i23++) {
                    AbstractC2001m abstractC2001m6 = c1971u.m4789d(i23).f4577a;
                    if (abstractC2001m6 instanceof C1970T) {
                        ((C1970T) abstractC2001m6).f4504j = c1971u;
                    }
                }
            } else if (abstractC2001m5 instanceof C2010q0) {
                C2010q0 c2010q0 = (C2010q0) abstractC2001m5;
                for (int i24 = 0; i24 < c2010q0.m4788b(); i24++) {
                    AbstractC2001m abstractC2001m7 = c2010q0.m4789d(i24).f4577a;
                    if (abstractC2001m7 instanceof C2008p0) {
                        ((C2008p0) abstractC2001m7).f4573i = c2010q0;
                    }
                }
            }
        }
        int i25 = i19 + 1;
        char c19 = cArr2[i19];
        int i26 = 1;
        while (i26 <= c19) {
            int i27 = i25 + 1;
            AbstractC2019v abstractC2019v = (AbstractC2019v) c1977a.f4513a.get(cArr2[i25]);
            c1977a.f4514b.add(abstractC2019v);
            abstractC2019v.f4579g = i26 - 1;
            i26++;
            i25 = i27;
        }
        if (c1977a.f4517e == 1) {
            if (zM4779d2) {
                int i28 = i25 + 1;
                c1977a.f4520h = new InterfaceC1954C[cArr2[i25]];
                int i29 = 0;
                while (i29 < c1977a.f4520h.length) {
                    int i30 = i28 + 1;
                    EnumC1956E enumC1956E = EnumC1956E.values()[cArr2[i28]];
                    int i31 = i30 + 1;
                    char c20 = cArr2[i30];
                    if (c20 == 65535) {
                        i = c20;
                        i = -1;
                    }
                    i = c20;
                    int i32 = i31 + 1;
                    char c21 = cArr2[i31];
                    int i33 = c21;
                    if (c21 == 65535) {
                        i33 = -1;
                    }
                    switch (enumC1956E) {
                        case CHANNEL:
                            c1957f = new C1957F(i);
                            break;
                        case CUSTOM:
                            c1957f = new C1958G(i, i33);
                            break;
                        case MODE:
                            c1957f = new C1960I(i);
                            break;
                        case MORE:
                            c1957f = C1961J.f4490a;
                            break;
                        case POP_MODE:
                            c1957f = C1962K.f4491a;
                            break;
                        case PUSH_MODE:
                            c1957f = new C1963L(i);
                            break;
                        case SKIP:
                            c1957f = C1964M.f4493a;
                            break;
                        case TYPE:
                            c1957f = new C1965N(i);
                            break;
                        default:
                            throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified lexer action type %d is not valid.", enumC1956E));
                    }
                    c1977a.f4520h[i29] = c1957f;
                    i29++;
                    i28 = i32;
                }
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (AbstractC2001m abstractC2001m8 : c1977a.f4513a) {
                    for (int i34 = 0; i34 < abstractC2001m8.m4788b(); i34++) {
                        AbstractC2016t0 abstractC2016t0M4789d2 = abstractC2001m8.m4789d(i34);
                        if (abstractC2016t0M4789d2 instanceof C2005o) {
                            C2005o c2005o = (C2005o) abstractC2016t0M4789d2;
                            int i35 = c2005o.f4569b;
                            C1958G c1958g = new C1958G(i35, c2005o.f4570c);
                            abstractC2001m8.f4564e.set(i34, new C2005o(abstractC2016t0M4789d2.f4577a, i35, arrayList4.size()));
                            arrayList4.add(c1958g);
                        }
                    }
                }
                c1977a.f4520h = (InterfaceC1954C[]) arrayList4.toArray(new InterfaceC1954C[arrayList4.size()]);
            }
        }
        for (AbstractC2001m abstractC2001m9 : c1977a.f4513a) {
            if ((abstractC2001m9 instanceof C2008p0) && c1977a.f4515c[abstractC2001m9.f4562c].f4531h) {
                AbstractC2001m abstractC2001m10 = abstractC2001m9.m4789d(abstractC2001m9.m4788b() - 1).f4577a;
                if ((abstractC2001m10 instanceof C1966O) && abstractC2001m10.f4563d && (abstractC2001m10.m4789d(0).f4577a instanceof C1986e0)) {
                    ((C2008p0) abstractC2001m9).f4574j = true;
                }
            }
        }
        this.f4552a.getClass();
        m4783f(c1977a);
        this.f4552a.getClass();
        return c1977a;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.m>] */
    /* JADX INFO: renamed from: f */
    protected final void m4783f(C1977a c1977a) {
        boolean z;
        for (AbstractC2001m abstractC2001m : c1977a.f4513a) {
            if (abstractC2001m != null) {
                boolean z2 = false;
                m4781a(abstractC2001m.f4563d || abstractC2001m.m4788b() <= 1);
                if (abstractC2001m instanceof C1970T) {
                    m4781a(((C1970T) abstractC2001m).f4504j != null);
                }
                if (abstractC2001m instanceof C2008p0) {
                    C2008p0 c2008p0 = (C2008p0) abstractC2001m;
                    m4781a(c2008p0.f4573i != null);
                    m4781a(c2008p0.m4788b() == 2);
                    if (c2008p0.m4789d(0).f4577a instanceof C2006o0) {
                        m4781a(c2008p0.m4789d(1).f4577a instanceof C1966O);
                        z = !c2008p0.f4580h;
                    } else {
                        if (!(c2008p0.m4789d(0).f4577a instanceof C1966O)) {
                            throw new IllegalStateException();
                        }
                        m4781a(c2008p0.m4789d(1).f4577a instanceof C2006o0);
                        z = c2008p0.f4580h;
                    }
                    m4781a(z);
                }
                if (abstractC2001m instanceof C2010q0) {
                    m4781a(abstractC2001m.m4788b() == 1);
                    m4781a(abstractC2001m.m4789d(0).f4577a instanceof C2008p0);
                }
                if (abstractC2001m instanceof C1966O) {
                    m4781a(((C1966O) abstractC2001m).f4495g != null);
                }
                if (abstractC2001m instanceof C1984d0) {
                    m4781a(((C1984d0) abstractC2001m).f4530g != null);
                }
                if (abstractC2001m instanceof AbstractC2017u) {
                    m4781a(((AbstractC2017u) abstractC2001m).f4578i != null);
                }
                if (abstractC2001m instanceof C2015t) {
                    m4781a(((C2015t) abstractC2001m).f4576g != null);
                }
                if (abstractC2001m instanceof AbstractC2019v) {
                    AbstractC2019v abstractC2019v = (AbstractC2019v) abstractC2001m;
                    if (abstractC2019v.m4788b() <= 1 || abstractC2019v.f4579g >= 0) {
                        z2 = true;
                    }
                } else if (abstractC2001m.m4788b() <= 1 || (abstractC2001m instanceof C1986e0)) {
                    z2 = true;
                }
                m4781a(z2);
            }
        }
    }
}
