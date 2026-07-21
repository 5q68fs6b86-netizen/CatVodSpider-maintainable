package com.github.catvod.spider.support.p002A0;

import com.google.protobuf.DescriptorProtos;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.hi */
/* JADX INFO: loaded from: classes.dex */
public final class C0312hi implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0654u[] f892a = new InterfaceC0654u[0];

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f893b = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: c */
    public final String f894c;

    /* JADX INFO: renamed from: d */
    public final TimeZone f895d;

    /* JADX INFO: renamed from: e */
    public final Locale f896e;

    /* JADX INFO: renamed from: f */
    public final transient InterfaceC0654u[] f897f;

    /* JADX INFO: renamed from: g */
    public final transient int f898g;

    /* JADX WARN: Code duplicated, block: B:100:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:103:0x01db  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:114:0x0209  */
    /* JADX WARN: Code duplicated, block: B:119:0x0230 A[LOOP:2: B:117:0x022c->B:119:0x0230, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122  */
    /* JADX WARN: Code duplicated, block: B:73:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x012c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0133  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0149  */
    /* JADX WARN: Code duplicated, block: B:83:0x014f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:88:0x017a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0198  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Switch 'out' block B:62:0x0109 for B:49:0x00e5 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:62:0x0109 for B:50:0x00e8 already processed. Defaulting to fallback option. */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.github.catvod.spider.support.A0.xk] */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.github.catvod.spider.support.A0.xk] */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.github.catvod.spider.support.A0.lf] */
    /* JADX WARN: Type inference failed for: r15v14, types: [com.github.catvod.spider.support.A0.ep] */
    /* JADX WARN: Type inference failed for: r15v15, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v16, types: [com.github.catvod.spider.support.A0.ky] */
    /* JADX WARN: Type inference failed for: r15v17, types: [com.github.catvod.spider.support.A0.ky] */
    /* JADX WARN: Type inference failed for: r15v18, types: [com.github.catvod.spider.support.A0.it] */
    /* JADX WARN: Type inference failed for: r15v19, types: [com.github.catvod.spider.support.A0.it] */
    /* JADX WARN: Type inference failed for: r15v20, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v21, types: [com.github.catvod.spider.support.A0.it] */
    /* JADX WARN: Type inference failed for: r15v22, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v23, types: [com.github.catvod.spider.support.A0.j] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v26, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v27, types: [com.github.catvod.spider.support.A0.j] */
    /* JADX WARN: Type inference failed for: r15v28, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v29, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v30, types: [com.github.catvod.spider.support.A0.it] */
    /* JADX WARN: Type inference failed for: r15v31, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v32, types: [com.github.catvod.spider.support.A0.it] */
    /* JADX WARN: Type inference failed for: r15v33, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v34, types: [com.github.catvod.spider.support.A0.h] */
    /* JADX WARN: Type inference failed for: r15v35, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v36, types: [com.github.catvod.spider.support.A0.h] */
    /* JADX WARN: Type inference failed for: r15v37, types: [com.github.catvod.spider.support.A0.h] */
    /* JADX WARN: Type inference failed for: r15v38, types: [com.github.catvod.spider.support.A0.es] */
    /* JADX WARN: Type inference failed for: r15v39, types: [com.github.catvod.spider.support.A0.es] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.github.catvod.spider.support.A0.br] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object] */
    public C0312hi(String str, TimeZone timeZone, Locale locale) {
        int length;
        int iMo1196f;
        int i;
        String string;
        int i2;
        int length2;
        char cCharAt;
        Object objM1275k;
        Object c0357j;
        TimeZone timeZone2;
        String strSubstring;
        String[] strArr;
        String str2 = str;
        this.f894c = str2;
        this.f895d = timeZone;
        Locale localeM1018a = AbstractC0134at.m1018a(locale);
        this.f896e = localeM1018a;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(localeM1018a);
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
        int i3 = 0;
        while (i3 < length3) {
            iArr[c] = i3;
            StringBuilder sb = new StringBuilder();
            int i4 = iArr[c];
            int length4 = str.length();
            char cCharAt2 = str2.charAt(i4);
            String[] strArr2 = weekdays;
            String[] strArr3 = shortWeekdays;
            if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < 'a' || cCharAt2 > 'z')) {
                char c2 = '\'';
                sb.append('\'');
                boolean z = false;
                while (true) {
                    if (i4 < length4) {
                        char cCharAt3 = str2.charAt(i4);
                        if (cCharAt3 == c2) {
                            int i5 = i4 + 1;
                            i = length3;
                            if (i5 >= length4 || str2.charAt(i5) != '\'') {
                                z = !z;
                            } else {
                                sb.append(cCharAt3);
                                i4 = i5;
                            }
                        } else {
                            i = length3;
                            if (z || ((cCharAt3 < 'A' || cCharAt3 > 'Z') && (cCharAt3 < 'a' || cCharAt3 > 'z'))) {
                                sb.append(cCharAt3);
                            } else {
                                i4--;
                            }
                        }
                        i4++;
                        str2 = str;
                        length3 = i;
                        c2 = '\'';
                    }
                    iArr[0] = i4;
                    string = sb.toString();
                    i2 = iArr[0];
                    length2 = string.length();
                    if (length2 == 0) {
                        InterfaceC0654u[] interfaceC0654uArr = (InterfaceC0654u[]) arrayList.toArray(f892a);
                        this.f897f = interfaceC0654uArr;
                        length = interfaceC0654uArr.length;
                        iMo1196f = 0;
                        while (true) {
                            length--;
                            if (length < 0) {
                                this.f898g = iMo1196f;
                                return;
                            }
                            iMo1196f += this.f897f[length].mo1196f();
                        }
                    } else {
                        cCharAt = string.charAt(0);
                        if (cCharAt == 'y') {
                            if (length2 == 2) {
                                objM1275k = C0409ky.f1110b;
                            } else {
                                objM1275k = m1275k(1, Math.max(length2, 4));
                            }
                            c0357j = objM1275k;
                            if (cCharAt == 'Y') {
                                c0357j = new C0357j(c0357j, 3);
                            }
                        } else if (cCharAt != 'z') {
                            switch (cCharAt) {
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    strSubstring = string.substring(1);
                                    if (strSubstring.length() == 1) {
                                        c0357j = new C0417lf(strSubstring);
                                    } else {
                                        c0357j = new C0238ep(strSubstring.charAt(0));
                                        continue;
                                        continue;
                                    }
                                    break;
                                case 'K':
                                    c0357j = m1275k(10, length2);
                                    continue;
                                    continue;
                                case 'M':
                                    if (length2 >= 4) {
                                        c0357j = new C0350it(2, months);
                                        continue;
                                        continue;
                                    } else if (length2 == 3) {
                                        c0357j = new C0350it(2, shortMonths);
                                    } else if (length2 == 2) {
                                        c0357j = C0409ky.f1111d;
                                    } else {
                                        c0357j = C0409ky.f1109a;
                                    }
                                    break;
                                case 'S':
                                    c0357j = m1275k(14, length2);
                                    continue;
                                    continue;
                                case 'a':
                                    c0357j = new C0350it(9, amPmStrings);
                                    continue;
                                    continue;
                                case 'd':
                                    c0357j = m1275k(5, length2);
                                    continue;
                                    continue;
                                case 'h':
                                    c0357j = new C0357j(m1275k(10, length2), 1);
                                    continue;
                                    continue;
                                case 'k':
                                    c0357j = new C0357j(m1275k(11, length2), 2);
                                    continue;
                                    continue;
                                case 'm':
                                    c0357j = m1275k(12, length2);
                                    continue;
                                    continue;
                                case 's':
                                    c0357j = m1275k(13, length2);
                                    continue;
                                    continue;
                                case 'u':
                                    c0357j = new C0357j(m1275k(7, length2), 0);
                                    continue;
                                    continue;
                                case 'w':
                                    c0357j = m1275k(3, length2);
                                    continue;
                                    continue;
                                default:
                                    switch (cCharAt) {
                                        case 'D':
                                            c0357j = m1275k(6, length2);
                                            continue;
                                            continue;
                                        case 'E':
                                            if (length2 < 4) {
                                                strArr = strArr3;
                                            } else {
                                                strArr = strArr2;
                                            }
                                            c0357j = new C0350it(7, strArr);
                                            continue;
                                            continue;
                                        case 'F':
                                            c0357j = m1275k(8, length2);
                                            continue;
                                            continue;
                                        case 'G':
                                            c0357j = new C0350it(0, eras);
                                            continue;
                                            continue;
                                        case 'H':
                                            c0357j = m1275k(11, length2);
                                            continue;
                                            continue;
                                        default:
                                            c0357j = C0303h.f882c;
                                            switch (cCharAt) {
                                                case 'W':
                                                    c0357j = m1275k(4, length2);
                                                    break;
                                                case 'X':
                                                    if (length2 != 1) {
                                                        c0357j = C0303h.f880a;
                                                    } else if (length2 != 2) {
                                                        c0357j = C0303h.f881b;
                                                    } else {
                                                        if (length2 == 3) {
                                                            throw new IllegalArgumentException("invalid number of X");
                                                        }
                                                    }
                                                    break;
                                                case 'Y':
                                                    if (length2 == 2) {
                                                        objM1275k = C0409ky.f1110b;
                                                    } else {
                                                        objM1275k = m1275k(1, Math.max(length2, 4));
                                                    }
                                                    c0357j = objM1275k;
                                                    if (cCharAt == 'Y') {
                                                        c0357j = new C0357j(c0357j, 3);
                                                    }
                                                    break;
                                                case 'Z':
                                                    if (length2 == 1) {
                                                        c0357j = C0241es.f793b;
                                                    } else if (length2 == 2) {
                                                        c0357j = C0241es.f792a;
                                                    }
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException("Illegal pattern component: ".concat(string));
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            timeZone2 = this.f895d;
                            if (length2 >= 4) {
                                c0357j = new C0746xk(timeZone2, localeM1018a, 1);
                            } else {
                                c0357j = new C0746xk(timeZone2, localeM1018a, 0);
                            }
                        }
                        arrayList.add(c0357j);
                        i3 = i2 + 1;
                        str2 = str;
                        weekdays = strArr2;
                        shortWeekdays = strArr3;
                        length3 = i;
                        c = 0;
                    }
                }
            } else {
                sb.append(cCharAt2);
                while (true) {
                    int i6 = i4 + 1;
                    if (i6 < length4 && str2.charAt(i6) == cCharAt2) {
                        sb.append(cCharAt2);
                        i4 = i6;
                    }
                }
            }
            i = length3;
            iArr[0] = i4;
            string = sb.toString();
            i2 = iArr[0];
            length2 = string.length();
            if (length2 == 0) {
                InterfaceC0654u[] interfaceC0654uArr2 = (InterfaceC0654u[]) arrayList.toArray(f892a);
                this.f897f = interfaceC0654uArr2;
                length = interfaceC0654uArr2.length;
                iMo1196f = 0;
                while (true) {
                    length--;
                    if (length < 0) {
                        this.f898g = iMo1196f;
                        return;
                    }
                    iMo1196f += this.f897f[length].mo1196f();
                }
            } else {
                cCharAt = string.charAt(0);
                if (cCharAt == 'y') {
                    if (length2 == 2) {
                        objM1275k = C0409ky.f1110b;
                    } else {
                        objM1275k = m1275k(1, Math.max(length2, 4));
                    }
                    c0357j = objM1275k;
                    if (cCharAt == 'Y') {
                        c0357j = new C0357j(c0357j, 3);
                    }
                } else if (cCharAt != 'z') {
                    switch (cCharAt) {
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            strSubstring = string.substring(1);
                            if (strSubstring.length() == 1) {
                                c0357j = new C0417lf(strSubstring);
                            } else {
                                c0357j = new C0238ep(strSubstring.charAt(0));
                                continue;
                                continue;
                            }
                            break;
                        case 'K':
                            c0357j = m1275k(10, length2);
                            continue;
                            continue;
                        case 'M':
                            if (length2 >= 4) {
                                c0357j = new C0350it(2, months);
                                continue;
                                continue;
                            } else if (length2 == 3) {
                                c0357j = new C0350it(2, shortMonths);
                            } else if (length2 == 2) {
                                c0357j = C0409ky.f1111d;
                            } else {
                                c0357j = C0409ky.f1109a;
                            }
                            break;
                        case 'S':
                            c0357j = m1275k(14, length2);
                            continue;
                            continue;
                        case 'a':
                            c0357j = new C0350it(9, amPmStrings);
                            continue;
                            continue;
                        case 'd':
                            c0357j = m1275k(5, length2);
                            continue;
                            continue;
                        case 'h':
                            c0357j = new C0357j(m1275k(10, length2), 1);
                            continue;
                            continue;
                        case 'k':
                            c0357j = new C0357j(m1275k(11, length2), 2);
                            continue;
                            continue;
                        case 'm':
                            c0357j = m1275k(12, length2);
                            continue;
                            continue;
                        case 's':
                            c0357j = m1275k(13, length2);
                            continue;
                            continue;
                        case 'u':
                            c0357j = new C0357j(m1275k(7, length2), 0);
                            continue;
                            continue;
                        case 'w':
                            c0357j = m1275k(3, length2);
                            continue;
                            continue;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    c0357j = m1275k(6, length2);
                                    continue;
                                    continue;
                                case 'E':
                                    if (length2 < 4) {
                                        strArr = strArr3;
                                    } else {
                                        strArr = strArr2;
                                    }
                                    c0357j = new C0350it(7, strArr);
                                    continue;
                                    continue;
                                case 'F':
                                    c0357j = m1275k(8, length2);
                                    continue;
                                    continue;
                                case 'G':
                                    c0357j = new C0350it(0, eras);
                                    continue;
                                    continue;
                                case 'H':
                                    c0357j = m1275k(11, length2);
                                    continue;
                                    continue;
                                default:
                                    c0357j = C0303h.f882c;
                                    switch (cCharAt) {
                                        case 'W':
                                            c0357j = m1275k(4, length2);
                                            break;
                                        case 'X':
                                            if (length2 != 1) {
                                                c0357j = C0303h.f880a;
                                            } else if (length2 != 2) {
                                                c0357j = C0303h.f881b;
                                            } else {
                                                if (length2 == 3) {
                                                    throw new IllegalArgumentException("invalid number of X");
                                                }
                                            }
                                            break;
                                        case 'Y':
                                            if (length2 == 2) {
                                                objM1275k = C0409ky.f1110b;
                                            } else {
                                                objM1275k = m1275k(1, Math.max(length2, 4));
                                            }
                                            c0357j = objM1275k;
                                            if (cCharAt == 'Y') {
                                                c0357j = new C0357j(c0357j, 3);
                                            }
                                            break;
                                        case 'Z':
                                            if (length2 == 1) {
                                                c0357j = C0241es.f793b;
                                            } else if (length2 == 2) {
                                                c0357j = C0241es.f792a;
                                            }
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: ".concat(string));
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    timeZone2 = this.f895d;
                    if (length2 >= 4) {
                        c0357j = new C0746xk(timeZone2, localeM1018a, 1);
                    } else {
                        c0357j = new C0746xk(timeZone2, localeM1018a, 0);
                    }
                }
                arrayList.add(c0357j);
                i3 = i2 + 1;
                str2 = str;
                weekdays = strArr2;
                shortWeekdays = strArr3;
                length3 = i;
                c = 0;
            }
        }
        InterfaceC0654u[] interfaceC0654uArr3 = (InterfaceC0654u[]) arrayList.toArray(f892a);
        this.f897f = interfaceC0654uArr3;
        length = interfaceC0654uArr3.length;
        iMo1196f = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.f898g = iMo1196f;
                return;
            }
            iMo1196f += this.f897f[length].mo1196f();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1272h(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* JADX INFO: renamed from: i */
    public static void m1273i(StringBuilder sb, int i, int i2) {
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
                sb.append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        sb.append((char) ((i / DescriptorProtos.Edition.EDITION_2023_VALUE) + 48));
                        i %= DescriptorProtos.Edition.EDITION_2023_VALUE;
                    }
                    if (i >= 100) {
                        sb.append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        sb.append('0');
                    }
                }
                if (i >= 10) {
                    sb.append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    sb.append('0');
                }
            }
            sb.append((char) (i + 48));
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
            sb.append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            } else {
                sb.append(cArr[i5]);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m1274j(TimeZone timeZone, boolean z, int i, Locale locale) {
        C0276g c0276g = new C0276g(timeZone, z, i, locale);
        ConcurrentHashMap concurrentHashMap = f893b;
        String str = (String) concurrentHashMap.get(c0276g);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) concurrentHashMap.putIfAbsent(c0276g, displayName);
        return str2 != null ? str2 : displayName;
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC0159br m1275k(int i, int i2) {
        if (i2 != 1) {
            return i2 != 2 ? new C0265fp(i, i2) : new C0279gc(i, 0);
        }
        return new C0279gc(i, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0312hi)) {
            return false;
        }
        C0312hi c0312hi = (C0312hi) obj;
        return this.f894c.equals(c0312hi.f894c) && this.f895d.equals(c0312hi.f895d) && this.f896e.equals(c0312hi.f896e);
    }

    public final int hashCode() {
        return (((this.f896e.hashCode() * 13) + this.f895d.hashCode()) * 13) + this.f894c.hashCode();
    }

    public final String toString() {
        return "FastDatePrinter[" + this.f894c + "," + this.f896e + "," + this.f895d.getID() + "]";
    }
}
