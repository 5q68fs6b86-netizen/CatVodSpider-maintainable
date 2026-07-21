package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ip */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0346ip extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final AbstractC0664uj f1017a;

    /* JADX INFO: renamed from: b */
    public final C0579rf f1018b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0669uo f1019c;

    /* JADX INFO: renamed from: d */
    public C0642to f1020d;

    /* JADX INFO: renamed from: e */
    public int f1021e;

    public AbstractC0346ip(AbstractC0664uj abstractC0664uj, InterfaceC0669uo interfaceC0669uo, C0579rf c0579rf) {
        this.f1021e = -1;
        this.f1017a = abstractC0664uj;
        this.f1019c = interfaceC0669uo;
        this.f1018b = c0579rf;
        if (abstractC0664uj != null) {
            this.f1021e = abstractC0664uj.f1572s;
        }
    }
}
