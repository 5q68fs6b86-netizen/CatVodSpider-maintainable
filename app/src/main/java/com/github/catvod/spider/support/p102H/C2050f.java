package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p101G.C2030b;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2050f {

    /* JADX INFO: renamed from: c */
    public static final C2050f f4752c = new C2050f(false, false);

    /* JADX INFO: renamed from: d */
    public static final C2050f f4753d = new C2050f(true, true);

    /* JADX INFO: renamed from: a */
    private final boolean f4754a;

    /* JADX INFO: renamed from: b */
    private final boolean f4755b;

    public C2050f(boolean z, boolean z2) {
        this.f4754a = z;
        this.f4755b = z2;
    }

    /* JADX INFO: renamed from: a */
    static String m5068a(String str) {
        return C1273a.m3165e(str.trim());
    }

    /* JADX INFO: renamed from: b */
    public final String m5069b(String str) {
        String strTrim = str.trim();
        return !this.f4755b ? C1273a.m3165e(strTrim) : strTrim;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    final C2030b m5070c(@Nullable C2030b c2030b) {
        if (c2030b != null && !this.f4755b) {
            c2030b.m4825u();
        }
        return c2030b;
    }

    /* JADX INFO: renamed from: d */
    public final String m5071d(String str) {
        String strTrim = str.trim();
        return !this.f4754a ? C1273a.m3165e(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5072e() {
        return this.f4755b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5073f() {
        return this.f4754a;
    }
}
