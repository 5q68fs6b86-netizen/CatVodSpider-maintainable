package com.github.catvod.spider.support.p002A0;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C0118ad implements Cloneable {

    /* JADX INFO: renamed from: a */
    public static final HashMap f588a = new HashMap();

    /* JADX INFO: renamed from: b */
    public String f589b;

    /* JADX INFO: renamed from: c */
    public final String f590c;

    /* JADX INFO: renamed from: d */
    public String f591d;

    /* JADX INFO: renamed from: e */
    public boolean f592e = true;

    /* JADX INFO: renamed from: f */
    public boolean f593f = true;

    /* JADX INFO: renamed from: g */
    public boolean f594g = false;

    /* JADX INFO: renamed from: h */
    public boolean f595h = false;

    /* JADX INFO: renamed from: i */
    public boolean f596i = false;

    /* JADX INFO: renamed from: j */
    public boolean f597j = false;

    /* JADX INFO: renamed from: k */
    public boolean f598k = false;

    static {
        String[] strArr = act.f579a;
        HashMap map = new HashMap();
        map.put("http://www.w3.org/1998/Math/MathML", new String[]{"math", "mi", "mo", "msup", "mn", "mtext"});
        map.put("http://www.w3.org/2000/svg", new String[]{"svg", "text"});
        final int i = 0;
        m986l(new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"}, new Consumer() { // from class: com.github.catvod.spider.support.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C0118ad c0118ad = (C0118ad) obj;
                switch (i) {
                    case 0:
                        c0118ad.f592e = true;
                        c0118ad.f593f = true;
                        break;
                    case 1:
                        c0118ad.f592e = false;
                        c0118ad.f593f = false;
                        break;
                    case 2:
                        c0118ad.f594g = true;
                        break;
                    case 3:
                        c0118ad.f593f = false;
                        break;
                    case 4:
                        c0118ad.f596i = true;
                        break;
                    case 5:
                        c0118ad.f597j = true;
                        break;
                    default:
                        c0118ad.f598k = true;
                        break;
                }
            }
        });
        final int i2 = 1;
        m986l(new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb", "text", "mi", "mo", "msup", "mn", "mtext"}, new Consumer() { // from class: com.github.catvod.spider.support.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C0118ad c0118ad = (C0118ad) obj;
                switch (i2) {
                    case 0:
                        c0118ad.f592e = true;
                        c0118ad.f593f = true;
                        break;
                    case 1:
                        c0118ad.f592e = false;
                        c0118ad.f593f = false;
                        break;
                    case 2:
                        c0118ad.f594g = true;
                        break;
                    case 3:
                        c0118ad.f593f = false;
                        break;
                    case 4:
                        c0118ad.f596i = true;
                        break;
                    case 5:
                        c0118ad.f597j = true;
                        break;
                    default:
                        c0118ad.f598k = true;
                        break;
                }
            }
        });
        final int i3 = 2;
        m986l(new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"}, new Consumer() { // from class: com.github.catvod.spider.support.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C0118ad c0118ad = (C0118ad) obj;
                switch (i3) {
                    case 0:
                        c0118ad.f592e = true;
                        c0118ad.f593f = true;
                        break;
                    case 1:
                        c0118ad.f592e = false;
                        c0118ad.f593f = false;
                        break;
                    case 2:
                        c0118ad.f594g = true;
                        break;
                    case 3:
                        c0118ad.f593f = false;
                        break;
                    case 4:
                        c0118ad.f596i = true;
                        break;
                    case 5:
                        c0118ad.f597j = true;
                        break;
                    default:
                        c0118ad.f598k = true;
                        break;
                }
            }
        });
        final int i4 = 3;
        m986l(new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s", "button"}, new Consumer() { // from class: com.github.catvod.spider.support.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C0118ad c0118ad = (C0118ad) obj;
                switch (i4) {
                    case 0:
                        c0118ad.f592e = true;
                        c0118ad.f593f = true;
                        break;
                    case 1:
                        c0118ad.f592e = false;
                        c0118ad.f593f = false;
                        break;
                    case 2:
                        c0118ad.f594g = true;
                        break;
                    case 3:
                        c0118ad.f593f = false;
                        break;
                    case 4:
                        c0118ad.f596i = true;
                        break;
                    case 5:
                        c0118ad.f597j = true;
                        break;
                    default:
                        c0118ad.f598k = true;
                        break;
                }
            }
        });
        final int i5 = 4;
        m986l(new String[]{"pre", "plaintext", "title", "textarea"}, new Consumer() { // from class: com.github.catvod.spider.support.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C0118ad c0118ad = (C0118ad) obj;
                switch (i5) {
                    case 0:
                        c0118ad.f592e = true;
                        c0118ad.f593f = true;
                        break;
                    case 1:
                        c0118ad.f592e = false;
                        c0118ad.f593f = false;
                        break;
                    case 2:
                        c0118ad.f594g = true;
                        break;
                    case 3:
                        c0118ad.f593f = false;
                        break;
                    case 4:
                        c0118ad.f596i = true;
                        break;
                    case 5:
                        c0118ad.f597j = true;
                        break;
                    default:
                        c0118ad.f598k = true;
                        break;
                }
            }
        });
        final int i6 = 5;
        m986l(new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"}, new Consumer() { // from class: com.github.catvod.spider.support.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C0118ad c0118ad = (C0118ad) obj;
                switch (i6) {
                    case 0:
                        c0118ad.f592e = true;
                        c0118ad.f593f = true;
                        break;
                    case 1:
                        c0118ad.f592e = false;
                        c0118ad.f593f = false;
                        break;
                    case 2:
                        c0118ad.f594g = true;
                        break;
                    case 3:
                        c0118ad.f593f = false;
                        break;
                    case 4:
                        c0118ad.f596i = true;
                        break;
                    case 5:
                        c0118ad.f597j = true;
                        break;
                    default:
                        c0118ad.f598k = true;
                        break;
                }
            }
        });
        final int i7 = 6;
        m986l(strArr, new Consumer() { // from class: com.github.catvod.spider.support.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C0118ad c0118ad = (C0118ad) obj;
                switch (i7) {
                    case 0:
                        c0118ad.f592e = true;
                        c0118ad.f593f = true;
                        break;
                    case 1:
                        c0118ad.f592e = false;
                        c0118ad.f593f = false;
                        break;
                    case 2:
                        c0118ad.f594g = true;
                        break;
                    case 3:
                        c0118ad.f593f = false;
                        break;
                    case 4:
                        c0118ad.f596i = true;
                        break;
                    case 5:
                        c0118ad.f597j = true;
                        break;
                    default:
                        c0118ad.f598k = true;
                        break;
                }
            }
        });
        for (final Map.Entry entry : map.entrySet()) {
            m986l((String[]) entry.getValue(), new Consumer() { // from class: com.github.catvod.spider.support.A0.ib
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((C0118ad) obj).f591d = (String) entry.getKey();
                }
            });
        }
    }

    public C0118ad(String str, String str2) {
        this.f589b = str;
        this.f590c = AbstractC0552qf.m1581c(str);
        this.f591d = str2;
    }

    /* JADX INFO: renamed from: l */
    public static void m986l(String[] strArr, Consumer consumer) {
        for (String str : strArr) {
            HashMap map = f588a;
            C0118ad c0118ad = (C0118ad) map.get(str);
            if (c0118ad == null) {
                c0118ad = new C0118ad(str, "http://www.w3.org/1999/xhtml");
                map.put(c0118ad.f589b, c0118ad);
            }
            consumer.accept(c0118ad);
        }
    }

    /* JADX INFO: renamed from: m */
    public static C0118ad m987m(String str, String str2, C0707vz c0707vz) {
        AbstractC0711wc.m1768c(str);
        AbstractC0711wc.m1770e(str2);
        HashMap map = f588a;
        C0118ad c0118ad = (C0118ad) map.get(str);
        if (c0118ad != null && c0118ad.f591d.equals(str2)) {
            return c0118ad;
        }
        c0707vz.getClass();
        String strTrim = str.trim();
        boolean z = c0707vz.f1650c;
        if (!z) {
            strTrim = AbstractC0552qf.m1581c(strTrim);
        }
        AbstractC0711wc.m1768c(strTrim);
        String strM1581c = AbstractC0552qf.m1581c(strTrim);
        C0118ad c0118ad2 = (C0118ad) map.get(strM1581c);
        if (c0118ad2 == null || !c0118ad2.f591d.equals(str2)) {
            C0118ad c0118ad3 = new C0118ad(strTrim, str2);
            c0118ad3.f592e = false;
            return c0118ad3;
        }
        if (z && !strTrim.equals(strM1581c)) {
            try {
                c0118ad2 = (C0118ad) super.clone();
                c0118ad2.f589b = strTrim;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        return c0118ad2;
    }

    public final Object clone() {
        try {
            return (C0118ad) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0118ad)) {
            return false;
        }
        C0118ad c0118ad = (C0118ad) obj;
        return this.f589b.equals(c0118ad.f589b) && this.f594g == c0118ad.f594g && this.f593f == c0118ad.f593f && this.f592e == c0118ad.f592e && this.f596i == c0118ad.f596i && this.f595h == c0118ad.f595h && this.f597j == c0118ad.f597j && this.f598k == c0118ad.f598k;
    }

    public final int hashCode() {
        return Objects.hash(this.f589b, Boolean.valueOf(this.f592e), Boolean.valueOf(this.f593f), Boolean.valueOf(this.f594g), Boolean.valueOf(this.f595h), Boolean.valueOf(this.f596i), Boolean.valueOf(this.f597j), Boolean.valueOf(this.f598k));
    }

    public final String toString() {
        return this.f589b;
    }
}
