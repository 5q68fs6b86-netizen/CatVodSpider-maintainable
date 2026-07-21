package com.github.catvod.spider.support.p002A0;

import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zm */
/* JADX INFO: loaded from: classes.dex */
public final class C0802zm implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1907a;

    public /* synthetic */ C0802zm(int i) {
        this.f1907a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1907a) {
            case 0:
                return ((abf) obj).f501a - ((abf) obj2).f501a;
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
