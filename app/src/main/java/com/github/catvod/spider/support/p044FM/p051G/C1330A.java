package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.A */
/* JADX INFO: loaded from: classes.dex */
final class C1330A implements InterfaceC1372z {

    /* JADX INFO: renamed from: a */
    private final String f3077a;

    C1330A(String str) {
        this.f3077a = str;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.f3077a);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return this.f3077a.length();
    }
}
