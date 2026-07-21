package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p134t.C2314g;
import com.github.catvod.spider.support.p137w.C2407i;
import com.github.catvod.spider.support.p137w.C2409k;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2371g {

    /* JADX INFO: renamed from: b */
    private static final UUID f5874b;

    /* JADX INFO: renamed from: c */
    private static final UUID f5875c;

    /* JADX INFO: renamed from: d */
    private static final UUID f5876d;

    /* JADX INFO: renamed from: e */
    private static final List<UUID> f5877e;

    /* JADX INFO: renamed from: f */
    public static final UUID f5878f;

    /* JADX INFO: renamed from: a */
    private final C2365d f5879a = C2365d.m6363a();

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.g$a */
    interface a {
        /* JADX INFO: renamed from: a */
        int mo6365a(char[] cArr, int i);

        int size();
    }

    static {
        UUID uuidFromString = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");
        UUID uuidFromString2 = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");
        f5874b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");
        f5875c = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");
        f5876d = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        f5877e = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        f5878f = uuidFromString4;
    }

    /* JADX INFO: renamed from: c */
    private int m6366c(char[] cArr, int i, List<C2407i> list, a aVar) {
        int size = i + 1;
        char c = cArr[i];
        for (int i2 = 0; i2 < c; i2++) {
            char c2 = cArr[size];
            int i3 = size + 1;
            C2407i c2407i = new C2407i(new int[0]);
            list.add(c2407i);
            int i4 = i3 + 1;
            if (cArr[i3] != 0) {
                c2407i.m6416a(-1);
            }
            size = i4;
            for (int i5 = 0; i5 < c2; i5++) {
                int iMo6365a = aVar.mo6365a(cArr, size);
                int size2 = size + aVar.size();
                int iMo6365a2 = aVar.mo6365a(cArr, size2);
                size = size2 + aVar.size();
                c2407i.m6417b(iMo6365a, iMo6365a2);
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX INFO: renamed from: d */
    protected static boolean m6367d(UUID uuid, UUID uuid2) {
        Object r0 = f5877e;
        int iIndexOf = r0.indexOf(uuid);
        return iIndexOf >= 0 && r0.indexOf(uuid2) >= iIndexOf;
    }

    /* JADX INFO: renamed from: e */
    protected static long m6368e(char[] cArr, int i) {
        long j = ((long) (cArr[i] | (cArr[i + 1] << 16))) & 4294967295L;
        int i2 = i + 2;
        return (((long) ((cArr[i2 + 1] << 16) | cArr[i2])) << 32) | j;
    }

    /* JADX INFO: renamed from: a */
    protected final void m6369a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r11v26, types: [com.github.catvod.spider.support.p135u.m] */
    /* JADX WARN: Type inference failed for: r11v27, types: [com.github.catvod.spider.support.p135u.m] */
    /* JADX WARN: Type inference failed for: r11v28, types: [com.github.catvod.spider.support.p135u.X] */
    /* JADX WARN: Type inference failed for: r11v29, types: [com.github.catvod.spider.support.p135u.X] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i0>] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.r>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.h0>] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public final C2359a m6370b(char[] cArr) {
        int i;
        InterfaceC2392x c2334a;
        AbstractC2376i0 c2388t;
        int i2;
        int i3;
        AbstractC2375i abstractC2375i;
        AbstractC2375i c2383o;
        char[] cArr2 = (char[]) cArr.clone();
        for (int i4 = 1; i4 < cArr2.length; i4++) {
            cArr2[i4] = (char) (cArr2[i4] - 2);
        }
        char c = cArr2[0];
        if (c != 3) {
            throw new UnsupportedOperationException(new InvalidClassException(C2359a.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(c), 3)));
        }
        UUID uuid = new UUID(m6368e(cArr2, 5), m6368e(cArr2, 1));
        if (!f5877e.contains(uuid)) {
            throw new UnsupportedOperationException(new InvalidClassException(C2359a.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with UUID %s (expected %s or a legacy UUID).", uuid, f5878f)));
        }
        boolean zM6367d = m6367d(f5874b, uuid);
        boolean zM6367d2 = m6367d(f5875c, uuid);
        C2359a c2359a = new C2359a(C2314g.m6256b(2)[cArr2[9]], cArr2[10]);
        ArrayList<C2409k> arrayList = new ArrayList();
        ArrayList<C2409k> arrayList2 = new ArrayList();
        char c2 = cArr2[11];
        char c3 = '\f';
        int i5 = 0;
        int i6 = 12;
        while (i5 < c2) {
            int i7 = i6 + 1;
            char c4 = cArr2[i6];
            if (c4 == 0) {
                c2359a.m6344a(null);
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
                        abstractC2375i = null;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case 1:
                        c2383o = new C2383o();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case 2:
                        c2383o = new C2357Y();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case 3:
                        c2383o = new C2382n();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case 4:
                        c2383o = new C2347N();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case 5:
                        c2383o = new C2368e0();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case 6:
                        c2383o = new C2374h0();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case 7:
                        c2383o = new C2358Z();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case '\b':
                        c2383o = new C2384p();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case '\t':
                        c2383o = new C2372g0();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case '\n':
                        c2383o = new C2370f0();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case 11:
                        c2383o = new C2348O();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    case '\f':
                        c2383o = new C2343J();
                        c2383o.f5885c = i3;
                        abstractC2375i = c2383o;
                        if (c4 == c3) {
                            arrayList.add(new C2409k((C2343J) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        } else if (abstractC2375i instanceof AbstractC2385q) {
                            arrayList2.add(new C2409k((AbstractC2385q) abstractC2375i, Integer.valueOf(cArr2[i8])));
                            i8++;
                        }
                        c2359a.m6344a(abstractC2375i);
                        i6 = i8;
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(c4)));
                }
            }
            i5++;
            c3 = '\f';
        }
        for (C2409k c2409k : arrayList) {
            ((C2343J) c2409k.f5967a).f5813g = (AbstractC2375i) c2359a.f5835a.get(((Integer) c2409k.f5968b).intValue());
        }
        for (C2409k c2409k2 : arrayList2) {
            ((AbstractC2385q) c2409k2.f5967a).f5896i = (C2384p) c2359a.f5835a.get(((Integer) c2409k2.f5968b).intValue());
        }
        int i9 = i6 + 1;
        char c6 = cArr2[i6];
        int i10 = 0;
        while (i10 < c6) {
            ((AbstractC2386r) c2359a.f5835a.get(cArr2[i9])).f5898h = true;
            i10++;
            i9++;
        }
        if (zM6367d) {
            int i11 = i9 + 1;
            char c7 = cArr2[i9];
            int i12 = 0;
            while (i12 < c7) {
                ((C2357Y) c2359a.f5835a.get(cArr2[i11])).f5834h = true;
                i12++;
                i11++;
            }
            i9 = i11;
        }
        int i13 = i9 + 1;
        char c8 = cArr2[i9];
        if (c2359a.f5839e == 1) {
            c2359a.f5841g = new int[c8];
        }
        c2359a.f5837c = new C2357Y[c8];
        for (int i14 = 0; i14 < c8; i14++) {
            int i15 = i13 + 1;
            c2359a.f5837c[i14] = (C2357Y) c2359a.f5835a.get(cArr2[i13]);
            if (c2359a.f5839e == 1) {
                i13 = i15 + 1;
                char c9 = cArr2[i15];
                if (c9 == 65535) {
                    i2 = c9;
                    i2 = -1;
                }
                i2 = c9;
                c2359a.f5841g[i14] = i2;
                if (!m6367d(f5875c, uuid)) {
                    i15 = i13 + 1;
                    char c10 = cArr2[i13];
                    i13 = i15;
                }
            } else {
                i13 = i15;
            }
        }
        c2359a.f5838d = new C2358Z[c8];
        for (AbstractC2375i abstractC2375i2 : c2359a.f5835a) {
            if (abstractC2375i2 instanceof C2358Z) {
                C2358Z c2358z = (C2358Z) abstractC2375i2;
                C2358Z[] c2358zArr = c2359a.f5838d;
                int i16 = abstractC2375i2.f5885c;
                c2358zArr[i16] = c2358z;
                c2359a.f5837c[i16].f5833g = c2358z;
            }
        }
        int i17 = i13 + 1;
        char c11 = cArr2[i13];
        int i18 = 0;
        while (i18 < c11) {
            c2359a.f5843i.add((C2374h0) c2359a.f5835a.get(cArr2[i17]));
            i18++;
            i17++;
        }
        ArrayList arrayList3 = new ArrayList();
        int iM6366c = m6366c(cArr2, i17, arrayList3, new C2367e());
        if (m6367d(f5876d, uuid)) {
            iM6366c = m6366c(cArr2, iM6366c, arrayList3, new C2369f());
        }
        int i19 = iM6366c + 1;
        char c12 = cArr2[iM6366c];
        for (int i20 = 0; i20 < c12; i20++) {
            char c13 = cArr2[i19];
            char c14 = cArr2[i19 + 1];
            char c15 = cArr2[i19 + 2];
            char c16 = cArr2[i19 + 3];
            char c17 = cArr2[i19 + 4];
            char c18 = cArr2[i19 + 5];
            AbstractC2375i abstractC2375i3 = (AbstractC2375i) c2359a.f5835a.get(c14);
            switch (c15) {
                case 1:
                    c2388t = new C2388t(abstractC2375i3);
                    break;
                case 2:
                    c2388t = c18 != 0 ? new C2356X(abstractC2375i3, -1, c17) : new C2356X(abstractC2375i3, c16, c17);
                    break;
                case 3:
                    c2388t = new C2360a0((C2357Y) c2359a.f5835a.get(c16), c18, abstractC2375i3);
                    break;
                case 4:
                    c2388t = new C2350Q(abstractC2375i3, c16, c17, c18 != 0);
                    break;
                case 5:
                    c2388t = c18 != 0 ? new C2381m(abstractC2375i3, -1) : new C2381m(abstractC2375i3, c16);
                    break;
                case 6:
                    c2388t = new C2379k(abstractC2375i3, c16, c17);
                    break;
                case 7:
                    c2388t = new C2364c0(abstractC2375i3, (C2407i) arrayList3.get(c16));
                    break;
                case '\b':
                    c2388t = new C2344K(abstractC2375i3, (C2407i) arrayList3.get(c16));
                    break;
                case '\t':
                    c2388t = new C2378j0(abstractC2375i3);
                    break;
                case '\n':
                    c2388t = new C2349P(abstractC2375i3, c16);
                    break;
                default:
                    throw new IllegalArgumentException("The specified transition type is not valid.");
            }
            ((AbstractC2375i) c2359a.f5835a.get(c13)).m6372a(c2388t);
            i19 += 6;
        }
        for (AbstractC2375i abstractC2375i4 : c2359a.f5835a) {
            for (int i21 = 0; i21 < abstractC2375i4.m6373b(); i21++) {
                AbstractC2376i0 abstractC2376i0M6374d = abstractC2375i4.m6374d(i21);
                if (abstractC2376i0M6374d instanceof C2360a0) {
                    C2360a0 c2360a0 = (C2360a0) abstractC2376i0M6374d;
                    C2357Y[] c2357yArr = c2359a.f5837c;
                    int i22 = c2360a0.f5889a.f5885c;
                    if (!c2357yArr[i22].f5834h || c2360a0.f5844b != 0) {
                        i22 = -1;
                    }
                    c2359a.f5838d[c2360a0.f5889a.f5885c].m6372a(new C2388t(c2360a0.f5845c, i22));
                }
            }
        }
        for (AbstractC2375i abstractC2375i5 : c2359a.f5835a) {
            if (abstractC2375i5 instanceof AbstractC2385q) {
                AbstractC2385q abstractC2385q = (AbstractC2385q) abstractC2375i5;
                C2384p c2384p = abstractC2385q.f5896i;
                if (c2384p == null) {
                    throw new IllegalStateException();
                }
                if (c2384p.f5895g != null) {
                    throw new IllegalStateException();
                }
                c2384p.f5895g = abstractC2385q;
            }
            if (abstractC2375i5 instanceof C2348O) {
                C2348O c2348o = (C2348O) abstractC2375i5;
                for (int i23 = 0; i23 < c2348o.m6373b(); i23++) {
                    AbstractC2375i abstractC2375i6 = c2348o.m6374d(i23).f5889a;
                    if (abstractC2375i6 instanceof C2347N) {
                        ((C2347N) abstractC2375i6).f5822j = c2348o;
                    }
                }
            } else if (abstractC2375i5 instanceof C2372g0) {
                C2372g0 c2372g0 = (C2372g0) abstractC2375i5;
                for (int i24 = 0; i24 < c2372g0.m6373b(); i24++) {
                    AbstractC2375i abstractC2375i7 = c2372g0.m6374d(i24).f5889a;
                    if (abstractC2375i7 instanceof C2370f0) {
                        ((C2370f0) abstractC2375i7).f5872i = c2372g0;
                    }
                }
            }
        }
        int i25 = i19 + 1;
        char c19 = cArr2[i19];
        int i26 = 1;
        while (i26 <= c19) {
            int i27 = i25 + 1;
            AbstractC2386r abstractC2386r = (AbstractC2386r) c2359a.f5835a.get(cArr2[i25]);
            c2359a.f5836b.add(abstractC2386r);
            abstractC2386r.f5897g = i26 - 1;
            i26++;
            i25 = i27;
        }
        if (c2359a.f5839e == 1) {
            if (zM6367d2) {
                int i28 = i25 + 1;
                c2359a.f5842h = new InterfaceC2392x[cArr2[i25]];
                int i29 = 0;
                while (i29 < c2359a.f5842h.length) {
                    int i30 = i28 + 1;
                    EnumC2394z enumC2394z = EnumC2394z.values()[cArr2[i28]];
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
                    switch (enumC2394z.ordinal()) {
                        case 0:
                            c2334a = new C2334A(i);
                            break;
                        case 1:
                            c2334a = new C2335B(i, i33);
                            break;
                        case 2:
                            c2334a = new C2337D(i);
                            break;
                        case 3:
                            c2334a = C2338E.f5808a;
                            break;
                        case 4:
                            c2334a = C2339F.f5809a;
                            break;
                        case 5:
                            c2334a = new C2340G(i);
                            break;
                        case 6:
                            c2334a = C2341H.f5811a;
                            break;
                        case 7:
                            c2334a = new C2342I(i);
                            break;
                        default:
                            throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified lexer action type %d is not valid.", enumC2394z));
                    }
                    c2359a.f5842h[i29] = c2334a;
                    i29++;
                    i28 = i32;
                }
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (AbstractC2375i abstractC2375i8 : c2359a.f5835a) {
                    for (int i34 = 0; i34 < abstractC2375i8.m6373b(); i34++) {
                        AbstractC2376i0 abstractC2376i0M6374d2 = abstractC2375i8.m6374d(i34);
                        if (abstractC2376i0M6374d2 instanceof C2379k) {
                            C2379k c2379k = (C2379k) abstractC2376i0M6374d2;
                            int i35 = c2379k.f5890b;
                            C2335B c2335b = new C2335B(i35, c2379k.f5891c);
                            abstractC2375i8.f5887e.set(i34, new C2379k(abstractC2376i0M6374d2.f5889a, i35, arrayList4.size()));
                            arrayList4.add(c2335b);
                        }
                    }
                }
                c2359a.f5842h = (InterfaceC2392x[]) arrayList4.toArray(new InterfaceC2392x[arrayList4.size()]);
            }
        }
        for (AbstractC2375i abstractC2375i9 : c2359a.f5835a) {
            if ((abstractC2375i9 instanceof C2370f0) && c2359a.f5837c[abstractC2375i9.f5885c].f5834h) {
                AbstractC2375i abstractC2375i10 = abstractC2375i9.m6374d(abstractC2375i9.m6373b() - 1).f5889a;
                if ((abstractC2375i10 instanceof C2343J) && abstractC2375i10.f5886d && (abstractC2375i10.m6374d(0).f5889a instanceof C2358Z)) {
                    ((C2370f0) abstractC2375i9).f5873j = true;
                }
            }
        }
        this.f5879a.getClass();
        m6371f(c2359a);
        this.f5879a.getClass();
        return c2359a;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX INFO: renamed from: f */
    protected final void m6371f(C2359a c2359a) {
        boolean z;
        for (AbstractC2375i abstractC2375i : c2359a.f5835a) {
            if (abstractC2375i != null) {
                boolean z2 = false;
                m6369a(abstractC2375i.f5886d || abstractC2375i.m6373b() <= 1);
                if (abstractC2375i instanceof C2347N) {
                    m6369a(((C2347N) abstractC2375i).f5822j != null);
                }
                if (abstractC2375i instanceof C2370f0) {
                    C2370f0 c2370f0 = (C2370f0) abstractC2375i;
                    m6369a(c2370f0.f5872i != null);
                    m6369a(c2370f0.m6373b() == 2);
                    if (c2370f0.m6374d(0).f5889a instanceof C2368e0) {
                        m6369a(c2370f0.m6374d(1).f5889a instanceof C2343J);
                        z = !c2370f0.f5898h;
                    } else {
                        if (!(c2370f0.m6374d(0).f5889a instanceof C2343J)) {
                            throw new IllegalStateException();
                        }
                        m6369a(c2370f0.m6374d(1).f5889a instanceof C2368e0);
                        z = c2370f0.f5898h;
                    }
                    m6369a(z);
                }
                if (abstractC2375i instanceof C2372g0) {
                    m6369a(abstractC2375i.m6373b() == 1);
                    m6369a(abstractC2375i.m6374d(0).f5889a instanceof C2370f0);
                }
                if (abstractC2375i instanceof C2343J) {
                    m6369a(((C2343J) abstractC2375i).f5813g != null);
                }
                if (abstractC2375i instanceof C2357Y) {
                    m6369a(((C2357Y) abstractC2375i).f5833g != null);
                }
                if (abstractC2375i instanceof AbstractC2385q) {
                    m6369a(((AbstractC2385q) abstractC2375i).f5896i != null);
                }
                if (abstractC2375i instanceof C2384p) {
                    m6369a(((C2384p) abstractC2375i).f5895g != null);
                }
                if (abstractC2375i instanceof AbstractC2386r) {
                    AbstractC2386r abstractC2386r = (AbstractC2386r) abstractC2375i;
                    if (abstractC2386r.m6373b() <= 1 || abstractC2386r.f5897g >= 0) {
                        z2 = true;
                    }
                } else if (abstractC2375i.m6373b() <= 1 || (abstractC2375i instanceof C2358Z)) {
                    z2 = true;
                }
                m6369a(z2);
            }
        }
    }
}
