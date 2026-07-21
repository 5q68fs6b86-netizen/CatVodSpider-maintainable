package com.github.catvod.spider.support.p002A0;

import java.util.function.Predicate;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ri */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0582ri implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0213dr f1441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0226ed f1442b;

    public /* synthetic */ C0582ri(AbstractC0213dr abstractC0213dr, C0226ed c0226ed) {
        this.f1441a = abstractC0213dr;
        this.f1442b = c0226ed;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f1441a.mo1020c(this.f1442b, (C0226ed) obj);
    }
}
