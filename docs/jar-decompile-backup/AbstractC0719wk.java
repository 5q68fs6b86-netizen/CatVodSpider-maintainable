package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.wk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0719wk extends AbstractC0680uz {

    /* JADX INFO: renamed from: c */
    public String f1729c;

    /* JADX INFO: renamed from: d */
    public String f1730d;

    /* JADX INFO: renamed from: e */
    public boolean f1731e;

    /* JADX INFO: renamed from: f */
    public C0554qh f1732f;

    /* JADX INFO: renamed from: o */
    public String f1733o;

    /* JADX INFO: renamed from: p */
    public final StringBuilder f1734p;

    /* JADX INFO: renamed from: q */
    public boolean f1735q;

    /* JADX INFO: renamed from: r */
    public String f1736r;

    /* JADX INFO: renamed from: s */
    public final StringBuilder f1737s;

    /* JADX INFO: renamed from: t */
    public boolean f1738t;

    /* JADX INFO: renamed from: u */
    public boolean f1739u;

    public AbstractC0719wk(int i, C0801zl c0801zl) {
        super(i);
        this.f1731e = false;
        this.f1734p = new StringBuilder();
        this.f1735q = false;
        this.f1737s = new StringBuilder();
        this.f1738t = false;
        this.f1739u = false;
        c0801zl.getClass();
    }

    /* JADX INFO: renamed from: aa */
    public final void m1803aa(int i, int i2) {
        this.f1738t = true;
        String str = this.f1736r;
        if (str != null) {
            this.f1737s.append(str);
            this.f1736r = null;
        }
    }

    /* JADX INFO: renamed from: ab */
    public final void m1804ab(String str) {
        this.f1729c = str;
        this.f1730d = AbstractC0552qf.m1581c(str.trim());
    }

    /* JADX INFO: renamed from: ac */
    public final void m1805ac() {
        String string;
        if (this.f1732f == null) {
            this.f1732f = new C0554qh();
        }
        if (this.f1735q && this.f1732f.f1405a < 512) {
            StringBuilder sb = this.f1734p;
            String strTrim = (sb.length() > 0 ? sb.toString() : this.f1733o).trim();
            if (strTrim.length() > 0) {
                if (this.f1738t) {
                    StringBuilder sb2 = this.f1737s;
                    string = sb2.length() > 0 ? sb2.toString() : this.f1736r;
                } else {
                    string = this.f1739u ? "" : null;
                }
                this.f1732f.m1585e(strTrim, string);
            }
        }
        m1806ad();
    }

    /* JADX INFO: renamed from: ad */
    public final void m1806ad() {
        AbstractC0680uz.m1738h(this.f1734p);
        this.f1733o = null;
        this.f1735q = false;
        AbstractC0680uz.m1738h(this.f1737s);
        this.f1736r = null;
        this.f1739u = false;
        this.f1738t = false;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0680uz
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0719wk mo904a() {
        this.f1729c = null;
        this.f1730d = null;
        this.f1731e = false;
        this.f1732f = null;
        m1806ad();
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final void m1807v(char c, int i, int i2) {
        m1803aa(i, i2);
        this.f1737s.append(c);
    }

    /* JADX INFO: renamed from: w */
    public final void m1808w(String str, int i, int i2) {
        m1803aa(i, i2);
        StringBuilder sb = this.f1737s;
        if (sb.length() == 0) {
            this.f1736r = str;
        } else {
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1809x(int[] iArr, int i, int i2) {
        m1803aa(i, i2);
        for (int i3 : iArr) {
            this.f1737s.appendCodePoint(i3);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1810y(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.f1729c;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.f1729c = strReplace;
        this.f1730d = AbstractC0552qf.m1581c(strReplace.trim());
    }

    /* JADX INFO: renamed from: z */
    public final void m1811z(int i, int i2) {
        this.f1735q = true;
        String str = this.f1733o;
        if (str != null) {
            this.f1734p.append(str);
            this.f1733o = null;
        }
    }
}
