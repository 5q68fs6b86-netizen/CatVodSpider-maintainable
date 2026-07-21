package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p055K.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1403w extends AbstractC1397q {

    /* JADX INFO: renamed from: e */
    private final boolean f3226e;

    public C1403w(String str, boolean z) {
        C1377c.m3360g(str);
        this.f3220d = str;
        this.f3226e = z;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: clone */
    public final Object mo3404i() {
        return (C1403w) super.mo3404i();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1397q, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ int mo3411g() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: i */
    public final AbstractC1399s mo3404i() {
        return (C1403w) super.mo3404i();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1397q, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: l */
    public final AbstractC1399s mo3412l() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: s */
    public final String mo3405s() {
        return "#declaration";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    public final String toString() {
        return mo3431t();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: v */
    final void mo3406v(Appendable appendable, int i, C1387g c1387g) throws IOException {
        appendable.append("<").append(this.f3226e ? "!" : "?").append(m3509I());
        C1383c c1383cMo3463d = mo3463d();
        c1383cMo3463d.getClass();
        int i2 = 0;
        while (true) {
            if (i2 >= c1383cMo3463d.f3186a || !c1383cMo3463d.m3385t(c1383cMo3463d.f3187b[i2])) {
                if (!(i2 < c1383cMo3463d.f3186a)) {
                    break;
                }
                C1381a c1381a = new C1381a(c1383cMo3463d.f3187b[i2], (String) c1383cMo3463d.f3188c[i2], c1383cMo3463d);
                int i3 = i2 + 1;
                String strM3375a = c1381a.m3375a();
                String value = c1381a.getValue();
                if (!strM3375a.equals("#declaration")) {
                    appendable.append(' ');
                    appendable.append(strM3375a);
                    if (!value.isEmpty()) {
                        appendable.append("=\"");
                        C1395o.m3501d(appendable, value, c1387g, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i2 = i3;
            } else {
                i2++;
            }
        }
        appendable.append(this.f3226e ? "!" : "?").append(">");
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: w */
    final void mo3407w(Appendable appendable, int i, C1387g c1387g) {
    }
}
