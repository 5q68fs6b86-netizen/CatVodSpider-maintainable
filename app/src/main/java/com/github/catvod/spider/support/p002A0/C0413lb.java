package com.github.catvod.spider.support.p002A0;

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.lb */
/* JADX INFO: loaded from: classes.dex */
public final class C0413lb {

    /* JADX INFO: renamed from: a */
    public static final UUID f1117a;

    /* JADX INFO: renamed from: b */
    public static final UUID f1118b;

    /* JADX INFO: renamed from: c */
    public static final UUID f1119c;

    /* JADX INFO: renamed from: d */
    public static final ArrayList f1120d;

    /* JADX INFO: renamed from: e */
    public static final UUID f1121e;

    /* JADX INFO: renamed from: f */
    public final C0372jo f1122f = C0372jo.f1069a;

    static {
        UUID uuidFromString = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");
        UUID uuidFromString2 = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");
        f1117a = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");
        f1118b = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");
        f1119c = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        f1120d = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        f1121e = uuidFromString4;
    }

    /* JADX INFO: renamed from: g */
    public static void m1367g(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m1368h(char[] cArr, int i, ArrayList arrayList, InterfaceC0393ki interfaceC0393ki) {
        int i2 = i + 1;
        char c = cArr[i];
        for (int i3 = 0; i3 < c; i3++) {
            char c2 = cArr[i2];
            int i4 = i2 + 1;
            C0339ii c0339ii = new C0339ii(new int[0]);
            arrayList.add(c0339ii);
            i2 += 2;
            if (cArr[i4] != 0) {
                c0339ii.m1302c(-1);
            }
            int i5 = 0;
            while (i5 < c2) {
                int iMo1337l = interfaceC0393ki.mo1337l(cArr, i2);
                int size = interfaceC0393ki.size() + i2;
                int iMo1337l2 = interfaceC0393ki.mo1337l(cArr, size);
                int size2 = size + interfaceC0393ki.size();
                c0339ii.m1303d(iMo1337l, iMo1337l2);
                i5++;
                i2 = size2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1369i(UUID uuid, UUID uuid2) {
        ArrayList arrayList = f1120d;
        int iIndexOf = arrayList.indexOf(uuid);
        return iIndexOf >= 0 && arrayList.indexOf(uuid2) >= iIndexOf;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0133  */
    /* JADX WARN: Code duplicated, block: B:42:0x0137  */
    /* JADX WARN: Code duplicated, block: B:44:0x014d  */
    /* JADX INFO: renamed from: j */
    public final C0367jj m1370j(char[] cArr) {
        int i;
        InterfaceC0573r c0415ld;
        AbstractC0488nw c0244ev;
        int i2;
        int i3;
        char c;
        AbstractC0428lq abstractC0428lq;
        AbstractC0428lq c0557qk;
        int i4;
        char c2 = 0;
        char[] cArr2 = (char[]) cArr.clone();
        for (int i5 = 1; i5 < cArr2.length; i5++) {
            cArr2[i5] = (char) (cArr2[i5] - 2);
        }
        char c3 = cArr2[0];
        if (c3 != 3) {
            throw new UnsupportedOperationException(new InvalidClassException(C0367jj.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(c3), 3)));
        }
        UUID uuid = new UUID((((long) (cArr2[5] | (cArr2[6] << 16))) & 4294967295L) | (((long) (cArr2[7] | (cArr2[8] << 16))) << 32), (((long) (cArr2[3] | (cArr2[4] << 16))) << 32) | (((long) (cArr2[1] | (cArr2[2] << 16))) & 4294967295L));
        if (!f1120d.contains(uuid)) {
            Locale.getDefault();
            throw new UnsupportedOperationException(new InvalidClassException(C0367jj.class.getName(), "Could not deserialize ATN with UUID " + uuid + " (expected " + f1121e + " or a legacy UUID)."));
        }
        boolean zM1369i = m1369i(f1117a, uuid);
        UUID uuid2 = f1118b;
        boolean zM1369i2 = m1369i(uuid2, uuid);
        int[] iArr = new int[2];
        System.arraycopy(AbstractC0710wb.f1722a, 0, iArr, 0, 2);
        C0367jj c0367jj = new C0367jj(iArr[cArr2[9]], cArr2[10]);
        ArrayList<aam> arrayList = new ArrayList();
        ArrayList<aam> arrayList2 = new ArrayList();
        char c4 = cArr2[11];
        int i6 = 0;
        int i7 = 12;
        while (true) {
            ArrayList<AbstractC0428lq> arrayList3 = c0367jj.f1037a;
            if (i6 >= c4) {
                for (aam aamVar : arrayList) {
                    ((aaj) aamVar.f447a).f445b = (AbstractC0428lq) arrayList3.get(((Integer) aamVar.f448b).intValue());
                }
                for (aam aamVar2 : arrayList2) {
                    ((AbstractC0559qm) aamVar2.f447a).f1409c = (C0558ql) arrayList3.get(((Integer) aamVar2.f448b).intValue());
                }
                int i8 = 1;
                int i9 = i7 + 1;
                char c5 = cArr2[i7];
                int i10 = 0;
                while (i10 < c5) {
                    ((acc) arrayList3.get(cArr2[i9])).f550m = true;
                    i10++;
                    i9++;
                }
                if (zM1369i) {
                    int i11 = i9 + 1;
                    char c6 = cArr2[i9];
                    int i12 = 0;
                    while (i12 < c6) {
                        ((C0478nm) arrayList3.get(cArr2[i11])).f1287c = true;
                        i12++;
                        i11++;
                    }
                    i9 = i11;
                }
                int i13 = i9 + 1;
                char c7 = cArr2[i9];
                int i14 = c0367jj.f1041e;
                if (i14 == 1) {
                    c0367jj.f1043g = new int[c7];
                }
                c0367jj.f1039c = new C0478nm[c7];
                for (int i15 = 0; i15 < c7; i15 += i8) {
                    int i16 = i13 + 1;
                    c0367jj.f1039c[i15] = (C0478nm) arrayList3.get(cArr2[i13]);
                    if (i14 == i8) {
                        int i17 = i13 + 2;
                        char c8 = cArr2[i16];
                        if (c8 == 65535) {
                            i2 = c8;
                            i2 = -1;
                        }
                        i2 = c8;
                        c0367jj.f1043g[i15] = i2;
                        if (m1369i(uuid2, uuid)) {
                            i13 = i17;
                        } else {
                            i13 += 3;
                            char c9 = cArr2[i17];
                        }
                        i8 = 1;
                    } else {
                        i13 = i16;
                    }
                }
                c0367jj.f1040d = new C0328hy[c7];
                for (AbstractC0428lq abstractC0428lq2 : arrayList3) {
                    if (abstractC0428lq2 instanceof C0328hy) {
                        C0328hy c0328hy = (C0328hy) abstractC0428lq2;
                        C0328hy[] c0328hyArr = c0367jj.f1040d;
                        int i18 = abstractC0428lq2.f1165f;
                        c0328hyArr[i18] = c0328hy;
                        c0367jj.f1039c[i18].f1286b = c0328hy;
                    }
                }
                int i19 = i13 + 1;
                char c10 = cArr2[i13];
                int i20 = 0;
                while (i20 < c10) {
                    c0367jj.f1045i.add((C0382jy) arrayList3.get(cArr2[i19]));
                    i20++;
                    i19++;
                }
                ArrayList arrayList4 = new ArrayList();
                int iM1368h = m1368h(cArr2, i19, arrayList4, new C0372jo(9));
                if (m1369i(f1119c, uuid)) {
                    iM1368h = m1368h(cArr2, iM1368h, arrayList4, new C0372jo(10));
                }
                int i21 = iM1368h + 1;
                char c11 = cArr2[iM1368h];
                for (int i22 = 0; i22 < c11; i22++) {
                    char c12 = cArr2[i21];
                    char c13 = cArr2[i21 + 1];
                    char c14 = cArr2[i21 + 2];
                    char c15 = cArr2[i21 + 3];
                    char c16 = cArr2[i21 + 4];
                    char c17 = cArr2[i21 + 5];
                    AbstractC0428lq abstractC0428lq3 = (AbstractC0428lq) arrayList3.get(c13);
                    switch (c14) {
                        case 1:
                            c0244ev = new C0244ev(abstractC0428lq3, -1);
                            break;
                        case 2:
                            c0244ev = c17 != 0 ? new C0321hr(abstractC0428lq3, -1, c16) : new C0321hr(abstractC0428lq3, c15, c16);
                            break;
                        case 3:
                            c0244ev = new abw((C0478nm) arrayList3.get(c15), c17, abstractC0428lq3);
                            break;
                        case 4:
                            c0244ev = new aaa(abstractC0428lq3, c15, c16, c17 != 0);
                            break;
                        case 5:
                            c0244ev = c17 != 0 ? new C0549qc(abstractC0428lq3, -1) : new C0549qc(abstractC0428lq3, c15);
                            break;
                        case 6:
                            c0244ev = new C0531pl(abstractC0428lq3, c15, c16);
                            break;
                        case 7:
                            c0244ev = new C0181cm(abstractC0428lq3, (C0339ii) arrayList4.get(c15));
                            break;
                        case '\b':
                            c0244ev = new C0378ju(abstractC0428lq3, (C0339ii) arrayList4.get(c15));
                            break;
                        case '\t':
                            c0244ev = new C0355iy(abstractC0428lq3);
                            break;
                        case '\n':
                            c0244ev = new C0420li(abstractC0428lq3, c15);
                            break;
                        default:
                            throw new IllegalArgumentException("The specified transition type is not valid.");
                    }
                    ((AbstractC0428lq) arrayList3.get(c12)).m1405j(c0244ev);
                    i21 += 6;
                }
                for (AbstractC0428lq abstractC0428lq4 : arrayList3) {
                    for (int i23 = 0; i23 < abstractC0428lq4.f1167h.size(); i23++) {
                        AbstractC0488nw abstractC0488nwM1406k = abstractC0428lq4.m1406k(i23);
                        if (abstractC0488nwM1406k instanceof abw) {
                            abw abwVar = (abw) abstractC0488nwM1406k;
                            C0478nm[] c0478nmArr = c0367jj.f1039c;
                            int i24 = abwVar.f1292g.f1165f;
                            if (!c0478nmArr[i24].f1287c || abwVar.f540a != 0) {
                                i24 = -1;
                            }
                            c0367jj.f1040d[abwVar.f1292g.f1165f].m1405j(new C0244ev(abwVar.f541f, i24));
                        }
                    }
                }
                for (AbstractC0428lq abstractC0428lq5 : arrayList3) {
                    if (abstractC0428lq5 instanceof AbstractC0559qm) {
                        AbstractC0559qm abstractC0559qm = (AbstractC0559qm) abstractC0428lq5;
                        C0558ql c0558ql = abstractC0559qm.f1409c;
                        if (c0558ql == null) {
                            throw new IllegalStateException();
                        }
                        if (c0558ql.f1408b != null) {
                            throw new IllegalStateException();
                        }
                        c0558ql.f1408b = abstractC0559qm;
                    }
                    if (abstractC0428lq5 instanceof C0472ng) {
                        C0472ng c0472ng = (C0472ng) abstractC0428lq5;
                        for (int i25 = 0; i25 < c0472ng.f1167h.size(); i25++) {
                            AbstractC0428lq abstractC0428lq6 = c0472ng.m1406k(i25).f1292g;
                            if (abstractC0428lq6 instanceof C0512ot) {
                                ((C0512ot) abstractC0428lq6).f1351b = c0472ng;
                            }
                        }
                    } else if (abstractC0428lq5 instanceof C0335ie) {
                        C0335ie c0335ie = (C0335ie) abstractC0428lq5;
                        for (int i26 = 0; i26 < c0335ie.f1167h.size(); i26++) {
                            AbstractC0428lq abstractC0428lq7 = c0335ie.m1406k(i26).f1292g;
                            if (abstractC0428lq7 instanceof C0627t) {
                                ((C0627t) abstractC0428lq7).f1522b = c0335ie;
                            }
                        }
                    }
                }
                char c18 = cArr2[i21];
                int i27 = i21 + 1;
                int i28 = 1;
                while (i28 <= c18) {
                    int i29 = i27 + 1;
                    acc accVar = (acc) arrayList3.get(cArr2[i27]);
                    c0367jj.f1038b.add(accVar);
                    accVar.f549l = i28 - 1;
                    i28++;
                    i27 = i29;
                }
                if (i14 == 1) {
                    if (zM1369i2) {
                        int i30 = i27 + 1;
                        c0367jj.f1044h = new InterfaceC0573r[cArr2[i27]];
                        for (int i31 = 0; i31 < c0367jj.f1044h.length; i31++) {
                            EnumC0337ig enumC0337ig = ((EnumC0337ig[]) EnumC0337ig.f1007a.clone())[cArr2[i30]];
                            int i32 = i30 + 2;
                            char c19 = cArr2[i30 + 1];
                            if (c19 == 65535) {
                                i = c19;
                                i = -1;
                            }
                            i = c19;
                            i30 += 3;
                            char c20 = cArr2[i32];
                            int i33 = c20;
                            if (c20 == 65535) {
                                i33 = -1;
                            }
                            switch (enumC0337ig.ordinal()) {
                                case 0:
                                    c0415ld = new C0415ld(i);
                                    break;
                                case 1:
                                    c0415ld = new C0446mh(i, i33);
                                    break;
                                case 2:
                                    c0415ld = new C0290gn(i);
                                    break;
                                case 3:
                                    c0415ld = aaz.f461c;
                                    break;
                                case 4:
                                    c0415ld = aaz.f462d;
                                    break;
                                case 5:
                                    c0415ld = new C0131aq(i);
                                    break;
                                case 6:
                                    c0415ld = aaz.f463e;
                                    break;
                                case 7:
                                    c0415ld = new C0675uu(i);
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified lexer action type %d is not valid.", enumC0337ig));
                            }
                            c0367jj.f1044h[i31] = c0415ld;
                        }
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        for (AbstractC0428lq abstractC0428lq8 : arrayList3) {
                            for (int i34 = 0; i34 < abstractC0428lq8.f1167h.size(); i34++) {
                                AbstractC0488nw abstractC0488nwM1406k2 = abstractC0428lq8.m1406k(i34);
                                if (abstractC0488nwM1406k2 instanceof C0531pl) {
                                    C0531pl c0531pl = (C0531pl) abstractC0488nwM1406k2;
                                    int i35 = c0531pl.f1366a;
                                    C0446mh c0446mh = new C0446mh(i35, c0531pl.f1367f);
                                    abstractC0428lq8.f1167h.set(i34, new C0531pl(abstractC0488nwM1406k2.f1292g, i35, arrayList5.size()));
                                    arrayList5.add(c0446mh);
                                }
                            }
                        }
                        c0367jj.f1044h = (InterfaceC0573r[]) arrayList5.toArray(new InterfaceC0573r[arrayList5.size()]);
                    }
                }
                for (AbstractC0428lq abstractC0428lq9 : arrayList3) {
                    if ((abstractC0428lq9 instanceof C0627t) && c0367jj.f1039c[abstractC0428lq9.f1165f].f1287c) {
                        AbstractC0428lq abstractC0428lq10 = abstractC0428lq9.m1406k(abstractC0428lq9.f1167h.size() - 1).f1292g;
                        if ((abstractC0428lq10 instanceof aaj) && abstractC0428lq10.f1166g && (abstractC0428lq10.m1406k(0).f1292g instanceof C0328hy)) {
                            ((C0627t) abstractC0428lq9).f1523c = true;
                        }
                    }
                }
                this.f1122f.getClass();
                for (AbstractC0428lq abstractC0428lq11 : arrayList3) {
                    if (abstractC0428lq11 != null) {
                        boolean z = abstractC0428lq11.f1166g;
                        ArrayList arrayList6 = abstractC0428lq11.f1167h;
                        m1367g(z || arrayList6.size() <= 1);
                        if (abstractC0428lq11 instanceof C0512ot) {
                            m1367g(((C0512ot) abstractC0428lq11).f1351b != null);
                        }
                        if (abstractC0428lq11 instanceof C0627t) {
                            C0627t c0627t = (C0627t) abstractC0428lq11;
                            m1367g(c0627t.f1522b != null);
                            m1367g(c0627t.f1167h.size() == 2);
                            if (c0627t.m1406k(0).f1292g instanceof C0141b) {
                                m1367g(c0627t.m1406k(1).f1292g instanceof aaj);
                                m1367g(!c0627t.f550m);
                            } else {
                                if (!(c0627t.m1406k(0).f1292g instanceof aaj)) {
                                    throw new IllegalStateException();
                                }
                                m1367g(c0627t.m1406k(1).f1292g instanceof C0141b);
                                m1367g(c0627t.f550m);
                            }
                        }
                        if (abstractC0428lq11 instanceof C0335ie) {
                            m1367g(arrayList6.size() == 1);
                            m1367g(abstractC0428lq11.m1406k(0).f1292g instanceof C0627t);
                        }
                        if (abstractC0428lq11 instanceof aaj) {
                            m1367g(((aaj) abstractC0428lq11).f445b != null);
                        }
                        if (abstractC0428lq11 instanceof C0478nm) {
                            m1367g(((C0478nm) abstractC0428lq11).f1286b != null);
                        }
                        if (abstractC0428lq11 instanceof AbstractC0559qm) {
                            m1367g(((AbstractC0559qm) abstractC0428lq11).f1409c != null);
                        }
                        if (abstractC0428lq11 instanceof C0558ql) {
                            m1367g(((C0558ql) abstractC0428lq11).f1408b != null);
                        }
                        if (abstractC0428lq11 instanceof acc) {
                            acc accVar2 = (acc) abstractC0428lq11;
                            m1367g(accVar2.f1167h.size() <= 1 || accVar2.f549l >= 0);
                        } else {
                            m1367g(arrayList6.size() <= 1 || (abstractC0428lq11 instanceof C0328hy));
                        }
                    }
                }
                return c0367jj;
            }
            int i36 = i7 + 1;
            char c21 = cArr2[i7];
            if (c21 == 0) {
                arrayList3.add(null);
                i7 = i36;
            } else {
                int i37 = i7 + 2;
                char c22 = cArr2[i36];
                if (c22 == 65535) {
                    i3 = c22;
                    i3 = -1;
                }
                switch (c21) {
                    case 0:
                        c = '\f';
                        abstractC0428lq = null;
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case 1:
                        c0557qk = new C0557qk();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case 2:
                        c0557qk = new C0478nm();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case 3:
                        c0557qk = new C0556qj();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case 4:
                        c0557qk = new C0512ot();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case 5:
                        c0557qk = new C0141b();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case 6:
                        c0557qk = new C0382jy();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case 7:
                        c0557qk = new C0328hy();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case '\b':
                        c0557qk = new C0558ql();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case '\t':
                        c0557qk = new C0335ie();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case '\n':
                        c0557qk = new C0627t();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case 11:
                        c0557qk = new C0472ng();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    case '\f':
                        c0557qk = new aaj();
                        c0557qk.f1165f = i3;
                        abstractC0428lq = c0557qk;
                        c = '\f';
                        if (c21 != c) {
                            if (abstractC0428lq instanceof AbstractC0559qm) {
                                i4 = i7 + 3;
                                arrayList2.add(new aam((AbstractC0559qm) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0428lq != null) {
                                abstractC0428lq.f1163d = c0367jj;
                                abstractC0428lq.f1164e = arrayList3.size();
                            }
                            arrayList3.add(abstractC0428lq);
                            i7 = i37;
                        } else {
                            i4 = i7 + 3;
                            arrayList.add(new aam((aaj) abstractC0428lq, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0428lq != null) {
                            abstractC0428lq.f1163d = c0367jj;
                            abstractC0428lq.f1164e = arrayList3.size();
                        }
                        arrayList3.add(abstractC0428lq);
                        i7 = i37;
                        break;
                    default:
                        Locale locale = Locale.getDefault();
                        Object[] objArr = new Object[1];
                        objArr[c2] = Integer.valueOf(c21);
                        throw new IllegalArgumentException(String.format(locale, "The specified state type %d is not valid.", objArr));
                }
            }
            i6++;
            c2 = 0;
        }
    }
}
