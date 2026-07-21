package com.github.catvod.spider.support.p002A0;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.dy */
/* JADX INFO: loaded from: classes.dex */
public final class C0220dy extends AbstractC0213dr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f760a;

    /* JADX INFO: renamed from: e */
    public final Pattern f761e;

    public /* synthetic */ C0220dy(Pattern pattern, int i) {
        this.f760a = i;
        this.f761e = pattern;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        switch (this.f760a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        switch (this.f760a) {
            case 0:
                return this.f761e.matcher(c0226ed2.m1169ak()).find();
            case 1:
                return this.f761e.matcher(c0226ed2.m1165ag()).find();
            case 2:
                return this.f761e.matcher((String) c0226ed2.f773i.stream().map(new C0234el(0)).collect(AbstractC0727ws.m1851m(""))).find();
            default:
                c0226ed2.getClass();
                return this.f761e.matcher((String) AbstractC0536pq.m1526b(c0226ed2, AbstractC0272fw.class).map(new C0234el(0)).collect(AbstractC0727ws.m1851m(""))).find();
        }
    }

    public final String toString() {
        switch (this.f760a) {
            case 0:
                return ":matches(" + this.f761e + ")";
            case 1:
                return ":matchesOwn(" + this.f761e + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.f761e + ")";
            default:
                return ":matchesWholeText(" + this.f761e + ")";
        }
    }
}
