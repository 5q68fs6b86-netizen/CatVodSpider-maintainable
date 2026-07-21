package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p041D.C1267b;
import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p042E.C1272d;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p102H.C2050f;
import com.github.catvod.spider.support.p103I.InterfaceC2062e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.G.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2041m implements Cloneable {

    /* JADX INFO: renamed from: c */
    static final List<AbstractC2041m> f4647c = Collections.emptyList();

    /* JADX INFO: renamed from: a */
    @Nullable
    AbstractC2041m f4648a;

    /* JADX INFO: renamed from: b */
    int f4649b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.G.m$a */
    private static class a implements InterfaceC2062e {

        /* JADX INFO: renamed from: a */
        private final Appendable f4650a;

        /* JADX INFO: renamed from: b */
        private final C2034f.a f4651b;

        a(Appendable appendable, C2034f.a aVar) {
            this.f4650a = appendable;
            this.f4651b = aVar;
            aVar.m4853f();
        }

        @Override // com.github.catvod.spider.support.p103I.InterfaceC2062e
        /* JADX INFO: renamed from: a */
        public final void mo4858a(AbstractC2041m abstractC2041m, int i) {
            if (abstractC2041m.mo4832t().equals("#text")) {
                return;
            }
            try {
                abstractC2041m.mo4834x(this.f4650a, i, this.f4651b);
            } catch (IOException e) {
                throw new C1267b(e);
            }
        }

        @Override // com.github.catvod.spider.support.p103I.InterfaceC2062e
        /* JADX INFO: renamed from: b */
        public final void mo4859b(AbstractC2041m abstractC2041m, int i) {
            try {
                abstractC2041m.mo4833w(this.f4650a, i, this.f4651b);
            } catch (IOException e) {
                throw new C1267b(e);
            }
        }
    }

    protected AbstractC2041m() {
    }

    /* JADX INFO: renamed from: B */
    private void m4930B(int i) {
        int iMo4835h = mo4835h();
        if (iMo4835h == 0) {
            return;
        }
        List<AbstractC2041m> listMo4895n = mo4895n();
        while (i < iMo4835h) {
            listMo4895n.get(i).f4649b = i;
            i++;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final AbstractC2041m m4931A() {
        return this.f4648a;
    }

    /* JADX INFO: renamed from: C */
    public final void m4932C() {
        C1271c.m3157g(this.f4648a);
        this.f4648a.mo4922D(this);
    }

    /* JADX INFO: renamed from: D */
    protected void mo4922D(AbstractC2041m abstractC2041m) {
        C1271c.m3153c(abstractC2041m.f4648a == this);
        int i = abstractC2041m.f4649b;
        mo4895n().remove(i);
        m4930B(i);
        abstractC2041m.f4648a = null;
    }

    /* JADX INFO: renamed from: E */
    public final void m4933E(AbstractC2041m abstractC2041m) {
        C1271c.m3157g(this.f4648a);
        AbstractC2041m abstractC2041m2 = this.f4648a;
        abstractC2041m2.getClass();
        C1271c.m3153c(this.f4648a == abstractC2041m2);
        AbstractC2041m abstractC2041m3 = abstractC2041m.f4648a;
        if (abstractC2041m3 != null) {
            abstractC2041m3.mo4922D(abstractC2041m);
        }
        int i = this.f4649b;
        abstractC2041m2.mo4895n().set(i, abstractC2041m);
        abstractC2041m.f4648a = abstractC2041m2;
        abstractC2041m.f4649b = i;
        this.f4648a = null;
    }

    /* JADX INFO: renamed from: F */
    public AbstractC2041m mo4868F() {
        AbstractC2041m abstractC2041m = this;
        while (true) {
            AbstractC2041m abstractC2041m2 = abstractC2041m.f4648a;
            if (abstractC2041m2 == null) {
                return abstractC2041m;
            }
            abstractC2041m = abstractC2041m2;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4934G(String str) {
        mo4893l(str);
    }

    /* JADX INFO: renamed from: H */
    public final int m4935H() {
        return this.f4649b;
    }

    /* JADX INFO: renamed from: a */
    public String mo4927a(String str) {
        C1271c.m3155e(str);
        return (mo4898p() && mo4883e().m4822o(str)) ? C1274b.m3178i(mo4885f(), mo4883e().m4820m(str)) : "";
    }

    /* JADX INFO: renamed from: b */
    protected final void m4936b(int i, AbstractC2041m... abstractC2041mArr) {
        boolean z;
        C1271c.m3157g(abstractC2041mArr);
        if (abstractC2041mArr.length == 0) {
            return;
        }
        List<AbstractC2041m> listMo4895n = mo4895n();
        AbstractC2041m abstractC2041mMo4905z = abstractC2041mArr[0].mo4905z();
        if (abstractC2041mMo4905z != null && abstractC2041mMo4905z.mo4835h() == abstractC2041mArr.length) {
            List<AbstractC2041m> listMo4895n2 = abstractC2041mMo4905z.mo4895n();
            int length = abstractC2041mArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else {
                    if (abstractC2041mArr[i2] != listMo4895n2.get(i2)) {
                        z = false;
                        break;
                    }
                    length = i2;
                }
            }
            if (z) {
                boolean z2 = mo4835h() == 0;
                abstractC2041mMo4905z.mo4836m();
                listMo4895n.addAll(i, Arrays.asList(abstractC2041mArr));
                int length2 = abstractC2041mArr.length;
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    abstractC2041mArr[i3].f4648a = this;
                    length2 = i3;
                }
                if (z2 && abstractC2041mArr[0].f4649b == 0) {
                    return;
                }
                m4930B(i);
                return;
            }
        }
        for (AbstractC2041m abstractC2041m : abstractC2041mArr) {
            if (abstractC2041m == null) {
                throw new C1272d("Array must not contain any null objects");
            }
        }
        for (AbstractC2041m abstractC2041m2 : abstractC2041mArr) {
            abstractC2041m2.getClass();
            AbstractC2041m abstractC2041m3 = abstractC2041m2.f4648a;
            if (abstractC2041m3 != null) {
                abstractC2041m3.mo4922D(abstractC2041m2);
            }
            abstractC2041m2.f4648a = this;
        }
        listMo4895n.addAll(i, Arrays.asList(abstractC2041mArr));
        m4930B(i);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC2041m mo4928c(String str, String str2) {
        C2042n.m4945a(this).getClass();
        mo4883e().m4828x(C2050f.f4752c.m5069b(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public String mo4929d(String str) {
        C1271c.m3157g(str);
        if (!mo4898p()) {
            return "";
        }
        String strM4820m = mo4883e().m4820m(str);
        if (strM4820m.length() > 0) {
            return strM4820m;
        }
        return str.startsWith("abs:") ? mo4927a(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: e */
    public abstract C2030b mo4883e();

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo4885f();

    /* JADX INFO: renamed from: g */
    public final AbstractC2041m m4937g(int i) {
        return mo4895n().get(i);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo4835h();

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final List<AbstractC2041m> m4938i() {
        if (mo4835h() == 0) {
            return f4647c;
        }
        List<AbstractC2041m> listMo4895n = mo4895n();
        ArrayList arrayList = new ArrayList(listMo4895n.size());
        arrayList.addAll(listMo4895n);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC2041m clone() {
        AbstractC2041m abstractC2041mMo4891k = mo4891k(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC2041mMo4891k);
        while (!linkedList.isEmpty()) {
            AbstractC2041m abstractC2041m = (AbstractC2041m) linkedList.remove();
            int iMo4835h = abstractC2041m.mo4835h();
            for (int i = 0; i < iMo4835h; i++) {
                List<AbstractC2041m> listMo4895n = abstractC2041m.mo4895n();
                AbstractC2041m abstractC2041mMo4891k2 = listMo4895n.get(i).mo4891k(abstractC2041m);
                listMo4895n.set(i, abstractC2041mMo4891k2);
                linkedList.add(abstractC2041mMo4891k2);
            }
        }
        return abstractC2041mMo4891k;
    }

    /* JADX INFO: renamed from: k */
    protected AbstractC2041m mo4891k(@Nullable AbstractC2041m abstractC2041m) {
        C2034f c2034fM4944y;
        try {
            AbstractC2041m abstractC2041m2 = (AbstractC2041m) super.clone();
            abstractC2041m2.f4648a = abstractC2041m;
            abstractC2041m2.f4649b = abstractC2041m == null ? 0 : this.f4649b;
            if (abstractC2041m == null && !(this instanceof C2034f) && (c2034fM4944y = m4944y()) != null) {
                C2034f c2034fM4840D0 = c2034fM4944y.m4840D0();
                abstractC2041m2.f4648a = c2034fM4840D0;
                c2034fM4840D0.mo4895n().add(abstractC2041m2);
            }
            return abstractC2041m2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: l */
    protected abstract void mo4893l(String str);

    /* JADX INFO: renamed from: m */
    public abstract AbstractC2041m mo4836m();

    /* JADX INFO: renamed from: n */
    protected abstract List<AbstractC2041m> mo4895n();

    /* JADX INFO: renamed from: o */
    public final boolean m4939o(String str) {
        C1271c.m3157g(str);
        if (!mo4898p()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo4883e().m4822o(strSubstring) && !mo4927a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo4883e().m4822o(str);
    }

    /* JADX INFO: renamed from: p */
    protected abstract boolean mo4898p();

    /* JADX INFO: renamed from: q */
    public final boolean m4940q() {
        return this.f4648a != null;
    }

    /* JADX INFO: renamed from: r */
    protected final void m4941r(Appendable appendable, int i, C2034f.a aVar) throws IOException {
        appendable.append('\n').append(C1274b.m3176g(aVar.m4851d() * i, aVar.m4852e()));
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final AbstractC2041m m4942s() {
        AbstractC2041m abstractC2041m = this.f4648a;
        if (abstractC2041m == null) {
            return null;
        }
        List<AbstractC2041m> listMo4895n = abstractC2041m.mo4895n();
        int i = this.f4649b + 1;
        if (listMo4895n.size() > i) {
            return listMo4895n.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public abstract String mo4832t();

    public String toString() {
        return mo4843u();
    }

    /* JADX INFO: renamed from: u */
    public String mo4843u() {
        StringBuilder sbM3171b = C1274b.m3171b();
        m4943v(sbM3171b);
        return C1274b.m3177h(sbM3171b);
    }

    /* JADX INFO: renamed from: v */
    protected final void m4943v(Appendable appendable) {
        C2034f c2034fM4944y = m4944y();
        if (c2034fM4944y == null) {
            c2034fM4944y = new C2034f("");
        }
        C1273a.m3167g(new a(appendable, c2034fM4944y.m4846y0()), this);
    }

    /* JADX INFO: renamed from: w */
    abstract void mo4833w(Appendable appendable, int i, C2034f.a aVar);

    /* JADX INFO: renamed from: x */
    abstract void mo4834x(Appendable appendable, int i, C2034f.a aVar);

    @Nullable
    /* JADX INFO: renamed from: y */
    public final C2034f m4944y() {
        AbstractC2041m abstractC2041mMo4868F = mo4868F();
        if (abstractC2041mMo4868F instanceof C2034f) {
            return (C2034f) abstractC2041mMo4868F;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public AbstractC2041m mo4905z() {
        return this.f4648a;
    }
}
