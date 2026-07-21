package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C2366d0 extends AbstractC2351S {

    /* JADX INFO: renamed from: c */
    public final AbstractC2351S f5870c;

    /* JADX INFO: renamed from: d */
    public final int f5871d;

    C2366d0(AbstractC2351S abstractC2351S, int i) {
        super(abstractC2351S != null ? C1273a.m3160b(C1273a.m3168h(C1273a.m3169i(1, abstractC2351S), i), 2) : C1273a.m3160b(1, 0));
        this.f5870c = abstractC2351S;
        this.f5871d = i;
    }

    /* JADX INFO: renamed from: i */
    public static C2366d0 m6364i(AbstractC2351S abstractC2351S, int i) {
        return (i == Integer.MAX_VALUE && abstractC2351S == null) ? AbstractC2351S.f5827b : new C2366d0(abstractC2351S, i);
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    /* JADX INFO: renamed from: c */
    public AbstractC2351S mo6332c(int i) {
        return this.f5870c;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    /* JADX INFO: renamed from: d */
    public int mo6333d(int i) {
        return this.f5871d;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    public boolean equals(Object obj) {
        AbstractC2351S abstractC2351S;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2366d0) || this.f5828a != obj.hashCode()) {
            return false;
        }
        C2366d0 c2366d0 = (C2366d0) obj;
        return this.f5871d == c2366d0.f5871d && (abstractC2351S = this.f5870c) != null && abstractC2351S.equals(c2366d0.f5870c);
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2351S
    /* JADX INFO: renamed from: h */
    public int mo6336h() {
        return 1;
    }

    public String toString() {
        AbstractC2351S abstractC2351S = this.f5870c;
        String string = abstractC2351S != null ? abstractC2351S.toString() : "";
        if (string.length() == 0) {
            int i = this.f5871d;
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(this.f5871d) + " " + string;
    }
}
