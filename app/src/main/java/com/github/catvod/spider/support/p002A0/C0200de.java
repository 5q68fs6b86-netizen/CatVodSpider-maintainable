package com.github.catvod.spider.support.p002A0;

import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.de */
/* JADX INFO: loaded from: classes.dex */
public final class C0200de {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f726a = 0;

    /* JADX INFO: renamed from: b */
    public final C0193cy f727b;

    /* JADX INFO: renamed from: c */
    public final C0193cy f728c;

    public C0200de(C0193cy c0193cy, C0193cy c0193cy2) {
        this.f727b = c0193cy;
        this.f728c = c0193cy2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0200de.class != obj.getClass()) {
            return false;
        }
        C0200de c0200de = (C0200de) obj;
        if (this.f727b.equals(c0200de.f727b)) {
            return this.f728c.equals(c0200de.f728c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f727b, this.f728c);
    }

    public final String toString() {
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        sbM1845g.append(this.f727b);
        sbM1845g.append('=');
        sbM1845g.append(this.f728c);
        return AbstractC0727ws.m1852n(sbM1845g);
    }
}
