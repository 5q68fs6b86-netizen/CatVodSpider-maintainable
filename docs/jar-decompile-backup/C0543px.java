package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.px */
/* JADX INFO: loaded from: classes.dex */
public final class C0543px extends AbstractC0753xr {

    /* JADX INFO: renamed from: e */
    public final AbstractC0753xr[] f1384e;

    /* JADX INFO: renamed from: f */
    public final int[] f1385f;

    public C0543px(C0277ga c0277ga) {
        this(new AbstractC0753xr[]{c0277ga.f852e}, new int[]{c0277ga.f853f});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0543px(AbstractC0753xr[] abstractC0753xrArr, int[] iArr) {
        int iM1523j = 1;
        for (AbstractC0753xr abstractC0753xr : abstractC0753xrArr) {
            iM1523j = AbstractC0534po.m1524k(iM1523j, abstractC0753xr);
        }
        for (int i : iArr) {
            iM1523j = AbstractC0534po.m1523j(iM1523j, i);
        }
        super(AbstractC0534po.m1518e(iM1523j, abstractC0753xrArr.length * 2));
        this.f1384e = abstractC0753xrArr;
        this.f1385f = iArr;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    /* JADX INFO: renamed from: a */
    public final AbstractC0753xr mo1140a(int i) {
        return this.f1384e[i];
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    /* JADX INFO: renamed from: b */
    public final int mo1141b(int i) {
        return this.f1385f[i];
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    /* JADX INFO: renamed from: c */
    public final boolean mo1142c() {
        return this.f1385f[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    /* JADX INFO: renamed from: d */
    public final int mo1143d() {
        return this.f1385f.length;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0543px)) {
            return false;
        }
        if (this.f1816i != ((AbstractC0753xr) obj).f1816i) {
            return false;
        }
        C0543px c0543px = (C0543px) obj;
        return Arrays.equals(this.f1385f, c0543px.f1385f) && Arrays.equals(this.f1384e, c0543px.f1384e);
    }

    public final String toString() {
        if (mo1142c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.f1385f;
            if (i >= iArr.length) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = iArr[i];
            if (i2 == Integer.MAX_VALUE) {
                sb.append("$");
            } else {
                sb.append(i2);
                AbstractC0753xr[] abstractC0753xrArr = this.f1384e;
                if (abstractC0753xrArr[i] != null) {
                    sb.append(' ');
                    sb.append(abstractC0753xrArr[i].toString());
                } else {
                    sb.append("null");
                }
            }
            i++;
        }
    }
}
