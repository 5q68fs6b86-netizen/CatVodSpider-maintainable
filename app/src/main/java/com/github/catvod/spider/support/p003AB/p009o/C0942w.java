package com.github.catvod.spider.support.p003AB.p009o;

import android.text.TextUtils;
import com.github.catvod.spider.support.p003AB.p005b.C0824H;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0942w {

    /* JADX INFO: renamed from: a */
    private static final char[] f2228a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final Map<char[], Map<Character, Integer>> f2229b = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    static char m2280b(char[] cArr, Character ch) {
        Map<char[], Map<Character, Integer>> map = f2229b;
        ?? map2 = (Map) map.get(cArr);
        if (map2 == 0) {
            map2 = new HashMap();
            map.put(cArr, (Map<Character, Integer>) map2);
            for (int i = 0; i < cArr.length; i++) {
                map2.put(Character.valueOf(cArr[i]), Integer.valueOf(i));
            }
        }
        return (char) ((Integer) map2.get(ch)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0194  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:115:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:77:0x0121  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:81:0x0134  */
    /* JADX WARN: Code duplicated, block: B:83:0x013b  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f  */
    /* JADX WARN: Code duplicated, block: B:86:0x014a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:90:0x0155  */
    /* JADX WARN: Code duplicated, block: B:95:0x017a  */
    /* JADX WARN: Code duplicated, block: B:96:0x017d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX INFO: renamed from: c */
    public static String m2281c(String str) {
        int i;
        int i2;
        int i3;
        char cM2278a;
        String strValueOf;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        int i9;
        char c2;
        int i10;
        int i11;
        int i12;
        int i13;
        char cM2278a2;
        int i14;
        int i15;
        String string;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        char cM2278a3;
        int i22;
        int i23;
        int i24;
        int i25;
        char cM2278a4;
        int i26;
        int i27;
        int i28;
        char cM2278a5;
        int i29;
        char cM2278a6;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        C0941v c0941v = new C0941v(str);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char cM2278a7 = c0941v.m2278a(0);
        int i30 = 0;
        while (true) {
            i = 3;
            if (i30 >= 3) {
                break;
            }
            arrayList.add(i30, String.valueOf((char) i30));
            i30++;
        }
        int i31 = 1;
        int i32 = 0;
        int i33 = 1;
        int i34 = 1;
        int i35 = 32;
        while (i33 != 4) {
            int i36 = i35 >> 1;
            if (i36 == 0) {
                cM2278a6 = c0941v.m2278a(i34);
                i34++;
                i29 = 32;
            } else {
                i29 = i36;
                cM2278a6 = cM2278a7;
            }
            i32 |= ((cM2278a7 & i35) > 0 ? 1 : 0) * i33;
            i33 <<= 1;
            cM2278a7 = cM2278a6;
            i35 = i29;
        }
        if (i32 != 0) {
            if (i32 == 1) {
                i32 = 0;
                int i37 = 1;
                while (i37 != 65536) {
                    int i38 = i35 >> 1;
                    if (i38 == 0) {
                        cM2278a5 = c0941v.m2278a(i34);
                        i27 = i34 + 1;
                        i28 = 32;
                    } else {
                        i27 = i34;
                        i28 = i38;
                        cM2278a5 = cM2278a7;
                    }
                    i32 |= ((cM2278a7 & i35) > 0 ? 1 : 0) * i37;
                    i37 <<= 1;
                    i35 = i28;
                    cM2278a7 = cM2278a5;
                    i34 = i27;
                }
            } else {
                if (i32 == 2) {
                    return "";
                }
                strValueOf = null;
            }
            arrayList.add(3, strValueOf);
            sb.append(strValueOf);
            i4 = 4;
            i5 = 4;
            while (i34 <= length) {
                i6 = i31 << i;
                i7 = i31;
                i8 = 0;
                while (i7 != i6) {
                    i23 = i35 >> 1;
                    if (i23 == 0) {
                        cM2278a4 = c0941v.m2278a(i34);
                        i24 = i34 + 1;
                        i25 = 32;
                    } else {
                        i24 = i34;
                        i25 = i23;
                        cM2278a4 = cM2278a7;
                    }
                    if ((cM2278a7 & i35) > 0) {
                        i26 = i31;
                    } else {
                        i26 = 0;
                    }
                    i8 |= i26 * i7;
                    i7 <<= 1;
                    i35 = i25;
                    cM2278a7 = cM2278a4;
                    i34 = i24;
                }
                if (i8 != 0) {
                    if (i8 != i31) {
                        i17 = i31;
                        i18 = 0;
                        while (i17 != 65536) {
                            i19 = i35 >> 1;
                            if (i19 == 0) {
                                cM2278a3 = c0941v.m2278a(i34);
                                i20 = i34 + 1;
                                i21 = 32;
                            } else {
                                i20 = i34;
                                i21 = i19;
                                cM2278a3 = cM2278a7;
                            }
                            if ((cM2278a7 & i35) > 0) {
                                i22 = 1;
                            } else {
                                i22 = 0;
                            }
                            i18 |= i22 * i17;
                            i17 <<= 1;
                            i35 = i21;
                            cM2278a7 = cM2278a3;
                            i34 = i20;
                        }
                        i10 = i4 + 1;
                        c2 = (char) i18;
                        c = 256;
                    } else {
                        if (i8 != 2) {
                            return sb.toString();
                        }
                        c = 256;
                    }
                    if (i5 == 0) {
                        i++;
                    } else {
                        i6 = i5;
                    }
                    if (i8 >= arrayList.size() && arrayList.get(i8) != null) {
                        string = (String) arrayList.get(i8);
                        i15 = 0;
                    } else {
                        if (i8 != i4) {
                            return null;
                        }
                        StringBuilder sbM1967a = C0824H.m1967a(strValueOf);
                        i15 = 0;
                        sbM1967a.append(strValueOf.charAt(0));
                        string = sbM1967a.toString();
                    }
                    sb.append(string);
                    StringBuilder sbM1967a2 = C0824H.m1967a(strValueOf);
                    sbM1967a2.append(string.charAt(i15));
                    arrayList.add(i4, sbM1967a2.toString());
                    i16 = i6 - 1;
                    if (i16 == 0) {
                        i16 = 1 << i;
                        i++;
                    }
                    i4++;
                    i5 = i16;
                    i31 = 1;
                    strValueOf = string;
                } else {
                    c = 256;
                    i9 = 1;
                    while (i9 != 256) {
                        i11 = i35 >> 1;
                        if (i11 == 0) {
                            cM2278a2 = c0941v.m2278a(i34);
                            i12 = i34 + 1;
                            i13 = 32;
                        } else {
                            i12 = i34;
                            i13 = i11;
                            cM2278a2 = cM2278a7;
                        }
                        if ((cM2278a7 & i35) > 0) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        i8 |= i14 * i9;
                        i9 <<= 1;
                        i35 = i13;
                        cM2278a7 = cM2278a2;
                        i34 = i12;
                    }
                    c2 = (char) i8;
                    i10 = i4 + 1;
                }
                arrayList.add(i4, String.valueOf(c2));
                i5--;
                int i39 = i10;
                i8 = i10 - 1;
                i4 = i39;
                if (i5 == 0) {
                    i++;
                } else {
                    i6 = i5;
                }
                if (i8 >= arrayList.size()) {
                    if (i8 != i4) {
                        return null;
                    }
                    StringBuilder sbM1967a3 = C0824H.m1967a(strValueOf);
                    i15 = 0;
                    sbM1967a3.append(strValueOf.charAt(0));
                    string = sbM1967a3.toString();
                } else {
                    if (i8 != i4) {
                        return null;
                    }
                    StringBuilder sbM1967a4 = C0824H.m1967a(strValueOf);
                    i15 = 0;
                    sbM1967a4.append(strValueOf.charAt(0));
                    string = sbM1967a4.toString();
                }
                sb.append(string);
                StringBuilder sbM1967a5 = C0824H.m1967a(strValueOf);
                sbM1967a5.append(string.charAt(i15));
                arrayList.add(i4, sbM1967a5.toString());
                i16 = i6 - 1;
                if (i16 == 0) {
                    i16 = 1 << i;
                    i++;
                }
                i4++;
                i5 = i16;
                i31 = 1;
                strValueOf = string;
            }
            return "";
        }
        int i40 = 1;
        while (i40 != 256) {
            int i41 = i35 >> 1;
            if (i41 == 0) {
                cM2278a = c0941v.m2278a(i34);
                i2 = i34 + 1;
                i3 = 32;
            } else {
                i2 = i34;
                i3 = i41;
                cM2278a = cM2278a7;
            }
            i32 |= ((cM2278a7 & i35) > 0 ? 1 : 0) * i40;
            i40 <<= 1;
            i35 = i3;
            cM2278a7 = cM2278a;
            i34 = i2;
        }
        strValueOf = String.valueOf((char) i32);
        arrayList.add(3, strValueOf);
        sb.append(strValueOf);
        i4 = 4;
        i5 = 4;
        while (i34 <= length) {
            i6 = i31 << i;
            i7 = i31;
            i8 = 0;
            while (i7 != i6) {
                i23 = i35 >> 1;
                if (i23 == 0) {
                    cM2278a4 = c0941v.m2278a(i34);
                    i24 = i34 + 1;
                    i25 = 32;
                } else {
                    i24 = i34;
                    i25 = i23;
                    cM2278a4 = cM2278a7;
                }
                if ((cM2278a7 & i35) > 0) {
                    i26 = i31;
                } else {
                    i26 = 0;
                }
                i8 |= i26 * i7;
                i7 <<= 1;
                i35 = i25;
                cM2278a7 = cM2278a4;
                i34 = i24;
            }
            if (i8 != 0) {
                if (i8 != i31) {
                    i17 = i31;
                    i18 = 0;
                    while (i17 != 65536) {
                        i19 = i35 >> 1;
                        if (i19 == 0) {
                            cM2278a3 = c0941v.m2278a(i34);
                            i20 = i34 + 1;
                            i21 = 32;
                        } else {
                            i20 = i34;
                            i21 = i19;
                            cM2278a3 = cM2278a7;
                        }
                        if ((cM2278a7 & i35) > 0) {
                            i22 = 1;
                        } else {
                            i22 = 0;
                        }
                        i18 |= i22 * i17;
                        i17 <<= 1;
                        i35 = i21;
                        cM2278a7 = cM2278a3;
                        i34 = i20;
                    }
                    i10 = i4 + 1;
                    c2 = (char) i18;
                    c = 256;
                } else {
                    if (i8 != 2) {
                        return sb.toString();
                    }
                    c = 256;
                }
                if (i5 == 0) {
                    i++;
                } else {
                    i6 = i5;
                }
                if (i8 >= arrayList.size()) {
                    if (i8 != i4) {
                        return null;
                    }
                    StringBuilder sbM1967a6 = C0824H.m1967a(strValueOf);
                    i15 = 0;
                    sbM1967a6.append(strValueOf.charAt(0));
                    string = sbM1967a6.toString();
                } else {
                    if (i8 != i4) {
                        return null;
                    }
                    StringBuilder sbM1967a7 = C0824H.m1967a(strValueOf);
                    i15 = 0;
                    sbM1967a7.append(strValueOf.charAt(0));
                    string = sbM1967a7.toString();
                }
                sb.append(string);
                StringBuilder sbM1967a8 = C0824H.m1967a(strValueOf);
                sbM1967a8.append(string.charAt(i15));
                arrayList.add(i4, sbM1967a8.toString());
                i16 = i6 - 1;
                if (i16 == 0) {
                    i16 = 1 << i;
                    i++;
                }
                i4++;
                i5 = i16;
                i31 = 1;
                strValueOf = string;
            } else {
                c = 256;
                i9 = 1;
                while (i9 != 256) {
                    i11 = i35 >> 1;
                    if (i11 == 0) {
                        cM2278a2 = c0941v.m2278a(i34);
                        i12 = i34 + 1;
                        i13 = 32;
                    } else {
                        i12 = i34;
                        i13 = i11;
                        cM2278a2 = cM2278a7;
                    }
                    if ((cM2278a7 & i35) > 0) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    i8 |= i14 * i9;
                    i9 <<= 1;
                    i35 = i13;
                    cM2278a7 = cM2278a2;
                    i34 = i12;
                }
                c2 = (char) i8;
                i10 = i4 + 1;
            }
            arrayList.add(i4, String.valueOf(c2));
            i5--;
            int i310 = i10;
            i8 = i10 - 1;
            i4 = i310;
            if (i5 == 0) {
                i++;
            } else {
                i6 = i5;
            }
            if (i8 >= arrayList.size()) {
                if (i8 != i4) {
                    return null;
                }
                StringBuilder sbM1967a9 = C0824H.m1967a(strValueOf);
                i15 = 0;
                sbM1967a9.append(strValueOf.charAt(0));
                string = sbM1967a9.toString();
            } else {
                if (i8 != i4) {
                    return null;
                }
                StringBuilder sbM1967a10 = C0824H.m1967a(strValueOf);
                i15 = 0;
                sbM1967a10.append(strValueOf.charAt(0));
                string = sbM1967a10.toString();
            }
            sb.append(string);
            StringBuilder sbM1967a11 = C0824H.m1967a(strValueOf);
            sbM1967a11.append(string.charAt(i15));
            arrayList.add(i4, sbM1967a11.toString());
            i16 = i6 - 1;
            if (i16 == 0) {
                i16 = 1 << i;
                i++;
            }
            i4++;
            i5 = i16;
            i31 = 1;
            strValueOf = string;
        }
        return "";
    }
}
