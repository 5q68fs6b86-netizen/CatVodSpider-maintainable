package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.th */
/* JADX INFO: loaded from: classes.dex */
public final class C0635th extends AbstractC0637tj {
    public C0635th(List list) {
        this.f1535a.addAll(list);
        m1714h();
    }

    public C0635th(AbstractC0213dr... abstractC0213drArr) {
        this(Arrays.asList(abstractC0213drArr));
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        for (int i = 0; i < this.f1537f; i++) {
            if (!((AbstractC0213dr) this.f1536e.get(i)).mo1020c(c0226ed, c0226ed2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return AbstractC0727ws.m1850l("", this.f1535a);
    }
}
