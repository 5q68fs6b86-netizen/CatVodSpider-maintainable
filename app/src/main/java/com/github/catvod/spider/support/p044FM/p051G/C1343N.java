package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p047C.C1300c;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p082g.C1812j;
import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1343N implements Serializable {

    /* JADX INFO: renamed from: f */
    private static final InterfaceC1372z[] f3098f = new InterfaceC1372z[0];

    /* JADX INFO: renamed from: g */
    private static final ConcurrentMap<C1332C, String> f3099g = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: a */
    private final String f3100a;

    /* JADX INFO: renamed from: b */
    private final TimeZone f3101b;

    /* JADX INFO: renamed from: c */
    private final Locale f3102c;

    /* JADX INFO: renamed from: d */
    private transient InterfaceC1372z[] f3103d;

    /* JADX INFO: renamed from: e */
    private transient int f3104e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b8 A[FALL_THROUGH, PHI: r12
      0x01b8: PHI (r12v8 int) = (r12v7 int), (r12v9 int) binds: [B:50:0x00e8, B:101:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e9 A[PHI: r7
      0x01e9: PHI (r7v12 com.github.catvod.spider.support.FM.G.z) = (r7v29 com.github.catvod.spider.support.FM.G.z), (r7v30 com.github.catvod.spider.support.FM.G.z) binds: [B:113:0x01e1, B:68:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x0206 A[LOOP:2: B:118:0x0202->B:120:0x0206, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0178  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a A[PHI: r14
      0x018a: PHI (r14v6 int) = (r14v5 int), (r14v7 int), (r14v8 int), (r14v9 int), (r14v10 int), (r14v11 int), (r14v13 int), (r14v14 int) binds: [B:48:0x00e4, B:62:0x0131, B:60:0x0126, B:57:0x010c, B:56:0x0108, B:54:0x00fa, B:83:0x0189, B:77:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x0195  */
    /* JADX WARN: Code duplicated, block: B:90:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:92:0x019e  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b1  */
    protected C1343N(String str, TimeZone timeZone, Locale locale) {
        int length;
        int iMo3319c;
        String[] strArr;
        String string;
        int i;
        int length2;
        char cCharAt;
        InterfaceC1370x interfaceC1370xM3329i;
        InterfaceC1372z c1342m;
        InterfaceC1372z c1331b;
        Locale locale2;
        int i2;
        int i3;
        int i4;
        String strSubstring;
        String[] strArr2;
        this.f3100a = str;
        this.f3101b = timeZone;
        Locale localeM3243a = C1300c.m3243a(locale);
        this.f3102c = localeM3243a;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(localeM3243a);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length3 = str.length();
        int[] iArr = new int[1];
        char c = 0;
        int i5 = 0;
        while (i5 < length3) {
            iArr[c] = i5;
            String str2 = this.f3100a;
            StringBuilder sb = new StringBuilder();
            int i6 = iArr[c];
            int length4 = str2.length();
            char cCharAt2 = str2.charAt(i6);
            int i7 = length3;
            if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < 'a' || cCharAt2 > 'z')) {
                char c2 = '\'';
                sb.append('\'');
                boolean z = false;
                while (true) {
                    if (i6 < length4) {
                        char cCharAt3 = str2.charAt(i6);
                        if (cCharAt3 == c2) {
                            int i8 = i6 + 1;
                            strArr = weekdays;
                            if (i8 >= length4 || str2.charAt(i8) != '\'') {
                                z = !z;
                            } else {
                                sb.append(cCharAt3);
                                i6 = i8;
                            }
                        } else {
                            strArr = weekdays;
                            if (z || ((cCharAt3 < 'A' || cCharAt3 > 'Z') && (cCharAt3 < 'a' || cCharAt3 > 'z'))) {
                                sb.append(cCharAt3);
                            } else {
                                i6--;
                            }
                        }
                        i6++;
                        c2 = '\'';
                        weekdays = strArr;
                    }
                    iArr[0] = i6;
                    string = sb.toString();
                    i = iArr[0];
                    length2 = string.length();
                    if (length2 == 0) {
                        InterfaceC1372z[] interfaceC1372zArr = (InterfaceC1372z[]) arrayList.toArray(f3098f);
                        this.f3103d = interfaceC1372zArr;
                        length = interfaceC1372zArr.length;
                        iMo3319c = 0;
                        while (true) {
                            length--;
                            if (length < 0) {
                                this.f3104e = iMo3319c;
                                return;
                            }
                            iMo3319c += this.f3103d[length].mo3319c();
                        }
                    } else {
                        cCharAt = string.charAt(0);
                        if (cCharAt == 'y') {
                            if (length2 == 2) {
                                interfaceC1370xM3329i = C1339J.f3094a;
                            } else {
                                interfaceC1370xM3329i = m3329i(1, Math.max(length2, 4));
                            }
                            c1331b = interfaceC1370xM3329i;
                            if (cCharAt == 'Y') {
                                c1342m = new C1342M(interfaceC1370xM3329i);
                            } else {
                                c1342m = c1331b;
                            }
                        } else if (cCharAt != 'z') {
                            i3 = 11;
                            i4 = 10;
                            switch (cCharAt) {
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    strSubstring = string.substring(1);
                                    if (strSubstring.length() == 1) {
                                        c1342m = new C1330A(strSubstring);
                                    } else {
                                        c1342m = new C1367u(strSubstring.charAt(0));
                                    }
                                    break;
                                case 'K':
                                    c1342m = m3329i(i4, length2);
                                    break;
                                case 'M':
                                    if (length2 >= 4) {
                                        c1342m = new C1331B(2, months);
                                    } else if (length2 == 3) {
                                        c1331b = new C1331B(2, shortMonths);
                                        c1342m = c1331b;
                                    } else if (length2 == 2) {
                                        c1342m = C1340K.f3095a;
                                    } else {
                                        c1342m = C1337H.f3092a;
                                    }
                                    break;
                                case 'S':
                                    i4 = 14;
                                    c1342m = m3329i(i4, length2);
                                    break;
                                case 'a':
                                    c1342m = new C1331B(9, amPmStrings);
                                    break;
                                case 'd':
                                    i4 = 5;
                                    c1342m = m3329i(i4, length2);
                                    break;
                                case 'h':
                                    c1342m = new C1335F(m3329i(10, length2));
                                    break;
                                case 'k':
                                    c1342m = new C1336G(m3329i(11, length2));
                                    break;
                                case 'm':
                                    i4 = 12;
                                    c1342m = m3329i(i4, length2);
                                    break;
                                case 's':
                                    i4 = 13;
                                    c1342m = m3329i(i4, length2);
                                    break;
                                case 'u':
                                    c1342m = new C1368v(m3329i(7, length2));
                                    break;
                                case 'w':
                                    i4 = 3;
                                    c1342m = m3329i(i4, length2);
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'D':
                                            i4 = 6;
                                            c1342m = m3329i(i4, length2);
                                            break;
                                        case 'E':
                                            if (length2 < 4) {
                                                strArr2 = shortWeekdays;
                                            } else {
                                                strArr2 = strArr;
                                            }
                                            c1342m = new C1331B(7, strArr2);
                                            break;
                                        case 'F':
                                            i4 = 8;
                                            c1342m = m3329i(i4, length2);
                                            break;
                                        case 'G':
                                            c1342m = new C1331B(0, eras);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'W':
                                                    i3 = 4;
                                                    break;
                                                case 'X':
                                                    if (length2 != 1) {
                                                        c1342m = C1369w.f3162b;
                                                    } else if (length2 != 2) {
                                                        c1342m = C1369w.f3163c;
                                                    } else {
                                                        if (length2 == 3) {
                                                            throw new IllegalArgumentException("invalid number of X");
                                                        }
                                                        c1342m = C1369w.f3164d;
                                                    }
                                                    break;
                                                case 'Y':
                                                    if (length2 == 2) {
                                                        interfaceC1370xM3329i = C1339J.f3094a;
                                                    } else {
                                                        interfaceC1370xM3329i = m3329i(1, Math.max(length2, 4));
                                                    }
                                                    c1331b = interfaceC1370xM3329i;
                                                    if (cCharAt == 'Y') {
                                                        c1342m = c1331b;
                                                    } else {
                                                        c1342m = new C1342M(interfaceC1370xM3329i);
                                                    }
                                                    break;
                                                case 'Z':
                                                    if (length2 == 1) {
                                                        c1342m = C1334E.f3088c;
                                                    } else if (length2 == 2) {
                                                        c1342m = C1334E.f3087b;
                                                    } else {
                                                        c1342m = C1369w.f3164d;
                                                    }
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(C1812j.m4399b("Illegal pattern component: ", string));
                                            }
                                        case 'H':
                                            c1342m = m3329i(i3, length2);
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            TimeZone timeZone2 = this.f3101b;
                            if (length2 >= 4) {
                                locale2 = this.f3102c;
                                i2 = 1;
                            } else {
                                locale2 = this.f3102c;
                                i2 = 0;
                            }
                            c1342m = new C1333D(timeZone2, locale2, i2);
                        }
                        arrayList.add(c1342m);
                        i5 = i + 1;
                        c = 0;
                        length3 = i7;
                        weekdays = strArr;
                    }
                }
            } else {
                sb.append(cCharAt2);
                while (true) {
                    int i9 = i6 + 1;
                    if (i9 < length4 && str2.charAt(i9) == cCharAt2) {
                        sb.append(cCharAt2);
                        i6 = i9;
                    }
                }
            }
            strArr = weekdays;
            iArr[0] = i6;
            string = sb.toString();
            i = iArr[0];
            length2 = string.length();
            if (length2 == 0) {
                InterfaceC1372z[] interfaceC1372zArr2 = (InterfaceC1372z[]) arrayList.toArray(f3098f);
                this.f3103d = interfaceC1372zArr2;
                length = interfaceC1372zArr2.length;
                iMo3319c = 0;
                while (true) {
                    length--;
                    if (length < 0) {
                        this.f3104e = iMo3319c;
                        return;
                    }
                    iMo3319c += this.f3103d[length].mo3319c();
                }
            } else {
                cCharAt = string.charAt(0);
                if (cCharAt == 'y') {
                    if (length2 == 2) {
                        interfaceC1370xM3329i = C1339J.f3094a;
                    } else {
                        interfaceC1370xM3329i = m3329i(1, Math.max(length2, 4));
                    }
                    c1331b = interfaceC1370xM3329i;
                    if (cCharAt == 'Y') {
                        c1342m = new C1342M(interfaceC1370xM3329i);
                    } else {
                        c1342m = c1331b;
                    }
                } else if (cCharAt != 'z') {
                    i3 = 11;
                    i4 = 10;
                    switch (cCharAt) {
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            strSubstring = string.substring(1);
                            if (strSubstring.length() == 1) {
                                c1342m = new C1330A(strSubstring);
                            } else {
                                c1342m = new C1367u(strSubstring.charAt(0));
                            }
                            break;
                        case 'K':
                            c1342m = m3329i(i4, length2);
                            break;
                        case 'M':
                            if (length2 >= 4) {
                                c1342m = new C1331B(2, months);
                            } else if (length2 == 3) {
                                c1331b = new C1331B(2, shortMonths);
                                c1342m = c1331b;
                            } else if (length2 == 2) {
                                c1342m = C1340K.f3095a;
                            } else {
                                c1342m = C1337H.f3092a;
                            }
                            break;
                        case 'S':
                            i4 = 14;
                            c1342m = m3329i(i4, length2);
                            break;
                        case 'a':
                            c1342m = new C1331B(9, amPmStrings);
                            break;
                        case 'd':
                            i4 = 5;
                            c1342m = m3329i(i4, length2);
                            break;
                        case 'h':
                            c1342m = new C1335F(m3329i(10, length2));
                            break;
                        case 'k':
                            c1342m = new C1336G(m3329i(11, length2));
                            break;
                        case 'm':
                            i4 = 12;
                            c1342m = m3329i(i4, length2);
                            break;
                        case 's':
                            i4 = 13;
                            c1342m = m3329i(i4, length2);
                            break;
                        case 'u':
                            c1342m = new C1368v(m3329i(7, length2));
                            break;
                        case 'w':
                            i4 = 3;
                            c1342m = m3329i(i4, length2);
                            break;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    i4 = 6;
                                    c1342m = m3329i(i4, length2);
                                    break;
                                case 'E':
                                    if (length2 < 4) {
                                        strArr2 = shortWeekdays;
                                    } else {
                                        strArr2 = strArr;
                                    }
                                    c1342m = new C1331B(7, strArr2);
                                    break;
                                case 'F':
                                    i4 = 8;
                                    c1342m = m3329i(i4, length2);
                                    break;
                                case 'G':
                                    c1342m = new C1331B(0, eras);
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'W':
                                            i3 = 4;
                                            break;
                                        case 'X':
                                            if (length2 != 1) {
                                                c1342m = C1369w.f3162b;
                                            } else if (length2 != 2) {
                                                c1342m = C1369w.f3163c;
                                            } else {
                                                if (length2 == 3) {
                                                    throw new IllegalArgumentException("invalid number of X");
                                                }
                                                c1342m = C1369w.f3164d;
                                            }
                                            break;
                                        case 'Y':
                                            if (length2 == 2) {
                                                interfaceC1370xM3329i = C1339J.f3094a;
                                            } else {
                                                interfaceC1370xM3329i = m3329i(1, Math.max(length2, 4));
                                            }
                                            c1331b = interfaceC1370xM3329i;
                                            if (cCharAt == 'Y') {
                                                c1342m = c1331b;
                                            } else {
                                                c1342m = new C1342M(interfaceC1370xM3329i);
                                            }
                                            break;
                                        case 'Z':
                                            if (length2 == 1) {
                                                c1342m = C1334E.f3088c;
                                            } else if (length2 == 2) {
                                                c1342m = C1334E.f3087b;
                                            } else {
                                                c1342m = C1369w.f3164d;
                                            }
                                            break;
                                        default:
                                            throw new IllegalArgumentException(C1812j.m4399b("Illegal pattern component: ", string));
                                    }
                                case 'H':
                                    c1342m = m3329i(i3, length2);
                                    break;
                            }
                            break;
                    }
                } else {
                    TimeZone timeZone3 = this.f3101b;
                    if (length2 >= 4) {
                        locale2 = this.f3102c;
                        i2 = 1;
                    } else {
                        locale2 = this.f3102c;
                        i2 = 0;
                    }
                    c1342m = new C1333D(timeZone3, locale2, i2);
                }
                arrayList.add(c1342m);
                i5 = i + 1;
                c = 0;
                length3 = i7;
                weekdays = strArr;
            }
        }
        InterfaceC1372z[] interfaceC1372zArr3 = (InterfaceC1372z[]) arrayList.toArray(f3098f);
        this.f3103d = interfaceC1372zArr3;
        length = interfaceC1372zArr3.length;
        iMo3319c = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.f3104e = iMo3319c;
                return;
            }
            iMo3319c += this.f3103d[length].mo3319c();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m3321a(Appendable appendable, int i) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* JADX INFO: renamed from: b */
    static void m3322b(Appendable appendable, int i, int i2) {
        int i3;
        if (i < 10000) {
            if (i >= 1000) {
                i3 = 4;
            } else if (i < 100) {
                i3 = i < 10 ? 1 : 2;
            } else {
                i3 = 3;
            }
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                ((StringBuilder) appendable).append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        ((StringBuilder) appendable).append((char) ((i / DescriptorProtos.Edition.EDITION_2023_VALUE) + 48));
                        i %= DescriptorProtos.Edition.EDITION_2023_VALUE;
                    }
                    if (i >= 100) {
                        ((StringBuilder) appendable).append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        ((StringBuilder) appendable).append('0');
                    }
                }
                if (i >= 10) {
                    ((StringBuilder) appendable).append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    ((StringBuilder) appendable).append('0');
                }
            }
            ((StringBuilder) appendable).append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            ((StringBuilder) appendable).append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            } else {
                ((StringBuilder) appendable).append(cArr[i5]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private String m3323c(Calendar calendar) throws IOException {
        StringBuilder sb = new StringBuilder(this.f3104e);
        try {
            for (InterfaceC1372z interfaceC1372z : this.f3103d) {
                interfaceC1372z.mo3318b(sb, calendar);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.support.FM.G.C, java.lang.String>] */
    /* JADX INFO: renamed from: h */
    static String m3324h(TimeZone timeZone, boolean z, int i, Locale locale) {
        C1332C c1332c = new C1332C(timeZone, z, i, locale);
        ?? r1 = f3099g;
        String str = (String) r1.get(c1332c);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) r1.putIfAbsent(c1332c, displayName);
        return str2 != null ? str2 : displayName;
    }

    /* JADX INFO: renamed from: d */
    final String m3325d(Object obj) throws IOException {
        if (obj instanceof Date) {
            Calendar calendar = Calendar.getInstance(this.f3101b, this.f3102c);
            calendar.setTime((Date) obj);
            return m3323c(calendar);
        }
        if (!(obj instanceof Calendar)) {
            if (!(obj instanceof Long)) {
                StringBuilder sbM3589b = C1434P.m3589b("Unknown class: ");
                sbM3589b.append(obj == null ? "<null>" : obj.getClass().getName());
                throw new IllegalArgumentException(sbM3589b.toString());
            }
            long jLongValue = ((Long) obj).longValue();
            Calendar calendar2 = Calendar.getInstance(this.f3101b, this.f3102c);
            calendar2.setTimeInMillis(jLongValue);
            return m3323c(calendar2);
        }
        Calendar calendar3 = (Calendar) obj;
        StringBuilder sb = new StringBuilder(this.f3104e);
        if (!calendar3.getTimeZone().equals(this.f3101b)) {
            calendar3 = (Calendar) calendar3.clone();
            calendar3.setTimeZone(this.f3101b);
        }
        try {
            for (InterfaceC1372z interfaceC1372z : this.f3103d) {
                interfaceC1372z.mo3318b(sb, calendar3);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Locale m3326e() {
        return this.f3102c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1343N)) {
            return false;
        }
        C1343N c1343n = (C1343N) obj;
        return this.f3100a.equals(c1343n.f3100a) && this.f3101b.equals(c1343n.f3101b) && this.f3102c.equals(c1343n.f3102c);
    }

    /* JADX INFO: renamed from: f */
    public final String m3327f() {
        return this.f3100a;
    }

    /* JADX INFO: renamed from: g */
    public final TimeZone m3328g() {
        return this.f3101b;
    }

    public final int hashCode() {
        return (((this.f3102c.hashCode() * 13) + this.f3101b.hashCode()) * 13) + this.f3100a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    protected final InterfaceC1370x m3329i(int i, int i2) {
        if (i2 != 1) {
            return i2 != 2 ? new C1371y(i, i2) : new C1338I(i);
        }
        return new C1341L(i);
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("FastDatePrinter[");
        sbM3589b.append(this.f3100a);
        sbM3589b.append(",");
        sbM3589b.append(this.f3102c);
        sbM3589b.append(",");
        sbM3589b.append(this.f3101b.getID());
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
