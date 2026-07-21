package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2188x;
import com.github.catvod.spider.support.p137w.C2406h;
import com.github.catvod.spider.support.p137w.C2409k;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2316i implements InterfaceC2307F, Serializable {

    /* JADX INFO: renamed from: a */
    protected int f5749a;

    /* JADX INFO: renamed from: b */
    protected int f5750b;

    /* JADX INFO: renamed from: c */
    protected int f5751c;

    /* JADX INFO: renamed from: d */
    protected int f5752d;

    /* JADX INFO: renamed from: e */
    protected C2409k<InterfaceC2303B, InterfaceC2311d> f5753e;

    /* JADX INFO: renamed from: f */
    protected String f5754f;

    /* JADX INFO: renamed from: g */
    protected int f5755g = -1;

    /* JADX INFO: renamed from: h */
    protected int f5756h;

    /* JADX INFO: renamed from: i */
    protected int f5757i;

    public C2316i(C2409k<InterfaceC2303B, InterfaceC2311d> c2409k, int i, int i2, int i3, int i4) {
        this.f5751c = -1;
        this.f5753e = c2409k;
        this.f5749a = i;
        this.f5752d = i2;
        this.f5756h = i3;
        this.f5757i = i4;
        InterfaceC2303B interfaceC2303B = c2409k.f5967a;
        if (interfaceC2303B != null) {
            this.f5750b = interfaceC2303B.getLine();
            this.f5751c = c2409k.f5967a.mo6218a();
        }
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2333z
    /* JADX INFO: renamed from: a */
    public final int mo6257a() {
        return this.f5751c;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2333z
    /* JADX INFO: renamed from: b */
    public final InterfaceC2303B mo6258b() {
        return this.f5753e.f5967a;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2333z
    /* JADX INFO: renamed from: c */
    public final int mo6259c() {
        return this.f5755g;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2307F
    /* JADX INFO: renamed from: d */
    public final void mo6226d(int i) {
        this.f5755g = i;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2333z
    /* JADX INFO: renamed from: e */
    public final int mo6260e() {
        return this.f5752d;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2333z
    public final int getLine() {
        return this.f5750b;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2333z
    public final String getText() {
        int i;
        String str = this.f5754f;
        if (str != null) {
            return str;
        }
        InterfaceC2311d interfaceC2311d = this.f5753e.f5968b;
        if (interfaceC2311d == null) {
            return null;
        }
        int size = interfaceC2311d.size();
        int i2 = this.f5756h;
        return (i2 >= size || (i = this.f5757i) >= size) ? "<EOF>" : interfaceC2311d.mo6241d(C2406h.m6411b(i2, i));
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2333z
    public final int getType() {
        return this.f5749a;
    }

    public final String toString() {
        String string;
        if (this.f5752d > 0) {
            StringBuilder sbM5396a = C2137a.m5396a(",channel=");
            sbM5396a.append(this.f5752d);
            string = sbM5396a.toString();
        } else {
            string = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.f5749a);
        StringBuilder sbM5396a2 = C2137a.m5396a("[@");
        sbM5396a2.append(this.f5755g);
        sbM5396a2.append(",");
        sbM5396a2.append(this.f5756h);
        sbM5396a2.append(":");
        sbM5396a2.append(this.f5757i);
        sbM5396a2.append("='");
        sbM5396a2.append(strReplace);
        sbM5396a2.append("',<");
        C2188x.m5787a(sbM5396a2, strValueOf, ">", string, ",");
        sbM5396a2.append(this.f5750b);
        sbM5396a2.append(":");
        sbM5396a2.append(this.f5751c);
        sbM5396a2.append("]");
        return sbM5396a2.toString();
    }
}
