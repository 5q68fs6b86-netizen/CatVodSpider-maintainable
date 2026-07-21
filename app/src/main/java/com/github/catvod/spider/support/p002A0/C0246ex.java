package com.github.catvod.spider.support.p002A0;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ex */
/* JADX INFO: loaded from: classes.dex */
public final class C0246ex extends AbstractC0213dr {

    /* JADX INFO: renamed from: a */
    public final String f800a;

    /* JADX INFO: renamed from: e */
    public final Pattern f801e;

    public C0246ex(String str, Pattern pattern) {
        this.f800a = AbstractC0552qf.m1582d(str);
        this.f801e = pattern;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        return 8;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        String str = this.f800a;
        return c0226ed2.m1229av(str) && this.f801e.matcher(c0226ed2.mo1228au(str)).find();
    }

    public final String toString() {
        return "[" + this.f800a + "~=" + this.f801e.toString() + "]";
    }
}
