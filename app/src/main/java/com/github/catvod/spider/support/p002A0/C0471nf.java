package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.nf */
/* JADX INFO: loaded from: classes.dex */
public final class C0471nf {

    /* JADX INFO: renamed from: a */
    public static final char[] f1273a = {',', '>', '+', '~', ' '};

    /* JADX INFO: renamed from: b */
    public static final String[] f1274b = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: c */
    public static final Pattern f1275c = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f1276d = Pattern.compile("([+-])?(\\d+)");

    /* JADX INFO: renamed from: e */
    public final C0421lj f1277e;

    /* JADX INFO: renamed from: f */
    public final String f1278f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f1279g = new ArrayList();

    public C0471nf(String str) {
        AbstractC0711wc.m1768c(str);
        String strTrim = str.trim();
        this.f1278f = strTrim;
        this.f1277e = new C0421lj(strTrim);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC0213dr m1458h(String str) {
        try {
            return new C0471nf(str).m1468r();
        } catch (IllegalArgumentException e) {
            throw new C0267fr(e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:56:0x012d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX INFO: renamed from: i */
    public final void m1459i(char c) {
        AbstractC0213dr c0635th;
        AbstractC0213dr abstractC0213dr;
        boolean z;
        C0635th c0635th2;
        Object obj;
        Object obj2;
        C0425ln c0425ln;
        C0636ti c0636ti;
        int i = 2;
        C0421lj c0421lj = this.f1277e;
        c0421lj.m1378i();
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        boolean z2 = false;
        while (!c0421lj.m1379j()) {
            if (!c0421lj.m1382m(f1273a)) {
                if (c0421lj.m1381l("(")) {
                    sbM1845g.append("(");
                    sbM1845g.append(c0421lj.m1375f('(', ')'));
                    sbM1845g.append(")");
                } else if (c0421lj.m1381l("[")) {
                    sbM1845g.append("[");
                    sbM1845g.append(c0421lj.m1375f('[', ']'));
                    sbM1845g.append("]");
                } else if (c0421lj.m1381l("\\")) {
                    sbM1845g.append(c0421lj.m1376g());
                    if (!c0421lj.m1379j()) {
                        sbM1845g.append(c0421lj.m1376g());
                    }
                } else {
                    sbM1845g.append(c0421lj.m1376g());
                }
                z2 = true;
            } else if (z2) {
                break;
            } else {
                sbM1845g.append(c0421lj.m1376g());
            }
        }
        AbstractC0213dr abstractC0213drM1458h = m1458h(AbstractC0727ws.m1852n(sbM1845g));
        ArrayList arrayList = this.f1279g;
        if (arrayList.size() == 1) {
            c0635th = (AbstractC0213dr) arrayList.get(0);
            if ((c0635th instanceof C0636ti) && c != ',') {
                C0636ti c0636ti2 = (C0636ti) c0635th;
                int i2 = c0636ti2.f1537f;
                AbstractC0213dr abstractC0213dr2 = i2 > 0 ? (AbstractC0213dr) c0636ti2.f1535a.get(i2 - 1) : null;
                z = true;
                AbstractC0213dr abstractC0213dr3 = abstractC0213dr2;
                abstractC0213dr = c0635th;
                c0635th = abstractC0213dr3;
            }
            arrayList.clear();
            if (c != ' ') {
                if (c != '>') {
                    if (c0635th instanceof C0425ln) {
                        c0425ln = (C0425ln) c0635th;
                    } else {
                        c0425ln = new C0425ln(c0635th);
                    }
                    c0425ln.f1160a.add(abstractC0213drM1458h);
                    c0425ln.f1161e = abstractC0213drM1458h.mo1019b() + c0425ln.f1161e;
                    obj = c0425ln;
                } else if (c != '~') {
                    c0635th2 = new C0635th(new C0811zv(c0635th), abstractC0213drM1458h);
                } else if (c != '+') {
                    c0635th2 = new C0635th(new C0480no(c0635th), abstractC0213drM1458h);
                } else {
                    if (c == ',') {
                        throw new C0267fr("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (c0635th instanceof C0636ti) {
                        c0636ti = (C0636ti) c0635th;
                    } else {
                        C0636ti c0636ti3 = new C0636ti();
                        c0636ti3.f1535a.add(c0635th);
                        c0636ti3.m1714h();
                        c0636ti = c0636ti3;
                    }
                    c0636ti.f1535a.add(abstractC0213drM1458h);
                    c0636ti.m1714h();
                    obj = c0636ti;
                }
                if (z) {
                    C0636ti c0636ti4 = (C0636ti) abstractC0213dr;
                    c0636ti4.f1535a.set(c0636ti4.f1537f - 1, obj);
                    c0636ti4.m1714h();
                    obj2 = abstractC0213dr;
                } else {
                    obj2 = obj;
                }
                arrayList.add(obj2);
            }
            c0635th2 = new C0635th(new C0137aw(c0635th, i), abstractC0213drM1458h);
            obj = c0635th2;
            if (z) {
                C0636ti c0636ti5 = (C0636ti) abstractC0213dr;
                c0636ti5.f1535a.set(c0636ti5.f1537f - 1, obj);
                c0636ti5.m1714h();
                obj2 = abstractC0213dr;
            } else {
                obj2 = obj;
            }
            arrayList.add(obj2);
        }
        c0635th = new C0635th(arrayList);
        abstractC0213dr = c0635th;
        z = false;
        arrayList.clear();
        if (c != ' ') {
            if (c != '>') {
                if (c0635th instanceof C0425ln) {
                    c0425ln = (C0425ln) c0635th;
                } else {
                    c0425ln = new C0425ln(c0635th);
                }
                c0425ln.f1160a.add(abstractC0213drM1458h);
                c0425ln.f1161e = abstractC0213drM1458h.mo1019b() + c0425ln.f1161e;
                obj = c0425ln;
            } else if (c != '~') {
                c0635th2 = new C0635th(new C0811zv(c0635th), abstractC0213drM1458h);
            } else if (c != '+') {
                c0635th2 = new C0635th(new C0480no(c0635th), abstractC0213drM1458h);
            } else {
                if (c == ',') {
                    throw new C0267fr("Unknown combinator '%s'", Character.valueOf(c));
                }
                if (c0635th instanceof C0636ti) {
                    c0636ti = (C0636ti) c0635th;
                } else {
                    C0636ti c0636ti6 = new C0636ti();
                    c0636ti6.f1535a.add(c0635th);
                    c0636ti6.m1714h();
                    c0636ti = c0636ti6;
                }
                c0636ti.f1535a.add(abstractC0213drM1458h);
                c0636ti.m1714h();
                obj = c0636ti;
            }
            if (z) {
                C0636ti c0636ti7 = (C0636ti) abstractC0213dr;
                c0636ti7.f1535a.set(c0636ti7.f1537f - 1, obj);
                c0636ti7.m1714h();
                obj2 = abstractC0213dr;
            } else {
                obj2 = obj;
            }
            arrayList.add(obj2);
        }
        c0635th2 = new C0635th(new C0137aw(c0635th, i), abstractC0213drM1458h);
        obj = c0635th2;
        if (z) {
            C0636ti c0636ti8 = (C0636ti) abstractC0213dr;
            c0636ti8.f1535a.set(c0636ti8.f1537f - 1, obj);
            c0636ti8.m1714h();
            obj2 = abstractC0213dr;
        } else {
            obj2 = obj;
        }
        arrayList.add(obj2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:72:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final AbstractC0213dr m1460j() {
        AbstractC0213dr c0242et;
        AbstractC0213dr c0246ex;
        int i = 7;
        int i2 = 5;
        int i3 = 8;
        int i4 = 9;
        int i5 = 4;
        int i6 = 6;
        int i7 = 3;
        int i8 = 2;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        C0421lj c0421lj = this.f1277e;
        boolean zM1380k = c0421lj.m1380k("#");
        String[] strArr = C0421lj.f1156b;
        if (zM1380k) {
            String strM1377h = c0421lj.m1377h(strArr);
            AbstractC0711wc.m1768c(strM1377h);
            return new C0242et(strM1377h, i3, z2);
        }
        if (c0421lj.m1380k(".")) {
            String strM1377h2 = c0421lj.m1377h(strArr);
            AbstractC0711wc.m1768c(strM1377h2);
            return new C0242et(strM1377h2.trim(), i8, objArr12 == true ? 1 : 0);
        }
        if ((!c0421lj.m1379j() && Character.isLetterOrDigit(c0421lj.f1157c.charAt(c0421lj.f1158d))) || c0421lj.m1381l("*|")) {
            String strM1582d = AbstractC0552qf.m1582d(c0421lj.m1377h(C0421lj.f1155a));
            AbstractC0711wc.m1768c(strM1582d);
            if (!strM1582d.startsWith("*|")) {
                if (!strM1582d.endsWith("|*")) {
                    if (strM1582d.contains("|")) {
                        strM1582d = strM1582d.replace("|", ":");
                    }
                    return new C0242et(strM1582d, i4, objArr == true ? 1 : 0);
                }
                return new C0242et(strM1582d.substring(0, strM1582d.length() - 2) + ":", 11, objArr2 == true ? 1 : 0);
            }
            String strSubstring = strM1582d.substring(2);
            List listAsList = Arrays.asList(new C0242et(strSubstring, i4, objArr4 == true ? 1 : 0), new C0242et(":" + strSubstring, 10, objArr3 == true ? 1 : 0));
            C0636ti c0636ti = new C0636ti();
            int i9 = c0636ti.f1537f;
            ArrayList arrayList = c0636ti.f1535a;
            if (i9 > 1) {
                arrayList.add(new C0635th(listAsList));
            } else {
                arrayList.addAll(listAsList);
            }
            c0636ti.m1714h();
            return c0636ti;
        }
        boolean zM1381l = c0421lj.m1381l("[");
        String str = this.f1278f;
        if (zM1381l) {
            C0421lj c0421lj2 = new C0421lj(c0421lj.m1375f('[', ']'));
            String[] strArr2 = f1274b;
            int i10 = c0421lj2.f1158d;
            loop0: while (!c0421lj2.m1379j()) {
                for (int i11 = 0; i11 < 6; i11++) {
                    if (c0421lj2.m1381l(strArr2[i11])) {
                        break loop0;
                    }
                }
                c0421lj2.f1158d++;
            }
            String strSubstring2 = c0421lj2.f1157c.substring(i10, c0421lj2.f1158d);
            AbstractC0711wc.m1768c(strSubstring2);
            c0421lj2.m1378i();
            if (c0421lj2.m1379j()) {
                if (strSubstring2.startsWith("^")) {
                    return new C0242et(strSubstring2.substring(1), 1);
                }
                return strSubstring2.equals(Marker.ANY_MARKER) ? new C0242et("", 1) : new C0242et(strSubstring2, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            if (c0421lj2.m1380k("=")) {
                c0246ex = new C0245ew(objArr9 == true ? 1 : 0, strSubstring2, c0421lj2.m1383n(), z);
            } else if (c0421lj2.m1380k("!=")) {
                c0246ex = new C0245ew(i7, strSubstring2, c0421lj2.m1383n(), c5 == true ? 1 : 0);
            } else if (c0421lj2.m1380k("^=")) {
                c0246ex = new C0245ew(i5, strSubstring2, c0421lj2.m1383n(), objArr8 == true ? 1 : 0);
            } else if (c0421lj2.m1380k("$=")) {
                c0246ex = new C0245ew(i8, strSubstring2, c0421lj2.m1383n(), objArr7 == true ? 1 : 0);
            } else if (c0421lj2.m1380k("*=")) {
                c0246ex = new C0245ew(c4 == true ? 1 : 0, strSubstring2, c0421lj2.m1383n(), c3 == true ? 1 : 0);
            } else {
                if (!c0421lj2.m1380k("~=")) {
                    throw new C0267fr("Could not parse attribute query '%s': unexpected token at '%s'", str, c0421lj2.m1383n());
                }
                c0246ex = new C0246ex(strSubstring2, Pattern.compile(c0421lj2.m1383n()));
            }
            return c0246ex;
        }
        if (c0421lj.m1380k(Marker.ANY_MARKER)) {
            return new C0583rj(objArr6 == true ? 1 : 0);
        }
        if (!c0421lj.m1380k(":")) {
            throw new C0267fr("Could not parse query '%s': unexpected token at '%s'", str, c0421lj.m1383n());
        }
        String strM1377h3 = c0421lj.m1377h(strArr);
        strM1377h3.getClass();
        switch (strM1377h3) {
            case "containsData":
                String strM1374e = C0421lj.m1374e(m1462l());
                AbstractC0711wc.m1769d(strM1374e, ":containsData(text) query must not be empty");
                c0242et = new C0242et(strM1374e, 3);
                break;
            case "first-child":
                return new C0583rj(i8);
            case "matchesWholeText":
                return m1467q(false);
            case "nth-child":
                return m1465o(false, false);
            case "nth-last-child":
                return m1465o(true, false);
            case "only-child":
                return new C0583rj(i5);
            case "nth-of-type":
                return m1465o(false, true);
            case "nth-last-of-type":
                return m1465o(true, true);
            case "contains":
                return m1463m(false);
            case "containsWholeOwnText":
                return m1464n(true);
            case "eq":
                return new C0214ds(m1461k(), 0);
            case "gt":
                return new C0214ds(m1461k(), 1);
            case "is":
                String strM1462l = m1462l();
                AbstractC0711wc.m1769d(strM1462l, ":is(selector) sub-select must not be empty");
                c0242et = new C0137aw(m1458h(strM1462l), objArr5 == true ? 1 : 0);
                break;
            case "lt":
                return new C0214ds(m1461k(), 2);
            case "has":
                String strM1462l2 = m1462l();
                AbstractC0711wc.m1769d(strM1462l2, ":has(selector) sub-select must not be empty");
                c0242et = new C0562qp(m1458h(strM1462l2));
                break;
            case "not":
                String strM1462l3 = m1462l();
                AbstractC0711wc.m1769d(strM1462l3, ":not(selector) subselect must not be empty");
                c0242et = new C0137aw(m1458h(strM1462l3), c == true ? 1 : 0);
                break;
            case "root":
                return new C0583rj(i6);
            case "empty":
                return new C0583rj(c2 == true ? 1 : 0);
            case "containsOwn":
                return m1463m(true);
            case "matchText":
                return new C0583rj(i);
            case "last-child":
                return new C0583rj(i7);
            case "matches":
                return m1466p(false);
            case "matchesWholeOwnText":
                return m1467q(true);
            case "first-of-type":
                return new C0223ea(0, 1, 3);
            case "only-of-type":
                return new C0583rj(i2);
            case "matchesOwn":
                return m1466p(true);
            case "containsWholeText":
                return m1464n(false);
            case "last-of-type":
                return new C0212dq(0, 1, 2);
            default:
                throw new C0267fr("Could not parse query '%s': unexpected token at '%s'", str, c0421lj.m1383n());
        }
        return c0242et;
    }

    /* JADX INFO: renamed from: k */
    public final int m1461k() {
        boolean z = true;
        String strTrim = m1462l().trim();
        String[] strArr = AbstractC0727ws.f1762a;
        if (strTrim == null || strTrim.length() == 0) {
            z = false;
            break;
        }
        int length = strTrim.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(strTrim.codePointAt(i))) {
                z = false;
                break;
            }
        }
        if (z) {
            return Integer.parseInt(strTrim);
        }
        throw new C0283gg("Index must be numeric");
    }

    /* JADX INFO: renamed from: l */
    public final String m1462l() {
        return this.f1277e.m1375f('(', ')');
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC0213dr m1463m(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        String strM1374e = C0421lj.m1374e(m1462l());
        AbstractC0711wc.m1769d(strM1374e, str.concat("(text) query must not be empty"));
        return z ? new C0242et(strM1374e, 4) : new C0242et(strM1374e, 5);
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC0213dr m1464n(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        String strM1374e = C0421lj.m1374e(m1462l());
        AbstractC0711wc.m1769d(strM1374e, str.concat("(text) query must not be empty"));
        return z ? new C0242et(strM1374e, 6, false) : new C0242et(strM1374e, 7, false);
    }

    /* JADX INFO: renamed from: o */
    public final C0218dw m1465o(boolean z, boolean z2) {
        int i;
        int i2;
        String strM1582d = AbstractC0552qf.m1582d(m1462l());
        Matcher matcher = f1275c.matcher(strM1582d);
        Matcher matcher2 = f1276d.matcher(strM1582d);
        if ("odd".equals(strM1582d)) {
            i2 = 2;
            i = 1;
        } else {
            if ("even".equals(strM1582d)) {
                i2 = 2;
            } else if (matcher.matches()) {
                i2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                if (matcher.group(4) != null) {
                    i = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                }
            } else {
                if (!matcher2.matches()) {
                    throw new C0267fr("Could not parse nth-index '%s': unexpected format", strM1582d);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i2 = 0;
            }
            i = 0;
        }
        if (z2) {
            return z ? new C0218dw(i2, i, 2) : new C0218dw(i2, i, 3);
        }
        return z ? new C0218dw(i2, i, 1) : new C0218dw(i2, i, 0);
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC0213dr m1466p(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        String strM1462l = m1462l();
        AbstractC0711wc.m1769d(strM1462l, str.concat("(regex) query must not be empty"));
        return z ? new C0220dy(Pattern.compile(strM1462l), 1) : new C0220dy(Pattern.compile(strM1462l), 0);
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC0213dr m1467q(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        String strM1462l = m1462l();
        AbstractC0711wc.m1769d(strM1462l, str.concat("(regex) query must not be empty"));
        return z ? new C0220dy(Pattern.compile(strM1462l), 2) : new C0220dy(Pattern.compile(strM1462l), 3);
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC0213dr m1468r() {
        C0421lj c0421lj = this.f1277e;
        c0421lj.m1378i();
        char[] cArr = f1273a;
        boolean zM1382m = c0421lj.m1382m(cArr);
        ArrayList arrayList = this.f1279g;
        if (zM1382m) {
            arrayList.add(new C0583rj(8));
            m1459i(c0421lj.m1376g());
        } else {
            arrayList.add(m1460j());
        }
        while (!c0421lj.m1379j()) {
            boolean zM1378i = c0421lj.m1378i();
            if (c0421lj.m1382m(cArr)) {
                m1459i(c0421lj.m1376g());
            } else if (zM1378i) {
                m1459i(' ');
            } else {
                arrayList.add(m1460j());
            }
        }
        return arrayList.size() == 1 ? (AbstractC0213dr) arrayList.get(0) : new C0635th(arrayList);
    }

    public final String toString() {
        return this.f1278f;
    }
}
