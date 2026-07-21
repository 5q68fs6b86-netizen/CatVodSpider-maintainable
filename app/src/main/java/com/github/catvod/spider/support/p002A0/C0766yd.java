package com.github.catvod.spider.support.p002A0;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.yd */
/* JADX INFO: loaded from: classes.dex */
public final class C0766yd extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public static final C0136av f1827a = new C0136av();

    /* JADX INFO: renamed from: d */
    public final AbstractC0406kv f1828d;

    public C0766yd(AbstractC0406kv abstractC0406kv) {
        this.f1828d = abstractC0406kv;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) {
        Date date = (Date) this.f1828d.mo900b(c0577rd);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) {
        this.f1828d.mo901c(aagVar, (Timestamp) obj);
    }
}
