package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1284j;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.x.c */
/* JADX INFO: loaded from: classes.dex */
public class C1928c implements InterfaceC1922H {

    /* JADX INFO: renamed from: a */
    protected InterfaceC1921G f4401a;

    /* JADX INFO: renamed from: b */
    protected List<InterfaceC1919E> f4402b = new ArrayList(100);

    /* JADX INFO: renamed from: c */
    protected int f4403c = -1;

    /* JADX INFO: renamed from: d */
    protected boolean f4404d;

    public C1928c(InterfaceC1921G interfaceC1921G) {
        this.f4401a = interfaceC1921G;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: a */
    public final void mo4656a() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1922H
    /* JADX INFO: renamed from: b */
    public final InterfaceC1921G mo4645b() {
        return this.f4401a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1922H
    /* JADX INFO: renamed from: c */
    public final String mo4646c(InterfaceC1919E interfaceC1919E, InterfaceC1919E interfaceC1919E2) {
        if (interfaceC1919E != null && interfaceC1919E2 != null) {
            C1284j c1284jM3201b = C1284j.m3201b(interfaceC1919E.mo4640c(), interfaceC1919E2.mo4640c());
            int i = c1284jM3201b.f3009a;
            int size = c1284jM3201b.f3010b;
            if (i >= 0 && size >= 0) {
                m4664m();
                while (m4663l(DescriptorProtos.Edition.EDITION_2023_VALUE) >= 1000) {
                }
                if (size >= this.f4402b.size()) {
                    size = this.f4402b.size() - 1;
                }
                StringBuilder sb = new StringBuilder();
                while (i <= size) {
                    InterfaceC1919E interfaceC1919E3 = (InterfaceC1919E) this.f4402b.get(i);
                    if (interfaceC1919E3.getType() == -1) {
                        break;
                    }
                    sb.append(interfaceC1919E3.getText());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: d */
    public final int mo4657d() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: f */
    public final void mo4658f(int i) {
        m4664m();
        this.f4403c = mo4662k(i);
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1922H
    /* JADX INFO: renamed from: g */
    public InterfaceC1919E mo4647g(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1922H
    public final InterfaceC1919E get(int i) {
        if (i >= 0 && i < this.f4402b.size()) {
            return (InterfaceC1919E) this.f4402b.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("token index ");
        sb.append(i);
        sb.append(" out of range 0..");
        sb.append(this.f4402b.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: h */
    public final int mo4659h(int i) {
        return mo4647g(i).getType();
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: i */
    public final int mo4660i() {
        return this.f4403c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: j */
    public final void mo4661j() {
        int i = this.f4403c;
        if (!(i >= 0 && (!this.f4404d ? i >= this.f4402b.size() : i >= this.f4402b.size() - 1)) && mo4659h(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (m4666o(this.f4403c + 1)) {
            this.f4403c = mo4662k(this.f4403c + 1);
        }
    }

    /* JADX INFO: renamed from: k */
    protected int mo4662k(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX INFO: renamed from: l */
    protected final int m4663l(int i) {
        if (this.f4404d) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC1919E interfaceC1919ENextToken = this.f4401a.nextToken();
            if (interfaceC1919ENextToken instanceof InterfaceC1925K) {
                ((InterfaceC1925K) interfaceC1919ENextToken).mo4651d(this.f4402b.size());
            }
            this.f4402b.add(interfaceC1919ENextToken);
            if (interfaceC1919ENextToken.getType() == -1) {
                this.f4404d = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    protected final void m4664m() {
        if (this.f4403c == -1) {
            m4666o(0);
            this.f4403c = mo4662k(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX INFO: renamed from: n */
    protected final int m4665n(int i) {
        m4666o(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            InterfaceC1919E interfaceC1919E = (InterfaceC1919E) this.f4402b.get(i);
            if (interfaceC1919E.mo4641e() == 0 || interfaceC1919E.getType() == -1) {
                return i;
            }
            i++;
            m4666o(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    /* JADX INFO: renamed from: o */
    protected final boolean m4666o(int i) {
        int size = (i - this.f4402b.size()) + 1;
        return size <= 0 || m4663l(size) >= size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.x.E>] */
    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    public final int size() {
        return this.f4402b.size();
    }
}
