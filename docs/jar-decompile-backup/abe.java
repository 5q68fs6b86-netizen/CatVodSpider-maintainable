package com.github.catvod.spider.support.p002A0;

import com.google.protobuf.DescriptorProtos;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.ListIterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class abe implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Locale f476a = new Locale("ja", "JP", "JP");

    /* JADX INFO: renamed from: b */
    public static final Comparator f477b = Comparator.reverseOrder();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentMap[] f478c = new ConcurrentMap[17];

    /* JADX INFO: renamed from: d */
    public static final C0436ly f479d = new C0436ly(1, 0);

    /* JADX INFO: renamed from: e */
    public static final C0436ly f480e = new C0436ly(2, 1);

    /* JADX INFO: renamed from: f */
    public static final C0237eo f481f = new C0237eo(1);

    /* JADX INFO: renamed from: g */
    public static final C0237eo f482g = new C0237eo(3);

    /* JADX INFO: renamed from: h */
    public static final C0237eo f483h = new C0237eo(4);

    /* JADX INFO: renamed from: i */
    public static final C0237eo f484i = new C0237eo(6);

    /* JADX INFO: renamed from: j */
    public static final C0237eo f485j = new C0237eo(5);

    /* JADX INFO: renamed from: k */
    public static final C0436ly f486k = new C0436ly(7, 2);

    /* JADX INFO: renamed from: l */
    public static final C0237eo f487l = new C0237eo(8);

    /* JADX INFO: renamed from: m */
    public static final C0237eo f488m = new C0237eo(11);

    /* JADX INFO: renamed from: n */
    public static final C0436ly f489n = new C0436ly(11, 3);

    /* JADX INFO: renamed from: o */
    public static final C0436ly f490o = new C0436ly(10, 4);

    /* JADX INFO: renamed from: p */
    public static final C0237eo f491p = new C0237eo(10);

    /* JADX INFO: renamed from: q */
    public static final C0237eo f492q = new C0237eo(12);

    /* JADX INFO: renamed from: r */
    public static final C0237eo f493r = new C0237eo(13);

    /* JADX INFO: renamed from: s */
    public static final C0237eo f494s = new C0237eo(14);

    /* JADX INFO: renamed from: t */
    public final String f495t;

    /* JADX INFO: renamed from: u */
    public final TimeZone f496u;

    /* JADX INFO: renamed from: v */
    public final Locale f497v;

    /* JADX INFO: renamed from: w */
    public final int f498w;

    /* JADX INFO: renamed from: x */
    public final int f499x;

    /* JADX INFO: renamed from: y */
    public final transient ArrayList f500y;

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0160 A[SYNTHETIC] */
    public abe(String str, TimeZone timeZone, Locale locale) {
        int i;
        C0495oc c0495oc;
        int i2;
        AbstractC0157bp abstractC0157bpM915aa;
        this.f495t = str;
        this.f496u = timeZone;
        Locale localeM1018a = AbstractC0134at.m1018a(locale);
        this.f497v = localeM1018a;
        Calendar calendar = Calendar.getInstance(timeZone, localeM1018a);
        if (localeM1018a.equals(f476a)) {
            i = 0;
        } else {
            calendar.setTime(new Date());
            i = calendar.get(1) - 80;
        }
        int i3 = (i / 100) * 100;
        this.f498w = i3;
        this.f499x = i - i3;
        this.f500y = new ArrayList();
        int i4 = 0;
        while (true) {
            String str2 = this.f495t;
            if (i4 >= str2.length()) {
                c0495oc = null;
            } else {
                char cCharAt = str2.charAt(i4);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    StringBuilder sb = new StringBuilder();
                    boolean z = false;
                    while (i4 < str2.length()) {
                        char cCharAt2 = str2.charAt(i4);
                        if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                            if (!z) {
                                throw new IllegalArgumentException("Unterminated quote");
                            }
                            String string = sb.toString();
                            c0495oc = new C0495oc(new C0454mp(string), string.length());
                        } else if (cCharAt2 != '\'' || ((i4 = i4 + 1) != str2.length() && str2.charAt(i4) == '\'')) {
                            i4++;
                            sb.append(cCharAt2);
                        } else {
                            z = !z;
                        }
                    }
                    if (!z) {
                        throw new IllegalArgumentException("Unterminated quote");
                    }
                    String string2 = sb.toString();
                    c0495oc = new C0495oc(new C0454mp(string2), string2.length());
                } else {
                    int i5 = i4;
                    do {
                        i5++;
                        if (i5 < str2.length()) {
                        }
                        i2 = i5 - i4;
                        if (cCharAt == 'y') {
                            if (i2 > 2) {
                                abstractC0157bpM915aa = f481f;
                            } else {
                                abstractC0157bpM915aa = f479d;
                            }
                        } else if (cCharAt != 'z') {
                            switch (cCharAt) {
                                case 'D':
                                    abstractC0157bpM915aa = f484i;
                                    break;
                                case 'E':
                                    abstractC0157bpM915aa = m915aa(7, calendar);
                                    break;
                                case 'F':
                                    abstractC0157bpM915aa = f487l;
                                    break;
                                case 'G':
                                    abstractC0157bpM915aa = m915aa(0, calendar);
                                    break;
                                case 'H':
                                    abstractC0157bpM915aa = f488m;
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'K':
                                            abstractC0157bpM915aa = f491p;
                                            break;
                                        case 'M':
                                            if (i2 >= 3) {
                                                abstractC0157bpM915aa = f480e;
                                            } else {
                                                abstractC0157bpM915aa = m915aa(2, calendar);
                                            }
                                            break;
                                        case 'S':
                                            abstractC0157bpM915aa = f494s;
                                            break;
                                        case 'a':
                                            abstractC0157bpM915aa = m915aa(9, calendar);
                                            break;
                                        case 'd':
                                            abstractC0157bpM915aa = f485j;
                                            break;
                                        case 'h':
                                            abstractC0157bpM915aa = f490o;
                                            break;
                                        case 'k':
                                            abstractC0157bpM915aa = f489n;
                                            break;
                                        case 'm':
                                            abstractC0157bpM915aa = f492q;
                                            break;
                                        case 's':
                                            abstractC0157bpM915aa = f493r;
                                            break;
                                        case 'u':
                                            abstractC0157bpM915aa = f486k;
                                            break;
                                        case 'w':
                                            abstractC0157bpM915aa = f482g;
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'W':
                                                    abstractC0157bpM915aa = f483h;
                                                    break;
                                                case 'X':
                                                    if (i2 != 1) {
                                                        abstractC0157bpM915aa = C0257fh.f824c;
                                                    } else if (i2 != 2) {
                                                        abstractC0157bpM915aa = C0257fh.f825d;
                                                    } else {
                                                        if (i2 == 3) {
                                                            C0257fh c0257fh = C0257fh.f824c;
                                                            throw new IllegalArgumentException("invalid number of X");
                                                        }
                                                        abstractC0157bpM915aa = C0257fh.f826e;
                                                    }
                                                    break;
                                                case 'Y':
                                                    if (i2 > 2) {
                                                        abstractC0157bpM915aa = f479d;
                                                    } else {
                                                        abstractC0157bpM915aa = f481f;
                                                    }
                                                    break;
                                                case 'Z':
                                                    if (i2 == 2) {
                                                        abstractC0157bpM915aa = m915aa(15, calendar);
                                                    } else {
                                                        abstractC0157bpM915aa = C0257fh.f826e;
                                                    }
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException("Format '" + cCharAt + "' not supported");
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            abstractC0157bpM915aa = m915aa(15, calendar);
                        }
                        c0495oc = new C0495oc(abstractC0157bpM915aa, i2);
                        i4 = i5;
                    } while (str2.charAt(i5) == cCharAt);
                    i2 = i5 - i4;
                    if (cCharAt == 'y') {
                        if (i2 > 2) {
                            abstractC0157bpM915aa = f481f;
                        } else {
                            abstractC0157bpM915aa = f479d;
                        }
                    } else if (cCharAt != 'z') {
                        switch (cCharAt) {
                            case 'D':
                                abstractC0157bpM915aa = f484i;
                                break;
                            case 'E':
                                abstractC0157bpM915aa = m915aa(7, calendar);
                                break;
                            case 'F':
                                abstractC0157bpM915aa = f487l;
                                break;
                            case 'G':
                                abstractC0157bpM915aa = m915aa(0, calendar);
                                break;
                            case 'H':
                                abstractC0157bpM915aa = f488m;
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'K':
                                        abstractC0157bpM915aa = f491p;
                                        break;
                                    case 'M':
                                        if (i2 >= 3) {
                                            abstractC0157bpM915aa = f480e;
                                        } else {
                                            abstractC0157bpM915aa = m915aa(2, calendar);
                                        }
                                        break;
                                    case 'S':
                                        abstractC0157bpM915aa = f494s;
                                        break;
                                    case 'a':
                                        abstractC0157bpM915aa = m915aa(9, calendar);
                                        break;
                                    case 'd':
                                        abstractC0157bpM915aa = f485j;
                                        break;
                                    case 'h':
                                        abstractC0157bpM915aa = f490o;
                                        break;
                                    case 'k':
                                        abstractC0157bpM915aa = f489n;
                                        break;
                                    case 'm':
                                        abstractC0157bpM915aa = f492q;
                                        break;
                                    case 's':
                                        abstractC0157bpM915aa = f493r;
                                        break;
                                    case 'u':
                                        abstractC0157bpM915aa = f486k;
                                        break;
                                    case 'w':
                                        abstractC0157bpM915aa = f482g;
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case 'W':
                                                abstractC0157bpM915aa = f483h;
                                                break;
                                            case 'X':
                                                if (i2 != 1) {
                                                    abstractC0157bpM915aa = C0257fh.f824c;
                                                } else if (i2 != 2) {
                                                    abstractC0157bpM915aa = C0257fh.f825d;
                                                } else {
                                                    if (i2 == 3) {
                                                        C0257fh c0257fh2 = C0257fh.f824c;
                                                        throw new IllegalArgumentException("invalid number of X");
                                                    }
                                                    abstractC0157bpM915aa = C0257fh.f826e;
                                                }
                                                break;
                                            case 'Y':
                                                if (i2 > 2) {
                                                    abstractC0157bpM915aa = f479d;
                                                } else {
                                                    abstractC0157bpM915aa = f481f;
                                                }
                                                break;
                                            case 'Z':
                                                if (i2 == 2) {
                                                    abstractC0157bpM915aa = m915aa(15, calendar);
                                                } else {
                                                    abstractC0157bpM915aa = C0257fh.f826e;
                                                }
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Format '" + cCharAt + "' not supported");
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        abstractC0157bpM915aa = m915aa(15, calendar);
                    }
                    c0495oc = new C0495oc(abstractC0157bpM915aa, i2);
                    i4 = i5;
                }
            }
            if (c0495oc == null) {
                return;
            } else {
                this.f500y.add(c0495oc);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX INFO: renamed from: z */
    public static void m914z(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '$' && cCharAt != '.' && cCharAt != '?' && cCharAt != '^' && cCharAt != '[' && cCharAt != '\\' && cCharAt != '{' && cCharAt != '|') {
                switch (cCharAt) {
                    case '(':
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    case '*':
                    case '+':
                        sb.append('\\');
                        break;
                }
            } else {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
    }

    /* JADX INFO: renamed from: aa */
    public final AbstractC0157bp m915aa(int i, Calendar calendar) {
        ConcurrentMap concurrentMap;
        ConcurrentMap[] concurrentMapArr = f478c;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i] == null) {
                    concurrentMapArr[i] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i];
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0157bp c0699vr = (AbstractC0157bp) concurrentMap.get(this.f497v);
        if (c0699vr == null) {
            c0699vr = i == 15 ? new C0699vr(this.f497v) : new C0453mo(i, calendar, this.f497v);
            AbstractC0157bp abstractC0157bp = (AbstractC0157bp) concurrentMap.putIfAbsent(this.f497v, c0699vr);
            if (abstractC0157bp != null) {
                return abstractC0157bp;
            }
        }
        return c0699vr;
    }

    /* JADX INFO: renamed from: ab */
    public final Date m916ab(String str, ParsePosition parsePosition) {
        int i;
        Calendar calendar = Calendar.getInstance(this.f496u, this.f497v);
        calendar.clear();
        ListIterator listIterator = this.f500y.listIterator();
        while (listIterator.hasNext()) {
            C0495oc c0495oc = (C0495oc) listIterator.next();
            if (c0495oc.f1324a.mo1061a() && listIterator.hasNext()) {
                AbstractC0157bp abstractC0157bp = ((C0495oc) listIterator.next()).f1324a;
                listIterator.previous();
                i = abstractC0157bp.mo1061a() ? c0495oc.f1325b : 0;
            } else {
                i = 0;
            }
            if (!c0495oc.f1324a.mo1062b(this, calendar, str, parsePosition, i)) {
                return null;
            }
        }
        return calendar.getTime();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abe)) {
            return false;
        }
        abe abeVar = (abe) obj;
        return this.f495t.equals(abeVar.f495t) && this.f496u.equals(abeVar.f496u) && this.f497v.equals(abeVar.f497v);
    }

    public final int hashCode() {
        return (((this.f497v.hashCode() * 13) + this.f496u.hashCode()) * 13) + this.f495t.hashCode();
    }

    public final String toString() {
        return "FastDateParser[" + this.f495t + ", " + this.f497v + ", " + this.f496u.getID() + "]";
    }
}
