package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p020W.C1013a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p028d0.C1074D;
import com.github.catvod.spider.support.p012C0.p028d0.C1078F;
import com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N;
import com.github.catvod.spider.support.p012C0.p029e0.C1195P;
import com.github.catvod.spider.support.p012C0.p029e0.C1207c;
import com.github.catvod.spider.support.p012C0.p029e0.C1211g;
import com.github.catvod.spider.support.p012C0.p029e0.C1212h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.l */
/* JADX INFO: loaded from: classes.dex */
public class C1053l extends AbstractC1059r {

    /* JADX INFO: renamed from: j */
    private static final List<C1053l> f2579j = Collections.emptyList();

    /* JADX INFO: renamed from: k */
    private static final String f2580k;

    /* JADX INFO: renamed from: f */
    private C1078F f2581f;

    /* JADX INFO: renamed from: g */
    private WeakReference<List<C1053l>> f2582g;

    /* JADX INFO: renamed from: h */
    List<AbstractC1059r> f2583h;

    /* JADX INFO: renamed from: i */
    private C1044c f2584i;

    static {
        Pattern.compile("\\s+");
        f2580k = "/baseUri";
    }

    public C1053l(C1078F c1078f, String str, C1044c c1044c) {
        C0966a.m2376k(c1078f);
        this.f2583h = AbstractC1059r.f2599e;
        this.f2584i = c1044c;
        this.f2581f = c1078f;
        if (str != null) {
            mo2715l(str);
        }
    }

    public C1053l(String str) {
        this(C1078F.m2811l(str, C1074D.f2656d), "", null);
    }

    /* JADX INFO: renamed from: K */
    private static void m2685K(C1053l c1053l, C1211g c1211g) {
        C1053l c1053l2 = (C1053l) c1053l.f2600c;
        if (c1053l2 == null || c1053l2.m2719n0().equals("#root")) {
            return;
        }
        c1211g.add(c1053l2);
        m2685K(c1053l2, c1211g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static void m2686N(StringBuilder sb, C1062u c1062u) {
        String strM2744I = c1062u.m2744I();
        if (m2688h0(c1062u.f2600c) || (c1062u instanceof C1045d)) {
            sb.append(strM2744I);
            return;
        }
        boolean zM2764M = C1062u.m2764M(sb);
        int i = C1034b.f2516d;
        int length = strM2744I.length();
        boolean z = false;
        boolean z2 = false;
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = strM2744I.codePointAt(iCharCount);
            if (!(iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160)) {
                if (!(iCodePointAt == 8203 || iCodePointAt == 173)) {
                    sb.appendCodePoint(iCodePointAt);
                    z2 = true;
                    z = false;
                }
            } else if ((!zM2764M || z2) && !z) {
                sb.append(' ');
                z = true;
            }
            iCharCount = Character.charCount(iCodePointAt) + iCharCount;
        }
    }

    /* JADX INFO: renamed from: Z */
    private static <E extends C1053l> int m2687Z(C1053l c1053l, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == c1053l) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h0 */
    static boolean m2688h0(AbstractC1059r abstractC1059r) {
        if (!(abstractC1059r instanceof C1053l)) {
            return false;
        }
        C1053l c1053l = (C1053l) abstractC1059r;
        int i = 0;
        while (!c1053l.f2581f.m2821j()) {
            C1053l c1053l2 = (C1053l) c1053l.f2600c;
            i++;
            if (i >= 6 || c1053l2 == null) {
                return false;
            }
            c1053l = c1053l2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.support.p012C0.p026c0.r] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: F */
    public final AbstractC1059r mo2689F() {
        Object r1 = this;
        while (true) {
            Object r0 = r1;
            AbstractC1059r abstractC1059r = r0.f2600c;
            if (abstractC1059r == null) {
                return (C1053l) r0;
            }
            r1 = abstractC1059r;
        }
    }

    /* JADX INFO: renamed from: L */
    public final C1053l m2690L(AbstractC1059r abstractC1059r) {
        C0966a.m2376k(abstractC1059r);
        AbstractC1059r abstractC1059r2 = abstractC1059r.f2600c;
        if (abstractC1059r2 != null) {
            abstractC1059r2.mo2740D(abstractC1059r);
        }
        abstractC1059r.f2600c = this;
        mo2718n();
        this.f2583h.add(abstractC1059r);
        abstractC1059r.f2601d = this.f2583h.size() - 1;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public final C1053l m2691M(String str) {
        C1060s.m2763a(this).getClass();
        C1053l c1053l = new C1053l(C1078F.m2811l(str, C1074D.f2655c), mo2707e(), null);
        m2690L(c1053l);
        return c1053l;
    }

    /* JADX INFO: renamed from: O */
    public final C1053l m2692O(String str) {
        C0966a.m2376k(str);
        m2690L(new C1062u(str));
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final C1053l m2693P() {
        return m2694Q().get(0);
    }

    /* JADX INFO: renamed from: Q */
    final List<C1053l> m2694Q() {
        List<C1053l> list;
        if (mo2661h() == 0) {
            return f2579j;
        }
        WeakReference<List<C1053l>> weakReference = this.f2582g;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f2583h.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC1059r abstractC1059r = this.f2583h.get(i);
            if (abstractC1059r instanceof C1053l) {
                arrayList.add((C1053l) abstractC1059r);
            }
        }
        this.f2582g = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: R */
    public final C1211g m2695R() {
        return new C1211g(m2694Q());
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C1053l mo2657j() {
        return (C1053l) super.mo2657j();
    }

    /* JADX INFO: renamed from: T */
    public final String m2696T() {
        String strM2744I;
        StringBuilder sbM2595a = C1034b.m2595a();
        for (AbstractC1059r abstractC1059r : this.f2583h) {
            if (abstractC1059r instanceof C1047f) {
                strM2744I = ((C1047f) abstractC1059r).m2744I();
            } else if (abstractC1059r instanceof C1046e) {
                strM2744I = ((C1046e) abstractC1059r).m2744I();
            } else if (abstractC1059r instanceof C1053l) {
                strM2744I = ((C1053l) abstractC1059r).m2696T();
            } else if (abstractC1059r instanceof C1045d) {
                strM2744I = ((C1045d) abstractC1059r).m2744I();
            }
            sbM2595a.append(strM2744I);
        }
        return C1034b.m2601g(sbM2595a);
    }

    /* JADX INFO: renamed from: U */
    public final int m2697U() {
        AbstractC1059r abstractC1059r = this.f2600c;
        if (((C1053l) abstractC1059r) == null) {
            return 0;
        }
        return m2687Z(this, ((C1053l) abstractC1059r).m2694Q());
    }

    /* JADX INFO: renamed from: V */
    public final C1211g m2698V() {
        return C1207c.m3009a(new C1212h(), this);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m2699W(String str) {
        C1044c c1044c = this.f2584i;
        if (c1044c == null) {
            return false;
        }
        String strM2646k = c1044c.m2646k("class");
        int length = strM2646k.length();
        int length2 = str.length();
        if (length == 0 || length < length2) {
            return false;
        }
        if (length == length2) {
            return str.equalsIgnoreCase(strM2646k);
        }
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Character.isWhitespace(strM2646k.charAt(i2))) {
                if (!z) {
                    continue;
                } else {
                    if (i2 - i == length2 && strM2646k.regionMatches(true, i, str, 0, length2)) {
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
            return strM2646k.regionMatches(true, i, str, 0, length2);
        }
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final String m2700X() {
        StringBuilder sbM2595a = C1034b.m2595a();
        int size = this.f2583h.size();
        for (int i = 0; i < size; i++) {
            this.f2583h.get(i).m2761v(sbM2595a);
        }
        String strM2601g = C1034b.m2601g(sbM2595a);
        C1049h c1049hM2762y = m2762y();
        if (c1049hM2762y == null) {
            c1049hM2762y = new C1049h();
        }
        return c1049hM2762y.m2673s0().m2668f() ? strM2601g.trim() : strM2601g;
    }

    /* JADX INFO: renamed from: Y */
    public final String m2701Y() {
        C1044c c1044c = this.f2584i;
        return c1044c != null ? c1044c.m2646k("id") : "";
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m2702a0() {
        return this.f2581f.m2814c();
    }

    /* JADX INFO: renamed from: b0 */
    public final C1053l m2703b0() {
        AbstractC1059r abstractC1059r = this.f2600c;
        if (abstractC1059r == null) {
            return null;
        }
        List<C1053l> listM2694Q = ((C1053l) abstractC1059r).m2694Q();
        int iM2687Z = m2687Z(this, listM2694Q) + 1;
        if (listM2694Q.size() > iM2687Z) {
            return listM2694Q.get(iM2687Z);
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    final void m2704c0() {
        this.f2582g = null;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: d */
    public final C1044c mo2705d() {
        if (this.f2584i == null) {
            this.f2584i = new C1044c();
        }
        return this.f2584i;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m2706d0() {
        return this.f2581f.m2820i();
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: e */
    public final String mo2707e() {
        String str = f2580k;
        while (this != null) {
            C1044c c1044c = this.f2584i;
            if (c1044c != null) {
                if (c1044c.m2650o(str) != -1) {
                    return this.f2584i.m2645j(str);
                }
            }
            this = (C1053l) this.f2600c;
        }
        return "";
    }

    /* JADX INFO: renamed from: e0 */
    public final String m2708e0() {
        StringBuilder sbM2595a = C1034b.m2595a();
        for (AbstractC1059r abstractC1059r : this.f2583h) {
            if (abstractC1059r instanceof C1062u) {
                m2686N(sbM2595a, (C1062u) abstractC1059r);
            } else if ((abstractC1059r instanceof C1053l) && ((C1053l) abstractC1059r).f2581f.m2813b().equals("br") && !C1062u.m2764M(sbM2595a)) {
                sbM2595a.append(" ");
            }
        }
        return C1034b.m2601g(sbM2595a).trim();
    }

    /* JADX INFO: renamed from: f0 */
    public final C1053l m2709f0() {
        return (C1053l) this.f2600c;
    }

    /* JADX INFO: renamed from: g0 */
    public final C1211g m2710g0() {
        C1211g c1211g = new C1211g();
        m2685K(this, c1211g);
        return c1211g;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: h */
    public final int mo2661h() {
        return this.f2583h.size();
    }

    /* JADX INFO: renamed from: i0 */
    public final C1053l m2711i0() {
        List<C1053l> listM2694Q;
        int iM2687Z;
        AbstractC1059r abstractC1059r = this.f2600c;
        if (abstractC1059r != null && (iM2687Z = m2687Z(this, (listM2694Q = ((C1053l) abstractC1059r).m2694Q()))) > 0) {
            return listM2694Q.get(iM2687Z - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final C1211g m2712j0(String str) {
        C0966a.m2374i(str);
        AbstractC1193N abstractC1193NM3005h = C1195P.m3005h(str);
        C0966a.m2376k(abstractC1193NM3005h);
        return C1207c.m3009a(abstractC1193NM3005h, this);
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: k */
    protected final AbstractC1059r mo2713k(AbstractC1059r abstractC1059r) {
        C1053l c1053l = (C1053l) super.mo2713k(abstractC1059r);
        C1044c c1044c = this.f2584i;
        c1053l.f2584i = c1044c != null ? c1044c.clone() : null;
        C1052k c1052k = new C1052k(c1053l, this.f2583h.size());
        c1053l.f2583h = c1052k;
        c1052k.addAll(this.f2583h);
        return c1053l;
    }

    /* JADX INFO: renamed from: k0 */
    public final C1053l m2714k0(String str) {
        C0966a.m2374i(str);
        return C1207c.m3010b(C1195P.m3005h(str), this);
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: l */
    protected final void mo2715l(String str) {
        mo2705d().m2653t(f2580k, str);
    }

    /* JADX INFO: renamed from: l0 */
    public final C1211g m2716l0() {
        AbstractC1059r abstractC1059r = this.f2600c;
        if (abstractC1059r == null) {
            return new C1211g(0);
        }
        List<C1053l> listM2694Q = ((C1053l) abstractC1059r).m2694Q();
        C1211g c1211g = new C1211g(listM2694Q.size() - 1);
        for (C1053l c1053l : listM2694Q) {
            if (c1053l != this) {
                c1211g.add(c1053l);
            }
        }
        return c1211g;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: m */
    public final AbstractC1059r mo2662m() {
        this.f2583h.clear();
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public final C1078F m2717m0() {
        return this.f2581f;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: n */
    protected final List<AbstractC1059r> mo2718n() {
        if (this.f2583h == AbstractC1059r.f2599e) {
            this.f2583h = new C1052k(this, 4);
        }
        return this.f2583h;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m2719n0() {
        return this.f2581f.m2813b();
    }

    /* JADX INFO: renamed from: o0 */
    public C1053l mo2671o0(String str) {
        C0966a.m2376k(str);
        this.f2583h.clear();
        C1049h c1049hM2762y = m2762y();
        m2690L((c1049hM2762y == null || !c1049hM2762y.m2676u0().m2810b(m2706d0())) ? new C1062u(str) : new C1047f(str));
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: p */
    protected final boolean mo2720p() {
        return this.f2584i != null;
    }

    /* JADX INFO: renamed from: p0 */
    public final String m2721p0() {
        StringBuilder sbM2595a = C1034b.m2595a();
        C1013a.m2550c(new C1051j(sbM2595a), this);
        return C1034b.m2601g(sbM2595a).trim();
    }

    /* JADX INFO: renamed from: q0 */
    public final List<C1062u> m2722q0() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1059r abstractC1059r : this.f2583h) {
            if (abstractC1059r instanceof C1062u) {
                arrayList.add((C1062u) abstractC1059r);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: t */
    public String mo2658t() {
        return this.f2581f.m2813b();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: w */
    void mo2659w(Appendable appendable, int i, C1048g c1048g) throws IOException {
        boolean z;
        C1053l c1053l;
        C1053l c1053l2;
        if (c1048g.m2668f()) {
            if (this.f2581f.m2812a() || ((c1053l2 = (C1053l) this.f2600c) != null && c1053l2.f2581f.m2812a())) {
                if (this.f2581f.m2817f() && !this.f2581f.m2815d() && ((c1053l = (C1053l) this.f2600c) == null || c1053l.m2702a0())) {
                    AbstractC1059r abstractC1059r = this.f2600c;
                    AbstractC1059r abstractC1059r2 = null;
                    if (abstractC1059r != null && this.f2601d > 0) {
                        abstractC1059r2 = abstractC1059r.mo2718n().get(this.f2601d - 1);
                    }
                    if (abstractC1059r2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
                    m2759r(appendable, i, c1048g);
                }
            }
        }
        appendable.append('<').append(m2719n0());
        C1044c c1044c = this.f2584i;
        if (c1044c != null) {
            c1044c.m2649n(appendable, c1048g);
        }
        if (this.f2583h.isEmpty() && this.f2581f.m2819h() && (c1048g.m2669g() != 1 || !this.f2581f.m2815d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: x */
    void mo2660x(Appendable appendable, int i, C1048g c1048g) throws IOException {
        if (this.f2583h.isEmpty() && this.f2581f.m2819h()) {
            return;
        }
        if (c1048g.m2668f() && !this.f2583h.isEmpty() && this.f2581f.m2812a()) {
            m2759r(appendable, i, c1048g);
        }
        appendable.append("</").append(m2719n0()).append('>');
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: z */
    public final AbstractC1059r mo2723z() {
        return (C1053l) this.f2600c;
    }
}
