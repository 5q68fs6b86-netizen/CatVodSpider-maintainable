package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p116a.C2137a;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2380l extends AbstractC2351S {

    /* JADX INFO: renamed from: c */
    public final AbstractC2351S[] f5892c;

    /* JADX INFO: renamed from: d */
    public final int[] f5893d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2380l(AbstractC2351S[] abstractC2351SArr, int[] iArr) {
        int iM3168h = 1;
        for (AbstractC2351S abstractC2351S : abstractC2351SArr) {
            iM3168h = C1273a.m3169i(iM3168h, abstractC2351S);
        }
        for (int i : iArr) {
            iM3168h = C1273a.m3168h(iM3168h, i);
        }
        super(C1273a.m3160b(iM3168h, abstractC2351SArr.length * 2));
        this.f5892c = abstractC2351SArr;
        this.f5893d = iArr;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    /* JADX INFO: renamed from: c */
    public final AbstractC2351S mo6332c(int i) {
        return this.f5892c[i];
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    /* JADX INFO: renamed from: d */
    public final int mo6333d(int i) {
        return this.f5893d[i];
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2380l) || this.f5828a != obj.hashCode()) {
            return false;
        }
        C2380l c2380l = (C2380l) obj;
        return Arrays.equals(this.f5893d, c2380l.f5893d) && Arrays.equals(this.f5892c, c2380l.f5892c);
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    /* JADX INFO: renamed from: f */
    public final boolean mo6335f() {
        return this.f5893d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    /* JADX INFO: renamed from: h */
    public final int mo6336h() {
        return this.f5893d.length;
    }

    public final String toString() {
        String string;
        if (mo6335f()) {
            return "[]";
        }
        StringBuilder sbM5396a = C2137a.m5396a("[");
        for (int i = 0; i < this.f5893d.length; i++) {
            if (i > 0) {
                sbM5396a.append(", ");
            }
            int[] iArr = this.f5893d;
            if (iArr[i] == Integer.MAX_VALUE) {
                string = "$";
            } else {
                sbM5396a.append(iArr[i]);
                if (this.f5892c[i] != null) {
                    sbM5396a.append(' ');
                    string = this.f5892c[i].toString();
                } else {
                    string = "null";
                }
            }
            sbM5396a.append(string);
        }
        sbM5396a.append("]");
        return sbM5396a.toString();
    }
}
