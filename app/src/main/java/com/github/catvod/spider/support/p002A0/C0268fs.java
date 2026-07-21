package com.github.catvod.spider.support.p002A0;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.fs */
/* JADX INFO: loaded from: classes.dex */
public final class C0268fs extends acg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f834a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0268fs(Class cls, int i) {
        super(cls);
        this.f834a = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.acg
    /* JADX INFO: renamed from: b */
    public final Date mo935b(Date date) {
        switch (this.f834a) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
