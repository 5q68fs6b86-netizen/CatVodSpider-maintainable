package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p042E.AbstractC1269a;
import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p042E.C1272d;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p102H.C2050f;
import com.github.catvod.spider.support.p102H.C2052h;
import com.github.catvod.spider.support.p103I.AbstractC2061d;
import com.github.catvod.spider.support.p103I.C2058a;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p103I.C2063f;
import com.github.catvod.spider.support.p103I.InterfaceC2062e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.G.i */
/* JADX INFO: loaded from: classes.dex */
public class C2037i extends AbstractC2041m {

    /* JADX INFO: renamed from: h */
    private static final List<C2037i> f4627h = Collections.emptyList();

    /* JADX INFO: renamed from: i */
    private static final String f4628i;

    /* JADX INFO: renamed from: d */
    private C2052h f4629d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private WeakReference<List<C2037i>> f4630e;

    /* JADX INFO: renamed from: f */
    List<AbstractC2041m> f4631f;

    /* JADX INFO: renamed from: g */
    @Nullable
    C2030b f4632g;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.G.i$a */
    final class a implements InterfaceC2062e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ StringBuilder f4633a;

        a(StringBuilder sb) {
            this.f4633a = sb;
        }

        @Override // com.github.catvod.spider.support.p103I.InterfaceC2062e
        /* JADX INFO: renamed from: a */
        public final void mo4858a(AbstractC2041m abstractC2041m, int i) {
            if ((abstractC2041m instanceof C2037i) && ((C2037i) abstractC2041m).m4884e0() && (abstractC2041m.m4942s() instanceof C2044p) && !C2044p.m4946N(this.f4633a)) {
                this.f4633a.append(' ');
            }
        }

        @Override // com.github.catvod.spider.support.p103I.InterfaceC2062e
        /* JADX INFO: renamed from: b */
        public final void mo4859b(AbstractC2041m abstractC2041m, int i) {
            if (abstractC2041m instanceof C2044p) {
                C2037i.m4864P(this.f4633a, (C2044p) abstractC2041m);
            } else if (abstractC2041m instanceof C2037i) {
                C2037i c2037i = (C2037i) abstractC2041m;
                if (this.f4633a.length() > 0) {
                    if ((c2037i.m4884e0() || c2037i.f4629d.m5088j().equals("br")) && !C2044p.m4946N(this.f4633a)) {
                        this.f4633a.append(' ');
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.G.i$b */
    private static final class b extends AbstractC1269a<AbstractC2041m> {

        /* JADX INFO: renamed from: a */
        private final C2037i f4634a;

        b(C2037i c2037i, int i) {
            super(i);
            this.f4634a = c2037i;
        }

        @Override // com.github.catvod.spider.support.p042E.AbstractC1269a
        /* JADX INFO: renamed from: a */
        public final void mo3150a() {
            this.f4634a.m4887g0();
        }
    }

    static {
        Pattern.compile("\\s+");
        f4628i = "/baseUri";
    }

    public C2037i(C2052h c2052h, @Nullable String str, @Nullable C2030b c2030b) {
        C1271c.m3157g(c2052h);
        this.f4631f = AbstractC2041m.f4647c;
        this.f4632g = c2030b;
        this.f4629d = c2052h;
        if (str != null) {
            mo4893l(str);
        }
    }

    public C2037i(String str) {
        this(C2052h.m5079m(str, C2050f.f4753d), "", null);
    }

    /* JADX INFO: renamed from: L */
    private static void m4863L(C2037i c2037i, C2060c c2060c) {
        C2037i c2037i2 = (C2037i) c2037i.f4648a;
        if (c2037i2 == null || c2037i2.m4901r0().equals("#root")) {
            return;
        }
        c2060c.add(c2037i2);
        m4863L(c2037i2, c2060c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static void m4864P(StringBuilder sb, C2044p c2044p) {
        String strM4926I = c2044p.m4926I();
        if (m4867l0(c2044p.f4648a) || (c2044p instanceof C2031c)) {
            sb.append(strM4926I);
        } else {
            C1274b.m3170a(sb, strM4926I, C2044p.m4946N(sb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static void m4865R(AbstractC2041m abstractC2041m, StringBuilder sb) {
        if (abstractC2041m instanceof C2044p) {
            sb.append(((C2044p) abstractC2041m).m4926I());
        } else if ((abstractC2041m instanceof C2037i) && ((C2037i) abstractC2041m).f4629d.m5088j().equals("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: d0 */
    private static <E extends C2037i> int m4866d0(C2037i c2037i, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == c2037i) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: l0 */
    static boolean m4867l0(@Nullable AbstractC2041m abstractC2041m) {
        if (abstractC2041m instanceof C2037i) {
            C2037i c2037i = (C2037i) abstractC2041m;
            int i = 0;
            while (!c2037i.f4629d.m5089k()) {
                c2037i = (C2037i) c2037i.f4648a;
                i++;
                if (i >= 6 || c2037i == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: F */
    public final AbstractC2041m mo4868F() {
        AbstractC2041m abstractC2041m = this;
        while (true) {
            AbstractC2041m abstractC2041m2 = abstractC2041m.f4648a;
            if (abstractC2041m2 == null) {
                return (C2037i) abstractC2041m;
            }
            abstractC2041m = abstractC2041m2;
        }
    }

    /* JADX INFO: renamed from: M */
    public final C2037i m4869M(AbstractC2041m abstractC2041m) {
        AbstractC2041m abstractC2041m2 = abstractC2041m.f4648a;
        if (abstractC2041m2 != null) {
            abstractC2041m2.mo4922D(abstractC2041m);
        }
        abstractC2041m.f4648a = this;
        mo4895n();
        this.f4631f.add(abstractC2041m);
        abstractC2041m.f4649b = this.f4631f.size() - 1;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final C2037i m4870N(Collection<? extends AbstractC2041m> collection) {
        if (collection == null) {
            throw new C1272d("Children collection to be inserted must not be null.");
        }
        int iMo4835h = mo4835h();
        int i = (iMo4835h + 1) - 1;
        C1271c.m3154d(i >= 0 && i <= iMo4835h, "Insert position out of bounds.");
        m4936b(i, (AbstractC2041m[]) new ArrayList(collection).toArray(new AbstractC2041m[0]));
        return this;
    }

    /* JADX INFO: renamed from: O */
    public final C2037i m4871O(String str) {
        C2042n.m4945a(this).getClass();
        C2037i c2037i = new C2037i(C2052h.m5079m(str, C2050f.f4752c), mo4885f(), null);
        m4869M(c2037i);
        return c2037i;
    }

    /* JADX INFO: renamed from: Q */
    public final C2037i m4872Q(String str) {
        C1271c.m3157g(str);
        m4869M(new C2044p(str));
        return this;
    }

    /* JADX INFO: renamed from: S */
    public final C2037i m4873S(AbstractC2041m abstractC2041m) {
        C1271c.m3157g(this.f4648a);
        this.f4648a.m4936b(this.f4649b, abstractC2041m);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public final C2037i m4874T() {
        return m4875U().get(0);
    }

    /* JADX INFO: renamed from: U */
    final List<C2037i> m4875U() {
        List<C2037i> list;
        if (mo4835h() == 0) {
            return f4627h;
        }
        WeakReference<List<C2037i>> weakReference = this.f4630e;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f4631f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC2041m abstractC2041m = this.f4631f.get(i);
            if (abstractC2041m instanceof C2037i) {
                arrayList.add((C2037i) abstractC2041m);
            }
        }
        this.f4630e = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public final C2060c m4876V() {
        return new C2060c(m4875U());
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public C2037i clone() {
        return (C2037i) super.clone();
    }

    /* JADX INFO: renamed from: X */
    public final String m4877X() {
        String strM4926I;
        StringBuilder sbM3171b = C1274b.m3171b();
        for (AbstractC2041m abstractC2041m : this.f4631f) {
            if (abstractC2041m instanceof C2033e) {
                strM4926I = ((C2033e) abstractC2041m).m4926I();
            } else if (abstractC2041m instanceof C2032d) {
                strM4926I = ((C2032d) abstractC2041m).m4926I();
            } else if (abstractC2041m instanceof C2037i) {
                strM4926I = ((C2037i) abstractC2041m).m4877X();
            } else if (abstractC2041m instanceof C2031c) {
                strM4926I = ((C2031c) abstractC2041m).m4926I();
            }
            sbM3171b.append(strM4926I);
        }
        return C1274b.m3177h(sbM3171b);
    }

    /* JADX INFO: renamed from: Y */
    public final int m4878Y() {
        AbstractC2041m abstractC2041m = this.f4648a;
        if (((C2037i) abstractC2041m) == null) {
            return 0;
        }
        return m4866d0(this, ((C2037i) abstractC2041m).m4875U());
    }

    /* JADX INFO: renamed from: Z */
    public final C2060c m4879Z() {
        return C2058a.m5174a(new AbstractC2061d.C2687a(), this);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m4880a0(String str) {
        C2030b c2030b = this.f4632g;
        if (c2030b == null) {
            return false;
        }
        String strM4820m = c2030b.m4820m("class");
        int length = strM4820m.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM4820m);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM4820m.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM4820m.regionMatches(true, i, str, 0, length2)) {
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
                return strM4820m.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final String m4881b0() {
        StringBuilder sbM3171b = C1274b.m3171b();
        int size = this.f4631f.size();
        for (int i = 0; i < size; i++) {
            this.f4631f.get(i).m4943v(sbM3171b);
        }
        String strM3177h = C1274b.m3177h(sbM3171b);
        C2034f c2034fM4944y = m4944y();
        if (c2034fM4944y == null) {
            c2034fM4944y = new C2034f("");
        }
        return c2034fM4944y.m4846y0().m4854g() ? strM3177h.trim() : strM3177h;
    }

    /* JADX INFO: renamed from: c0 */
    public final String m4882c0() {
        C2030b c2030b = this.f4632g;
        return c2030b != null ? c2030b.m4820m("id") : "";
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: e */
    public final C2030b mo4883e() {
        if (this.f4632g == null) {
            this.f4632g = new C2030b();
        }
        return this.f4632g;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m4884e0() {
        return this.f4629d.m5082c();
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: f */
    public final String mo4885f() {
        String str = f4628i;
        for (C2037i c2037i = this; c2037i != null; c2037i = (C2037i) c2037i.f4648a) {
            C2030b c2030b = c2037i.f4632g;
            if (c2030b != null) {
                if (c2030b.m4824q(str) != -1) {
                    return c2037i.f4632g.m4819l(str);
                }
            }
        }
        return "";
    }

    @Nullable
    /* JADX INFO: renamed from: f0 */
    public final C2037i m4886f0() {
        AbstractC2041m abstractC2041m = this.f4648a;
        if (abstractC2041m == null) {
            return null;
        }
        List<C2037i> listM4875U = ((C2037i) abstractC2041m).m4875U();
        int iM4866d0 = m4866d0(this, listM4875U) + 1;
        if (listM4875U.size() > iM4866d0) {
            return listM4875U.get(iM4866d0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    final void m4887g0() {
        this.f4630e = null;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: h */
    public final int mo4835h() {
        return this.f4631f.size();
    }

    /* JADX INFO: renamed from: h0 */
    public final String m4888h0() {
        return this.f4629d.m5088j();
    }

    /* JADX INFO: renamed from: i0 */
    public final String m4889i0() {
        StringBuilder sbM3171b = C1274b.m3171b();
        for (int i = 0; i < mo4835h(); i++) {
            AbstractC2041m abstractC2041m = this.f4631f.get(i);
            if (abstractC2041m instanceof C2044p) {
                m4864P(sbM3171b, (C2044p) abstractC2041m);
            } else if ((abstractC2041m instanceof C2037i) && ((C2037i) abstractC2041m).f4629d.m5088j().equals("br") && !C2044p.m4946N(sbM3171b)) {
                sbM3171b.append(" ");
            }
        }
        return C1274b.m3177h(sbM3171b).trim();
    }

    @Nullable
    /* JADX INFO: renamed from: j0 */
    public final C2037i m4890j0() {
        return (C2037i) this.f4648a;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: k */
    protected final AbstractC2041m mo4891k(@Nullable AbstractC2041m abstractC2041m) {
        C2037i c2037i = (C2037i) super.mo4891k(abstractC2041m);
        C2030b c2030b = this.f4632g;
        c2037i.f4632g = c2030b != null ? c2030b.clone() : null;
        b bVar = new b(c2037i, this.f4631f.size());
        c2037i.f4631f = bVar;
        bVar.addAll(this.f4631f);
        return c2037i;
    }

    /* JADX INFO: renamed from: k0 */
    public final C2060c m4892k0() {
        C2060c c2060c = new C2060c();
        m4863L(this, c2060c);
        return c2060c;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: l */
    protected final void mo4893l(String str) {
        mo4883e().m4827w(f4628i, str);
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: m */
    public final AbstractC2041m mo4836m() {
        this.f4631f.clear();
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: m0 */
    public final C2037i m4894m0() {
        List<C2037i> listM4875U;
        int iM4866d0;
        AbstractC2041m abstractC2041m = this.f4648a;
        if (abstractC2041m != null && (iM4866d0 = m4866d0(this, (listM4875U = ((C2037i) abstractC2041m).m4875U()))) > 0) {
            return listM4875U.get(iM4866d0 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: n */
    protected final List<AbstractC2041m> mo4895n() {
        if (this.f4631f == AbstractC2041m.f4647c) {
            this.f4631f = new b(this, 4);
        }
        return this.f4631f;
    }

    /* JADX INFO: renamed from: n0 */
    public final C2060c m4896n0(String str) {
        C1271c.m3155e(str);
        AbstractC2061d abstractC2061dM5192j = C2063f.m5192j(str);
        C1271c.m3157g(abstractC2061dM5192j);
        return C2058a.m5174a(abstractC2061dM5192j, this);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX INFO: renamed from: o0 */
    final boolean m4897o0(C2034f.a aVar) {
        boolean z;
        C2037i c2037i;
        C2037i c2037i2;
        if (aVar.m4854g()) {
            if (this.f4629d.m5080a() || ((c2037i2 = (C2037i) this.f4648a) != null && c2037i2.f4629d.m5080a())) {
                if (this.f4629d.m5085f() && ((c2037i = (C2037i) this.f4648a) == null || c2037i.m4884e0())) {
                    AbstractC2041m abstractC2041m = this.f4648a;
                    AbstractC2041m abstractC2041m2 = null;
                    if (abstractC2041m != null && this.f4649b > 0) {
                        abstractC2041m2 = abstractC2041m.mo4895n().get(this.f4649b - 1);
                    }
                    if (abstractC2041m2 != null) {
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

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: p */
    protected final boolean mo4898p() {
        return this.f4632g != null;
    }

    /* JADX INFO: renamed from: p0 */
    public final C2060c m4899p0() {
        AbstractC2041m abstractC2041m = this.f4648a;
        if (abstractC2041m == null) {
            return new C2060c(0);
        }
        List<C2037i> listM4875U = ((C2037i) abstractC2041m).m4875U();
        C2060c c2060c = new C2060c(listM4875U.size() - 1);
        for (C2037i c2037i : listM4875U) {
            if (c2037i != this) {
                c2060c.add(c2037i);
            }
        }
        return c2060c;
    }

    /* JADX INFO: renamed from: q0 */
    public final C2052h m4900q0() {
        return this.f4629d;
    }

    /* JADX INFO: renamed from: r0 */
    public final String m4901r0() {
        return this.f4629d.m5081b();
    }

    /* JADX INFO: renamed from: s0 */
    public C2037i mo4842s0(String str) {
        C1271c.m3157g(str);
        this.f4631f.clear();
        C2034f c2034fM4944y = m4944y();
        m4869M((c2034fM4944y == null || !c2034fM4944y.m4837A0().m5076b(m4888h0())) ? new C2044p(str) : new C2033e(str));
        return this;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: t */
    public String mo4832t() {
        return this.f4629d.m5081b();
    }

    /* JADX INFO: renamed from: t0 */
    public final String m4902t0() {
        StringBuilder sbM3171b = C1274b.m3171b();
        C1273a.m3167g(new a(sbM3171b), this);
        return C1274b.m3177h(sbM3171b).trim();
    }

    /* JADX INFO: renamed from: u0 */
    public final List<C2044p> m4903u0() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC2041m abstractC2041m : this.f4631f) {
            if (abstractC2041m instanceof C2044p) {
                arrayList.add((C2044p) abstractC2041m);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: v0 */
    public final String m4904v0() {
        StringBuilder sbM3171b = C1274b.m3171b();
        int iMo4835h = mo4835h();
        for (int i = 0; i < iMo4835h; i++) {
            m4865R(this.f4631f.get(i), sbM3171b);
        }
        return C1274b.m3177h(sbM3171b);
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: w */
    void mo4833w(Appendable appendable, int i, C2034f.a aVar) throws IOException {
        if (m4897o0(aVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            m4941r(appendable, i, aVar);
        }
        appendable.append('<').append(m4901r0());
        C2030b c2030b = this.f4632g;
        if (c2030b != null) {
            c2030b.m4823p(appendable, aVar);
        }
        if (this.f4631f.isEmpty() && this.f4629d.m5087i() && (aVar.m4855h() != 1 || !this.f4629d.m5083d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: x */
    void mo4834x(Appendable appendable, int i, C2034f.a aVar) throws IOException {
        if (this.f4631f.isEmpty() && this.f4629d.m5087i()) {
            return;
        }
        if (aVar.m4854g() && !this.f4631f.isEmpty() && this.f4629d.m5080a()) {
            m4941r(appendable, i, aVar);
        }
        appendable.append("</").append(m4901r0()).append('>');
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    @Nullable
    /* JADX INFO: renamed from: z */
    public final AbstractC2041m mo4905z() {
        return (C2037i) this.f4648a;
    }
}
