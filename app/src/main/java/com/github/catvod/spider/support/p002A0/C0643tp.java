package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.tp */
/* JADX INFO: loaded from: classes.dex */
public final class C0643tp implements InterfaceC0669uo {

    /* JADX INFO: renamed from: a */
    public C0792zc f1553a;

    /* JADX INFO: renamed from: b */
    public ArrayList f1554b;

    /* JADX INFO: renamed from: c */
    public int f1555c;

    /* JADX INFO: renamed from: d */
    public boolean f1556d;

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0669uo
    /* JADX INFO: renamed from: e */
    public final int mo1697e(int i) {
        return m1721f(i).f1544a;
    }

    /* JADX INFO: renamed from: f */
    public final C0642to m1721f(int i) {
        if (this.f1555c == -1) {
            m1726k(0);
            this.f1555c = m1724i(0);
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f1554b;
        if (i >= 0) {
            int iM1724i = this.f1555c;
            for (int i2 = 1; i2 < i; i2++) {
                int i3 = iM1724i + 1;
                if (m1726k(i3)) {
                    iM1724i = m1724i(i3);
                }
            }
            return (C0642to) arrayList.get(iM1724i);
        }
        int i4 = -i;
        if (i4 == 0) {
            return null;
        }
        int size = this.f1555c;
        if (size - i4 < 0) {
            return null;
        }
        for (int i5 = 1; i5 <= i4 && size > 0; i5++) {
            size--;
            m1726k(size);
            if (size >= this.f1554b.size()) {
                size = this.f1554b.size() - 1;
            } else {
                while (size >= 0) {
                    C0642to c0642to = (C0642to) arrayList.get(size);
                    if (c0642to.f1544a == -1 || c0642to.f1547d == 0) {
                        break;
                    }
                    size--;
                }
            }
        }
        if (size < 0) {
            return null;
        }
        return (C0642to) arrayList.get(size);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX INFO: renamed from: g */
    public final void m1722g() {
        int i = this.f1555c;
        if (i >= 0) {
            boolean z = this.f1556d;
            ArrayList arrayList = this.f1554b;
            if (!z ? i >= arrayList.size() : i >= arrayList.size() - 1) {
                if (mo1697e(1) == -1) {
                    throw new IllegalStateException("cannot consume EOF");
                }
            }
        } else if (mo1697e(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (m1726k(this.f1555c + 1)) {
            this.f1555c = m1724i(this.f1555c + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public final int m1723h(int i) {
        C0642to c0642toM1339n;
        int i2;
        ?? r10;
        ?? r15;
        int iM1224n;
        boolean z;
        int i3 = 0;
        if (this.f1556d) {
            return 0;
        }
        int i4 = 0;
        while (i4 < i) {
            C0792zc c0792zc = this.f1553a;
            C0619ss c0619ss = c0792zc.f509f;
            if (c0619ss == 0) {
                throw new IllegalStateException("nextToken requires a non-null input stream.");
            }
            while (true) {
                boolean z2 = c0792zc.f516m;
                C0372jo c0372jo = c0792zc.f511h;
                char c = 65535;
                if (z2) {
                    AbstractC0414lc abstractC0414lc = c0792zc.f1571r;
                    int i5 = ((C0270fu) abstractC0414lc).f841d;
                    int i6 = ((C0270fu) abstractC0414lc).f840c;
                    int i7 = c0619ss.f1514b;
                    c0642toM1339n = c0372jo.m1339n(c0792zc.f510g, -1, null, 0, i7, i7 - 1, i6, i5);
                    c0792zc.f512i = c0642toM1339n;
                    i2 = -1;
                    r10 = 1;
                    break;
                }
                c0792zc.f512i = null;
                c0792zc.f517n = i3;
                c0792zc.f513j = c0619ss.f1514b;
                C0270fu c0270fu = (C0270fu) c0792zc.f1571r;
                c0792zc.f515l = c0270fu.f841d;
                c0792zc.f514k = c0270fu.f840c;
                while (true) {
                    c0792zc.f518o = i3;
                    try {
                        iM1224n = ((C0270fu) c0792zc.f1571r).m1224n(c0619ss, c0792zc.f520u);
                        i2 = -1;
                        r15 = 1;
                    } catch (C0663ui e) {
                        int i8 = c0792zc.f513j;
                        C0619ss c0619ss2 = c0792zc.f509f;
                        String strM1698f = c0619ss2.m1698f(C0145bd.m1022d(i8, c0619ss2.f1514b));
                        StringBuilder sb = new StringBuilder("token recognition error at: '");
                        StringBuilder sb2 = new StringBuilder();
                        char[] charArray = strM1698f.toCharArray();
                        int length = charArray.length;
                        int i9 = 0;
                        while (i9 < length) {
                            char c2 = charArray[i9];
                            String strValueOf = String.valueOf(c2);
                            if (c2 == c) {
                                strValueOf = "<EOF>";
                            } else if (c2 == '\r') {
                                strValueOf = "\\r";
                            } else if (c2 == '\t') {
                                strValueOf = "\\t";
                            } else if (c2 == '\n') {
                                strValueOf = "\\n";
                            }
                            sb2.append(strValueOf);
                            i9++;
                            c = 65535;
                        }
                        sb.append(sb2.toString());
                        sb.append("'");
                        String string = sb.toString();
                        C0764yb c0764yb = c0792zc.f1570q;
                        if (c0764yb == null) {
                            throw new NullPointerException("delegates");
                        }
                        int i10 = c0792zc.f514k;
                        int i11 = c0792zc.f515l;
                        Iterator it = c0764yb.iterator();
                        while (it.hasNext()) {
                            ((C0718wj) it.next()).m1802e(c0792zc, null, i10, i11, string, e);
                            i11 = i11;
                            i10 = i10;
                        }
                        r15 = 1;
                        i2 = -1;
                        if (c0619ss.mo1697e(1) != -1) {
                            ((C0270fu) c0792zc.f1571r).m1222l(c0619ss);
                        }
                        iM1224n = -3;
                    }
                    if (c0619ss.mo1697e(r15) == i2) {
                        c0792zc.f516m = r15;
                    }
                    if (c0792zc.f518o == 0) {
                        c0792zc.f518o = iM1224n;
                    }
                    int i12 = c0792zc.f518o;
                    if (i12 == -3) {
                        break;
                    }
                    if (i12 != -2) {
                        if (c0792zc.f512i == null) {
                            z = true;
                            c0792zc.f512i = c0372jo.m1339n(c0792zc.f510g, i12, null, c0792zc.f517n, c0792zc.f513j, c0619ss.f1514b - 1, c0792zc.f514k, c0792zc.f515l);
                        } else {
                            z = true;
                        }
                        c0642toM1339n = c0792zc.f512i;
                        r10 = z;
                        break;
                    }
                    i3 = 0;
                    c = 65535;
                }
                i3 = 0;
            }
            boolean z3 = c0642toM1339n instanceof C0642to;
            ArrayList arrayList = this.f1554b;
            if (z3) {
                c0642toM1339n.f1550g = arrayList.size();
            }
            arrayList.add(c0642toM1339n);
            if (c0642toM1339n.f1544a == i2) {
                this.f1556d = r10;
                return i4 + r10;
            }
            i4++;
            i3 = 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final int m1724i(int i) {
        m1726k(i);
        if (i >= this.f1554b.size()) {
            return this.f1554b.size() - 1;
        }
        ArrayList arrayList = this.f1554b;
        Object obj = arrayList.get(i);
        while (true) {
            C0642to c0642to = (C0642to) obj;
            if (c0642to.f1547d == 0 || c0642to.f1544a == -1) {
                return i;
            }
            i++;
            m1726k(i);
            obj = arrayList.get(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1725j(int i) {
        if (this.f1555c == -1) {
            m1726k(0);
            this.f1555c = m1724i(0);
        }
        this.f1555c = m1724i(i);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1726k(int i) {
        int size = (i - this.f1554b.size()) + 1;
        return size <= 0 || m1723h(size) >= size;
    }
}
