package com.github.catvod.spider.support.p011C;

import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p117b.C2174h;
import com.github.catvod.spider.support.p139y.C2420c;
import com.google.protobuf.DescriptorProtos;
import java.io.Serializable;
import java.text.DateFormatSymbols;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0961d implements Serializable {

    /* JADX INFO: renamed from: g */
    static final Locale f2262g = new Locale("ja", "JP", "JP");

    /* JADX INFO: renamed from: h */
    private static final Comparator<String> f2263h = Comparator.reverseOrder();

    /* JADX INFO: renamed from: i */
    private static final ConcurrentMap<Locale, k>[] f2264i = new ConcurrentMap[17];

    /* JADX INFO: renamed from: j */
    private static final a f2265j = new a();

    /* JADX INFO: renamed from: k */
    private static final b f2266k = new b();

    /* JADX INFO: renamed from: l */
    private static final i f2267l = new i(1);

    /* JADX INFO: renamed from: m */
    private static final i f2268m = new i(3);

    /* JADX INFO: renamed from: n */
    private static final i f2269n = new i(4);

    /* JADX INFO: renamed from: o */
    private static final i f2270o = new i(6);

    /* JADX INFO: renamed from: p */
    private static final i f2271p = new i(5);

    /* JADX INFO: renamed from: q */
    private static final c f2272q = new c();

    /* JADX INFO: renamed from: r */
    private static final i f2273r = new i(8);

    /* JADX INFO: renamed from: s */
    private static final i f2274s = new i(11);

    /* JADX INFO: renamed from: t */
    private static final d f2275t = new d();

    /* JADX INFO: renamed from: u */
    private static final e f2276u = new e();

    /* JADX INFO: renamed from: v */
    private static final i f2277v = new i(10);

    /* JADX INFO: renamed from: w */
    private static final i f2278w = new i(12);

    /* JADX INFO: renamed from: x */
    private static final i f2279x = new i(13);

    /* JADX INFO: renamed from: y */
    private static final i f2280y = new i(14);

    /* JADX INFO: renamed from: a */
    private final String f2281a;

    /* JADX INFO: renamed from: b */
    private final TimeZone f2282b;

    /* JADX INFO: renamed from: c */
    private final Locale f2283c;

    /* JADX INFO: renamed from: d */
    private final int f2284d;

    /* JADX INFO: renamed from: e */
    private final int f2285e;

    /* JADX INFO: renamed from: f */
    private transient List<l> f2286f;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$a */
    static class a extends i {
        a() {
            super(1);
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.i
        /* JADX INFO: renamed from: c */
        final int mo2346c(C0961d c0961d, int i) {
            return i < 100 ? C0961d.m2339d(c0961d, i) : i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$b */
    static class b extends i {
        b() {
            super(2);
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.i
        /* JADX INFO: renamed from: c */
        final int mo2346c(C0961d c0961d, int i) {
            return i - 1;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$c */
    static class c extends i {
        c() {
            super(7);
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.i
        /* JADX INFO: renamed from: c */
        final int mo2346c(C0961d c0961d, int i) {
            if (i == 7) {
                return 1;
            }
            return 1 + i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$d */
    static class d extends i {
        d() {
            super(11);
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.i
        /* JADX INFO: renamed from: c */
        final int mo2346c(C0961d c0961d, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$e */
    static class e extends i {
        e() {
            super(10);
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.i
        /* JADX INFO: renamed from: c */
        final int mo2346c(C0961d c0961d, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$f */
    private static class f extends j {

        /* JADX INFO: renamed from: b */
        private final int f2287b;

        /* JADX INFO: renamed from: c */
        final Locale f2288c;

        /* JADX INFO: renamed from: d */
        private final Map<String, Integer> f2289d;

        f(int i, Calendar calendar, Locale locale) {
            this.f2287b = i;
            this.f2288c = C2420c.m6434a(locale);
            StringBuilder sbM5396a = C2137a.m5396a("((?iu)");
            this.f2289d = (HashMap) C0961d.m2338c(calendar, locale, i, sbM5396a);
            sbM5396a.setLength(sbM5396a.length() - 1);
            sbM5396a.append(")");
            this.f2295a = Pattern.compile(sbM5396a.toString());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        @Override // com.github.catvod.spider.support.p011C.C0961d.j
        /* JADX INFO: renamed from: c */
        final void mo2347c(Calendar calendar, String str) {
            String lowerCase = str.toLowerCase(this.f2288c);
            Integer num = (Integer) this.f2289d.get(lowerCase);
            if (num == null) {
                num = (Integer) this.f2289d.get(lowerCase + '.');
            }
            calendar.set(this.f2287b, num.intValue());
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.j
        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("CaseInsensitiveTextStrategy [field=");
            sbM5396a.append(this.f2287b);
            sbM5396a.append(", locale=");
            sbM5396a.append(this.f2288c);
            sbM5396a.append(", lKeyValues=");
            sbM5396a.append(this.f2289d);
            sbM5396a.append(", pattern=");
            sbM5396a.append(this.f2295a);
            sbM5396a.append("]");
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$g */
    private static class g extends k {

        /* JADX INFO: renamed from: a */
        private final String f2290a;

        g(String str) {
            super(null);
            this.f2290a = str;
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.k
        /* JADX INFO: renamed from: b */
        final boolean mo2348b(C0961d c0961d, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            for (int i2 = 0; i2 < this.f2290a.length(); i2++) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.f2290a.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(parsePosition.getIndex() + this.f2290a.length());
            return true;
        }

        public final String toString() {
            return C2174h.m5657b(C2137a.m5396a("CopyQuotedStrategy [formatField="), this.f2290a, "]");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$h */
    private static class h extends j {

        /* JADX INFO: renamed from: b */
        private static final h f2291b = new h("(Z|(?:[+-]\\d{2}))");

        /* JADX INFO: renamed from: c */
        private static final h f2292c = new h("(Z|(?:[+-]\\d{2}\\d{2}))");

        /* JADX INFO: renamed from: d */
        private static final h f2293d = new h("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        h(String str) {
            this.f2295a = Pattern.compile(str);
        }

        /* JADX INFO: renamed from: e */
        static k m2350e(int i) {
            if (i == 1) {
                return f2291b;
            }
            if (i == 2) {
                return f2292c;
            }
            if (i == 3) {
                return f2293d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.j
        /* JADX INFO: renamed from: c */
        final void mo2347c(Calendar calendar, String str) {
            calendar.setTimeZone(C0963f.m2365a(str));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$i */
    private static class i extends k {

        /* JADX INFO: renamed from: a */
        private final int f2294a;

        i(int i) {
            super(null);
            this.f2294a = i;
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.k
        /* JADX INFO: renamed from: a */
        final boolean mo2351a() {
            return true;
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.k
        /* JADX INFO: renamed from: b */
        final boolean mo2348b(C0961d c0961d, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i2 = i + index;
                if (length > i2) {
                    length = i2;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int i3 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.f2294a, mo2346c(c0961d, i3));
            return true;
        }

        /* JADX INFO: renamed from: c */
        int mo2346c(C0961d c0961d, int i) {
            return i;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("NumberStrategy [field=");
            sbM5396a.append(this.f2294a);
            sbM5396a.append("]");
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$j */
    private static abstract class j extends k {

        /* JADX INFO: renamed from: a */
        Pattern f2295a;

        j() {
            super(null);
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.k
        /* JADX INFO: renamed from: a */
        final boolean mo2351a() {
            return false;
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.k
        /* JADX INFO: renamed from: b */
        final boolean mo2348b(C0961d c0961d, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.f2295a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
            mo2347c(calendar, matcher.group(1));
            return true;
        }

        /* JADX INFO: renamed from: c */
        abstract void mo2347c(Calendar calendar, String str);

        public String toString() {
            return getClass().getSimpleName() + " [pattern=" + this.f2295a + "]";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$k */
    private static abstract class k {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        boolean mo2351a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        abstract boolean mo2348b(C0961d c0961d, Calendar calendar, String str, ParsePosition parsePosition, int i);
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$l */
    private static class l {

        /* JADX INFO: renamed from: a */
        final k f2296a;

        /* JADX INFO: renamed from: b */
        final int f2297b;

        l(k kVar, int i) {
            this.f2296a = kVar;
            this.f2297b = i;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("StrategyAndWidth [strategy=");
            sbM5396a.append(this.f2296a);
            sbM5396a.append(", width=");
            sbM5396a.append(this.f2297b);
            sbM5396a.append("]");
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$m */
    private class m {

        /* JADX INFO: renamed from: a */
        private final Calendar f2298a;

        /* JADX INFO: renamed from: b */
        private int f2299b;

        m(Calendar calendar) {
            this.f2298a = calendar;
        }

        /* JADX INFO: renamed from: a */
        final l m2352a() {
            if (this.f2299b >= C0961d.this.f2281a.length()) {
                return null;
            }
            char cCharAt = C0961d.this.f2281a.charAt(this.f2299b);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i = this.f2299b;
                do {
                    int i2 = this.f2299b + 1;
                    this.f2299b = i2;
                    if (i2 >= C0961d.this.f2281a.length()) {
                        break;
                    }
                } while (C0961d.this.f2281a.charAt(this.f2299b) == cCharAt);
                int i3 = this.f2299b - i;
                return new l(C0961d.m2337b(C0961d.this, cCharAt, i3, this.f2298a), i3);
            }
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.f2299b < C0961d.this.f2281a.length()) {
                char cCharAt2 = C0961d.this.f2281a.charAt(this.f2299b);
                if (!z) {
                    if ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z')) {
                        break;
                    }
                }
                if (cCharAt2 == '\'') {
                    int i4 = this.f2299b + 1;
                    this.f2299b = i4;
                    if (i4 == C0961d.this.f2281a.length() || C0961d.this.f2281a.charAt(this.f2299b) != '\'') {
                        z = !z;
                    }
                }
                this.f2299b++;
                sb.append(cCharAt2);
            }
            if (z) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String string = sb.toString();
            return new l(new g(string), string.length());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$n */
    static class n extends j {

        /* JADX INFO: renamed from: b */
        private final Locale f2301b;

        /* JADX INFO: renamed from: c */
        private final Map<String, a> f2302c = new HashMap();

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.d$n$a */
        private static class a {

            /* JADX INFO: renamed from: a */
            final TimeZone f2303a;

            /* JADX INFO: renamed from: b */
            final int f2304b;

            a(TimeZone timeZone, boolean z) {
                this.f2303a = timeZone;
                this.f2304b = z ? timeZone.getDSTSavings() : 0;
            }
        }

        /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p011C.d$n$a>] */
        n(Locale locale) {
            this.f2301b = C2420c.m6434a(locale);
            StringBuilder sbM5396a = C2137a.m5396a("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(C0961d.f2263h);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            aVar2 = new a(timeZone, true);
                        } else if (i == 5) {
                            aVar2 = aVar;
                        }
                        if (strArr[i] != null) {
                            String lowerCase = strArr[i].toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.f2302c.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String str2 : treeSet) {
                sbM5396a.append('|');
                C0961d.m2341f(sbM5396a, str2);
            }
            sbM5396a.append(")");
            this.f2295a = Pattern.compile(sbM5396a.toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p011C.d$n$a>] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p011C.d$n$a>] */
        @Override // com.github.catvod.spider.support.p011C.C0961d.j
        /* JADX INFO: renamed from: c */
        final void mo2347c(Calendar calendar, String str) {
            TimeZone timeZoneM2365a = C0963f.m2365a(str);
            if (timeZoneM2365a != null) {
                calendar.setTimeZone(timeZoneM2365a);
                return;
            }
            String lowerCase = str.toLowerCase(this.f2301b);
            a aVar = (a) this.f2302c.get(lowerCase);
            if (aVar == null) {
                aVar = (a) this.f2302c.get(lowerCase + '.');
            }
            calendar.set(16, aVar.f2304b);
            calendar.set(15, aVar.f2303a.getRawOffset());
        }

        @Override // com.github.catvod.spider.support.p011C.C0961d.j
        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("TimeZoneStrategy [locale=");
            sbM5396a.append(this.f2301b);
            sbM5396a.append(", tzNames=");
            sbM5396a.append(this.f2302c);
            sbM5396a.append(", pattern=");
            sbM5396a.append(this.f2295a);
            sbM5396a.append("]");
            return sbM5396a.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p011C.d$l>] */
    protected C0961d(String str, TimeZone timeZone, Locale locale) {
        int i2;
        this.f2281a = str;
        this.f2282b = timeZone;
        Locale localeM6434a = C2420c.m6434a(locale);
        this.f2283c = localeM6434a;
        Calendar calendar = Calendar.getInstance(timeZone, localeM6434a);
        if (localeM6434a.equals(f2262g)) {
            i2 = 0;
        } else {
            calendar.setTime(new Date());
            i2 = calendar.get(1) - 80;
        }
        int i3 = (i2 / 100) * 100;
        this.f2284d = i3;
        this.f2285e = i2 - i3;
        this.f2286f = new ArrayList();
        m mVar = new m(calendar);
        while (true) {
            l lVarM2352a = mVar.m2352a();
            if (lVarM2352a == null) {
                return;
            } else {
                this.f2286f.add(lVarM2352a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static k m2337b(C0961d c0961d, char c2, int i2, Calendar calendar) {
        int i3;
        c0961d.getClass();
        if (c2 != 'y') {
            if (c2 != 'z') {
                switch (c2) {
                    case 'D':
                        return f2270o;
                    case 'E':
                        i3 = 7;
                        break;
                    case 'F':
                        return f2273r;
                    case 'G':
                        i3 = 0;
                        break;
                    case 'H':
                        return f2274s;
                    default:
                        switch (c2) {
                            case 'K':
                                return f2277v;
                            case 'M':
                                return i2 >= 3 ? c0961d.m2342g(2, calendar) : f2266k;
                            case 'S':
                                return f2280y;
                            case 'a':
                                i3 = 9;
                                break;
                            case 'd':
                                return f2271p;
                            case 'h':
                                return f2276u;
                            case 'k':
                                return f2275t;
                            case 'm':
                                return f2278w;
                            case 's':
                                return f2279x;
                            case 'u':
                                return f2272q;
                            case 'w':
                                return f2268m;
                            default:
                                switch (c2) {
                                    case 'W':
                                        return f2269n;
                                    case 'X':
                                        return h.m2350e(i2);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i2 == 2) {
                                            return h.f2293d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c2 + "' not supported");
                                }
                                i3 = 15;
                                break;
                        }
                        break;
                }
            } else {
                i3 = 15;
            }
            return c0961d.m2342g(i3, calendar);
        }
        return i2 > 2 ? f2267l : f2265j;
    }

    /* JADX INFO: renamed from: c */
    static Map m2338c(Calendar calendar, Locale locale, int i2, StringBuilder sb) {
        HashMap map = new HashMap();
        Locale localeM6434a = C2420c.m6434a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i2, 0, localeM6434a);
        TreeSet treeSet = new TreeSet(f2263h);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(localeM6434a);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            m2343j(sb, (String) it.next());
            sb.append('|');
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    static int m2339d(C0961d c0961d, int i2) {
        int i3 = c0961d.f2284d + i2;
        return i2 >= c0961d.f2285e ? i3 : i3 + 100;
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ StringBuilder m2341f(StringBuilder sb, String str) {
        m2343j(sb, str);
        return sb;
    }

    /* JADX INFO: renamed from: g */
    private k m2342g(int i2, Calendar calendar) {
        ConcurrentMap<Locale, k> concurrentMap;
        ConcurrentMap<Locale, k>[] concurrentMapArr = f2264i;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i2] == null) {
                concurrentMapArr[i2] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i2];
        }
        k nVar = concurrentMap.get(this.f2283c);
        if (nVar == null) {
            nVar = i2 == 15 ? new n(this.f2283c) : new f(i2, calendar, this.f2283c);
            k kVarPutIfAbsent = concurrentMap.putIfAbsent(this.f2283c, nVar);
            if (kVarPutIfAbsent != null) {
                return kVarPutIfAbsent;
            }
        }
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX INFO: renamed from: j */
    private static StringBuilder m2343j(StringBuilder sb, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
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
        if (!(obj instanceof C0961d)) {
            return false;
        }
        C0961d c0961d = (C0961d) obj;
        return this.f2281a.equals(c0961d.f2281a) && this.f2282b.equals(c0961d.f2282b) && this.f2283c.equals(c0961d.f2283c);
    }

    /* JADX INFO: renamed from: h */
    public final Date m2344h(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateM2345i = m2345i(str, parsePosition);
        if (dateM2345i != null) {
            return dateM2345i;
        }
        if (!this.f2283c.equals(f2262g)) {
            throw new ParseException(C2139c.m5408a("Unparseable date: ", str), parsePosition.getErrorIndex());
        }
        StringBuilder sbM5396a = C2137a.m5396a("(The ");
        sbM5396a.append(this.f2283c);
        sbM5396a.append(" locale does not support dates before 1868 AD)\nUnparseable date: \"");
        sbM5396a.append(str);
        throw new ParseException(sbM5396a.toString(), parsePosition.getErrorIndex());
    }

    public final int hashCode() {
        return (((this.f2283c.hashCode() * 13) + this.f2282b.hashCode()) * 13) + this.f2281a.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p011C.d$l>] */
    /* JADX INFO: renamed from: i */
    public final Date m2345i(String str, ParsePosition parsePosition) {
        boolean z;
        l lVar;
        int i2;
        Calendar calendar = Calendar.getInstance(this.f2282b, this.f2283c);
        calendar.clear();
        ListIterator listIterator = this.f2286f.listIterator();
        do {
            z = false;
            if (!listIterator.hasNext()) {
                z = true;
                break;
            }
            lVar = (l) listIterator.next();
            if (lVar.f2296a.mo2351a() && listIterator.hasNext()) {
                k kVar = ((l) listIterator.next()).f2296a;
                listIterator.previous();
                if (kVar.mo2351a()) {
                    i2 = lVar.f2297b;
                } else {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
        } while (lVar.f2296a.mo2348b(this, calendar, str, parsePosition, i2));
        if (z) {
            return calendar.getTime();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("FastDateParser[");
        sbM5396a.append(this.f2281a);
        sbM5396a.append(", ");
        sbM5396a.append(this.f2283c);
        sbM5396a.append(", ");
        sbM5396a.append(this.f2282b.getID());
        sbM5396a.append("]");
        return sbM5396a.toString();
    }
}
}
