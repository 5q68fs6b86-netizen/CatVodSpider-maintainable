package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p053I.C1376b;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p055K.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1387g implements Cloneable {

    /* JADX INFO: renamed from: d */
    @Nullable
    int f3192d;

    /* JADX INFO: renamed from: a */
    private EnumC1394n f3189a = EnumC1394n.base;

    /* JADX INFO: renamed from: b */
    private Charset f3190b = C1376b.f3168a;

    /* JADX INFO: renamed from: c */
    private final ThreadLocal<CharsetEncoder> f3191c = new ThreadLocal<>();

    /* JADX INFO: renamed from: e */
    private boolean f3193e = true;

    /* JADX INFO: renamed from: f */
    private int f3194f = 1;

    /* JADX INFO: renamed from: g */
    private int f3195g = 30;

    /* JADX INFO: renamed from: h */
    private int f3196h = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1387g clone() {
        try {
            C1387g c1387g = (C1387g) super.clone();
            String strName = this.f3190b.name();
            c1387g.getClass();
            c1387g.f3190b = Charset.forName(strName);
            c1387g.f3189a = EnumC1394n.valueOf(this.f3189a.name());
            return c1387g;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    final CharsetEncoder m3414b() {
        CharsetEncoder charsetEncoder = this.f3191c.get();
        return charsetEncoder != null ? charsetEncoder : m3419g();
    }

    /* JADX INFO: renamed from: c */
    public final C1387g m3415c(EnumC1394n enumC1394n) {
        this.f3189a = enumC1394n;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC1394n m3416d() {
        return this.f3189a;
    }

    /* JADX INFO: renamed from: e */
    public final int m3417e() {
        return this.f3194f;
    }

    /* JADX INFO: renamed from: f */
    public final int m3418f() {
        return this.f3195g;
    }

    /* JADX INFO: renamed from: g */
    final CharsetEncoder m3419g() {
        int i;
        CharsetEncoder charsetEncoderNewEncoder = this.f3190b.newEncoder();
        this.f3191c.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        if (strName.equals("US-ASCII")) {
            i = 1;
        } else {
            i = strName.startsWith("UTF-") ? 2 : 3;
        }
        this.f3192d = i;
        return charsetEncoderNewEncoder;
    }

    /* JADX INFO: renamed from: h */
    public final C1387g m3420h() {
        this.f3193e = false;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3421i() {
        return this.f3193e;
    }

    /* JADX INFO: renamed from: j */
    public final C1387g m3422j() {
        this.f3196h = 2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final int m3423k() {
        return this.f3196h;
    }
}
