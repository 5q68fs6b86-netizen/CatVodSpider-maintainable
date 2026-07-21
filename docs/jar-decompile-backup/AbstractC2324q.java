package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p135u.C2391w;
import com.github.catvod.spider.support.p137w.C2405g;
import com.github.catvod.spider.support.p137w.C2406h;
import com.github.catvod.spider.support.p137w.C2409k;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2324q extends AbstractC2331x<Integer, C2391w> implements InterfaceC2303B {

    /* JADX INFO: renamed from: d */
    public InterfaceC2311d f5765d;

    /* JADX INFO: renamed from: e */
    protected C2409k<InterfaceC2303B, InterfaceC2311d> f5766e;

    /* JADX INFO: renamed from: g */
    public InterfaceC2333z f5768g;

    /* JADX INFO: renamed from: i */
    public int f5770i;

    /* JADX INFO: renamed from: j */
    public int f5771j;

    /* JADX INFO: renamed from: k */
    public boolean f5772k;

    /* JADX INFO: renamed from: l */
    public int f5773l;

    /* JADX INFO: renamed from: m */
    public int f5774m;

    /* JADX INFO: renamed from: f */
    protected InterfaceC2302A<?> f5767f = C2317j.f5758a;

    /* JADX INFO: renamed from: h */
    public int f5769h = -1;

    /* JADX INFO: renamed from: n */
    public final C2405g f5775n = new C2405g();

    /* JADX INFO: renamed from: o */
    public int f5776o = 0;

    public AbstractC2324q(InterfaceC2311d interfaceC2311d) {
        this.f5765d = interfaceC2311d;
        this.f5766e = new C2409k<>(this, interfaceC2311d);
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2303B
    /* JADX INFO: renamed from: a */
    public final int mo6218a() {
        return ((C2391w) this.f5797b).m6385g();
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2303B
    /* JADX INFO: renamed from: b */
    public final InterfaceC2302A<? extends InterfaceC2333z> mo6219b() {
        return this.f5767f;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2303B
    public final InterfaceC2311d getInputStream() {
        return this.f5765d;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2303B
    public final int getLine() {
        return ((C2391w) this.f5797b).m6386h();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.support.p134t.A<?>, com.github.catvod.spider.support.p134t.j] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public final InterfaceC2333z m6273i() {
        InterfaceC2333z interfaceC2333zM6261a = this.f5767f.m6261a(this.f5766e, -1, null, 0, this.f5765d.mo6234h(), this.f5765d.mo6234h() - 1, ((C2391w) this.f5797b).m6386h(), ((C2391w) this.f5797b).m6385g());
        this.f5768g = interfaceC2333zM6261a;
        return interfaceC2333zM6261a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m6274j(C2325r c2325r) {
        InterfaceC2311d interfaceC2311d = this.f5765d;
        String strMo6241d = interfaceC2311d.mo6241d(C2406h.m6411b(this.f5769h, interfaceC2311d.mo6234h()));
        StringBuilder sbM5396a = C2137a.m5396a("token recognition error at: '");
        StringBuilder sb = new StringBuilder();
        for (char c : strMo6241d.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = "<EOF>";
            } else if (c == 13) {
                strValueOf = "\\r";
            } else if (c == 9) {
                strValueOf = "\\t";
            } else if (c == 10) {
                strValueOf = "\\n";
            }
            sb.append(strValueOf);
        }
        sbM5396a.append(sb.toString());
        sbM5396a.append("'");
        ((C2329v) m6299d()).mo6230d(this, null, this.f5770i, this.f5771j, sbM5396a.toString(), c2325r);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.github.catvod.spider.support.p134t.A<?>, com.github.catvod.spider.support.p134t.j] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.github.catvod.spider.support.p134t.InterfaceC2303B
    public final InterfaceC2333z nextToken() {
        int iM6387i;
        InterfaceC2311d interfaceC2311d = this.f5765d;
        if (interfaceC2311d == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        interfaceC2311d.mo6231c();
        loop0: while (true) {
            try {
                if (this.f5772k) {
                    m6273i();
                    break;
                }
                this.f5768g = null;
                this.f5773l = 0;
                this.f5769h = this.f5765d.mo6234h();
                this.f5771j = ((C2391w) this.f5797b).m6385g();
                this.f5770i = ((C2391w) this.f5797b).m6386h();
                while (true) {
                    this.f5774m = 0;
                    try {
                        iM6387i = ((C2391w) this.f5797b).m6387i(this.f5765d, this.f5776o);
                    } catch (C2325r e) {
                        m6274j(e);
                        if (this.f5765d.mo6233g(1) != -1) {
                            ((C2391w) this.f5797b).m6383e(this.f5765d);
                        }
                        iM6387i = -3;
                    }
                    if (this.f5765d.mo6233g(1) == -1) {
                        this.f5772k = true;
                    }
                    if (this.f5774m == 0) {
                        this.f5774m = iM6387i;
                    }
                    int i = this.f5774m;
                    if (i == -3) {
                        break;
                    }
                    if (i != -2) {
                        if (this.f5768g != null) {
                            break loop0;
                        }
                        this.f5768g = this.f5767f.m6261a(this.f5766e, i, null, this.f5773l, this.f5769h, this.f5765d.mo6234h() - 1, this.f5770i, this.f5771j);
                        break loop0;
                    }
                }
            } catch (Throwable th) {
                this.f5765d.release();
                throw th;
            }
        }
        InterfaceC2333z interfaceC2333z = this.f5768g;
        this.f5765d.release();
        return interfaceC2333z;
    }
}
