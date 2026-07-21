package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p020W.C1013a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p028d0.C1074D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.c0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1059r implements Cloneable {

    /* JADX INFO: renamed from: e */
    static final List<AbstractC1059r> f2599e = Collections.emptyList();

    /* JADX INFO: renamed from: c */
    AbstractC1059r f2600c;

    /* JADX INFO: renamed from: d */
    int f2601d;

    protected AbstractC1059r() {
    }

    /* JADX INFO: renamed from: B */
    private void m2748B(int i) {
        List<AbstractC1059r> listMo2718n = mo2718n();
        while (i < listMo2718n.size()) {
            listMo2718n.get(i).f2601d = i;
            i++;
        }
    }

    /* JADX INFO: renamed from: A */
    public final AbstractC1059r m2749A() {
        return this.f2600c;
    }

    /* JADX INFO: renamed from: C */
    public final void m2750C() {
        C0966a.m2376k(this.f2600c);
        this.f2600c.mo2740D(this);
    }

    /* JADX INFO: renamed from: D */
    protected void mo2740D(AbstractC1059r abstractC1059r) {
        C0966a.m2371f(abstractC1059r.f2600c == this);
        int i = abstractC1059r.f2601d;
        mo2718n().remove(i);
        m2748B(i);
        abstractC1059r.f2600c = null;
    }

    /* JADX INFO: renamed from: E */
    public final void m2751E(AbstractC1059r abstractC1059r) {
        C0966a.m2376k(this.f2600c);
        AbstractC1059r abstractC1059r2 = this.f2600c;
        abstractC1059r2.getClass();
        C0966a.m2371f(this.f2600c == abstractC1059r2);
        AbstractC1059r abstractC1059r3 = abstractC1059r.f2600c;
        if (abstractC1059r3 != null) {
            abstractC1059r3.mo2740D(abstractC1059r);
        }
        int i = this.f2601d;
        abstractC1059r2.mo2718n().set(i, abstractC1059r);
        abstractC1059r.f2600c = abstractC1059r2;
        abstractC1059r.f2601d = i;
        this.f2600c = null;
    }

    /* JADX INFO: renamed from: F */
    public AbstractC1059r mo2689F() {
        while (true) {
            AbstractC1059r abstractC1059r = this.f2600c;
            if (abstractC1059r == null) {
                return this;
            }
            this = abstractC1059r;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2752G(String str) {
        mo2715l(str);
    }

    /* JADX INFO: renamed from: H */
    public final int m2753H() {
        return this.f2601d;
    }

    /* JADX INFO: renamed from: a */
    public String mo2745a(String str) {
        C0966a.m2374i(str);
        String externalForm = "";
        if (mo2720p() && mo2705d().m2648m(str)) {
            String strMo2707e = mo2707e();
            String strM2646k = mo2705d().m2646k(str);
            int i = C1034b.f2516d;
            try {
                try {
                    externalForm = C1034b.m2602h(new URL(strMo2707e), strM2646k).toExternalForm();
                } catch (MalformedURLException e) {
                    externalForm = new URL(strM2646k).toExternalForm();
                }
            } catch (MalformedURLException e2) {
            }
        }
        return externalForm;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1059r mo2746b(String str, String str2) {
        C1060s.m2763a(this).getClass();
        mo2705d().m2654u(C1074D.f2655c.m2803a(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String mo2747c(String str) {
        C0966a.m2376k(str);
        if (!mo2720p()) {
            return "";
        }
        String strM2646k = mo2705d().m2646k(str);
        if (strM2646k.length() <= 0) {
            return str.startsWith("abs:") ? mo2745a(str.substring(4)) : "";
        }
        return strM2646k;
    }

    /* JADX INFO: renamed from: d */
    public abstract C1044c mo2705d();

    /* JADX INFO: renamed from: e */
    public abstract String mo2707e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:2: B:20:0x0052->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final AbstractC1059r m2754f(AbstractC1059r abstractC1059r) {
        int i;
        AbstractC1059r abstractC1059r2;
        AbstractC1059r abstractC1059r3;
        boolean z;
        C0966a.m2376k(this.f2600c);
        AbstractC1059r abstractC1059r4 = this.f2600c;
        int i2 = this.f2601d;
        AbstractC1059r[] abstractC1059rArr = {abstractC1059r};
        abstractC1059r4.getClass();
        List<AbstractC1059r> listMo2718n = abstractC1059r4.mo2718n();
        AbstractC1059r abstractC1059rMo2723z = abstractC1059rArr[0].mo2723z();
        if (abstractC1059rMo2723z == null || abstractC1059rMo2723z.mo2661h() != 1) {
            for (i = 0; i < 1; i++) {
                if (abstractC1059rArr[i] != null) {
                    throw new IllegalArgumentException("Array must not contain any null objects");
                }
            }
            for (int i3 = 0; i3 < 1; i3++) {
                abstractC1059r2 = abstractC1059rArr[i3];
                abstractC1059r2.getClass();
                abstractC1059r3 = abstractC1059r2.f2600c;
                if (abstractC1059r3 != null) {
                    abstractC1059r3.mo2740D(abstractC1059r2);
                }
                abstractC1059r2.f2600c = abstractC1059r4;
            }
            listMo2718n.addAll(i2, Arrays.asList(abstractC1059rArr));
        } else {
            List<AbstractC1059r> listMo2718n2 = abstractC1059rMo2723z.mo2718n();
            int i4 = 1;
            while (true) {
                int i5 = i4 - 1;
                if (i4 <= 0) {
                    z = true;
                    break;
                }
                if (abstractC1059rArr[i5] != listMo2718n2.get(i5)) {
                    z = false;
                    break;
                }
                i4 = i5;
            }
            if (z) {
                abstractC1059rMo2723z.mo2662m();
                listMo2718n.addAll(i2, Arrays.asList(abstractC1059rArr));
                int i6 = 1;
                while (true) {
                    int i7 = i6 - 1;
                    if (i6 <= 0) {
                        break;
                    }
                    abstractC1059rArr[i7].f2600c = abstractC1059r4;
                    i6 = i7;
                }
            } else {
                while (i < 1) {
                    if (abstractC1059rArr[i] != null) {
                        throw new IllegalArgumentException("Array must not contain any null objects");
                    }
                }
                while (i3 < 1) {
                    abstractC1059r2 = abstractC1059rArr[i3];
                    abstractC1059r2.getClass();
                    abstractC1059r3 = abstractC1059r2.f2600c;
                    if (abstractC1059r3 != null) {
                        abstractC1059r3.mo2740D(abstractC1059r2);
                    }
                    abstractC1059r2.f2600c = abstractC1059r4;
                }
                listMo2718n.addAll(i2, Arrays.asList(abstractC1059rArr));
            }
        }
        abstractC1059r4.m2748B(i2);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC1059r m2755g(int i) {
        return mo2718n().get(i);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo2661h();

    /* JADX INFO: renamed from: i */
    public final List<AbstractC1059r> m2756i() {
        if (mo2661h() == 0) {
            return f2599e;
        }
        List<AbstractC1059r> listMo2718n = mo2718n();
        ArrayList arrayList = new ArrayList(listMo2718n.size());
        arrayList.addAll(listMo2718n);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* JADX INFO: renamed from: j */
    public AbstractC1059r mo2657j() {
        AbstractC1059r abstractC1059rMo2713k = mo2713k(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC1059rMo2713k);
        while (!linkedList.isEmpty()) {
            AbstractC1059r abstractC1059r = (AbstractC1059r) linkedList.remove();
            int iMo2661h = abstractC1059r.mo2661h();
            for (int i = 0; i < iMo2661h; i++) {
                List<AbstractC1059r> listMo2718n = abstractC1059r.mo2718n();
                AbstractC1059r abstractC1059rMo2713k2 = listMo2718n.get(i).mo2713k(abstractC1059r);
                listMo2718n.set(i, abstractC1059rMo2713k2);
                linkedList.add(abstractC1059rMo2713k2);
            }
        }
        return abstractC1059rMo2713k;
    }

    /* JADX INFO: renamed from: k */
    protected AbstractC1059r mo2713k(AbstractC1059r abstractC1059r) {
        try {
            AbstractC1059r abstractC1059r2 = (AbstractC1059r) super.clone();
            abstractC1059r2.f2600c = abstractC1059r;
            abstractC1059r2.f2601d = abstractC1059r == null ? 0 : this.f2601d;
            return abstractC1059r2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: l */
    protected abstract void mo2715l(String str);

    /* JADX INFO: renamed from: m */
    public abstract AbstractC1059r mo2662m();

    /* JADX INFO: renamed from: n */
    protected abstract List<AbstractC1059r> mo2718n();

    /* JADX INFO: renamed from: o */
    public final boolean m2757o(String str) {
        C0966a.m2376k(str);
        if (!mo2720p()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo2705d().m2648m(strSubstring) && !mo2745a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo2705d().m2648m(str);
    }

    /* JADX INFO: renamed from: p */
    protected abstract boolean mo2720p();

    /* JADX INFO: renamed from: q */
    public final boolean m2758q() {
        return this.f2600c != null;
    }

    /* JADX INFO: renamed from: r */
    protected final void m2759r(Appendable appendable, int i, C1048g c1048g) {
        appendable.append('\n').append(C1034b.m2600f(c1048g.m2666d() * i));
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC1059r m2760s() {
        AbstractC1059r abstractC1059r = this.f2600c;
        if (abstractC1059r == null) {
            return null;
        }
        List<AbstractC1059r> listMo2718n = abstractC1059r.mo2718n();
        int i = this.f2601d + 1;
        if (listMo2718n.size() > i) {
            return listMo2718n.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public abstract String mo2658t();

    public String toString() {
        return mo2675u();
    }

    /* JADX INFO: renamed from: u */
    public String mo2675u() {
        StringBuilder sbM2595a = C1034b.m2595a();
        m2761v(sbM2595a);
        return C1034b.m2601g(sbM2595a);
    }

    /* JADX INFO: renamed from: v */
    protected final void m2761v(Appendable appendable) {
        C1049h c1049hM2762y = m2762y();
        if (c1049hM2762y == null) {
            c1049hM2762y = new C1049h();
        }
        C1013a.m2550c(new C1058q(appendable, c1049hM2762y.m2673s0()), this);
    }

    /* JADX INFO: renamed from: w */
    abstract void mo2659w(Appendable appendable, int i, C1048g c1048g);

    /* JADX INFO: renamed from: x */
    abstract void mo2660x(Appendable appendable, int i, C1048g c1048g);

    /* JADX INFO: renamed from: y */
    public final C1049h m2762y() {
        AbstractC1059r abstractC1059rMo2689F = mo2689F();
        if (abstractC1059rMo2689F instanceof C1049h) {
            return (C1049h) abstractC1059rMo2689F;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public AbstractC1059r mo2723z() {
        return this.f2600c;
    }
}
