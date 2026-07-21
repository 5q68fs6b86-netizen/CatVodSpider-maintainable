package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1078F implements Cloneable {

    /* JADX INFO: renamed from: l */
    private static final Map<String, C1078F> f2661l = new HashMap();

    /* JADX INFO: renamed from: m */
    private static final String[] f2662m = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};

    /* JADX INFO: renamed from: n */
    private static final String[] f2663n = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* JADX INFO: renamed from: o */
    private static final String[] f2664o = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* JADX INFO: renamed from: p */
    private static final String[] f2665p = {"pre", "plaintext", "title", "textarea"};

    /* JADX INFO: renamed from: q */
    private static final String[] f2666q = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* JADX INFO: renamed from: r */
    private static final String[] f2667r = {"input", "keygen", "object", "select", "textarea"};

    /* JADX INFO: renamed from: c */
    private String f2668c;

    /* JADX INFO: renamed from: d */
    private String f2669d;

    /* JADX INFO: renamed from: e */
    private boolean f2670e = true;

    /* JADX INFO: renamed from: f */
    private boolean f2671f = true;

    /* JADX INFO: renamed from: g */
    private boolean f2672g = false;

    /* JADX INFO: renamed from: h */
    private boolean f2673h = false;

    /* JADX INFO: renamed from: i */
    private boolean f2674i = false;

    /* JADX INFO: renamed from: j */
    private boolean f2675j = false;

    /* JADX INFO: renamed from: k */
    private boolean f2676k = false;

    /* JADX WARN: Type inference failed for: r3v103, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    static {
        for (int i = 0; i < 64; i++) {
            C1078F c1078f = new C1078F(new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center"}[i]);
            f2661l.put(c1078f.f2668c, c1078f);
        }
        for (String str : f2662m) {
            C1078F c1078f2 = new C1078F(str);
            c1078f2.f2670e = false;
            c1078f2.f2671f = false;
            f2661l.put(c1078f2.f2668c, c1078f2);
        }
        for (String str2 : f2663n) {
            C1078F c1078f3 = (C1078F) f2661l.get(str2);
            C0966a.m2376k(c1078f3);
            c1078f3.f2672g = true;
        }
        for (String str3 : f2664o) {
            C1078F c1078f4 = (C1078F) f2661l.get(str3);
            C0966a.m2376k(c1078f4);
            c1078f4.f2671f = false;
        }
        for (String str4 : f2665p) {
            C1078F c1078f5 = (C1078F) f2661l.get(str4);
            C0966a.m2376k(c1078f5);
            c1078f5.f2674i = true;
        }
        for (String str5 : f2666q) {
            C1078F c1078f6 = (C1078F) f2661l.get(str5);
            C0966a.m2376k(c1078f6);
            c1078f6.f2675j = true;
        }
        for (String str6 : f2667r) {
            C1078F c1078f7 = (C1078F) f2661l.get(str6);
            C0966a.m2376k(c1078f7);
            c1078f7.f2676k = true;
        }
    }

    private C1078F(String str) {
        this.f2668c = str;
        this.f2669d = C1263a.m3147c(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    /* JADX INFO: renamed from: l */
    public static C1078F m2811l(String str, C1074D c1074d) {
        C0966a.m2376k(str);
        ?? r1 = f2661l;
        C1078F c1078f = (C1078F) r1.get(str);
        if (c1078f != null) {
            return c1078f;
        }
        String strM2805c = c1074d.m2805c(str);
        C0966a.m2374i(strM2805c);
        String strM3147c = C1263a.m3147c(strM2805c);
        C1078F c1078f2 = (C1078F) r1.get(strM3147c);
        if (c1078f2 == null) {
            C1078F c1078f3 = new C1078F(strM2805c);
            c1078f3.f2670e = false;
            return c1078f3;
        }
        if (!c1074d.m2807e() || strM2805c.equals(strM3147c)) {
            return c1078f2;
        }
        try {
            C1078F c1078f4 = (C1078F) super.clone();
            c1078f4.f2668c = strM2805c;
            return c1078f4;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2812a() {
        return this.f2671f;
    }

    /* JADX INFO: renamed from: b */
    public final String m2813b() {
        return this.f2668c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2814c() {
        return this.f2670e;
    }

    protected final Object clone() {
        try {
            return (C1078F) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2815d() {
        return this.f2672g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2816e() {
        return this.f2675j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1078F)) {
            return false;
        }
        C1078F c1078f = (C1078F) obj;
        if (this.f2668c.equals(c1078f.f2668c) && this.f2672g == c1078f.f2672g && this.f2671f == c1078f.f2671f && this.f2670e == c1078f.f2670e && this.f2674i == c1078f.f2674i && this.f2673h == c1078f.f2673h && this.f2675j == c1078f.f2675j) {
            return this.f2676k == c1078f.f2676k;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2817f() {
        return !this.f2670e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.C0.d0.F>] */
    /* JADX INFO: renamed from: g */
    public final boolean m2818g() {
        return f2661l.containsKey(this.f2668c);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2819h() {
        return this.f2672g || this.f2673h;
    }

    public final int hashCode() {
        return (((((((((((((this.f2668c.hashCode() * 31) + (this.f2670e ? 1 : 0)) * 31) + (this.f2671f ? 1 : 0)) * 31) + (this.f2672g ? 1 : 0)) * 31) + (this.f2673h ? 1 : 0)) * 31) + (this.f2674i ? 1 : 0)) * 31) + (this.f2675j ? 1 : 0)) * 31) + (this.f2676k ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m2820i() {
        return this.f2669d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2821j() {
        return this.f2674i;
    }

    /* JADX INFO: renamed from: k */
    final C1078F m2822k() {
        this.f2673h = true;
        return this;
    }

    public final String toString() {
        return this.f2668c;
    }
}
