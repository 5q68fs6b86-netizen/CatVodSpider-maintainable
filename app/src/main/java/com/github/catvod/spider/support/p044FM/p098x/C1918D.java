package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b;
import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1294d;
import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1295e;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.x.D */
/* JADX INFO: loaded from: classes.dex */
public class C1918D implements InterfaceC1295e {

    /* JADX INFO: renamed from: c */
    public static final C1950y f4393c = new C1950y();

    /* JADX INFO: renamed from: a */
    public C1918D f4394a;

    /* JADX INFO: renamed from: b */
    public int f4395b;

    public C1918D() {
        this.f4395b = -1;
    }

    public C1918D(C1918D c1918d, int i) {
        this.f4394a = c1918d;
        this.f4395b = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b
    /* JADX INFO: renamed from: b */
    public <T> T mo3232b(InterfaceC1294d<? extends T> interfaceC1294d) {
        return interfaceC1294d.mo3185g(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b
    /* JADX INFO: renamed from: c */
    public InterfaceC1292b mo3233c(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b
    /* JADX INFO: renamed from: d */
    public int mo3234d() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public int mo3830e() {
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4637f() {
        return this.f4395b == -1;
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b
    public final String getText() {
        if (mo3234d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mo3234d(); i++) {
            sb.append(mo3233c(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("[");
        for (C1918D c1918d = this; c1918d != null; c1918d = c1918d.f4394a) {
            if (!c1918d.m4637f()) {
                sbM3589b.append(c1918d.f4395b);
            }
            C1918D c1918d2 = c1918d.f4394a;
            if (c1918d2 != null && !c1918d2.m4637f()) {
                sbM3589b.append(" ");
            }
        }
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
