package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1383c;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1412E {

    /* JADX INFO: renamed from: c */
    public static final C1412E f3294c = new C1412E(false, false);

    /* JADX INFO: renamed from: d */
    public static final C1412E f3295d = new C1412E(true, true);

    /* JADX INFO: renamed from: a */
    private final boolean f3296a;

    /* JADX INFO: renamed from: b */
    private final boolean f3297b;

    public C1412E(boolean z, boolean z2) {
        this.f3296a = z;
        this.f3297b = z2;
    }

    /* JADX INFO: renamed from: a */
    static String m3538a(String str) {
        return C1286l.m3219d(str.trim());
    }

    /* JADX INFO: renamed from: b */
    public final String m3539b(String str) {
        String strTrim = str.trim();
        return !this.f3297b ? C1286l.m3219d(strTrim) : strTrim;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    final C1383c m3540c(@Nullable C1383c c1383c) {
        if (c1383c != null && !this.f3297b) {
            c1383c.m3398u();
        }
        return c1383c;
    }

    /* JADX INFO: renamed from: d */
    public final String m3541d(String str) {
        String strTrim = str.trim();
        return !this.f3296a ? C1286l.m3219d(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3542e() {
        return this.f3297b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3543f() {
        return this.f3296a;
    }
}
