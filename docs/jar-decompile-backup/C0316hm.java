package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.hm */
/* JADX INFO: loaded from: classes.dex */
public final class C0316hm {

    /* JADX INFO: renamed from: a */
    public static final char[] f899a;

    /* JADX INFO: renamed from: b */
    public static final int[] f900b = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: c */
    public final C0606sf f901c;

    /* JADX INFO: renamed from: d */
    public final C0408kx f902d;

    /* JADX INFO: renamed from: k */
    public final C0708w f909k;

    /* JADX INFO: renamed from: l */
    public final C0667um f910l;

    /* JADX INFO: renamed from: m */
    public AbstractC0719wk f911m;

    /* JADX INFO: renamed from: q */
    public String f915q;

    /* JADX INFO: renamed from: r */
    public String f916r;

    /* JADX INFO: renamed from: s */
    public int f917s;

    /* JADX INFO: renamed from: e */
    public EnumC0709wa f903e = EnumC0709wa.f1698c;

    /* JADX INFO: renamed from: f */
    public AbstractC0680uz f904f = null;

    /* JADX INFO: renamed from: g */
    public boolean f905g = false;

    /* JADX INFO: renamed from: h */
    public String f906h = null;

    /* JADX INFO: renamed from: i */
    public final StringBuilder f907i = new StringBuilder(1024);

    /* JADX INFO: renamed from: j */
    public final StringBuilder f908j = new StringBuilder(1024);

    /* JADX INFO: renamed from: n */
    public final C0343im f912n = new C0343im(5);

    /* JADX INFO: renamed from: o */
    public final C0476nk f913o = new C0476nk();

    /* JADX INFO: renamed from: p */
    public final C0300gx f914p = new C0300gx();

    /* JADX INFO: renamed from: t */
    public int f918t = 0;

    /* JADX INFO: renamed from: u */
    public final int[] f919u = new int[1];

    /* JADX INFO: renamed from: v */
    public final int[] f920v = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f899a = cArr;
        Arrays.sort(cArr);
    }

    public C0316hm(C0801zl c0801zl) {
        C0708w c0708w = new C0708w(2, c0801zl);
        this.f909k = c0708w;
        this.f911m = c0708w;
        this.f910l = new C0667um(3, c0801zl);
        this.f901c = c0801zl.f1892l;
        this.f902d = (C0408kx) c0801zl.f1891k.f1779d;
    }

    /* JADX INFO: renamed from: aa */
    public final void m1280aa() {
        AbstractC0680uz.m1738h(this.f908j);
    }

    /* JADX INFO: renamed from: ab */
    public final void m1281ab(char c) {
        if (this.f906h == null) {
            this.f906h = String.valueOf(c);
        } else {
            StringBuilder sb = this.f907i;
            if (sb.length() == 0) {
                sb.append(this.f906h);
            }
            sb.append(c);
        }
        this.f912n.getClass();
        this.f901c.m1672ak();
    }

    /* JADX INFO: renamed from: ac */
    public final void m1282ac(AbstractC0680uz abstractC0680uz) {
        if (this.f905g) {
            throw new C0283gg("Must be false");
        }
        this.f904f = abstractC0680uz;
        this.f905g = true;
        abstractC0680uz.getClass();
        C0606sf c0606sf = this.f901c;
        c0606sf.m1672ak();
        this.f918t = c0606sf.m1672ak();
        int i = abstractC0680uz.f1590g;
        if (i == 2) {
            this.f915q = ((C0708w) abstractC0680uz).f1729c;
            this.f916r = null;
        } else if (i == 3) {
            C0667um c0667um = (C0667um) abstractC0680uz;
            if (c0667um.f1732f != null) {
                Object[] objArr = {c0667um.f1730d};
                C0408kx c0408kx = this.f902d;
                if (c0408kx.m1364a()) {
                    c0408kx.add(new abb(c0606sf, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ad */
    public final void m1283ad(String str) {
        if (this.f906h == null) {
            this.f906h = str;
        } else {
            StringBuilder sb = this.f907i;
            if (sb.length() == 0) {
                sb.append(this.f906h);
            }
            sb.append(str);
        }
        this.f912n.getClass();
        this.f901c.m1672ak();
    }

    /* JADX INFO: renamed from: ae */
    public final void m1284ae(StringBuilder sb) {
        if (this.f906h == null) {
            this.f906h = sb.toString();
        } else {
            StringBuilder sb2 = this.f907i;
            if (sb2.length() == 0) {
                sb2.append(this.f906h);
            }
            sb2.append((CharSequence) sb);
        }
        this.f912n.getClass();
        this.f901c.m1672ak();
    }

    /* JADX INFO: renamed from: af */
    public final void m1285af() {
        m1282ac(this.f914p);
    }

    /* JADX INFO: renamed from: ag */
    public final void m1286ag() {
        m1282ac(this.f913o);
    }

    /* JADX INFO: renamed from: ah */
    public final void m1287ah() {
        AbstractC0719wk abstractC0719wk = this.f911m;
        if (abstractC0719wk.f1735q) {
            abstractC0719wk.m1805ac();
        }
        m1282ac(this.f911m);
    }

    /* JADX INFO: renamed from: ai */
    public final void m1288ai(EnumC0709wa enumC0709wa) {
        C0408kx c0408kx = this.f902d;
        if (c0408kx.m1364a()) {
            c0408kx.add(new abb(this.f901c, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{enumC0709wa}));
        }
    }

    /* JADX INFO: renamed from: aj */
    public final void m1289aj(EnumC0709wa enumC0709wa) {
        C0408kx c0408kx = this.f902d;
        if (c0408kx.m1364a()) {
            C0606sf c0606sf = this.f901c;
            c0408kx.add(new abb(c0606sf, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(c0606sf.m1662aa()), enumC0709wa}));
        }
    }

    /* JADX INFO: renamed from: ak */
    public final boolean m1290ak() {
        if (this.f915q != null) {
            AbstractC0719wk abstractC0719wk = this.f911m;
            String str = abstractC0719wk.f1729c;
            if (str == null || str.length() == 0) {
                throw new C0283gg("Must be false");
            }
            if (abstractC0719wk.f1729c.equalsIgnoreCase(this.f915q)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: al */
    public final void m1291al(EnumC0709wa enumC0709wa) {
        if (enumC0709wa == EnumC0709wa.f1705j) {
            this.f917s = this.f901c.m1672ak();
        }
        this.f903e = enumC0709wa;
    }

    /* JADX INFO: renamed from: w */
    public final void m1292w(EnumC0709wa enumC0709wa) {
        m1291al(enumC0709wa);
        this.f901c.m1676q();
    }

    /* JADX INFO: renamed from: x */
    public final void m1293x(String str, Object... objArr) {
        C0408kx c0408kx = this.f902d;
        if (c0408kx.m1364a()) {
            c0408kx.add(new abb(this.f901c, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX INFO: renamed from: y */
    public final int[] m1294y(Character ch, boolean z) {
        int i;
        char c;
        char c2;
        char c3;
        char c4;
        int i2;
        String strM1661p;
        char c5;
        int iIntValue;
        int i3;
        char c6;
        C0606sf c0606sf = this.f901c;
        if (c0606sf.m1663ab()) {
            return null;
        }
        if (ch != null && ch.charValue() == c0606sf.m1662aa()) {
            return null;
        }
        char[] cArr = f899a;
        c0606sf.m1677r();
        if (!c0606sf.m1663ab() && Arrays.binarySearch(cArr, c0606sf.f1477e[c0606sf.f1478f]) >= 0) {
            return null;
        }
        if (c0606sf.f1479g - c0606sf.f1478f < 1024) {
            c0606sf.f1480h = 0;
        }
        c0606sf.m1677r();
        c0606sf.f1482j = c0606sf.f1478f;
        boolean zM1665ad = c0606sf.m1665ad("#");
        char c7 = 'A';
        int[] iArr = this.f919u;
        if (zM1665ad) {
            boolean zM1666ae = c0606sf.m1666ae("X");
            if (zM1666ae) {
                c0606sf.m1677r();
                int i4 = c0606sf.f1478f;
                while (true) {
                    i3 = c0606sf.f1478f;
                    if (i3 >= c0606sf.f1479g || (((c6 = c0606sf.f1477e[i3]) < '0' || c6 > '9') && ((c6 < c7 || c6 > 'F') && (c6 < 'a' || c6 > 'f')))) {
                        break;
                    }
                    c0606sf.f1478f = i3 + 1;
                    c7 = 'A';
                }
                strM1661p = C0606sf.m1661p(c0606sf.f1477e, c0606sf.f1475c, i4, i3 - i4);
            } else {
                c0606sf.m1677r();
                int i5 = c0606sf.f1478f;
                while (true) {
                    i2 = c0606sf.f1478f;
                    if (i2 >= c0606sf.f1479g || (c5 = c0606sf.f1477e[i2]) < '0' || c5 > '9') {
                        break;
                    }
                    c0606sf.f1478f = i2 + 1;
                }
                strM1661p = C0606sf.m1661p(c0606sf.f1477e, c0606sf.f1475c, i5, i2 - i5);
            }
            if (strM1661p.length() == 0) {
                m1293x("numeric reference with no numerals", new Object[0]);
                c0606sf.m1674am();
                return null;
            }
            c0606sf.f1482j = -1;
            if (!c0606sf.m1665ad(";")) {
                m1293x("missing semicolon on [&#%s]", strM1661p);
            }
            try {
                iIntValue = Integer.valueOf(strM1661p, zM1666ae ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || iIntValue > 1114111) {
                m1293x("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128 && iIntValue < 160) {
                    m1293x("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                    iIntValue = f900b[iIntValue - 128];
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        c0606sf.m1677r();
        int i6 = c0606sf.f1478f;
        while (true) {
            int i7 = c0606sf.f1478f;
            if (i7 >= c0606sf.f1479g || (((c4 = c0606sf.f1477e[i7]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                break;
            }
            c0606sf.f1478f++;
        }
        while (true) {
            i = c0606sf.f1478f;
            if (i >= c0606sf.f1479g || (c3 = c0606sf.f1477e[i]) < '0' || c3 > '9') {
                break;
            }
            c0606sf.f1478f = i + 1;
        }
        String strM1661p2 = C0606sf.m1661p(c0606sf.f1477e, c0606sf.f1475c, i6, i - i6);
        boolean zM1667af = c0606sf.m1667af(';');
        char[] cArr2 = AbstractC0225ec.f764a;
        EnumC0255ff enumC0255ff = EnumC0255ff.base;
        int iBinarySearch = Arrays.binarySearch(enumC0255ff.f820e, strM1661p2);
        if ((iBinarySearch >= 0 ? enumC0255ff.f821f[iBinarySearch] : -1) == -1) {
            EnumC0255ff enumC0255ff2 = EnumC0255ff.extended;
            int iBinarySearch2 = Arrays.binarySearch(enumC0255ff2.f820e, strM1661p2);
            if ((iBinarySearch2 >= 0 ? enumC0255ff2.f821f[iBinarySearch2] : -1) == -1 || !zM1667af) {
                c0606sf.m1674am();
                if (zM1667af) {
                    m1293x("invalid named reference [%s]", strM1661p2);
                }
                if (z) {
                    return null;
                }
                Iterator it = AbstractC0225ec.f766c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strM1661p2 = "";
                        break;
                    }
                    String str = (String) it.next();
                    if (strM1661p2.startsWith(str)) {
                        strM1661p2 = str;
                        break;
                    }
                }
                if (strM1661p2.isEmpty()) {
                    return null;
                }
                c0606sf.m1665ad(strM1661p2);
            }
        }
        if (z && (c0606sf.m1670ai() || ((!c0606sf.m1663ab() && (c2 = c0606sf.f1477e[c0606sf.f1478f]) >= '0' && c2 <= '9') || c0606sf.m1668ag('=', '-', '_')))) {
            c0606sf.m1674am();
            return null;
        }
        c0606sf.f1482j = -1;
        if (!c0606sf.m1665ad(";")) {
            m1293x("missing semicolon on [&%s]", strM1661p2);
        }
        String str2 = (String) AbstractC0225ec.f765b.get(strM1661p2);
        int[] iArr2 = this.f920v;
        if (str2 != null) {
            iArr2[0] = str2.codePointAt(0);
            iArr2[1] = str2.codePointAt(1);
            c = 2;
        } else {
            EnumC0255ff enumC0255ff3 = EnumC0255ff.extended;
            int iBinarySearch3 = Arrays.binarySearch(enumC0255ff3.f820e, strM1661p2);
            int i8 = iBinarySearch3 >= 0 ? enumC0255ff3.f821f[iBinarySearch3] : -1;
            if (i8 != -1) {
                iArr2[0] = i8;
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == 1) {
            iArr[0] = iArr2[0];
            return iArr;
        }
        if (c == 2) {
            return iArr2;
        }
        throw new C0283gg("Unexpected characters returned for ".concat(strM1661p2));
    }

    /* JADX INFO: renamed from: z */
    public final AbstractC0719wk m1295z(boolean z) {
        AbstractC0719wk abstractC0719wk;
        if (z) {
            abstractC0719wk = this.f909k;
            abstractC0719wk.mo904a();
        } else {
            abstractC0719wk = this.f910l;
            abstractC0719wk.mo904a();
        }
        this.f911m = abstractC0719wk;
        return abstractC0719wk;
    }
}
