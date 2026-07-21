package com.github.catvod.spider.support.p044FM.p098x;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.x.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1933h {

    /* JADX INFO: renamed from: a */
    private final int f4412a;

    /* JADX INFO: renamed from: b */
    private final ByteBuffer f4413b;

    /* JADX INFO: renamed from: c */
    private final CharBuffer f4414c;

    /* JADX INFO: renamed from: d */
    private final IntBuffer f4415d;

    C1933h(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.f4412a = i;
        this.f4413b = byteBuffer;
        this.f4414c = charBuffer;
        this.f4415d = intBuffer;
    }

    /* JADX INFO: renamed from: a */
    final int m4677a() {
        int iM4675a = C1932g.m4675a(this.f4412a);
        if (iM4675a == 0) {
            return this.f4413b.arrayOffset();
        }
        if (iM4675a == 1) {
            return this.f4414c.arrayOffset();
        }
        if (iM4675a == 2) {
            return this.f4415d.arrayOffset();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    /* JADX INFO: renamed from: b */
    final byte[] m4678b() {
        return this.f4413b.array();
    }

    /* JADX INFO: renamed from: c */
    final char[] m4679c() {
        return this.f4414c.array();
    }

    /* JADX INFO: renamed from: d */
    final int m4680d() {
        return this.f4412a;
    }

    /* JADX INFO: renamed from: e */
    final int[] m4681e() {
        return this.f4415d.array();
    }

    /* JADX INFO: renamed from: f */
    public final int m4682f() {
        Buffer buffer;
        int iM4675a = C1932g.m4675a(this.f4412a);
        if (iM4675a == 0) {
            buffer = this.f4413b;
        } else if (iM4675a == 1) {
            buffer = this.f4414c;
        } else {
            if (iM4675a != 2) {
                throw new UnsupportedOperationException("Not reached");
            }
            buffer = this.f4415d;
        }
        return buffer.position();
    }

    /* JADX INFO: renamed from: g */
    public final int m4683g() {
        Buffer buffer;
        int iM4675a = C1932g.m4675a(this.f4412a);
        if (iM4675a == 0) {
            buffer = this.f4413b;
        } else if (iM4675a == 1) {
            buffer = this.f4414c;
        } else {
            if (iM4675a != 2) {
                throw new UnsupportedOperationException("Not reached");
            }
            buffer = this.f4415d;
        }
        return buffer.remaining();
    }
}
