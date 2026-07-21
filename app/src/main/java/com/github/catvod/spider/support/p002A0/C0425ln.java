package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ln */
/* JADX INFO: loaded from: classes.dex */
public final class C0425ln extends AbstractC0213dr {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1160a;

    /* JADX INFO: renamed from: e */
    public int f1161e;

    public C0425ln(AbstractC0213dr abstractC0213dr) {
        ArrayList arrayList = new ArrayList();
        this.f1160a = arrayList;
        this.f1161e = 2;
        arrayList.add(abstractC0213dr);
        this.f1161e = abstractC0213dr.mo1019b() + this.f1161e;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        return this.f1161e;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        if (c0226ed2 == c0226ed) {
            return false;
        }
        ArrayList arrayList = this.f1160a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (c0226ed2 == null || !((AbstractC0213dr) arrayList.get(size)).mo1020c(c0226ed, c0226ed2)) {
                return false;
            }
            c0226ed2 = (C0226ed) c0226ed2.f846ap;
        }
        return true;
    }

    public final String toString() {
        return AbstractC0727ws.m1850l(" > ", this.f1160a);
    }
}
