package com.github.catvod.spider.support.p002A0;

import java.util.EmptyStackException;

/* JADX INFO: loaded from: classes.dex */
public final class aaz implements InterfaceC0573r {

    /* JADX INFO: renamed from: c */
    public static final aaz f461c = new aaz(0);

    /* JADX INFO: renamed from: d */
    public static final aaz f462d = new aaz(1);

    /* JADX INFO: renamed from: e */
    public static final aaz f463e = new aaz(2);

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f464f;

    public /* synthetic */ aaz(int i) {
        this.f464f = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: a */
    public final boolean mo905a() {
        switch (this.f464f) {
        }
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: b */
    public final void mo906b(C0792zc c0792zc) {
        switch (this.f464f) {
            case 0:
                c0792zc.f518o = -2;
                return;
            case 1:
                C0734wz c0734wz = c0792zc.f519p;
                int i = c0734wz.f1775c;
                if (i == 0) {
                    throw new EmptyStackException();
                }
                int i2 = i - 1;
                if (i2 < 0 || i2 >= i) {
                    throw new IndexOutOfBoundsException();
                }
                int[] iArr = c0734wz.f1774b;
                int i3 = iArr[i2];
                System.arraycopy(iArr, i, iArr, i2, (i - i2) - 1);
                int[] iArr2 = c0734wz.f1774b;
                int i4 = c0734wz.f1775c - 1;
                iArr2[i4] = 0;
                c0734wz.f1775c = i4;
                c0792zc.f520u = i3;
                return;
            default:
                c0792zc.f518o = -3;
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f464f) {
            case 0:
                return obj == this;
            case 1:
                return obj == this;
            default:
                return obj == this;
        }
    }

    public final int hashCode() {
        switch (this.f464f) {
            case 0:
                return AbstractC0534po.m1518e(AbstractC0534po.m1523j(0, 3), 1);
            case 1:
                return AbstractC0534po.m1518e(AbstractC0534po.m1523j(0, 4), 1);
            default:
                return AbstractC0534po.m1518e(AbstractC0534po.m1523j(0, 6), 1);
        }
    }

    public final String toString() {
        switch (this.f464f) {
            case 0:
                return "more";
            case 1:
                return "popMode";
            default:
                return "skip";
        }
    }
}
