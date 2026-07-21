package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.tj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0637tj extends AbstractC0213dr {

    /* JADX INFO: renamed from: f */
    public int f1537f = 0;

    /* JADX INFO: renamed from: g */
    public int f1538g = 0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1535a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f1536e = new ArrayList();

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        return this.f1538g;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: d */
    public final void mo1139d() {
        Iterator it = this.f1535a.iterator();
        while (it.hasNext()) {
            ((AbstractC0213dr) it.next()).mo1139d();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1714h() {
        ArrayList<AbstractC0213dr> arrayList = this.f1535a;
        this.f1537f = arrayList.size();
        this.f1538g = 0;
        for (AbstractC0213dr abstractC0213dr : arrayList) {
            this.f1538g = abstractC0213dr.mo1019b() + this.f1538g;
        }
        ArrayList arrayList2 = this.f1536e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.sort(Comparator.comparingInt(new C0634tg()));
    }
}
