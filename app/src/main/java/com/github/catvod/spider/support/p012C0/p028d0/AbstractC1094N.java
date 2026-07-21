package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p026c0.C1044c;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.N */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1094N extends AbstractC1096O {

    /* JADX INFO: renamed from: b */
    protected String f2685b;

    /* JADX INFO: renamed from: c */
    protected String f2686c;

    /* JADX INFO: renamed from: d */
    private String f2687d;

    /* JADX INFO: renamed from: f */
    private String f2689f;

    /* JADX INFO: renamed from: j */
    C1044c f2693j;

    /* JADX INFO: renamed from: e */
    private StringBuilder f2688e = new StringBuilder();

    /* JADX INFO: renamed from: g */
    private boolean f2690g = false;

    /* JADX INFO: renamed from: h */
    private boolean f2691h = false;

    /* JADX INFO: renamed from: i */
    boolean f2692i = false;

    AbstractC1094N() {
    }

    /* JADX INFO: renamed from: p */
    private void m2830p() {
        this.f2691h = true;
        String str = this.f2689f;
        if (str != null) {
            this.f2688e.append(str);
            this.f2689f = null;
        }
    }

    /* JADX INFO: renamed from: i */
    final void m2831i(char c) {
        String strValueOf = String.valueOf(c);
        String str = this.f2687d;
        if (str != null) {
            strValueOf = str.concat(strValueOf);
        }
        this.f2687d = strValueOf;
    }

    /* JADX INFO: renamed from: j */
    final void m2832j(String str) {
        String str2 = this.f2687d;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f2687d = str;
    }

    /* JADX INFO: renamed from: k */
    final void m2833k(char c) {
        m2830p();
        this.f2688e.append(c);
    }

    /* JADX INFO: renamed from: l */
    final void m2834l(String str) {
        m2830p();
        if (this.f2688e.length() == 0) {
            this.f2689f = str;
        } else {
            this.f2688e.append(str);
        }
    }

    /* JADX INFO: renamed from: m */
    final void m2835m(int[] iArr) {
        m2830p();
        for (int i : iArr) {
            this.f2688e.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: n */
    final void m2836n(char c) {
        m2837o(String.valueOf(c));
    }

    /* JADX INFO: renamed from: o */
    final void m2837o(String str) {
        String str2 = this.f2685b;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f2685b = str;
        this.f2686c = C1263a.m3147c(str);
    }

    /* JADX INFO: renamed from: q */
    final void m2838q() {
        if (this.f2687d != null) {
            m2842u();
        }
    }

    /* JADX INFO: renamed from: r */
    final boolean m2839r() {
        return this.f2693j != null;
    }

    /* JADX INFO: renamed from: s */
    final AbstractC1094N m2840s(String str) {
        this.f2685b = str;
        this.f2686c = C1263a.m3147c(str);
        return this;
    }

    /* JADX INFO: renamed from: t */
    final String m2841t() {
        String str = this.f2685b;
        C0966a.m2370e(str == null || str.length() == 0);
        return this.f2685b;
    }

    /* JADX INFO: renamed from: u */
    final void m2842u() {
        String string;
        if (this.f2693j == null) {
            this.f2693j = new C1044c();
        }
        String str = this.f2687d;
        if (str != null) {
            String strTrim = str.trim();
            this.f2687d = strTrim;
            if (strTrim.length() > 0) {
                if (this.f2691h) {
                    string = this.f2688e.length() > 0 ? this.f2688e.toString() : this.f2689f;
                } else {
                    string = this.f2690g ? "" : null;
                }
                this.f2693j.m2640d(this.f2687d, string);
            }
        }
        this.f2687d = null;
        this.f2690g = false;
        this.f2691h = false;
        AbstractC1096O.m2845h(this.f2688e);
        this.f2689f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.AbstractC1096O
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC1094N mo2823g() {
        this.f2685b = null;
        this.f2686c = null;
        this.f2687d = null;
        AbstractC1096O.m2845h(this.f2688e);
        this.f2689f = null;
        this.f2690g = false;
        this.f2691h = false;
        this.f2692i = false;
        this.f2693j = null;
        return this;
    }

    /* JADX INFO: renamed from: w */
    final void m2843w() {
        this.f2690g = true;
    }

    /* JADX INFO: renamed from: x */
    final String m2844x() {
        String str = this.f2685b;
        return str != null ? str : "[unset]";
    }
}
