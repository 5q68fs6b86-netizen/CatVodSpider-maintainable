package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1273a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.H.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2052h implements Cloneable {

    /* JADX INFO: renamed from: j */
    private static final Map<String, C2052h> f4758j = new HashMap();

    /* JADX INFO: renamed from: k */
    private static final String[] f4759k = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};

    /* JADX INFO: renamed from: l */
    private static final String[] f4760l = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* JADX INFO: renamed from: m */
    private static final String[] f4761m = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* JADX INFO: renamed from: n */
    private static final String[] f4762n = {"pre", "plaintext", "title", "textarea"};

    /* JADX INFO: renamed from: o */
    private static final String[] f4763o = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* JADX INFO: renamed from: p */
    private static final String[] f4764p = {"input", "keygen", "object", "select", "textarea"};

    /* JADX INFO: renamed from: a */
    private String f4765a;

    /* JADX INFO: renamed from: b */
    private String f4766b;

    /* JADX INFO: renamed from: c */
    private boolean f4767c = true;

    /* JADX INFO: renamed from: d */
    private boolean f4768d = true;

    /* JADX INFO: renamed from: e */
    private boolean f4769e = false;

    /* JADX INFO: renamed from: f */
    private boolean f4770f = false;

    /* JADX INFO: renamed from: g */
    private boolean f4771g = false;

    /* JADX INFO: renamed from: h */
    private boolean f4772h = false;

    /* JADX INFO: renamed from: i */
    private boolean f4773i = false;

    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        for (int i = 0; i < 69; i++) {
            C2052h c2052h = new C2052h(strArr[i]);
            f4758j.put(c2052h.f4765a, c2052h);
        }
        for (String str : f4759k) {
            C2052h c2052h2 = new C2052h(str);
            c2052h2.f4767c = false;
            c2052h2.f4768d = false;
            f4758j.put(c2052h2.f4765a, c2052h2);
        }
        for (String str2 : f4760l) {
            C2052h c2052h3 = (C2052h) f4758j.get(str2);
            C1271c.m3157g(c2052h3);
            c2052h3.f4769e = true;
        }
        for (String str3 : f4761m) {
            C2052h c2052h4 = (C2052h) f4758j.get(str3);
            C1271c.m3157g(c2052h4);
            c2052h4.f4768d = false;
        }
        for (String str4 : f4762n) {
            C2052h c2052h5 = (C2052h) f4758j.get(str4);
            C1271c.m3157g(c2052h5);
            c2052h5.f4771g = true;
        }
        for (String str5 : f4763o) {
            C2052h c2052h6 = (C2052h) f4758j.get(str5);
            C1271c.m3157g(c2052h6);
            c2052h6.f4772h = true;
        }
        for (String str6 : f4764p) {
            C2052h c2052h7 = (C2052h) f4758j.get(str6);
            C1271c.m3157g(c2052h7);
            c2052h7.f4773i = true;
        }
    }

    private C2052h(String str) {
        this.f4765a = str;
        this.f4766b = C1273a.m3165e(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX INFO: renamed from: h */
    public static boolean m5078h(String str) {
        return f4758j.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX INFO: renamed from: m */
    public static C2052h m5079m(String str, C2050f c2050f) {
        C1271c.m3157g(str);
        ?? r0 = f4758j;
        C2052h c2052h = (C2052h) r0.get(str);
        if (c2052h != null) {
            return c2052h;
        }
        String strM5071d = c2050f.m5071d(str);
        C1271c.m3155e(strM5071d);
        String strM3165e = C1273a.m3165e(strM5071d);
        C2052h c2052h2 = (C2052h) r0.get(strM3165e);
        if (c2052h2 == null) {
            C2052h c2052h3 = new C2052h(strM5071d);
            c2052h3.f4767c = false;
            return c2052h3;
        }
        if (!c2050f.m5073f() || strM5071d.equals(strM3165e)) {
            return c2052h2;
        }
        try {
            C2052h c2052h4 = (C2052h) super.clone();
            c2052h4.f4765a = strM5071d;
            return c2052h4;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5080a() {
        return this.f4768d;
    }

    /* JADX INFO: renamed from: b */
    public final String m5081b() {
        return this.f4765a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5082c() {
        return this.f4767c;
    }

    protected final Object clone() {
        try {
            return (C2052h) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5083d() {
        return this.f4769e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5084e() {
        return this.f4772h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2052h)) {
            return false;
        }
        C2052h c2052h = (C2052h) obj;
        return this.f4765a.equals(c2052h.f4765a) && this.f4769e == c2052h.f4769e && this.f4768d == c2052h.f4768d && this.f4767c == c2052h.f4767c && this.f4771g == c2052h.f4771g && this.f4770f == c2052h.f4770f && this.f4772h == c2052h.f4772h && this.f4773i == c2052h.f4773i;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5085f() {
        return !this.f4767c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.H.h>] */
    /* JADX INFO: renamed from: g */
    public final boolean m5086g() {
        return f4758j.containsKey(this.f4765a);
    }

    public final int hashCode() {
        return (((((((((((((this.f4765a.hashCode() * 31) + (this.f4767c ? 1 : 0)) * 31) + (this.f4768d ? 1 : 0)) * 31) + (this.f4769e ? 1 : 0)) * 31) + (this.f4770f ? 1 : 0)) * 31) + (this.f4771g ? 1 : 0)) * 31) + (this.f4772h ? 1 : 0)) * 31) + (this.f4773i ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5087i() {
        return this.f4769e || this.f4770f;
    }

    /* JADX INFO: renamed from: j */
    public final String m5088j() {
        return this.f4766b;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5089k() {
        return this.f4771g;
    }

    /* JADX INFO: renamed from: l */
    final C2052h m5090l() {
        this.f4770f = true;
        return this;
    }

    public final String toString() {
        return this.f4765a;
    }
}
