package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.b */
/* JADX INFO: loaded from: classes.dex */
public class C2361b {

    /* JADX INFO: renamed from: a */
    public final AbstractC2375i f5846a;

    /* JADX INFO: renamed from: b */
    public final int f5847b;

    /* JADX INFO: renamed from: c */
    public AbstractC2351S f5848c;

    /* JADX INFO: renamed from: d */
    public int f5849d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2362b0 f5850e;

    public C2361b(C2361b c2361b, AbstractC2375i abstractC2375i, AbstractC2351S abstractC2351S, AbstractC2362b0 abstractC2362b0) {
        this.f5846a = abstractC2375i;
        this.f5847b = c2361b.f5847b;
        this.f5848c = abstractC2351S;
        this.f5850e = abstractC2362b0;
        this.f5849d = c2361b.f5849d;
    }

    public C2361b(AbstractC2375i abstractC2375i, int i, AbstractC2351S abstractC2351S, AbstractC2362b0 abstractC2362b0) {
        this.f5846a = abstractC2375i;
        this.f5847b = i;
        this.f5848c = abstractC2351S;
        this.f5850e = abstractC2362b0;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo6350a(C2361b c2361b) {
        AbstractC2351S abstractC2351S;
        AbstractC2351S abstractC2351S2;
        if (this == c2361b) {
            return true;
        }
        return c2361b != null && this.f5846a.f5884b == c2361b.f5846a.f5884b && this.f5847b == c2361b.f5847b && ((abstractC2351S = this.f5848c) == (abstractC2351S2 = c2361b.f5848c) || (abstractC2351S != null && abstractC2351S.equals(abstractC2351S2))) && this.f5850e.equals(c2361b.f5850e) && m6352c() == c2361b.m6352c();
    }

    /* JADX INFO: renamed from: b */
    public final int m6351b() {
        return this.f5849d & (-1073741825);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6352c() {
        return (this.f5849d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2361b) {
            return mo6350a((C2361b) obj);
        }
        return false;
    }

    public int hashCode() {
        return C1273a.m3160b(C1273a.m3169i(C1273a.m3169i(C1273a.m3168h(C1273a.m3168h(7, this.f5846a.f5884b), this.f5847b), this.f5848c), this.f5850e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f5846a);
        sb.append(",");
        sb.append(this.f5847b);
        if (this.f5848c != null) {
            sb.append(",[");
            sb.append(this.f5848c.toString());
            sb.append("]");
        }
        AbstractC2362b0 abstractC2362b0 = this.f5850e;
        if (abstractC2362b0 != null && abstractC2362b0 != AbstractC2362b0.f5851a) {
            sb.append(",");
            sb.append(this.f5850e);
        }
        if (m6351b() > 0) {
            sb.append(",up=");
            sb.append(m6351b());
        }
        sb.append(')');
        return sb.toString();
    }
}
