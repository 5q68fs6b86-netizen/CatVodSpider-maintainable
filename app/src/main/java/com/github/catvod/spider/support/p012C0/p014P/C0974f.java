package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.p012C0.p037l.C1257a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p014P.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0974f {

    /* JADX INFO: renamed from: a */
    private final int f2360a;

    /* JADX INFO: renamed from: b */
    private final ByteBuffer f2361b;

    /* JADX INFO: renamed from: c */
    private final CharBuffer f2362c;

    /* JADX INFO: renamed from: d */
    private final IntBuffer f2363d;

    C0974f(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.f2360a = i;
        this.f2361b = byteBuffer;
        this.f2362c = charBuffer;
        this.f2363d = intBuffer;
    }

    /* JADX INFO: renamed from: b */
    public static C0973e m2410b(int i) {
        return new C0973e(i);
    }

    /* JADX INFO: renamed from: a */
    final int m2411a() {
        int iM3131a = C1257a.m3131a(this.f2360a);
        if (iM3131a == 0) {
            return this.f2361b.arrayOffset();
        }
        if (iM3131a == 1) {
            return this.f2362c.arrayOffset();
        }
        if (iM3131a == 2) {
            return this.f2363d.arrayOffset();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    /* JADX INFO: renamed from: c */
    final byte[] m2412c() {
        return this.f2361b.array();
    }

    /* JADX INFO: renamed from: d */
    final char[] m2413d() {
        return this.f2362c.array();
    }

    /* JADX INFO: renamed from: e */
    final int m2414e() {
        return this.f2360a;
    }

    /* JADX INFO: renamed from: f */
    final int[] m2415f() {
        return this.f2363d.array();
    }

    /* JADX INFO: renamed from: g */
    public final int m2416g() {
        Buffer buffer;
        int iM3131a = C1257a.m3131a(this.f2360a);
        if (iM3131a == 0) {
            buffer = this.f2361b;
        } else if (iM3131a == 1) {
            buffer = this.f2362c;
        } else {
            if (iM3131a != 2) {
                throw new UnsupportedOperationException("Not reached");
            }
            buffer = this.f2363d;
        }
        return buffer.position();
    }

    /* JADX INFO: renamed from: h */
    public final int m2417h() {
        Buffer buffer;
        int iM3131a = C1257a.m3131a(this.f2360a);
        if (iM3131a == 0) {
            buffer = this.f2361b;
        } else if (iM3131a == 1) {
            buffer = this.f2362c;
        } else {
            if (iM3131a != 2) {
                throw new UnsupportedOperationException("Not reached");
            }
            buffer = this.f2363d;
        }
        return buffer.remaining();
    }
}
