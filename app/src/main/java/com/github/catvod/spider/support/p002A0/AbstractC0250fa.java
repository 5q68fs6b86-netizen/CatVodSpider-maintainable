package com.github.catvod.spider.support.p002A0;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.fa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0250fa extends AbstractC0213dr {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f812e;

    /* JADX INFO: renamed from: f */
    public final Object f813f;

    /* JADX INFO: renamed from: g */
    public final Object f814g;

    public AbstractC0250fa(AbstractC0213dr abstractC0213dr) {
        this.f812e = 1;
        this.f814g = ThreadLocal.withInitial(new C0605se(6));
        this.f813f = abstractC0213dr;
    }

    public AbstractC0250fa(String str, String str2, boolean z) {
        this.f812e = 0;
        AbstractC0711wc.m1768c(str);
        AbstractC0711wc.m1768c(str2);
        this.f813f = AbstractC0552qf.m1582d(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strM1581c = (!z && z2) ? AbstractC0552qf.m1581c(str2) : AbstractC0552qf.m1582d(str2);
        this.f814g = strM1581c;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: d */
    public void mo1139d() {
        switch (this.f812e) {
            case 1:
                ((IdentityHashMap) ((ThreadLocal) this.f814g).get()).clear();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.catvod.spider.support.A0.bu] */
    /* JADX INFO: renamed from: h */
    public boolean m1204h(final C0226ed c0226ed, C0226ed c0226ed2) {
        Map map = (Map) ((ThreadLocal) this.f814g).get();
        C0234el c0234el = AbstractC0499og.f1326a;
        return ((Boolean) ((Map) map.computeIfAbsent(c0226ed, AbstractC0499og.f1326a)).computeIfAbsent(c0226ed2, new Function() { // from class: com.github.catvod.spider.support.A0.bu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((AbstractC0213dr) this.f693a.f813f).mo1020c(c0226ed, (C0226ed) obj));
            }
        })).booleanValue();
    }
}
