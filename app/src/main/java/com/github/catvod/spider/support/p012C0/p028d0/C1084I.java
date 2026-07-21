package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p023b.C1030n;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.I */
/* JADX INFO: loaded from: classes.dex */
final class C1084I extends AbstractC1096O {

    /* JADX INFO: renamed from: b */
    private final StringBuilder f2678b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    private String f2679c;

    C1084I() {
        this.f2694a = 4;
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.AbstractC1096O
    /* JADX INFO: renamed from: g */
    final AbstractC1096O mo2823g() {
        AbstractC1096O.m2845h(this.f2678b);
        this.f2679c = null;
        return this;
    }

    /* JADX INFO: renamed from: i */
    final C1084I m2826i(char c) {
        String str = this.f2679c;
        if (str != null) {
            this.f2678b.append(str);
            this.f2679c = null;
        }
        this.f2678b.append(c);
        return this;
    }

    /* JADX INFO: renamed from: j */
    final C1084I m2827j(String str) {
        String str2 = this.f2679c;
        if (str2 != null) {
            this.f2678b.append(str2);
            this.f2679c = null;
        }
        if (this.f2678b.length() == 0) {
            this.f2679c = str;
        } else {
            this.f2678b.append(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    final String m2828k() {
        String str = this.f2679c;
        return str != null ? str : this.f2678b.toString();
    }

    public final String toString() {
        StringBuilder sbM2774b = C1064d.m2774b("<!--");
        String string = this.f2679c;
        if (string == null) {
            string = this.f2678b.toString();
        }
        return C1030n.m2554b(sbM2774b, string, "-->");
    }
}
