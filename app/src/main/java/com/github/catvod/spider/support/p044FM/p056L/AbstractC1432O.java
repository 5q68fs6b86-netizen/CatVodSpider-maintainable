package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p055K.C1383c;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.O */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1432O extends AbstractC1436Q {

    /* JADX INFO: renamed from: d */
    @Nullable
    protected String f3326d;

    /* JADX INFO: renamed from: e */
    @Nullable
    protected String f3327e;

    /* JADX INFO: renamed from: g */
    @Nullable
    private String f3329g;

    /* JADX INFO: renamed from: j */
    @Nullable
    private String f3332j;

    /* JADX INFO: renamed from: n */
    @Nullable
    C1383c f3336n;

    /* JADX INFO: renamed from: f */
    private final StringBuilder f3328f = new StringBuilder();

    /* JADX INFO: renamed from: h */
    private boolean f3330h = false;

    /* JADX INFO: renamed from: i */
    private final StringBuilder f3331i = new StringBuilder();

    /* JADX INFO: renamed from: k */
    private boolean f3333k = false;

    /* JADX INFO: renamed from: l */
    private boolean f3334l = false;

    /* JADX INFO: renamed from: m */
    boolean f3335m = false;

    AbstractC1432O() {
    }

    /* JADX INFO: renamed from: r */
    private void m3572r() {
        this.f3333k = true;
        String str = this.f3332j;
        if (str != null) {
            this.f3331i.append(str);
            this.f3332j = null;
        }
    }

    /* JADX INFO: renamed from: A */
    final String m3573A() {
        String str = this.f3326d;
        return str != null ? str : "[unset]";
    }

    /* JADX INFO: renamed from: k */
    final void m3574k(char c) {
        this.f3330h = true;
        String str = this.f3329g;
        if (str != null) {
            this.f3328f.append(str);
            this.f3329g = null;
        }
        this.f3328f.append(c);
    }

    /* JADX INFO: renamed from: l */
    final void m3575l(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        this.f3330h = true;
        String str2 = this.f3329g;
        if (str2 != null) {
            this.f3328f.append(str2);
            this.f3329g = null;
        }
        if (this.f3328f.length() == 0) {
            this.f3329g = strReplace;
        } else {
            this.f3328f.append(strReplace);
        }
    }

    /* JADX INFO: renamed from: m */
    final void m3576m(char c) {
        m3572r();
        this.f3331i.append(c);
    }

    /* JADX INFO: renamed from: n */
    final void m3577n(String str) {
        m3572r();
        if (this.f3331i.length() == 0) {
            this.f3332j = str;
        } else {
            this.f3331i.append(str);
        }
    }

    /* JADX INFO: renamed from: o */
    final void m3578o(int[] iArr) {
        m3572r();
        for (int i : iArr) {
            this.f3331i.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: p */
    final void m3579p(char c) {
        m3580q(String.valueOf(c));
    }

    /* JADX INFO: renamed from: q */
    final void m3580q(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.f3326d;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.f3326d = strReplace;
        this.f3327e = C1412E.m3538a(strReplace);
    }

    /* JADX INFO: renamed from: s */
    final void m3581s() {
        if (this.f3330h) {
            m3586x();
        }
    }

    /* JADX INFO: renamed from: t */
    final boolean m3582t(String str) {
        C1383c c1383c = this.f3336n;
        return c1383c != null && c1383c.m3394n(str);
    }

    /* JADX INFO: renamed from: u */
    final boolean m3583u() {
        return this.f3336n != null;
    }

    /* JADX INFO: renamed from: v */
    final AbstractC1432O m3584v(String str) {
        this.f3326d = str;
        this.f3327e = C1412E.m3538a(str);
        return this;
    }

    /* JADX INFO: renamed from: w */
    final String m3585w() {
        String str = this.f3326d;
        C1377c.m3355b(str == null || str.length() == 0);
        return this.f3326d;
    }

    /* JADX INFO: renamed from: x */
    final void m3586x() {
        String string;
        if (this.f3336n == null) {
            this.f3336n = new C1383c();
        }
        if (this.f3330h && this.f3336n.size() < 512) {
            String strTrim = (this.f3328f.length() > 0 ? this.f3328f.toString() : this.f3329g).trim();
            if (strTrim.length() > 0) {
                if (this.f3333k) {
                    string = this.f3331i.length() > 0 ? this.f3331i.toString() : this.f3332j;
                } else {
                    string = this.f3334l ? "" : null;
                }
                this.f3336n.m3387d(strTrim, string);
            }
        }
        AbstractC1436Q.m3591i(this.f3328f);
        this.f3329g = null;
        this.f3330h = false;
        AbstractC1436Q.m3591i(this.f3331i);
        this.f3332j = null;
        this.f3333k = false;
        this.f3334l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1436Q
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public AbstractC1432O mo3564h() {
        super.mo3564h();
        this.f3326d = null;
        this.f3327e = null;
        AbstractC1436Q.m3591i(this.f3328f);
        this.f3329g = null;
        this.f3330h = false;
        AbstractC1436Q.m3591i(this.f3331i);
        this.f3332j = null;
        this.f3334l = false;
        this.f3333k = false;
        this.f3335m = false;
        this.f3336n = null;
        return this;
    }

    /* JADX INFO: renamed from: z */
    final void m3587z() {
        this.f3334l = true;
    }
}
