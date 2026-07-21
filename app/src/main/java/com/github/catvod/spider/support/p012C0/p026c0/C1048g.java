package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p022a0.C1016b;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1048g implements Cloneable {

    /* JADX INFO: renamed from: f */
    int f2570f;

    /* JADX INFO: renamed from: c */
    private EnumC1054m f2567c = EnumC1054m.base;

    /* JADX INFO: renamed from: d */
    private Charset f2568d = C1016b.f2478a;

    /* JADX INFO: renamed from: e */
    private final ThreadLocal<CharsetEncoder> f2569e = new ThreadLocal<>();

    /* JADX INFO: renamed from: g */
    private boolean f2571g = true;

    /* JADX INFO: renamed from: h */
    private int f2572h = 1;

    /* JADX INFO: renamed from: i */
    private int f2573i = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1048g clone() {
        try {
            C1048g c1048g = (C1048g) super.clone();
            String strName = this.f2568d.name();
            c1048g.getClass();
            c1048g.f2568d = Charset.forName(strName);
            c1048g.f2567c = EnumC1054m.valueOf(this.f2567c.name());
            return c1048g;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    final CharsetEncoder m2664b() {
        CharsetEncoder charsetEncoder = this.f2569e.get();
        return charsetEncoder != null ? charsetEncoder : m2667e();
    }

    /* JADX INFO: renamed from: c */
    public final EnumC1054m m2665c() {
        return this.f2567c;
    }

    /* JADX INFO: renamed from: d */
    public final int m2666d() {
        return this.f2572h;
    }

    /* JADX INFO: renamed from: e */
    final CharsetEncoder m2667e() {
        int i;
        CharsetEncoder charsetEncoderNewEncoder = this.f2568d.newEncoder();
        this.f2569e.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        if (strName.equals("US-ASCII")) {
            i = 1;
        } else {
            i = strName.startsWith("UTF-") ? 2 : 3;
        }
        this.f2570f = i;
        return charsetEncoderNewEncoder;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2668f() {
        return this.f2571g;
    }

    /* JADX INFO: renamed from: g */
    public final int m2669g() {
        return this.f2573i;
    }
}
