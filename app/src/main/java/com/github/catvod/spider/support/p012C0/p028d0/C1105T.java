package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p027d.C1064d;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.T */
/* JADX INFO: loaded from: classes.dex */
final class C1105T extends EnumC1142h1 {
    C1105T() {
        super("RcdataLessthanSign", 10, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        if (c1119a.m2921y('/')) {
            c1100q.m2874h();
            c1100q.m2868a(EnumC1142h1.f2793n);
            return;
        }
        if (!c1119a.m2894C() || c1100q.m2869b() == null) {
            c1100q.m2877k("<");
            enumC1142h1 = EnumC1142h1.f2775e;
        } else {
            StringBuilder sbM2774b = C1064d.m2774b("</");
            sbM2774b.append(c1100q.m2869b());
            String string = sbM2774b.toString();
            Locale locale = Locale.ENGLISH;
            if (c1119a.m2895D(string.toLowerCase(locale)) > -1 || c1119a.m2895D(string.toUpperCase(locale)) > -1) {
                c1100q.m2877k("<");
                enumC1142h1 = EnumC1142h1.f2775e;
            } else {
                AbstractC1094N abstractC1094NM2873g = c1100q.m2873g(false);
                abstractC1094NM2873g.m2840s(c1100q.m2869b());
                c1100q.f2707i = abstractC1094NM2873g;
                c1100q.m2881o();
                enumC1142h1 = EnumC1142h1.f2785j;
            }
        }
        c1100q.m2887u(enumC1142h1);
    }
}
