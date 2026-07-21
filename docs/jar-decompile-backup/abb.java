package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final class abb implements InterfaceC0253fd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f471a;

    /* JADX INFO: renamed from: d */
    public final Object f472d;

    /* JADX INFO: renamed from: e */
    public final Object f473e;

    public abb(C0606sf c0606sf, String str) {
        this.f471a = 2;
        c0606sf.getClass();
        this.f472d = c0606sf.m1673al();
        this.f473e = str;
    }

    public abb(C0606sf c0606sf, String str, Object[] objArr) {
        this.f471a = 2;
        c0606sf.getClass();
        this.f472d = c0606sf.m1673al();
        this.f473e = String.format(str, objArr);
    }

    public /* synthetic */ abb(Object obj, Object obj2, int i) {
        this.f471a = i;
        this.f472d = obj;
        this.f473e = obj2;
    }

    public abb(Supplier supplier) {
        this.f471a = 3;
        this.f473e = supplier;
        this.f472d = ThreadLocal.withInitial(new C0605se(4));
    }

    /* JADX INFO: renamed from: f */
    public static String m907f(abf abfVar) {
        int i = abfVar.f501a;
        StringBuilder sb = new StringBuilder();
        sb.append(abfVar.f504d ? ":" : "");
        sb.append("s");
        sb.append(i);
        sb.append(abfVar.f507g ? "^" : "");
        String string = sb.toString();
        if (!abfVar.f504d) {
            return string;
        }
        if (abfVar.f508h != null) {
            return string + "=>" + Arrays.toString(abfVar.f508h);
        }
        return string + "=>" + abfVar.f505e;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0253fd
    /* JADX INFO: renamed from: b */
    public void mo908b(AbstractC0272fw abstractC0272fw, int i) {
        if (abstractC0272fw.mo924s().equals("#text")) {
            return;
        }
        try {
            abstractC0272fw.mo926v((StringBuilder) this.f472d, i, (C0674ut) this.f473e);
        } catch (IOException e) {
            throw new C0649tv(e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0253fd
    /* JADX INFO: renamed from: c */
    public void mo909c(AbstractC0272fw abstractC0272fw, int i) {
        try {
            abstractC0272fw.mo925u((StringBuilder) this.f472d, i, (C0674ut) this.f473e);
        } catch (IOException e) {
            throw new C0649tv(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public Object m910g() {
        Stack stackM911h = m911h();
        return !stackM911h.isEmpty() ? stackM911h.pop() : ((Supplier) this.f473e).get();
    }

    /* JADX INFO: renamed from: h */
    public Stack m911h() {
        ThreadLocal threadLocal = (ThreadLocal) this.f472d;
        Stack stack = (Stack) ((SoftReference) threadLocal.get()).get();
        if (stack != null) {
            return stack;
        }
        Stack stack2 = new Stack();
        threadLocal.set(new SoftReference(stack2));
        return stack2;
    }

    /* JADX INFO: renamed from: i */
    public void m912i(Object obj) {
        Stack stackM911h = m911h();
        if (stackM911h.size() < 12) {
            stackM911h.push(obj);
        }
    }

    public String toString() {
        switch (this.f471a) {
            case 0:
                if (((C0803zn) this.f472d).f1909b == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                ArrayList<abf> arrayList = new ArrayList(((C0803zn) this.f472d).f1908a.keySet());
                Collections.sort(arrayList, new C0802zm(0));
                for (abf abfVar : arrayList) {
                    abf[] abfVarArr = abfVar.f503c;
                    int length = abfVarArr != null ? abfVarArr.length : 0;
                    for (int i = 0; i < length; i++) {
                        abf abfVar2 = abfVar.f503c[i];
                        if (abfVar2 != null && abfVar2.f501a != Integer.MAX_VALUE) {
                            sb.append(m907f(abfVar));
                            String strM1296f = ((C0317hn) this.f473e).m1296f(i - 1);
                            sb.append("-");
                            sb.append(strM1296f);
                            sb.append("->");
                            sb.append(m907f(abfVar2));
                            sb.append('\n');
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() == 0) {
                    return null;
                }
                return string;
            case 1:
            default:
                return super.toString();
            case 2:
                return "<" + ((String) this.f472d) + ">: " + ((String) this.f473e);
        }
    }
}
