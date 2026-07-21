package com.github.catvod.spider.support.p002A0;

import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.gm */
/* JADX INFO: loaded from: classes.dex */
public final class C0289gm implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C0289gm f865a = new C0289gm(0);

    /* JADX INFO: renamed from: b */
    public static final C0289gm f866b = new C0289gm(1);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f867c;

    public /* synthetic */ C0289gm(int i) {
        this.f867c = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f867c) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC0399ko.m1351f("a", comparable);
                AbstractC0399ko.m1351f("b", comparable2);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC0399ko.m1351f("a", comparable3);
                AbstractC0399ko.m1351f("b", comparable4);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f867c) {
            case 0:
                return f866b;
            default:
                return f865a;
        }
    }
}
