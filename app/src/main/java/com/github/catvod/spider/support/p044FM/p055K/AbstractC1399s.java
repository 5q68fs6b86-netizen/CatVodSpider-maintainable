package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p053I.C1378d;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1399s implements Cloneable {

    /* JADX INFO: renamed from: c */
    static final List<AbstractC1399s> f3223c = Collections.emptyList();

    /* JADX INFO: renamed from: a */
    @Nullable
    AbstractC1399s f3224a;

    /* JADX INFO: renamed from: b */
    int f3225b;

    protected AbstractC1399s() {
    }

    /* JADX INFO: renamed from: A */
    private void m3512A(int i) {
        int iMo3411g = mo3411g();
        if (iMo3411g == 0) {
            return;
        }
        List<AbstractC1399s> listMo3475m = mo3475m();
        while (i < iMo3411g) {
            listMo3475m.get(i).f3225b = i;
            i++;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m3513B() {
        C1377c.m3360g(this.f3224a);
        this.f3224a.mo3504C(this);
    }

    /* JADX INFO: renamed from: C */
    protected void mo3504C(AbstractC1399s abstractC1399s) {
        C1377c.m3356c(abstractC1399s.f3224a == this);
        int i = abstractC1399s.f3225b;
        mo3475m().remove(i);
        m3512A(i);
        abstractC1399s.f3224a = null;
    }

    /* JADX INFO: renamed from: D */
    public final void m3514D(AbstractC1399s abstractC1399s) {
        C1377c.m3360g(this.f3224a);
        AbstractC1399s abstractC1399s2 = this.f3224a;
        abstractC1399s2.getClass();
        C1377c.m3356c(this.f3224a == abstractC1399s2);
        AbstractC1399s abstractC1399s3 = abstractC1399s.f3224a;
        if (abstractC1399s3 != null) {
            abstractC1399s3.mo3504C(abstractC1399s);
        }
        int i = this.f3225b;
        abstractC1399s2.mo3475m().set(i, abstractC1399s);
        abstractC1399s.f3224a = abstractC1399s2;
        abstractC1399s.f3225b = i;
        this.f3224a = null;
    }

    /* JADX INFO: renamed from: E */
    public AbstractC1399s mo3447E() {
        AbstractC1399s abstractC1399s = this;
        while (true) {
            AbstractC1399s abstractC1399s2 = abstractC1399s.f3224a;
            if (abstractC1399s2 == null) {
                return abstractC1399s;
            }
            abstractC1399s = abstractC1399s2;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3515F(String str) {
        mo3472k(str);
    }

    /* JADX INFO: renamed from: G */
    public final int m3516G() {
        return this.f3225b;
    }

    /* JADX INFO: renamed from: a */
    public String mo3510a(String str) {
        C1377c.m3358e(str);
        return (mo3477o() && mo3463d().m3395o(str)) ? C1380b.m3370i(mo3465e(), mo3463d().m3393m(str)) : "";
    }

    /* JADX INFO: renamed from: b */
    protected final void m3517b(int i, AbstractC1399s... abstractC1399sArr) {
        boolean z;
        C1377c.m3360g(abstractC1399sArr);
        if (abstractC1399sArr.length == 0) {
            return;
        }
        List<AbstractC1399s> listMo3475m = mo3475m();
        AbstractC1399s abstractC1399sMo3487y = abstractC1399sArr[0].mo3487y();
        if (abstractC1399sMo3487y != null && abstractC1399sMo3487y.mo3411g() == abstractC1399sArr.length) {
            List<AbstractC1399s> listMo3475m2 = abstractC1399sMo3487y.mo3475m();
            int length = abstractC1399sArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else {
                    if (abstractC1399sArr[i2] != listMo3475m2.get(i2)) {
                        z = false;
                        break;
                    }
                    length = i2;
                }
            }
            if (z) {
                boolean z2 = mo3411g() == 0;
                abstractC1399sMo3487y.mo3412l();
                listMo3475m.addAll(i, Arrays.asList(abstractC1399sArr));
                int length2 = abstractC1399sArr.length;
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    abstractC1399sArr[i3].f3224a = this;
                    length2 = i3;
                }
                if (z2 && abstractC1399sArr[0].f3225b == 0) {
                    return;
                }
                m3512A(i);
                return;
            }
        }
        for (AbstractC1399s abstractC1399s : abstractC1399sArr) {
            if (abstractC1399s == null) {
                throw new C1378d("Array must not contain any null objects");
            }
        }
        for (AbstractC1399s abstractC1399s2 : abstractC1399sArr) {
            abstractC1399s2.getClass();
            AbstractC1399s abstractC1399s3 = abstractC1399s2.f3224a;
            if (abstractC1399s3 != null) {
                abstractC1399s3.mo3504C(abstractC1399s2);
            }
            abstractC1399s2.f3224a = this;
        }
        listMo3475m.addAll(i, Arrays.asList(abstractC1399sArr));
        m3512A(i);
    }

    /* JADX INFO: renamed from: c */
    public String mo3511c(String str) {
        C1377c.m3360g(str);
        if (!mo3477o()) {
            return "";
        }
        String strM3393m = mo3463d().m3393m(str);
        if (strM3393m.length() > 0) {
            return strM3393m;
        }
        return str.startsWith("abs:") ? mo3510a(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: d */
    public abstract C1383c mo3463d();

    /* JADX INFO: renamed from: e */
    public abstract String mo3465e();

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1399s m3518f(int i) {
        return mo3475m().get(i);
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo3411g();

    /* JADX INFO: renamed from: h */
    public final List<AbstractC1399s> m3519h() {
        if (mo3411g() == 0) {
            return f3223c;
        }
        List<AbstractC1399s> listMo3475m = mo3475m();
        ArrayList arrayList = new ArrayList(listMo3475m.size());
        arrayList.addAll(listMo3475m);
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // 
    /* JADX INFO: renamed from: i */
    public AbstractC1399s mo3404i() {
        AbstractC1399s abstractC1399sMo3470j = mo3470j(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC1399sMo3470j);
        while (!linkedList.isEmpty()) {
            AbstractC1399s abstractC1399s = (AbstractC1399s) linkedList.remove();
            int iMo3411g = abstractC1399s.mo3411g();
            for (int i = 0; i < iMo3411g; i++) {
                List<AbstractC1399s> listMo3475m = abstractC1399s.mo3475m();
                AbstractC1399s abstractC1399sMo3470j2 = listMo3475m.get(i).mo3470j(abstractC1399s);
                listMo3475m.set(i, abstractC1399sMo3470j2);
                linkedList.add(abstractC1399sMo3470j2);
            }
        }
        return abstractC1399sMo3470j;
    }

    /* JADX INFO: renamed from: j */
    protected AbstractC1399s mo3470j(@Nullable AbstractC1399s abstractC1399s) {
        C1388h c1388hM3525x;
        try {
            AbstractC1399s abstractC1399s2 = (AbstractC1399s) super.clone();
            abstractC1399s2.f3224a = abstractC1399s;
            abstractC1399s2.f3225b = abstractC1399s == null ? 0 : this.f3225b;
            if (abstractC1399s == null && !(this instanceof C1388h) && (c1388hM3525x = m3525x()) != null) {
                C1388h c1388hM3429F0 = c1388hM3525x.m3429F0();
                abstractC1399s2.f3224a = c1388hM3429F0;
                c1388hM3429F0.mo3475m().add(abstractC1399s2);
            }
            return abstractC1399s2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: k */
    protected abstract void mo3472k(String str);

    /* JADX INFO: renamed from: l */
    public abstract AbstractC1399s mo3412l();

    /* JADX INFO: renamed from: m */
    protected abstract List<AbstractC1399s> mo3475m();

    /* JADX INFO: renamed from: n */
    public final boolean m3520n(String str) {
        C1377c.m3360g(str);
        if (!mo3477o()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo3463d().m3395o(strSubstring) && !mo3510a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo3463d().m3395o(str);
    }

    /* JADX INFO: renamed from: o */
    protected abstract boolean mo3477o();

    /* JADX INFO: renamed from: p */
    public final boolean m3521p() {
        return this.f3224a != null;
    }

    /* JADX INFO: renamed from: q */
    protected final void m3522q(Appendable appendable, int i, C1387g c1387g) {
        appendable.append('\n').append(C1380b.m3368g(c1387g.m3417e() * i, c1387g.m3418f()));
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final AbstractC1399s m3523r() {
        AbstractC1399s abstractC1399s = this.f3224a;
        if (abstractC1399s == null) {
            return null;
        }
        List<AbstractC1399s> listMo3475m = abstractC1399s.mo3475m();
        int i = this.f3225b + 1;
        if (listMo3475m.size() > i) {
            return listMo3475m.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public abstract String mo3405s();

    /* JADX INFO: renamed from: t */
    public String mo3431t() {
        StringBuilder sbM3363b = C1380b.m3363b();
        m3524u(sbM3363b);
        return C1380b.m3369h(sbM3363b);
    }

    public String toString() {
        return mo3431t();
    }

    /* JADX INFO: renamed from: u */
    protected final void m3524u(Appendable appendable) {
        C1388h c1388hM3525x = m3525x();
        if (c1388hM3525x == null) {
            c1388hM3525x = new C1388h("");
        }
        C1317a.m3303d(new C1398r(appendable, c1388hM3525x.m3424A0()), this);
    }

    /* JADX INFO: renamed from: v */
    abstract void mo3406v(Appendable appendable, int i, C1387g c1387g);

    /* JADX INFO: renamed from: w */
    abstract void mo3407w(Appendable appendable, int i, C1387g c1387g);

    @Nullable
    /* JADX INFO: renamed from: x */
    public final C1388h m3525x() {
        AbstractC1399s abstractC1399sMo3447E = mo3447E();
        if (abstractC1399sMo3447E instanceof C1388h) {
            return (C1388h) abstractC1399sMo3447E;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public AbstractC1399s mo3487y() {
        return this.f3224a;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final AbstractC1399s m3526z() {
        return this.f3224a;
    }
}
