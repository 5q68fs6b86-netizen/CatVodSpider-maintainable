package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1416G implements Cloneable {

    /* JADX INFO: renamed from: j */
    private static final Map<String, C1416G> f3301j = new HashMap();

    /* JADX INFO: renamed from: k */
    private static final String[] f3302k = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};

    /* JADX INFO: renamed from: l */
    private static final String[] f3303l = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* JADX INFO: renamed from: m */
    private static final String[] f3304m = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* JADX INFO: renamed from: n */
    private static final String[] f3305n = {"pre", "plaintext", "title", "textarea"};

    /* JADX INFO: renamed from: o */
    private static final String[] f3306o = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* JADX INFO: renamed from: p */
    private static final String[] f3307p = {"input", "keygen", "object", "select", "textarea"};

    /* JADX INFO: renamed from: a */
    private String f3308a;

    /* JADX INFO: renamed from: b */
    private String f3309b;

    /* JADX INFO: renamed from: c */
    private boolean f3310c = true;

    /* JADX INFO: renamed from: d */
    private boolean f3311d = true;

    /* JADX INFO: renamed from: e */
    private boolean f3312e = false;

    /* JADX INFO: renamed from: f */
    private boolean f3313f = false;

    /* JADX INFO: renamed from: g */
    private boolean f3314g = false;

    /* JADX INFO: renamed from: h */
    private boolean f3315h = false;

    /* JADX INFO: renamed from: i */
    private boolean f3316i = false;

    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        for (int i = 0; i < 69; i++) {
            C1416G c1416g = new C1416G(strArr[i]);
            f3301j.put(c1416g.f3308a, c1416g);
        }
        for (String str : f3302k) {
            C1416G c1416g2 = new C1416G(str);
            c1416g2.f3310c = false;
            c1416g2.f3311d = false;
            f3301j.put(c1416g2.f3308a, c1416g2);
        }
        for (String str2 : f3303l) {
            C1416G c1416g3 = (C1416G) f3301j.get(str2);
            C1377c.m3360g(c1416g3);
            c1416g3.f3312e = true;
        }
        for (String str3 : f3304m) {
            C1416G c1416g4 = (C1416G) f3301j.get(str3);
            C1377c.m3360g(c1416g4);
            c1416g4.f3311d = false;
        }
        for (String str4 : f3305n) {
            C1416G c1416g5 = (C1416G) f3301j.get(str4);
            C1377c.m3360g(c1416g5);
            c1416g5.f3314g = true;
        }
        for (String str5 : f3306o) {
            C1416G c1416g6 = (C1416G) f3301j.get(str5);
            C1377c.m3360g(c1416g6);
            c1416g6.f3315h = true;
        }
        for (String str6 : f3307p) {
            C1416G c1416g7 = (C1416G) f3301j.get(str6);
            C1377c.m3360g(c1416g7);
            c1416g7.f3316i = true;
        }
    }

    private C1416G(String str) {
        this.f3308a = str;
        this.f3309b = C1286l.m3219d(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX INFO: renamed from: h */
    public static boolean m3551h(String str) {
        return f3301j.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX INFO: renamed from: m */
    public static C1416G m3552m(String str, C1412E c1412e) {
        C1377c.m3360g(str);
        ?? r0 = f3301j;
        C1416G c1416g = (C1416G) r0.get(str);
        if (c1416g != null) {
            return c1416g;
        }
        String strM3541d = c1412e.m3541d(str);
        C1377c.m3358e(strM3541d);
        String strM3219d = C1286l.m3219d(strM3541d);
        C1416G c1416g2 = (C1416G) r0.get(strM3219d);
        if (c1416g2 == null) {
            C1416G c1416g3 = new C1416G(strM3541d);
            c1416g3.f3310c = false;
            return c1416g3;
        }
        if (!c1412e.m3543f() || strM3541d.equals(strM3219d)) {
            return c1416g2;
        }
        try {
            C1416G c1416g4 = (C1416G) super.clone();
            c1416g4.f3308a = strM3541d;
            return c1416g4;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3553a() {
        return this.f3311d;
    }

    /* JADX INFO: renamed from: b */
    public final String m3554b() {
        return this.f3308a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3555c() {
        return this.f3310c;
    }

    protected final Object clone() {
        try {
            return (C1416G) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3556d() {
        return this.f3312e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3557e() {
        return this.f3315h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1416G)) {
            return false;
        }
        C1416G c1416g = (C1416G) obj;
        return this.f3308a.equals(c1416g.f3308a) && this.f3312e == c1416g.f3312e && this.f3311d == c1416g.f3311d && this.f3310c == c1416g.f3310c && this.f3314g == c1416g.f3314g && this.f3313f == c1416g.f3313f && this.f3315h == c1416g.f3315h && this.f3316i == c1416g.f3316i;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3558f() {
        return !this.f3310c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX INFO: renamed from: g */
    public final boolean m3559g() {
        return f3301j.containsKey(this.f3308a);
    }

    public final int hashCode() {
        return (((((((((((((this.f3308a.hashCode() * 31) + (this.f3310c ? 1 : 0)) * 31) + (this.f3311d ? 1 : 0)) * 31) + (this.f3312e ? 1 : 0)) * 31) + (this.f3313f ? 1 : 0)) * 31) + (this.f3314g ? 1 : 0)) * 31) + (this.f3315h ? 1 : 0)) * 31) + (this.f3316i ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3560i() {
        return this.f3312e || this.f3313f;
    }

    /* JADX INFO: renamed from: j */
    public final String m3561j() {
        return this.f3309b;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3562k() {
        return this.f3314g;
    }

    /* JADX INFO: renamed from: l */
    final C1416G m3563l() {
        this.f3313f = true;
        return this;
    }

    public final String toString() {
        return this.f3308a;
    }
}
