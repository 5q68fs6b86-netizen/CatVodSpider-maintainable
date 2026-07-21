package com.github.catvod.spider.support.p128m;

import com.github.catvod.spider.support.p116a.C2137a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2262e {

    /* JADX INFO: renamed from: a */
    private static char[] f5637a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

    /* JADX INFO: renamed from: b */
    private static char[] f5638b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+-$".toCharArray();

    /* JADX INFO: renamed from: c */
    private static HashMap<char[], HashMap<Character, Integer>> f5639c = new HashMap<>();

    /* JADX INFO: renamed from: com.github.catvod.spider.support.m.e$a */
    final class a extends b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ char[] f5640a;

        a(char[] cArr) {
            this.f5640a = cArr;
        }

        /* JADX INFO: renamed from: a */
        public final Character m6149a(int i) {
            return Character.valueOf(C2262e.m6147b(C2262e.f5637a, Character.valueOf(this.f5640a[i])));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.m.e$b */
    private static abstract class b {
        b() {
        }
    }

    static {
        char[][] cArr = {f5637a, f5638b};
        for (int i = 0; i < 2; i++) {
            char[] cArr2 = cArr[i];
            if (f5639c.get(cArr2) == null) {
                HashMap<Character, Integer> map = new HashMap<>();
                f5639c.put(cArr2, map);
                for (int i2 = 0; i2 < cArr2.length; i2++) {
                    map.put(Character.valueOf(cArr2[i2]), Integer.valueOf(i2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static char m6147b(char[] cArr, Character ch) {
        return (char) f5639c.get(cArr).get(ch).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:103:0x0218  */
    /* JADX WARN: Code duplicated, block: B:104:0x0227  */
    /* JADX WARN: Code duplicated, block: B:113:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0144 A[LOOP:4: B:68:0x013e->B:70:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x01af  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01db  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e9 A[DONT_INVERT] */
    /* JADX INFO: renamed from: c */
    public static String m6148c(String str) {
        double d;
        int i;
        String strValueOf;
        int i2;
        double dPow;
        int i3;
        double d2;
        int iPow;
        int i4;
        int i5;
        int i6;
        int iPow2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String string;
        double d3;
        int iPow3;
        int i12;
        int i13;
        int i14;
        StringBuilder sb;
        Iterator it;
        int i15;
        int i16;
        String str2 = "";
        if (str == null) {
            return "";
        }
        if (str == "") {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        a aVar = new a(charArray);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        char cCharValue = aVar.m6149a(0).charValue();
        for (int i17 = 0; i17 < 3; i17++) {
            arrayList.add(i17, String.valueOf((char) i17));
        }
        int iPow4 = (int) Math.pow(2.0d, 2.0d);
        int i18 = 1;
        int i19 = 0;
        int i20 = 32;
        for (int i21 = 1; i21 != iPow4; i21 <<= 1) {
            int i22 = cCharValue & i20;
            i20 >>= 1;
            if (i20 == 0) {
                int i23 = i18 + 1;
                char cCharValue2 = aVar.m6149a(i18).charValue();
                i20 = 32;
                i18 = i23;
                cCharValue = cCharValue2;
            }
            i19 |= (i22 > 0 ? 1 : 0) * i21;
        }
        if (i19 != 0) {
            if (i19 == 1) {
                int iPow5 = (int) Math.pow(2.0d, 16.0d);
                int i24 = 0;
                for (int i25 = 1; i25 != iPow5; i25 <<= 1) {
                    int i26 = cCharValue & i20;
                    int i27 = i20 >> 1;
                    if (i27 == 0) {
                        char cCharValue3 = aVar.m6149a(i18).charValue();
                        i18++;
                        cCharValue = cCharValue3;
                        i20 = 32;
                    } else {
                        i20 = i27;
                    }
                    i24 |= (i26 > 0 ? 1 : 0) * i25;
                }
                i = i24;
                d = 2.0d;
            } else {
                if (i19 == 2) {
                    return "";
                }
                strValueOf = null;
                i2 = 3;
                d = 2.0d;
            }
            arrayList.add(i2, strValueOf);
            arrayList2.add(strValueOf);
            dPow = 4.0d;
            i3 = 4;
            while (i18 <= length) {
                String str3 = str2;
                int i28 = length;
                d2 = i2;
                iPow = (int) Math.pow(d, d2);
                i4 = 0;
                for (i5 = 1; i5 != iPow; i5 <<= 1) {
                    i15 = cCharValue & i20;
                    i20 >>= 1;
                    if (i20 == 0) {
                        int i29 = i18 + 1;
                        char cCharValue4 = aVar.m6149a(i18).charValue();
                        i20 = 32;
                        i18 = i29;
                        cCharValue = cCharValue4;
                    }
                    if (i15 > 0) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    i4 |= i16 * i5;
                }
                if (i4 != 0) {
                    if (i4 != 1) {
                        i6 = i20;
                        iPow3 = (int) Math.pow(2.0d, 16.0d);
                        i8 = 0;
                        for (i12 = 1; i12 != iPow3; i12 <<= 1) {
                            i13 = cCharValue & i6;
                            i6 >>= 1;
                            if (i6 == 0) {
                                int i30 = i18 + 1;
                                char cCharValue5 = aVar.m6149a(i18).charValue();
                                i6 = 32;
                                i18 = i30;
                                cCharValue = cCharValue5;
                            }
                            if (i13 > 0) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                            i8 |= i14 * i12;
                        }
                    } else if (i4 == 2) {
                        sb = new StringBuilder(arrayList2.size());
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                        }
                        return sb.toString();
                    }
                    if (dPow == 0.0d) {
                        dPow = Math.pow(2.0d, d2);
                        i2++;
                    }
                    if (i4 >= arrayList.size() && arrayList.get(i4) != null) {
                        string = (String) arrayList.get(i4);
                        i11 = 0;
                    } else {
                        if (i4 != i3) {
                            return null;
                        }
                        StringBuilder sbM5396a = C2137a.m5396a(strValueOf);
                        i11 = 0;
                        sbM5396a.append(strValueOf.charAt(0));
                        string = sbM5396a.toString();
                    }
                    arrayList2.add(string);
                    int i31 = i3 + 1;
                    StringBuilder sbM5396a2 = C2137a.m5396a(strValueOf);
                    sbM5396a2.append(string.charAt(i11));
                    arrayList.add(i3, sbM5396a2.toString());
                    dPow -= 1.0d;
                    if (dPow == 0.0d) {
                        double dPow2 = Math.pow(2.0d, i2);
                        i2++;
                        d3 = 2.0d;
                        dPow = dPow2;
                    } else {
                        d3 = 2.0d;
                    }
                    strValueOf = string;
                    length = i28;
                    str2 = str3;
                    i3 = i31;
                    d = d3;
                } else {
                    i6 = i20;
                    iPow2 = (int) Math.pow(2.0d, 8.0d);
                    i8 = 0;
                    for (i7 = 1; i7 != iPow2; i7 <<= 1) {
                        i9 = cCharValue & i6;
                        i6 >>= 1;
                        if (i6 == 0) {
                            int i32 = i18 + 1;
                            char cCharValue6 = aVar.m6149a(i18).charValue();
                            i6 = 32;
                            i18 = i32;
                            cCharValue = cCharValue6;
                        }
                        if (i9 > 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        i8 |= i10 * i7;
                    }
                }
                int i33 = i3 + 1;
                arrayList.add(i3, String.valueOf((char) i8));
                i4 = i33 - 1;
                dPow -= 1.0d;
                i3 = i33;
                i20 = i6;
                if (dPow == 0.0d) {
                    dPow = Math.pow(2.0d, d2);
                    i2++;
                }
                if (i4 >= arrayList.size()) {
                    if (i4 != i3) {
                        return null;
                    }
                    StringBuilder sbM5396a3 = C2137a.m5396a(strValueOf);
                    i11 = 0;
                    sbM5396a3.append(strValueOf.charAt(0));
                    string = sbM5396a3.toString();
                } else {
                    if (i4 != i3) {
                        return null;
                    }
                    StringBuilder sbM5396a4 = C2137a.m5396a(strValueOf);
                    i11 = 0;
                    sbM5396a4.append(strValueOf.charAt(0));
                    string = sbM5396a4.toString();
                }
                arrayList2.add(string);
                int i34 = i3 + 1;
                StringBuilder sbM5396a5 = C2137a.m5396a(strValueOf);
                sbM5396a5.append(string.charAt(i11));
                arrayList.add(i3, sbM5396a5.toString());
                dPow -= 1.0d;
                if (dPow == 0.0d) {
                    double dPow3 = Math.pow(2.0d, i2);
                    i2++;
                    d3 = 2.0d;
                    dPow = dPow3;
                } else {
                    d3 = 2.0d;
                }
                strValueOf = string;
                length = i28;
                str2 = str3;
                i3 = i34;
                d = d3;
            }
            return str2;
        }
        d = 2.0d;
        int iPow6 = (int) Math.pow(2.0d, 8.0d);
        i = 0;
        for (int i35 = 1; i35 != iPow6; i35 <<= 1) {
            int i36 = cCharValue & i20;
            int i37 = i20 >> 1;
            if (i37 == 0) {
                int i38 = i18 + 1;
                char cCharValue7 = aVar.m6149a(i18).charValue();
                i20 = 32;
                i18 = i38;
                cCharValue = cCharValue7;
            } else {
                i20 = i37;
            }
            i |= (i36 > 0 ? 1 : 0) * i35;
        }
        strValueOf = String.valueOf((char) i);
        i2 = 3;
        arrayList.add(i2, strValueOf);
        arrayList2.add(strValueOf);
        dPow = 4.0d;
        i3 = 4;
        while (i18 <= length) {
            String str4 = str2;
            int i210 = length;
            d2 = i2;
            iPow = (int) Math.pow(d, d2);
            i4 = 0;
            while (i5 != iPow) {
                i15 = cCharValue & i20;
                i20 >>= 1;
                if (i20 == 0) {
                    int i211 = i18 + 1;
                    char cCharValue8 = aVar.m6149a(i18).charValue();
                    i20 = 32;
                    i18 = i211;
                    cCharValue = cCharValue8;
                }
                if (i15 > 0) {
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                i4 |= i16 * i5;
            }
            if (i4 != 0) {
                if (i4 != 1) {
                    i6 = i20;
                    iPow3 = (int) Math.pow(2.0d, 16.0d);
                    i8 = 0;
                    while (i12 != iPow3) {
                        i13 = cCharValue & i6;
                        i6 >>= 1;
                        if (i6 == 0) {
                            int i39 = i18 + 1;
                            char cCharValue9 = aVar.m6149a(i18).charValue();
                            i6 = 32;
                            i18 = i39;
                            cCharValue = cCharValue9;
                        }
                        if (i13 > 0) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        i8 |= i14 * i12;
                    }
                } else if (i4 == 2) {
                    sb = new StringBuilder(arrayList2.size());
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                    return sb.toString();
                }
                if (dPow == 0.0d) {
                    dPow = Math.pow(2.0d, d2);
                    i2++;
                }
                if (i4 >= arrayList.size()) {
                    if (i4 != i3) {
                        return null;
                    }
                    StringBuilder sbM5396a6 = C2137a.m5396a(strValueOf);
                    i11 = 0;
                    sbM5396a6.append(strValueOf.charAt(0));
                    string = sbM5396a6.toString();
                } else {
                    if (i4 != i3) {
                        return null;
                    }
                    StringBuilder sbM5396a7 = C2137a.m5396a(strValueOf);
                    i11 = 0;
                    sbM5396a7.append(strValueOf.charAt(0));
                    string = sbM5396a7.toString();
                }
                arrayList2.add(string);
                int i310 = i3 + 1;
                StringBuilder sbM5396a8 = C2137a.m5396a(strValueOf);
                sbM5396a8.append(string.charAt(i11));
                arrayList.add(i3, sbM5396a8.toString());
                dPow -= 1.0d;
                if (dPow == 0.0d) {
                    double dPow4 = Math.pow(2.0d, i2);
                    i2++;
                    d3 = 2.0d;
                    dPow = dPow4;
                } else {
                    d3 = 2.0d;
                }
                strValueOf = string;
                length = i210;
                str2 = str4;
                i3 = i310;
                d = d3;
            } else {
                i6 = i20;
                iPow2 = (int) Math.pow(2.0d, 8.0d);
                i8 = 0;
                while (i7 != iPow2) {
                    i9 = cCharValue & i6;
                    i6 >>= 1;
                    if (i6 == 0) {
                        int i311 = i18 + 1;
                        char cCharValue10 = aVar.m6149a(i18).charValue();
                        i6 = 32;
                        i18 = i311;
                        cCharValue = cCharValue10;
                    }
                    if (i9 > 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    i8 |= i10 * i7;
                }
            }
            int i312 = i3 + 1;
            arrayList.add(i3, String.valueOf((char) i8));
            i4 = i312 - 1;
            dPow -= 1.0d;
            i3 = i312;
            i20 = i6;
            if (dPow == 0.0d) {
                dPow = Math.pow(2.0d, d2);
                i2++;
            }
            if (i4 >= arrayList.size()) {
                if (i4 != i3) {
                    return null;
                }
                StringBuilder sbM5396a9 = C2137a.m5396a(strValueOf);
                i11 = 0;
                sbM5396a9.append(strValueOf.charAt(0));
                string = sbM5396a9.toString();
            } else {
                if (i4 != i3) {
                    return null;
                }
                StringBuilder sbM5396a10 = C2137a.m5396a(strValueOf);
                i11 = 0;
                sbM5396a10.append(strValueOf.charAt(0));
                string = sbM5396a10.toString();
            }
            arrayList2.add(string);
            int i313 = i3 + 1;
            StringBuilder sbM5396a11 = C2137a.m5396a(strValueOf);
            sbM5396a11.append(string.charAt(i11));
            arrayList.add(i3, sbM5396a11.toString());
            dPow -= 1.0d;
            if (dPow == 0.0d) {
                double dPow5 = Math.pow(2.0d, i2);
                i2++;
                d3 = 2.0d;
                dPow = dPow5;
            } else {
                d3 = 2.0d;
            }
            strValueOf = string;
            length = i210;
            str2 = str4;
            i3 = i313;
            d = d3;
        }
        return str2;
    }
}
