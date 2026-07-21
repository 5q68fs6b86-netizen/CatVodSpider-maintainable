package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p053I.C1378d;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p056L.C1412E;
import com.github.catvod.spider.support.p044FM.p056L.C1416G;
import com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N;
import com.github.catvod.spider.support.p044FM.p057M.C1534P;
import com.github.catvod.spider.support.p044FM.p057M.C1536S;
import com.github.catvod.spider.support.p044FM.p057M.C1547c;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p057M.C1552h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p055K.m */
/* JADX INFO: loaded from: classes.dex */
public class C1393m extends AbstractC1399s {

    /* JADX INFO: renamed from: h */
    private static final List<C1393m> f3203h = Collections.emptyList();

    /* JADX INFO: renamed from: i */
    private static final String f3204i;

    /* JADX INFO: renamed from: d */
    private C1416G f3205d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private WeakReference<List<C1393m>> f3206e;

    /* JADX INFO: renamed from: f */
    List<AbstractC1399s> f3207f;

    /* JADX INFO: renamed from: g */
    @Nullable
    C1383c f3208g;

    static {
        Pattern.compile("\\s+");
        f3204i = "/baseUri";
    }

    public C1393m(C1416G c1416g, @Nullable String str, @Nullable C1383c c1383c) {
        C1377c.m3360g(c1416g);
        this.f3207f = AbstractC1399s.f3223c;
        this.f3208g = c1383c;
        this.f3205d = c1416g;
        if (str != null) {
            mo3472k(str);
        }
    }

    public C1393m(String str) {
        this(C1416G.m3552m(str, C1412E.f3295d), "", null);
    }

    /* JADX INFO: renamed from: K */
    private static void m3442K(C1393m c1393m, C1551g c1551g) {
        C1393m c1393m2 = (C1393m) c1393m.f3224a;
        if (c1393m2 == null || c1393m2.m3483t0().equals("#root")) {
            return;
        }
        c1551g.add(c1393m2);
        m3442K(c1393m2, c1551g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static void m3443O(StringBuilder sb, C1402v c1402v) {
        String strM3509I = c1402v.m3509I();
        if (m3446m0(c1402v.f3224a) || (c1402v instanceof C1384d)) {
            sb.append(strM3509I);
        } else {
            C1380b.m3362a(sb, strM3509I, C1402v.m3528N(sb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static void m3444Q(AbstractC1399s abstractC1399s, StringBuilder sb) {
        if (abstractC1399s instanceof C1402v) {
            sb.append(((C1402v) abstractC1399s).m3509I());
        } else if ((abstractC1399s instanceof C1393m) && ((C1393m) abstractC1399s).f3205d.m3561j().equals("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: e0 */
    private static <E extends C1393m> int m3445e0(C1393m c1393m, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == c1393m) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m0 */
    static boolean m3446m0(@Nullable AbstractC1399s abstractC1399s) {
        if (abstractC1399s instanceof C1393m) {
            C1393m c1393m = (C1393m) abstractC1399s;
            int i = 0;
            while (!c1393m.f3205d.m3562k()) {
                c1393m = (C1393m) c1393m.f3224a;
                i++;
                if (i >= 6 || c1393m == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: E */
    public final AbstractC1399s mo3447E() {
        AbstractC1399s abstractC1399s = this;
        while (true) {
            AbstractC1399s abstractC1399s2 = abstractC1399s.f3224a;
            if (abstractC1399s2 == null) {
                return (C1393m) abstractC1399s;
            }
            abstractC1399s = abstractC1399s2;
        }
    }

    /* JADX INFO: renamed from: L */
    public final C1393m m3448L(AbstractC1399s abstractC1399s) {
        AbstractC1399s abstractC1399s2 = abstractC1399s.f3224a;
        if (abstractC1399s2 != null) {
            abstractC1399s2.mo3504C(abstractC1399s);
        }
        abstractC1399s.f3224a = this;
        mo3475m();
        this.f3207f.add(abstractC1399s);
        abstractC1399s.f3225b = this.f3207f.size() - 1;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public final C1393m m3449M(Collection<? extends AbstractC1399s> collection) {
        if (collection == null) {
            throw new C1378d("Children collection to be inserted must not be null.");
        }
        int iMo3411g = mo3411g();
        int i = (iMo3411g + 1) - 1;
        C1377c.m3357d(i >= 0 && i <= iMo3411g, "Insert position out of bounds.");
        m3517b(i, (AbstractC1399s[]) new ArrayList(collection).toArray(new AbstractC1399s[0]));
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final C1393m m3450N(String str) {
        C1393m c1393m = new C1393m(C1416G.m3552m(str, C1400t.m3527a(this).m3549f()), mo3465e(), null);
        m3448L(c1393m);
        return c1393m;
    }

    /* JADX INFO: renamed from: P */
    public final C1393m m3451P(String str) {
        C1377c.m3360g(str);
        m3448L(new C1402v(str));
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final C1393m m3452R(String str, String str2) {
        mo3463d().m3401x(C1400t.m3527a(this).m3549f().m3539b(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public final C1393m m3453S(AbstractC1399s abstractC1399s) {
        C1377c.m3360g(this.f3224a);
        this.f3224a.m3517b(this.f3225b, abstractC1399s);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public final C1393m m3454T() {
        return m3455U().get(0);
    }

    /* JADX INFO: renamed from: U */
    final List<C1393m> m3455U() {
        List<C1393m> list;
        if (mo3411g() == 0) {
            return f3203h;
        }
        WeakReference<List<C1393m>> weakReference = this.f3206e;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f3207f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC1399s abstractC1399s = this.f3207f.get(i);
            if (abstractC1399s instanceof C1393m) {
                arrayList.add((C1393m) abstractC1399s);
            }
        }
        this.f3206e = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public final C1551g m3456V() {
        return new C1551g(m3455U());
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C1393m mo3404i() {
        return (C1393m) super.mo3404i();
    }

    /* JADX INFO: renamed from: X */
    public final String m3457X() {
        String strM3509I;
        StringBuilder sbM3363b = C1380b.m3363b();
        for (AbstractC1399s abstractC1399s : this.f3207f) {
            if (abstractC1399s instanceof C1386f) {
                strM3509I = ((C1386f) abstractC1399s).m3509I();
            } else if (abstractC1399s instanceof C1385e) {
                strM3509I = ((C1385e) abstractC1399s).m3509I();
            } else if (abstractC1399s instanceof C1393m) {
                strM3509I = ((C1393m) abstractC1399s).m3457X();
            } else if (abstractC1399s instanceof C1384d) {
                strM3509I = ((C1384d) abstractC1399s).m3509I();
            }
            sbM3363b.append(strM3509I);
        }
        return C1380b.m3369h(sbM3363b);
    }

    /* JADX INFO: renamed from: Y */
    public final int m3458Y() {
        AbstractC1399s abstractC1399s = this.f3224a;
        if (((C1393m) abstractC1399s) == null) {
            return 0;
        }
        return m3445e0(this, ((C1393m) abstractC1399s).m3455U());
    }

    /* JADX INFO: renamed from: Z */
    public final C1551g m3459Z() {
        return C1547c.m3782a(new C1552h(), this);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m3460a0(String str) {
        C1383c c1383c = this.f3208g;
        if (c1383c == null) {
            return false;
        }
        String strM3393m = c1383c.m3393m("class");
        int length = strM3393m.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM3393m);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM3393m.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM3393m.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return strM3393m.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m3461b0() {
        for (AbstractC1399s abstractC1399s : this.f3207f) {
            if (abstractC1399s instanceof C1402v) {
                if (!((C1402v) abstractC1399s).m3530M()) {
                    return true;
                }
            } else if ((abstractC1399s instanceof C1393m) && ((C1393m) abstractC1399s).m3461b0()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final String m3462c0() {
        StringBuilder sbM3363b = C1380b.m3363b();
        int size = this.f3207f.size();
        for (int i = 0; i < size; i++) {
            this.f3207f.get(i).m3524u(sbM3363b);
        }
        String strM3369h = C1380b.m3369h(sbM3363b);
        C1388h c1388hM3525x = m3525x();
        if (c1388hM3525x == null) {
            c1388hM3525x = new C1388h("");
        }
        return c1388hM3525x.m3424A0().m3421i() ? strM3369h.trim() : strM3369h;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: d */
    public final C1383c mo3463d() {
        if (this.f3208g == null) {
            this.f3208g = new C1383c();
        }
        return this.f3208g;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m3464d0() {
        C1383c c1383c = this.f3208g;
        return c1383c != null ? c1383c.m3393m("id") : "";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: e */
    public final String mo3465e() {
        String str = f3204i;
        for (C1393m c1393m = this; c1393m != null; c1393m = (C1393m) c1393m.f3224a) {
            C1383c c1383c = c1393m.f3208g;
            if (c1383c != null) {
                if (c1383c.m3397q(str) != -1) {
                    return c1393m.f3208g.m3392l(str);
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m3466f0() {
        return this.f3205d.m3555c();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: g */
    public final int mo3411g() {
        return this.f3207f.size();
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public final C1393m m3467g0() {
        AbstractC1399s abstractC1399s = this.f3224a;
        if (abstractC1399s == null) {
            return null;
        }
        List<C1393m> listM3455U = ((C1393m) abstractC1399s).m3455U();
        int iM3445e0 = m3445e0(this, listM3455U) + 1;
        if (listM3455U.size() > iM3445e0) {
            return listM3455U.get(iM3445e0);
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    final void m3468h0() {
        this.f3206e = null;
    }

    /* JADX INFO: renamed from: i0 */
    public final String m3469i0() {
        return this.f3205d.m3561j();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: j */
    protected final AbstractC1399s mo3470j(@Nullable AbstractC1399s abstractC1399s) {
        C1393m c1393m = (C1393m) super.mo3470j(abstractC1399s);
        C1383c c1383c = this.f3208g;
        c1393m.f3208g = c1383c != null ? c1383c.clone() : null;
        C1392l c1392l = new C1392l(c1393m, this.f3207f.size());
        c1393m.f3207f = c1392l;
        c1392l.addAll(this.f3207f);
        return c1393m;
    }

    /* JADX INFO: renamed from: j0 */
    public final String m3471j0() {
        StringBuilder sbM3363b = C1380b.m3363b();
        for (int i = 0; i < mo3411g(); i++) {
            AbstractC1399s abstractC1399s = this.f3207f.get(i);
            if (abstractC1399s instanceof C1402v) {
                m3443O(sbM3363b, (C1402v) abstractC1399s);
            } else if ((abstractC1399s instanceof C1393m) && ((C1393m) abstractC1399s).f3205d.m3561j().equals("br") && !C1402v.m3528N(sbM3363b)) {
                sbM3363b.append(" ");
            }
        }
        return C1380b.m3369h(sbM3363b).trim();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: k */
    protected final void mo3472k(String str) {
        mo3463d().m3400w(f3204i, str);
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final C1393m m3473k0() {
        return (C1393m) this.f3224a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: l */
    public final AbstractC1399s mo3412l() {
        this.f3207f.clear();
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public final C1551g m3474l0() {
        C1551g c1551g = new C1551g();
        m3442K(this, c1551g);
        return c1551g;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: m */
    protected final List<AbstractC1399s> mo3475m() {
        if (this.f3207f == AbstractC1399s.f3223c) {
            this.f3207f = new C1392l(this, 4);
        }
        return this.f3207f;
    }

    @Nullable
    /* JADX INFO: renamed from: n0 */
    public final C1393m m3476n0() {
        List<C1393m> listM3455U;
        int iM3445e0;
        AbstractC1399s abstractC1399s = this.f3224a;
        if (abstractC1399s != null && (iM3445e0 = m3445e0(this, (listM3455U = ((C1393m) abstractC1399s).m3455U()))) > 0) {
            return listM3455U.get(iM3445e0 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: o */
    protected final boolean mo3477o() {
        return this.f3208g != null;
    }

    /* JADX INFO: renamed from: o0 */
    public final C1551g m3478o0(String str) {
        C1377c.m3358e(str);
        AbstractC1532N abstractC1532NM3777j = C1534P.m3777j(str);
        C1377c.m3360g(abstractC1532NM3777j);
        return C1547c.m3782a(abstractC1532NM3777j, this);
    }

    @Nullable
    /* JADX INFO: renamed from: p0 */
    public final C1393m m3479p0(String str) {
        return C1536S.m3779a(str, this);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX INFO: renamed from: q0 */
    final boolean m3480q0(C1387g c1387g) {
        boolean z;
        C1393m c1393m;
        C1393m c1393m2;
        if (c1387g.m3421i()) {
            if (this.f3205d.m3553a() || ((c1393m2 = (C1393m) this.f3224a) != null && c1393m2.f3205d.m3553a())) {
                if (this.f3205d.m3558f() && ((c1393m = (C1393m) this.f3224a) == null || c1393m.m3466f0())) {
                    AbstractC1399s abstractC1399s = this.f3224a;
                    AbstractC1399s abstractC1399s2 = null;
                    if (abstractC1399s != null && this.f3225b > 0) {
                        abstractC1399s2 = abstractC1399s.mo3475m().get(this.f3225b - 1);
                    }
                    if (abstractC1399s2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public final C1551g m3481r0() {
        AbstractC1399s abstractC1399s = this.f3224a;
        if (abstractC1399s == null) {
            return new C1551g(0);
        }
        List<C1393m> listM3455U = ((C1393m) abstractC1399s).m3455U();
        C1551g c1551g = new C1551g(listM3455U.size() - 1);
        for (C1393m c1393m : listM3455U) {
            if (c1393m != this) {
                c1551g.add(c1393m);
            }
        }
        return c1551g;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: s */
    public String mo3405s() {
        return this.f3205d.m3554b();
    }

    /* JADX INFO: renamed from: s0 */
    public final C1416G m3482s0() {
        return this.f3205d;
    }

    /* JADX INFO: renamed from: t0 */
    public final String m3483t0() {
        return this.f3205d.m3554b();
    }

    /* JADX INFO: renamed from: u0 */
    public C1393m mo3432u0(String str) {
        C1377c.m3360g(str);
        this.f3207f.clear();
        C1388h c1388hM3525x = m3525x();
        m3448L((c1388hM3525x == null || !c1388hM3525x.m3426C0().m3546b(m3469i0())) ? new C1402v(str) : new C1386f(str));
        return this;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: v */
    void mo3406v(Appendable appendable, int i, C1387g c1387g) throws IOException {
        if (m3480q0(c1387g) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            m3522q(appendable, i, c1387g);
        }
        appendable.append('<').append(m3483t0());
        C1383c c1383c = this.f3208g;
        if (c1383c != null) {
            c1383c.m3396p(appendable, c1387g);
        }
        if (this.f3207f.isEmpty() && this.f3205d.m3560i() && (c1387g.m3423k() != 1 || !this.f3205d.m3556d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final String m3484v0() {
        StringBuilder sbM3363b = C1380b.m3363b();
        C1317a.m3303d(new C1391k(sbM3363b), this);
        return C1380b.m3369h(sbM3363b).trim();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: w */
    void mo3407w(Appendable appendable, int i, C1387g c1387g) throws IOException {
        if (this.f3207f.isEmpty() && this.f3205d.m3560i()) {
            return;
        }
        if (c1387g.m3421i() && !this.f3207f.isEmpty() && this.f3205d.m3553a()) {
            m3522q(appendable, i, c1387g);
        }
        appendable.append("</").append(m3483t0()).append('>');
    }

    /* JADX INFO: renamed from: w0 */
    public final List<C1402v> m3485w0() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1399s abstractC1399s : this.f3207f) {
            if (abstractC1399s instanceof C1402v) {
                arrayList.add((C1402v) abstractC1399s);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: x0 */
    public final String m3486x0() {
        StringBuilder sbM3363b = C1380b.m3363b();
        int iMo3411g = mo3411g();
        for (int i = 0; i < iMo3411g; i++) {
            m3444Q(this.f3207f.get(i), sbM3363b);
        }
        return C1380b.m3369h(sbM3363b);
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    @Nullable
    /* JADX INFO: renamed from: y */
    public final AbstractC1399s mo3487y() {
        return (C1393m) this.f3224a;
    }
}
