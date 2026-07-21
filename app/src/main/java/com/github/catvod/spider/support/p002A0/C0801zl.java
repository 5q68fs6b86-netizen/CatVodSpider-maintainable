package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zl */
/* JADX INFO: loaded from: classes.dex */
public final class C0801zl {

    /* JADX INFO: renamed from: a */
    public static final String[] f1874a = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: b */
    public static final String[] f1875b = {"ol", "ul"};

    /* JADX INFO: renamed from: c */
    public static final String[] f1876c = {"button"};

    /* JADX INFO: renamed from: d */
    public static final String[] f1877d = {"html", "table"};

    /* JADX INFO: renamed from: e */
    public static final String[] f1878e = {"optgroup", "option"};

    /* JADX INFO: renamed from: f */
    public static final String[] f1879f = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: g */
    public static final String[] f1880g = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: h */
    public static final String[] f1881h = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* JADX INFO: renamed from: i */
    public static final String[] f1882i = {"mi", "mn", "mo", "ms", "mtext"};

    /* JADX INFO: renamed from: j */
    public static final String[] f1883j = {"desc", "foreignObject", "title"};

    /* JADX INFO: renamed from: aa */
    public ArrayList f1884aa;

    /* JADX INFO: renamed from: ab */
    public ArrayList f1885ab;

    /* JADX INFO: renamed from: ac */
    public ArrayList f1886ac;

    /* JADX INFO: renamed from: ad */
    public C0667um f1887ad;

    /* JADX INFO: renamed from: ae */
    public boolean f1888ae;

    /* JADX INFO: renamed from: af */
    public boolean f1889af;

    /* JADX INFO: renamed from: k */
    public C0736xa f1891k;

    /* JADX INFO: renamed from: l */
    public C0606sf f1892l;

    /* JADX INFO: renamed from: m */
    public C0316hm f1893m;

    /* JADX INFO: renamed from: n */
    public C0235em f1894n;

    /* JADX INFO: renamed from: o */
    public ArrayList f1895o;

    /* JADX INFO: renamed from: p */
    public String f1896p;

    /* JADX INFO: renamed from: q */
    public AbstractC0680uz f1897q;

    /* JADX INFO: renamed from: r */
    public C0707vz f1898r;

    /* JADX INFO: renamed from: s */
    public HashMap f1899s;

    /* JADX INFO: renamed from: t */
    public C0708w f1900t;

    /* JADX INFO: renamed from: v */
    public EnumC0416le f1902v;

    /* JADX INFO: renamed from: w */
    public EnumC0416le f1903w;

    /* JADX INFO: renamed from: x */
    public boolean f1904x;

    /* JADX INFO: renamed from: y */
    public C0226ed f1905y;

    /* JADX INFO: renamed from: z */
    public C0166by f1906z;

    /* JADX INFO: renamed from: u */
    public final C0667um f1901u = new C0667um(3, this);

    /* JADX INFO: renamed from: ag */
    public final String[] f1890ag = {null};

    /* JADX INFO: renamed from: ah */
    public static boolean m1911ah(ArrayList arrayList, C0226ed c0226ed) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((C0226ed) arrayList.get(i)) == c0226ed) {
                return true;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ai */
    public final C0226ed m1912ai(C0226ed c0226ed) {
        for (int size = this.f1895o.size() - 1; size >= 0; size--) {
            if (((C0226ed) this.f1895o.get(size)) == c0226ed) {
                return (C0226ed) this.f1895o.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: aj */
    public final void m1913aj(C0226ed c0226ed) {
        int size = this.f1884aa.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            C0226ed c0226ed2 = (C0226ed) this.f1884aa.get(i3);
            if (c0226ed2 == null) {
                return;
            }
            if (c0226ed.f771g.f590c.equals(c0226ed2.f771g.f590c) && c0226ed.mo1170l().equals(c0226ed2.mo1170l())) {
                i2++;
            }
            if (i2 == 3) {
                this.f1884aa.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ak */
    public final void m1914ak() {
        while (!this.f1884aa.isEmpty()) {
            int size = this.f1884aa.size();
            if ((size > 0 ? (C0226ed) this.f1884aa.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: al */
    public final void m1915al(String... strArr) {
        for (int size = this.f1895o.size() - 1; size >= 0; size--) {
            C0226ed c0226ed = (C0226ed) this.f1895o.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(c0226ed.f771g.f591d) && (AbstractC0727ws.m1846h(c0226ed.f771g.f590c, strArr) || c0226ed.m1230aw("html"))) {
                return;
            }
            m1942bm();
        }
    }

    /* JADX INFO: renamed from: am */
    public final void m1916am() {
        m1915al("table", "template");
    }

    /* JADX INFO: renamed from: an */
    public final void m1917an() {
        m1915al("tr", "template");
    }

    /* JADX INFO: renamed from: ao */
    public final C0226ed m1918ao(C0708w c0708w, String str, boolean z) {
        int i;
        int i2;
        C0554qh c0554qh = c0708w.f1732f;
        if (!z) {
            C0707vz c0707vz = this.f1898r;
            if (c0554qh == null) {
                c0707vz.getClass();
            } else if (!c0707vz.f1651d) {
                for (int i3 = 0; i3 < c0554qh.f1405a; i3++) {
                    String str2 = c0554qh.f1406b[i3];
                    if (!C0554qh.m1584d(str2)) {
                        c0554qh.f1406b[i3] = AbstractC0552qf.m1581c(str2);
                    }
                }
            }
        }
        if (c0554qh != null && (i = c0554qh.f1405a) != 0) {
            C0707vz c0707vz2 = this.f1898r;
            if (i == 0) {
                i2 = 0;
            } else {
                boolean z2 = c0707vz2.f1651d;
                int i4 = 0;
                i2 = 0;
                while (i4 < c0554qh.f1405a) {
                    String str3 = c0554qh.f1406b[i4];
                    i4++;
                    int i5 = i4;
                    while (i5 < c0554qh.f1405a) {
                        if ((z2 && str3.equals(c0554qh.f1406b[i5])) || (!z2 && str3.equalsIgnoreCase(c0554qh.f1406b[i5]))) {
                            i2++;
                            c0554qh.m1595o(i5);
                            i5--;
                        }
                        i5++;
                    }
                }
            }
            if (i2 > 0) {
                Object[] objArr = {c0708w.f1730d};
                C0408kx c0408kx = (C0408kx) this.f1891k.f1779d;
                if (c0408kx.m1364a()) {
                    c0408kx.add(new abb(this.f1892l, "Dropped duplicate attribute(s) in tag [%s]", objArr));
                }
            }
        }
        C0118ad c0118adM1954by = m1954by(c0708w.f1729c, str, z ? C0707vz.f1649b : this.f1898r);
        return c0118adM1954by.f590c.equals("form") ? new C0166by(c0118adM1954by, c0554qh) : new C0226ed(c0118adM1954by, null, c0554qh);
    }

    /* JADX INFO: renamed from: ap */
    public final C0226ed m1919ap() {
        int size = this.f1895o.size();
        return size > 0 ? (C0226ed) this.f1895o.get(size - 1) : this.f1894n;
    }

    /* JADX INFO: renamed from: aq */
    public final boolean m1920aq(String str) {
        C0226ed c0226edM1919ap;
        if (this.f1895o.size() == 0 || (c0226edM1919ap = m1919ap()) == null) {
            return false;
        }
        C0118ad c0118ad = c0226edM1919ap.f771g;
        return c0118ad.f590c.equals(str) && c0118ad.f591d.equals("http://www.w3.org/1999/xhtml");
    }

    /* JADX INFO: renamed from: ar */
    public final void m1921ar(C0226ed c0226ed) {
        C0166by c0166by;
        if (c0226ed.f771g.f597j && (c0166by = this.f1906z) != null) {
            c0166by.f697a.add(c0226ed);
        }
        if (((C0408kx) this.f1891k.f1779d).m1364a() && c0226ed.m1229av("xmlns")) {
            String strMo1228au = c0226ed.mo1228au("xmlns");
            C0118ad c0118ad = c0226ed.f771g;
            if (!strMo1228au.equals(c0118ad.f591d)) {
                Object[] objArr = {c0226ed.mo1228au("xmlns"), c0118ad.f589b};
                C0408kx c0408kx = (C0408kx) this.f1891k.f1779d;
                if (c0408kx.m1364a()) {
                    c0408kx.add(new abb(this.f1892l, "Invalid xmlns attribute [%s] on tag [%s]", objArr));
                }
            }
        }
        if (this.f1889af && AbstractC0727ws.m1847i(m1919ap().f771g.f590c, AbstractC0702vu.f1609ab)) {
            m1939bj(c0226ed);
        } else {
            m1919ap().m1180y(c0226ed);
        }
        this.f1895o.add(c0226ed);
    }

    /* JADX INFO: renamed from: as */
    public final void m1922as(EnumC0416le enumC0416le) {
        if (((C0408kx) this.f1891k.f1779d).m1364a()) {
            ((C0408kx) this.f1891k.f1779d).add(new abb(this.f1892l, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.f1897q.getClass().getSimpleName(), this.f1897q, enumC0416le}));
        }
    }

    /* JADX INFO: renamed from: at */
    public final void m1923at(String str) {
        while (AbstractC0727ws.m1847i(m1919ap().f771g.f590c, f1879f)) {
            if (str != null && m1920aq(str)) {
                return;
            } else {
                m1942bm();
            }
        }
    }

    /* JADX INFO: renamed from: au */
    public final void m1924au(boolean z) {
        String[] strArr = z ? f1880g : f1879f;
        while ("http://www.w3.org/1999/xhtml".equals(m1919ap().f771g.f591d) && AbstractC0727ws.m1847i(m1919ap().f771g.f590c, strArr)) {
            m1942bm();
        }
    }

    /* JADX INFO: renamed from: av */
    public final C0226ed m1925av(String str) {
        for (int size = this.f1884aa.size() - 1; size >= 0; size--) {
            C0226ed c0226ed = (C0226ed) this.f1884aa.get(size);
            if (c0226ed == null) {
                return null;
            }
            if (c0226ed.m1230aw(str)) {
                return c0226ed;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: aw */
    public final C0226ed m1926aw(String str) {
        int size = this.f1895o.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            C0226ed c0226ed = (C0226ed) this.f1895o.get(i);
            C0118ad c0118ad = c0226ed.f771g;
            if (c0118ad.f590c.equals(str) && c0118ad.f591d.equals("http://www.w3.org/1999/xhtml")) {
                return c0226ed;
            }
            i--;
        }
        return null;
    }

    /* JADX INFO: renamed from: ax */
    public final boolean m1927ax(String str) {
        String[] strArr = f1876c;
        String[] strArr2 = f1874a;
        String[] strArr3 = this.f1890ag;
        strArr3[0] = str;
        return m1930ba(strArr3, strArr2, strArr);
    }

    /* JADX INFO: renamed from: ay */
    public final boolean m1928ay(String str) {
        String[] strArr = f1874a;
        String[] strArr2 = this.f1890ag;
        strArr2[0] = str;
        return m1930ba(strArr2, strArr, null);
    }

    /* JADX INFO: renamed from: az */
    public final boolean m1929az(String str) {
        for (int size = this.f1895o.size() - 1; size >= 0; size--) {
            String str2 = ((C0226ed) this.f1895o.get(size)).f771g.f590c;
            if (str2.equals(str)) {
                return true;
            }
            if (!AbstractC0727ws.m1847i(str2, f1878e)) {
                return false;
            }
        }
        throw new C0283gg("Should not be reachable");
    }

    /* JADX INFO: renamed from: ba */
    public final boolean m1930ba(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f1895o.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            C0226ed c0226ed = (C0226ed) this.f1895o.get(i);
            if (c0226ed.f771g.f591d.equals("http://www.w3.org/1999/xhtml")) {
                String str = c0226ed.f771g.f590c;
                if (AbstractC0727ws.m1847i(str, strArr)) {
                    return true;
                }
                if (AbstractC0727ws.m1847i(str, strArr2)) {
                    return false;
                }
                if (strArr3 != null && AbstractC0727ws.m1847i(str, strArr3)) {
                    return false;
                }
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: bb */
    public final boolean m1931bb(String str) {
        String[] strArr = f1877d;
        String[] strArr2 = this.f1890ag;
        strArr2[0] = str;
        return m1930ba(strArr2, strArr, null);
    }

    /* JADX INFO: renamed from: bc */
    public final void m1932bc(C0343im c0343im) {
        m1933bd(c0343im, m1919ap());
    }

    /* JADX INFO: renamed from: bd */
    public final void m1933bd(C0343im c0343im, C0226ed c0226ed) {
        AbstractC0272fw abtVar;
        String str = c0226ed.f771g.f590c;
        String str2 = c0343im.f1013b;
        if (c0343im instanceof C0222e) {
            abtVar = new C0586rm(str2);
        } else {
            abtVar = (str.equals("script") || str.equals("style")) ? new abt(str2) : new C0706vy(str2);
        }
        c0226ed.m1180y(abtVar);
    }

    /* JADX INFO: renamed from: be */
    public final void m1934be(C0300gx c0300gx) {
        String string = c0300gx.f879c;
        if (string == null) {
            string = c0300gx.f878b.toString();
        }
        m1919ap().m1180y(new C0638tk(string));
    }

    /* JADX INFO: renamed from: bf */
    public final C0226ed m1935bf(C0708w c0708w) {
        C0226ed c0226edM1918ao = m1918ao(c0708w, "http://www.w3.org/1999/xhtml", false);
        m1921ar(c0226edM1918ao);
        if (c0708w.f1731e) {
            HashMap map = C0118ad.f588a;
            C0118ad c0118ad = c0226edM1918ao.f771g;
            if (!map.containsKey(c0118ad.f589b)) {
                c0118ad.f595h = true;
            } else if (!c0118ad.f594g) {
                C0316hm c0316hm = this.f1893m;
                Object[] objArr = {c0118ad.f590c};
                C0408kx c0408kx = c0316hm.f902d;
                if (c0408kx.m1364a()) {
                    c0408kx.add(new abb(c0316hm.f901c, "Tag [%s] cannot be self closing; not a void tag", objArr));
                }
            }
            this.f1893m.m1291al(EnumC0709wa.f1698c);
            C0316hm c0316hm2 = this.f1893m;
            C0667um c0667um = this.f1887ad;
            c0667um.mo904a();
            c0667um.m1804ab(c0118ad.f589b);
            c0316hm2.m1282ac(c0667um);
        }
        return c0226edM1918ao;
    }

    /* JADX INFO: renamed from: bg */
    public final C0226ed m1936bg(C0708w c0708w) {
        C0226ed c0226edM1918ao = m1918ao(c0708w, "http://www.w3.org/1999/xhtml", false);
        m1921ar(c0226edM1918ao);
        m1942bm();
        return c0226edM1918ao;
    }

    /* JADX INFO: renamed from: bh */
    public final void m1937bh(C0708w c0708w, String str) {
        C0226ed c0226edM1918ao = m1918ao(c0708w, str, true);
        m1921ar(c0226edM1918ao);
        if (c0708w.f1731e) {
            c0226edM1918ao.f771g.f595h = true;
            m1942bm();
        }
    }

    /* JADX INFO: renamed from: bi */
    public final void m1938bi(C0708w c0708w, boolean z, boolean z2) {
        C0166by c0166by = (C0166by) m1918ao(c0708w, "http://www.w3.org/1999/xhtml", false);
        if (!z2 || !m1940bk("template")) {
            this.f1906z = c0166by;
        }
        m1921ar(c0166by);
        if (z) {
            return;
        }
        m1942bm();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX INFO: renamed from: bj */
    public final void m1939bj(C0226ed c0226ed) {
        C0226ed c0226edM1912ai;
        boolean z;
        C0226ed c0226edM1926aw = m1926aw("table");
        if (c0226edM1926aw != null) {
            c0226edM1912ai = (C0226ed) c0226edM1926aw.f846ap;
            if (c0226edM1912ai != null) {
                z = true;
            } else {
                c0226edM1912ai = m1912ai(c0226edM1926aw);
            }
            if (z) {
                c0226edM1912ai.m1180y(c0226ed);
                return;
            }
            AbstractC0711wc.m1770e(c0226edM1926aw);
            AbstractC0711wc.m1770e(c0226edM1926aw.f846ap);
            if (c0226ed.f846ap == c0226edM1926aw.f846ap) {
                c0226ed.m1234ba();
            }
            c0226edM1926aw.f846ap.m1227at(c0226edM1926aw.f847aq, c0226ed);
        }
        c0226edM1912ai = (C0226ed) this.f1895o.get(0);
        z = false;
        if (z) {
            c0226edM1912ai.m1180y(c0226ed);
            return;
        }
        AbstractC0711wc.m1770e(c0226edM1926aw);
        AbstractC0711wc.m1770e(c0226edM1926aw.f846ap);
        if (c0226ed.f846ap == c0226edM1926aw.f846ap) {
            c0226ed.m1234ba();
        }
        c0226edM1926aw.f846ap.m1227at(c0226edM1926aw.f847aq, c0226ed);
    }

    /* JADX INFO: renamed from: bk */
    public final boolean m1940bk(String str) {
        return m1926aw(str) != null;
    }

    /* JADX INFO: renamed from: bl */
    public final boolean m1941bl(String[] strArr) {
        int size = this.f1895o.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            if (!AbstractC0727ws.m1847i(((C0226ed) this.f1895o.get(i)).f771g.f590c, strArr)) {
                return true;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: bm */
    public final C0226ed m1942bm() {
        return (C0226ed) this.f1895o.remove(this.f1895o.size() - 1);
    }

    /* JADX INFO: renamed from: bn */
    public final void m1943bn(String str) {
        for (int size = this.f1895o.size() - 1; size >= 0; size--) {
            C0118ad c0118ad = m1942bm().f771g;
            if (c0118ad.f590c.equals(str) && c0118ad.f591d.equals("http://www.w3.org/1999/xhtml")) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: bo */
    public final void m1944bo() {
        if (this.f1885ab.size() > 0) {
            ArrayList arrayList = this.f1885ab;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX INFO: renamed from: bp */
    public final boolean m1945bp(AbstractC0680uz abstractC0680uz) {
        boolean zM1742l = true;
        if (!this.f1895o.isEmpty()) {
            C0226ed c0226edM1919ap = m1919ap();
            String str = c0226edM1919ap.f771g.f591d;
            if (!"http://www.w3.org/1999/xhtml".equals(str)) {
                C0118ad c0118ad = c0226edM1919ap.f771g;
                if ("http://www.w3.org/1998/Math/MathML".equals(c0118ad.f591d)) {
                    if (AbstractC0727ws.m1847i(c0118ad.f590c, f1882i)) {
                        if (abstractC0680uz.m1744n()) {
                            C0708w c0708w = (C0708w) abstractC0680uz;
                            if ("mglyph".equals(c0708w.f1730d) || "malignmark".equals(c0708w.f1730d)) {
                                if (!abstractC0680uz.m1739i()) {
                                    if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                                        if (!"http://www.w3.org/1998/Math/MathML".equals(c0118ad.f591d)) {
                                            if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                                            }
                                        } else if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                                        }
                                        zM1742l = abstractC0680uz.m1742l();
                                    } else {
                                        if (!"http://www.w3.org/1998/Math/MathML".equals(c0118ad.f591d)) {
                                            if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                                            }
                                        } else if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                                        }
                                        zM1742l = abstractC0680uz.m1742l();
                                    }
                                }
                            }
                        } else if (!abstractC0680uz.m1739i()) {
                            if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                                if (!"http://www.w3.org/1998/Math/MathML".equals(c0118ad.f591d)) {
                                    if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                                    }
                                } else if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                                }
                                zM1742l = abstractC0680uz.m1742l();
                            } else {
                                if (!"http://www.w3.org/1998/Math/MathML".equals(c0118ad.f591d)) {
                                    if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                                    }
                                } else if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                                }
                                zM1742l = abstractC0680uz.m1742l();
                            }
                        }
                    } else if ("http://www.w3.org/1998/Math/MathML".equals(str) || !c0226edM1919ap.m1230aw("annotation-xml") || !abstractC0680uz.m1744n() || !"svg".equals(((C0708w) abstractC0680uz).f1730d)) {
                        if (!"http://www.w3.org/1998/Math/MathML".equals(c0118ad.f591d) && c0226edM1919ap.m1230aw("annotation-xml")) {
                            String strM1582d = AbstractC0552qf.m1582d(c0226edM1919ap.mo1228au("encoding"));
                            if (strM1582d.equals("text/html") || strM1582d.equals("application/xhtml+xml")) {
                                if (!abstractC0680uz.m1744n()) {
                                }
                            } else if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                            }
                        } else if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d) && AbstractC0727ws.m1846h(c0118ad.f589b, f1883j)) {
                            if (!abstractC0680uz.m1744n() && !abstractC0680uz.m1739i()) {
                            }
                        }
                        zM1742l = abstractC0680uz.m1742l();
                    }
                } else if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                    if (!"http://www.w3.org/1998/Math/MathML".equals(c0118ad.f591d)) {
                        if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                        }
                    } else if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                    }
                    zM1742l = abstractC0680uz.m1742l();
                } else {
                    if (!"http://www.w3.org/1998/Math/MathML".equals(c0118ad.f591d)) {
                        if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                        }
                    } else if (!"http://www.w3.org/2000/svg".equals(c0118ad.f591d)) {
                    }
                    zM1742l = abstractC0680uz.m1742l();
                }
            }
        }
        return (zM1742l ? this.f1902v : EnumC0416le.f1151z).mo1058a(abstractC0680uz, this);
    }

    /* JADX INFO: renamed from: bq */
    public final boolean m1946bq(String str) {
        AbstractC0680uz abstractC0680uz = this.f1897q;
        C0667um c0667um = this.f1901u;
        if (abstractC0680uz == c0667um) {
            C0667um c0667um2 = new C0667um(3, this);
            c0667um2.m1804ab(str);
            return m1945bp(c0667um2);
        }
        c0667um.mo904a();
        c0667um.m1804ab(str);
        return m1945bp(c0667um);
    }

    /* JADX INFO: renamed from: br */
    public final void m1947br(String str) {
        C0708w c0708w = this.f1900t;
        if (this.f1897q == c0708w) {
            C0708w c0708w2 = new C0708w(2, this);
            c0708w2.m1804ab(str);
            m1945bp(c0708w2);
        } else {
            c0708w.mo904a();
            c0708w.m1804ab(str);
            m1945bp(c0708w);
        }
    }

    /* JADX INFO: renamed from: bs */
    public final void m1948bs(EnumC0416le enumC0416le) {
        this.f1885ab.add(enumC0416le);
    }

    /* JADX INFO: renamed from: bt */
    public final void m1949bt() {
        C0226ed c0226ed;
        if (this.f1895o.size() > 256) {
            return;
        }
        boolean z = true;
        if (this.f1884aa.size() > 0) {
            ArrayList arrayList = this.f1884aa;
            c0226ed = (C0226ed) arrayList.get(arrayList.size() - 1);
        } else {
            c0226ed = null;
        }
        if (c0226ed == null || m1911ah(this.f1895o, c0226ed)) {
            return;
        }
        int size = this.f1884aa.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            c0226ed = (C0226ed) this.f1884aa.get(i3);
            if (c0226ed == null || m1911ah(this.f1895o, c0226ed)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                c0226ed = (C0226ed) this.f1884aa.get(i3);
            }
            AbstractC0711wc.m1770e(c0226ed);
            C0226ed c0226ed2 = new C0226ed(m1954by(c0226ed.f771g.f590c, "http://www.w3.org/1999/xhtml", this.f1898r), null, c0226ed.mo1170l().clone());
            m1921ar(c0226ed2);
            this.f1884aa.set(i3, c0226ed2);
            if (i3 == i2) {
                return;
            } else {
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: bu */
    public final void m1950bu(C0226ed c0226ed) {
        for (int size = this.f1884aa.size() - 1; size >= 0; size--) {
            if (((C0226ed) this.f1884aa.get(size)) == c0226ed) {
                this.f1884aa.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: bv */
    public final void m1951bv(C0226ed c0226ed) {
        for (int size = this.f1895o.size() - 1; size >= 0; size--) {
            if (((C0226ed) this.f1895o.get(size)) == c0226ed) {
                this.f1895o.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: bw */
    public final void m1952bw() {
        C0707vz c0707vz;
        if (!m1940bk("body")) {
            ArrayList arrayList = this.f1895o;
            C0235em c0235em = this.f1894n;
            C0226ed c0226edM1161ac = c0235em.m1161ac();
            while (true) {
                c0707vz = C0707vz.f1648a;
                if (c0226edM1161ac == null) {
                    String str = c0235em.f771g.f591d;
                    AbstractC0272fw abstractC0272fwMo1179x = c0235em.mo1179x();
                    C0235em c0235em2 = abstractC0272fwMo1179x instanceof C0235em ? (C0235em) abstractC0272fwMo1179x : null;
                    (c0235em2 != null ? c0235em2.f784al : new C0736xa(new C0801zl())).getClass();
                    C0226ed c0226ed = new C0226ed(C0118ad.m987m("html", str, c0707vz), c0235em.mo1171m(), null);
                    c0235em.m1180y(c0226ed);
                    c0226edM1161ac = c0226ed;
                    break;
                }
                if (c0226edM1161ac.m1230aw("html")) {
                    break;
                } else {
                    c0226edM1161ac = c0226edM1161ac.m1164af();
                }
            }
            C0226ed c0226edM1161ac2 = c0226edM1161ac.m1161ac();
            while (true) {
                if (c0226edM1161ac2 == null) {
                    String str2 = c0226edM1161ac.f771g.f591d;
                    AbstractC0272fw abstractC0272fwMo1179x2 = c0226edM1161ac.mo1179x();
                    C0235em c0235em3 = abstractC0272fwMo1179x2 instanceof C0235em ? (C0235em) abstractC0272fwMo1179x2 : null;
                    (c0235em3 != null ? c0235em3.f784al : new C0736xa(new C0801zl())).getClass();
                    C0226ed c0226ed2 = new C0226ed(C0118ad.m987m("body", str2, c0707vz), c0226edM1161ac.mo1171m(), null);
                    c0226edM1161ac.m1180y(c0226ed2);
                    c0226edM1161ac2 = c0226ed2;
                    break;
                }
                if (c0226edM1161ac2.m1230aw("body") || c0226edM1161ac2.m1230aw("frameset")) {
                    break;
                } else {
                    c0226edM1161ac2 = c0226edM1161ac2.m1164af();
                }
            }
            arrayList.add(c0226edM1161ac2);
        }
        this.f1902v = EnumC0416le.f1134i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0162  */
    /* JADX WARN: Code duplicated, block: B:107:0x0170  */
    /* JADX WARN: Code duplicated, block: B:109:0x0173  */
    /* JADX WARN: Code duplicated, block: B:110:0x0176  */
    /* JADX WARN: Code duplicated, block: B:116:0x0187 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: bx */
    public final boolean m1953bx() {
        byte b;
        EnumC0416le enumC0416le;
        EnumC0416le enumC0416le2;
        int size = this.f1895o.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        EnumC0416le enumC0416le3 = this.f1902v;
        if (this.f1895o.size() == 0) {
            this.f1902v = EnumC0416le.f1134i;
        }
        boolean z = false;
        while (i >= i2) {
            C0226ed c0226ed = (C0226ed) this.f1895o.get(i);
            if (i == i2) {
                z = true;
            }
            String str = c0226ed != null ? c0226ed.f771g.f590c : "";
            if ("http://www.w3.org/1999/xhtml".equals(c0226ed.f771g.f591d)) {
                str.getClass();
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals("frameset")) {
                            b = 0;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList.get(arrayList.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case -1321546630:
                        if (str.equals("template")) {
                            b = 1;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList2 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList2.get(arrayList2.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case -906021636:
                        if (str.equals("select")) {
                            b = 2;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList3 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList3.get(arrayList3.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case -636197633:
                        if (str.equals("colgroup")) {
                            b = 3;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList4 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList4.get(arrayList4.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 3696:
                        if (str.equals("td")) {
                            b = 4;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList5 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList5.get(arrayList5.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 3700:
                        if (str.equals("th")) {
                            b = 5;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList6 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList6.get(arrayList6.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 3710:
                        if (str.equals("tr")) {
                            b = 6;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList7 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList7.get(arrayList7.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 3029410:
                        if (str.equals("body")) {
                            b = 7;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList8 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList8.get(arrayList8.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 3198432:
                        if (str.equals("head")) {
                            b = 8;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList9 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList9.get(arrayList9.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 3213227:
                        if (str.equals("html")) {
                            b = 9;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList10 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList10.get(arrayList10.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 110115790:
                        if (str.equals("table")) {
                            b = 10;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList11 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList11.get(arrayList11.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            b = 11;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList12 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList12.get(arrayList12.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            b = 12;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList13 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList13.get(arrayList13.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            b = 13;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList14 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList14.get(arrayList14.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            b = 14;
                        }
                        switch (b) {
                            case 0:
                                this.f1902v = EnumC0416le.f1147v;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 1:
                                if (this.f1885ab.size() > 0) {
                                    ArrayList arrayList15 = this.f1885ab;
                                    enumC0416le = (EnumC0416le) arrayList15.get(arrayList15.size() - 1);
                                } else {
                                    enumC0416le = null;
                                }
                                if (enumC0416le != null) {
                                    throw new C0283gg("Bug: no template insertion mode on stack!");
                                }
                                this.f1902v = enumC0416le;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 2:
                                this.f1902v = EnumC0416le.f1143r;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 3:
                                this.f1902v = EnumC0416le.f1139n;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 4:
                            case 5:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1142q;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 6:
                                this.f1902v = EnumC0416le.f1141p;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 7:
                                this.f1902v = EnumC0416le.f1134i;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 8:
                                if (!z) {
                                    if (z) {
                                        this.f1902v = EnumC0416le.f1134i;
                                    }
                                    break;
                                } else {
                                    this.f1902v = EnumC0416le.f1131f;
                                }
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 9:
                                if (this.f1905y == null) {
                                    enumC0416le2 = EnumC0416le.f1130e;
                                } else {
                                    enumC0416le2 = EnumC0416le.f1133h;
                                }
                                this.f1902v = enumC0416le2;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 10:
                                this.f1902v = EnumC0416le.f1136k;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 11:
                            case 12:
                            case 13:
                                this.f1902v = EnumC0416le.f1140o;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            case 14:
                                this.f1902v = EnumC0416le.f1138m;
                                if (this.f1902v != enumC0416le3) {
                                    return true;
                                }
                                return false;
                            default:
                                if (z) {
                                    this.f1902v = EnumC0416le.f1134i;
                                    if (this.f1902v != enumC0416le3) {
                                        return true;
                                    }
                                    return false;
                                }
                                break;
                        }
                        break;
                }
                b = -1;
                switch (b) {
                    case 0:
                        this.f1902v = EnumC0416le.f1147v;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 1:
                        if (this.f1885ab.size() > 0) {
                            ArrayList arrayList16 = this.f1885ab;
                            enumC0416le = (EnumC0416le) arrayList16.get(arrayList16.size() - 1);
                        } else {
                            enumC0416le = null;
                        }
                        if (enumC0416le != null) {
                            throw new C0283gg("Bug: no template insertion mode on stack!");
                        }
                        this.f1902v = enumC0416le;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 2:
                        this.f1902v = EnumC0416le.f1143r;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 3:
                        this.f1902v = EnumC0416le.f1139n;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 4:
                    case 5:
                        if (!z) {
                            if (z) {
                                this.f1902v = EnumC0416le.f1134i;
                            }
                            break;
                        } else {
                            this.f1902v = EnumC0416le.f1142q;
                        }
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 6:
                        this.f1902v = EnumC0416le.f1141p;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 7:
                        this.f1902v = EnumC0416le.f1134i;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 8:
                        if (!z) {
                            if (z) {
                                this.f1902v = EnumC0416le.f1134i;
                            }
                            break;
                        } else {
                            this.f1902v = EnumC0416le.f1131f;
                        }
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 9:
                        if (this.f1905y == null) {
                            enumC0416le2 = EnumC0416le.f1130e;
                        } else {
                            enumC0416le2 = EnumC0416le.f1133h;
                        }
                        this.f1902v = enumC0416le2;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 10:
                        this.f1902v = EnumC0416le.f1136k;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 11:
                    case 12:
                    case 13:
                        this.f1902v = EnumC0416le.f1140o;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    case 14:
                        this.f1902v = EnumC0416le.f1138m;
                        if (this.f1902v != enumC0416le3) {
                            return true;
                        }
                        return false;
                    default:
                        if (z) {
                            this.f1902v = EnumC0416le.f1134i;
                            if (this.f1902v != enumC0416le3) {
                                return true;
                            }
                            return false;
                        }
                        break;
                }
            }
            i--;
        }
        if (this.f1902v != enumC0416le3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: by */
    public final C0118ad m1954by(String str, String str2, C0707vz c0707vz) {
        C0118ad c0118ad = (C0118ad) this.f1899s.get(str);
        if (c0118ad != null && c0118ad.f591d.equals(str2)) {
            return c0118ad;
        }
        C0118ad c0118adM987m = C0118ad.m987m(str, str2, c0707vz);
        this.f1899s.put(str, c0118adM987m);
        return c0118adM987m;
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.f1897q + ", state=" + this.f1902v + ", currentElement=" + m1919ap() + '}';
    }
}
