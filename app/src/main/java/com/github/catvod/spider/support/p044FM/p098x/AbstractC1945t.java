package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1283i;
import com.github.catvod.spider.support.p044FM.p045A.C1284j;
import com.github.catvod.spider.support.p044FM.p045A.C1288n;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p099y.C1953B;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1945t extends AbstractC1917C<Integer, C1953B> implements InterfaceC1921G {

    /* JADX INFO: renamed from: d */
    public InterfaceC1929d f4436d;

    /* JADX INFO: renamed from: e */
    protected C1288n<InterfaceC1921G, InterfaceC1929d> f4437e;

    /* JADX INFO: renamed from: g */
    public InterfaceC1919E f4439g;

    /* JADX INFO: renamed from: i */
    public int f4441i;

    /* JADX INFO: renamed from: j */
    public int f4442j;

    /* JADX INFO: renamed from: k */
    public boolean f4443k;

    /* JADX INFO: renamed from: l */
    public int f4444l;

    /* JADX INFO: renamed from: m */
    public int f4445m;

    /* JADX INFO: renamed from: f */
    protected InterfaceC1920F<?> f4438f = C1930e.f4405a;

    /* JADX INFO: renamed from: h */
    public int f4440h = -1;

    /* JADX INFO: renamed from: n */
    public final C1283i f4446n = new C1283i();

    /* JADX INFO: renamed from: o */
    public int f4447o = 0;

    public AbstractC1945t(InterfaceC1929d interfaceC1929d) {
        this.f4436d = interfaceC1929d;
        this.f4437e = new C1288n<>(this, interfaceC1929d);
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1921G
    /* JADX INFO: renamed from: a */
    public final int mo4642a() {
        return ((C1953B) this.f4391b).m4719g();
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1921G
    /* JADX INFO: renamed from: b */
    public final InterfaceC1929d mo4643b() {
        return this.f4436d;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1921G
    /* JADX INFO: renamed from: c */
    public final InterfaceC1920F<? extends InterfaceC1919E> mo4644c() {
        return this.f4438f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1921G
    public final int getLine() {
        return ((C1953B) this.f4391b).m4720h();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.support.p044FM.p098x.F<?>, com.github.catvod.spider.support.p044FM.p098x.e] */
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
    /* JADX INFO: renamed from: j */
    public final InterfaceC1919E m4695j() {
        InterfaceC1919E interfaceC1919EM4669a = this.f4438f.m4669a(this.f4437e, -1, null, 0, this.f4436d.mo4660i(), this.f4436d.mo4660i() - 1, ((C1953B) this.f4391b).m4720h(), ((C1953B) this.f4391b).m4719g());
        this.f4439g = interfaceC1919EM4669a;
        return interfaceC1919EM4669a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m4696k(C1946u c1946u) {
        InterfaceC1929d interfaceC1929d = this.f4436d;
        String strMo4667e = interfaceC1929d.mo4667e(C1284j.m3201b(this.f4440h, interfaceC1929d.mo4660i()));
        StringBuilder sbM3589b = C1434P.m3589b("token recognition error at: '");
        StringBuilder sb = new StringBuilder();
        for (char c : strMo4667e.toCharArray()) {
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
        sbM3589b.append(sb.toString());
        sbM3589b.append("'");
        ((C1951z) m4632e()).mo4653b(this, null, this.f4441i, this.f4442j, sbM3589b.toString(), c1946u);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.github.catvod.spider.support.p044FM.p098x.F<?>, com.github.catvod.spider.support.p044FM.p098x.e] */
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
    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1921G
    public final InterfaceC1919E nextToken() {
        int iM4721i;
        InterfaceC1929d interfaceC1929d = this.f4436d;
        if (interfaceC1929d == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        interfaceC1929d.mo4657d();
        loop0: while (true) {
            try {
                if (this.f4443k) {
                    m4695j();
                    break;
                }
                this.f4439g = null;
                this.f4444l = 0;
                this.f4440h = this.f4436d.mo4660i();
                this.f4442j = ((C1953B) this.f4391b).m4719g();
                this.f4441i = ((C1953B) this.f4391b).m4720h();
                while (true) {
                    this.f4445m = 0;
                    try {
                        iM4721i = ((C1953B) this.f4391b).m4721i(this.f4436d, this.f4447o);
                    } catch (C1946u e) {
                        m4696k(e);
                        if (this.f4436d.mo4659h(1) != -1) {
                            ((C1953B) this.f4391b).m4717e(this.f4436d);
                        }
                        iM4721i = -3;
                    }
                    if (this.f4436d.mo4659h(1) == -1) {
                        this.f4443k = true;
                    }
                    if (this.f4445m == 0) {
                        this.f4445m = iM4721i;
                    }
                    int i = this.f4445m;
                    if (i == -3) {
                        break;
                    }
                    if (i != -2) {
                        if (this.f4439g != null) {
                            break loop0;
                        }
                        this.f4439g = this.f4438f.m4669a(this.f4437e, i, null, this.f4444l, this.f4440h, this.f4436d.mo4660i() - 1, this.f4441i, this.f4442j);
                        break loop0;
                    }
                }
            } catch (Throwable th) {
                this.f4436d.mo4656a();
                throw th;
            }
        }
        InterfaceC1919E interfaceC1919E = this.f4439g;
        this.f4436d.mo4656a();
        return interfaceC1919E;
    }
}
