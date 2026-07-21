package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p047C.C1300c;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p082g.C1812j;
import com.google.protobuf.DescriptorProtos;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1366t implements Serializable {

    /* JADX INFO: renamed from: g */
    static final Locale f3135g = new Locale("ja", "JP", "JP");

    /* JADX INFO: renamed from: h */
    private static final Comparator<String> f3136h = Comparator.reverseOrder();

    /* JADX INFO: renamed from: i */
    private static final ConcurrentMap<Locale, AbstractC1361o>[] f3137i = new ConcurrentMap[17];

    /* JADX INFO: renamed from: j */
    private static final C1351e f3138j = new C1351e();

    /* JADX INFO: renamed from: k */
    private static final C1352f f3139k = new C1352f();

    /* JADX INFO: renamed from: l */
    private static final C1359m f3140l = new C1359m(1);

    /* JADX INFO: renamed from: m */
    private static final C1359m f3141m = new C1359m(3);

    /* JADX INFO: renamed from: n */
    private static final C1359m f3142n = new C1359m(4);

    /* JADX INFO: renamed from: o */
    private static final C1359m f3143o = new C1359m(6);

    /* JADX INFO: renamed from: p */
    private static final C1359m f3144p = new C1359m(5);

    /* JADX INFO: renamed from: q */
    private static final C1353g f3145q = new C1353g();

    /* JADX INFO: renamed from: r */
    private static final C1359m f3146r = new C1359m(8);

    /* JADX INFO: renamed from: s */
    private static final C1359m f3147s = new C1359m(11);

    /* JADX INFO: renamed from: t */
    private static final C1354h f3148t = new C1354h();

    /* JADX INFO: renamed from: u */
    private static final C1355i f3149u = new C1355i();

    /* JADX INFO: renamed from: v */
    private static final C1359m f3150v = new C1359m(10);

    /* JADX INFO: renamed from: w */
    private static final C1359m f3151w = new C1359m(12);

    /* JADX INFO: renamed from: x */
    private static final C1359m f3152x = new C1359m(13);

    /* JADX INFO: renamed from: y */
    private static final C1359m f3153y = new C1359m(14);

    /* JADX INFO: renamed from: a */
    private final String f3154a;

    /* JADX INFO: renamed from: b */
    private final TimeZone f3155b;

    /* JADX INFO: renamed from: c */
    private final Locale f3156c;

    /* JADX INFO: renamed from: d */
    private final int f3157d;

    /* JADX INFO: renamed from: e */
    private final int f3158e;

    /* JADX INFO: renamed from: f */
    private transient List<C1362p> f3159f;

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p051G.p>] */
    protected C1366t(String str, TimeZone timeZone, Locale locale) {
        int i;
        this.f3154a = str;
        this.f3155b = timeZone;
        Locale localeM3243a = C1300c.m3243a(locale);
        this.f3156c = localeM3243a;
        Calendar calendar = Calendar.getInstance(timeZone, localeM3243a);
        if (localeM3243a.equals(f3135g)) {
            i = 0;
        } else {
            calendar.setTime(new Date());
            i = calendar.get(1) - 80;
        }
        int i2 = (i / 100) * 100;
        this.f3157d = i2;
        this.f3158e = i - i2;
        this.f3159f = new ArrayList();
        C1363q c1363q = new C1363q(this, calendar);
        while (true) {
            C1362p c1362pM3342a = c1363q.m3342a();
            if (c1362pM3342a == null) {
                return;
            } else {
                this.f3159f.add(c1362pM3342a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static AbstractC1361o m3344b(C1366t c1366t, char c, int i, Calendar calendar) {
        int i2;
        c1366t.getClass();
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return f3143o;
                    case 'E':
                        i2 = 7;
                        break;
                    case 'F':
                        return f3146r;
                    case 'G':
                        i2 = 0;
                        break;
                    case 'H':
                        return f3147s;
                    default:
                        switch (c) {
                            case 'K':
                                return f3150v;
                            case 'M':
                                return i >= 3 ? c1366t.m3349g(2, calendar) : f3139k;
                            case 'S':
                                return f3153y;
                            case 'a':
                                i2 = 9;
                                break;
                            case 'd':
                                return f3144p;
                            case 'h':
                                return f3149u;
                            case 'k':
                                return f3148t;
                            case 'm':
                                return f3151w;
                            case 's':
                                return f3152x;
                            case 'u':
                                return f3145q;
                            case 'w':
                                return f3141m;
                            default:
                                switch (c) {
                                    case 'W':
                                        return f3142n;
                                    case 'X':
                                        return C1358l.m3340e(i);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i == 2) {
                                            return C1358l.f3123d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c + "' not supported");
                                }
                                i2 = 15;
                                break;
                        }
                        break;
                }
            } else {
                i2 = 15;
            }
            return c1366t.m3349g(i2, calendar);
        }
        return i > 2 ? f3140l : f3138j;
    }

    /* JADX INFO: renamed from: c */
    static Map m3345c(Calendar calendar, Locale locale, int i, StringBuilder sb) {
        HashMap map = new HashMap();
        Locale localeM3243a = C1300c.m3243a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, localeM3243a);
        TreeSet treeSet = new TreeSet(f3136h);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(localeM3243a);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            m3350j(sb, (String) it.next());
            sb.append('|');
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    static int m3346d(C1366t c1366t, int i) {
        int i2 = c1366t.f3157d + i;
        return i >= c1366t.f3158e ? i2 : i2 + 100;
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ StringBuilder m3348f(StringBuilder sb, String str) {
        m3350j(sb, str);
        return sb;
    }

    /* JADX INFO: renamed from: g */
    private AbstractC1361o m3349g(int i, Calendar calendar) {
        ConcurrentMap<Locale, AbstractC1361o> concurrentMap;
        ConcurrentMap<Locale, AbstractC1361o>[] concurrentMapArr = f3137i;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i] == null) {
                concurrentMapArr[i] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i];
        }
        AbstractC1361o c1365s = concurrentMap.get(this.f3156c);
        if (c1365s == null) {
            c1365s = i == 15 ? new C1365s(this.f3156c) : new C1356j(i, calendar, this.f3156c);
            AbstractC1361o abstractC1361oPutIfAbsent = concurrentMap.putIfAbsent(this.f3156c, c1365s);
            if (abstractC1361oPutIfAbsent != null) {
                return abstractC1361oPutIfAbsent;
            }
        }
        return c1365s;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX INFO: renamed from: j */
    private static StringBuilder m3350j(StringBuilder sb, String str) {
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
        return sb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1366t)) {
            return false;
        }
        C1366t c1366t = (C1366t) obj;
        return this.f3154a.equals(c1366t.f3154a) && this.f3155b.equals(c1366t.f3155b) && this.f3156c.equals(c1366t.f3156c);
    }

    /* JADX INFO: renamed from: h */
    public final Date m3351h(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateM3352i = m3352i(str, parsePosition);
        if (dateM3352i != null) {
            return dateM3352i;
        }
        if (!this.f3156c.equals(f3135g)) {
            throw new ParseException(C1812j.m4399b("Unparseable date: ", str), parsePosition.getErrorIndex());
        }
        StringBuilder sbM3589b = C1434P.m3589b("(The ");
        sbM3589b.append(this.f3156c);
        sbM3589b.append(" locale does not support dates before 1868 AD)\nUnparseable date: \"");
        sbM3589b.append(str);
        throw new ParseException(sbM3589b.toString(), parsePosition.getErrorIndex());
    }

    public final int hashCode() {
        return (((this.f3156c.hashCode() * 13) + this.f3155b.hashCode()) * 13) + this.f3154a.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p051G.p>] */
    /* JADX INFO: renamed from: i */
    public final Date m3352i(String str, ParsePosition parsePosition) {
        boolean z;
        C1362p c1362p;
        int i;
        Calendar calendar = Calendar.getInstance(this.f3155b, this.f3156c);
        calendar.clear();
        ListIterator listIterator = this.f3159f.listIterator();
        do {
            z = false;
            if (!listIterator.hasNext()) {
                z = true;
                break;
            }
            c1362p = (C1362p) listIterator.next();
            if (c1362p.f3126a.mo3341a() && listIterator.hasNext()) {
                AbstractC1361o abstractC1361o = ((C1362p) listIterator.next()).f3126a;
                listIterator.previous();
                if (abstractC1361o.mo3341a()) {
                    i = c1362p.f3127b;
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
        } while (c1362p.f3126a.mo3338b(this, calendar, str, parsePosition, i));
        if (z) {
            return calendar.getTime();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("FastDateParser[");
        sbM3589b.append(this.f3154a);
        sbM3589b.append(", ");
        sbM3589b.append(this.f3156c);
        sbM3589b.append(", ");
        sbM3589b.append(this.f3155b.getID());
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
