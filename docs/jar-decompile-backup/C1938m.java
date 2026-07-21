package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1284j;
import com.github.catvod.spider.support.p044FM.p045A.C1288n;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1938m implements InterfaceC1925K, Serializable {

    /* JADX INFO: renamed from: a */
    protected int f4421a;

    /* JADX INFO: renamed from: b */
    protected int f4422b;

    /* JADX INFO: renamed from: c */
    protected int f4423c;

    /* JADX INFO: renamed from: d */
    protected int f4424d;

    /* JADX INFO: renamed from: e */
    protected C1288n<InterfaceC1921G, InterfaceC1929d> f4425e;

    /* JADX INFO: renamed from: f */
    protected String f4426f;

    /* JADX INFO: renamed from: g */
    protected int f4427g = -1;

    /* JADX INFO: renamed from: h */
    protected int f4428h;

    /* JADX INFO: renamed from: i */
    protected int f4429i;

    public C1938m(C1288n<InterfaceC1921G, InterfaceC1929d> c1288n, int i, int i2, int i3, int i4) {
        this.f4423c = -1;
        this.f4425e = c1288n;
        this.f4421a = i;
        this.f4424d = i2;
        this.f4428h = i3;
        this.f4429i = i4;
        InterfaceC1921G interfaceC1921G = c1288n.f3014a;
        if (interfaceC1921G != null) {
            this.f4422b = interfaceC1921G.getLine();
            this.f4423c = c1288n.f3014a.mo4642a();
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E
    /* JADX INFO: renamed from: a */
    public final int mo4638a() {
        return this.f4423c;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E
    /* JADX INFO: renamed from: b */
    public final InterfaceC1921G mo4639b() {
        return this.f4425e.f3014a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E
    /* JADX INFO: renamed from: c */
    public final int mo4640c() {
        return this.f4427g;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1925K
    /* JADX INFO: renamed from: d */
    public final void mo4651d(int i) {
        this.f4427g = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E
    /* JADX INFO: renamed from: e */
    public final int mo4641e() {
        return this.f4424d;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E
    public final int getLine() {
        return this.f4422b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E
    public final String getText() {
        int i;
        String str = this.f4426f;
        if (str != null) {
            return str;
        }
        InterfaceC1929d interfaceC1929d = this.f4425e.f3015b;
        if (interfaceC1929d == null) {
            return null;
        }
        int size = interfaceC1929d.size();
        int i2 = this.f4428h;
        return (i2 >= size || (i = this.f4429i) >= size) ? "<EOF>" : interfaceC1929d.mo4667e(C1284j.m3201b(i2, i));
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E
    public final int getType() {
        return this.f4421a;
    }

    public final String toString() {
        String string;
        if (this.f4424d > 0) {
            StringBuilder sbM3589b = C1434P.m3589b(",channel=");
            sbM3589b.append(this.f4424d);
            string = sbM3589b.toString();
        } else {
            string = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.f4421a);
        StringBuilder sbM3589b2 = C1434P.m3589b("[@");
        sbM3589b2.append(this.f4427g);
        sbM3589b2.append(",");
        sbM3589b2.append(this.f4428h);
        sbM3589b2.append(":");
        sbM3589b2.append(this.f4429i);
        sbM3589b2.append("='");
        sbM3589b2.append(strReplace);
        sbM3589b2.append("',<");
        sbM3589b2.append(strValueOf);
        sbM3589b2.append(">");
        sbM3589b2.append(string);
        sbM3589b2.append(",");
        sbM3589b2.append(this.f4422b);
        sbM3589b2.append(":");
        sbM3589b2.append(this.f4423c);
        sbM3589b2.append("]");
        return sbM3589b2.toString();
    }
}
