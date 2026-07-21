package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p137w.C2406h;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.t.c */
/* JADX INFO: loaded from: classes.dex */
public class C2310c implements InterfaceC2304C {

    /* JADX INFO: renamed from: a */
    protected InterfaceC2303B f5730a;

    /* JADX INFO: renamed from: b */
    protected List<InterfaceC2333z> f5731b = new ArrayList(100);

    /* JADX INFO: renamed from: c */
    protected int f5732c = -1;

    /* JADX INFO: renamed from: d */
    protected boolean f5733d;

    public C2310c(InterfaceC2303B interfaceC2303B) {
        this.f5730a = interfaceC2303B;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    @Override // com.github.catvod.spider.support.p134t.InterfaceC2304C
    /* JADX INFO: renamed from: a */
    public final String mo6220a(InterfaceC2333z interfaceC2333z, InterfaceC2333z interfaceC2333z2) {
        if (interfaceC2333z != null && interfaceC2333z2 != null) {
            C2406h c2406hM6411b = C2406h.m6411b(interfaceC2333z.mo6259c(), interfaceC2333z2.mo6259c());
            int i = c2406hM6411b.f5962a;
            int size = c2406hM6411b.f5963b;
            if (i >= 0 && size >= 0) {
                m6238l();
                while (m6237k(DescriptorProtos.Edition.EDITION_2023_VALUE) >= 1000) {
                }
                if (size >= this.f5731b.size()) {
                    size = this.f5731b.size() - 1;
                }
                StringBuilder sb = new StringBuilder();
                while (i <= size) {
                    InterfaceC2333z interfaceC2333z3 = (InterfaceC2333z) this.f5731b.get(i);
                    if (interfaceC2333z3.getType() == -1) {
                        break;
                    }
                    sb.append(interfaceC2333z3.getText());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2304C
    /* JADX INFO: renamed from: b */
    public final InterfaceC2303B mo6221b() {
        return this.f5730a;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: c */
    public final int mo6231c() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: e */
    public final void mo6232e(int i) {
        m6238l();
        this.f5732c = mo6236j(i);
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2304C
    /* JADX INFO: renamed from: f */
    public InterfaceC2333z mo6222f(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: g */
    public final int mo6233g(int i) {
        return mo6222f(i).getType();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    @Override // com.github.catvod.spider.support.p134t.InterfaceC2304C
    public final InterfaceC2333z get(int i) {
        if (i >= 0 && i < this.f5731b.size()) {
            return (InterfaceC2333z) this.f5731b.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("token index ");
        sb.append(i);
        sb.append(" out of range 0..");
        sb.append(this.f5731b.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: h */
    public final int mo6234h() {
        return this.f5732c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: i */
    public final void mo6235i() {
        int i = this.f5732c;
        if (!(i >= 0 && (!this.f5733d ? i >= this.f5731b.size() : i >= this.f5731b.size() - 1)) && mo6233g(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (m6240n(this.f5732c + 1)) {
            this.f5732c = mo6236j(this.f5732c + 1);
        }
    }

    /* JADX INFO: renamed from: j */
    protected int mo6236j(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX INFO: renamed from: k */
    protected final int m6237k(int i) {
        if (this.f5733d) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC2333z interfaceC2333zNextToken = this.f5730a.nextToken();
            if (interfaceC2333zNextToken instanceof InterfaceC2307F) {
                ((InterfaceC2307F) interfaceC2333zNextToken).mo6226d(this.f5731b.size());
            }
            this.f5731b.add(interfaceC2333zNextToken);
            if (interfaceC2333zNextToken.getType() == -1) {
                this.f5733d = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    protected final void m6238l() {
        if (this.f5732c == -1) {
            m6240n(0);
            this.f5732c = mo6236j(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX INFO: renamed from: m */
    protected final int m6239m(int i) {
        m6240n(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            InterfaceC2333z interfaceC2333z = (InterfaceC2333z) this.f5731b.get(i);
            if (interfaceC2333z.mo6260e() == 0 || interfaceC2333z.getType() == -1) {
                return i;
            }
            i++;
            m6240n(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    /* JADX INFO: renamed from: n */
    protected final boolean m6240n(int i) {
        int size = (i - this.f5731b.size()) + 1;
        return size <= 0 || m6237k(size) >= size;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.t.z>] */
    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    public final int size() {
        return this.f5731b.size();
    }
}
