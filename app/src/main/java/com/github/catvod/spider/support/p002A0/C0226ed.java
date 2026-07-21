package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ed */
/* JADX INFO: loaded from: classes.dex */
public class C0226ed extends AbstractC0272fw {

    /* JADX INFO: renamed from: e */
    public static final List f769e = Collections.emptyList();

    /* JADX INFO: renamed from: f */
    public static final String f770f;

    /* JADX INFO: renamed from: g */
    public final C0118ad f771g;

    /* JADX INFO: renamed from: h */
    public WeakReference f772h;

    /* JADX INFO: renamed from: i */
    public List f773i;

    /* JADX INFO: renamed from: j */
    public C0554qh f774j;

    static {
        Pattern.compile("\\s+");
        f770f = "/baseUri";
    }

    public C0226ed(C0118ad c0118ad, String str, C0554qh c0554qh) {
        AbstractC0711wc.m1770e(c0118ad);
        this.f773i = AbstractC0272fw.f845ao;
        this.f774j = c0554qh;
        this.f771g = c0118ad;
        if (str != null) {
            m1159aa(str);
        }
    }

    public C0226ed(String str) {
        this(C0118ad.m987m(str, "http://www.w3.org/1999/xhtml", C0707vz.f1649b), "", null);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1158k(AbstractC0272fw abstractC0272fw) {
        if (abstractC0272fw instanceof C0226ed) {
            C0226ed c0226ed = (C0226ed) abstractC0272fw;
            int i = 0;
            while (!c0226ed.f771g.f596i) {
                c0226ed = (C0226ed) c0226ed.f846ap;
                i++;
                if (i >= 6 || c0226ed == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: aa */
    public final void m1159aa(String str) {
        mo1170l().m1594n(f770f, str);
    }

    /* JADX INFO: renamed from: ab */
    public final int m1160ab() {
        AbstractC0272fw abstractC0272fw = this.f846ap;
        if (((C0226ed) abstractC0272fw) == null) {
            return 0;
        }
        List listM1181z = ((C0226ed) abstractC0272fw).m1181z();
        int size = listM1181z.size();
        for (int i = 0; i < size; i++) {
            if (listM1181z.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ac */
    public final C0226ed m1161ac() {
        for (AbstractC0272fw abstractC0272fwM1231ax = mo1172n() == 0 ? null : (AbstractC0272fw) mo1175q().get(0); abstractC0272fwM1231ax != null; abstractC0272fwM1231ax = abstractC0272fwM1231ax.m1231ax()) {
            if (abstractC0272fwM1231ax instanceof C0226ed) {
                return (C0226ed) abstractC0272fwM1231ax;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ad */
    public final boolean m1162ad(String str) {
        C0554qh c0554qh = this.f774j;
        if (c0554qh == null) {
            return false;
        }
        String strM1589i = c0554qh.m1589i("class");
        int length = strM1589i.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM1589i);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM1589i.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM1589i.regionMatches(true, i, str, 0, length2)) {
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
                return strM1589i.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ae */
    public final String m1163ae() {
        C0235em c0235em;
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        int size = this.f773i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            AbstractC0272fw abstractC0272fw = (AbstractC0272fw) this.f773i.get(i);
            AbstractC0272fw abstractC0272fwMo1179x = abstractC0272fw.mo1179x();
            c0235em = abstractC0272fwMo1179x instanceof C0235em ? (C0235em) abstractC0272fwMo1179x : null;
            if (c0235em == null) {
                c0235em = new C0235em();
            }
            AbstractC0535pp.m1525b(new abb(sbM1845g, c0235em.f783a, 1), abstractC0272fw);
            i++;
        }
        String strM1852n = AbstractC0727ws.m1852n(sbM1845g);
        AbstractC0272fw abstractC0272fwMo1179x2 = mo1179x();
        c0235em = abstractC0272fwMo1179x2 instanceof C0235em ? (C0235em) abstractC0272fwMo1179x2 : null;
        return (c0235em != null ? c0235em.f783a : new C0235em().f783a).f1582c ? strM1852n.trim() : strM1852n;
    }

    /* JADX INFO: renamed from: af */
    public final C0226ed m1164af() {
        AbstractC0272fw abstractC0272fwM1231ax = this;
        do {
            abstractC0272fwM1231ax = abstractC0272fwM1231ax.m1231ax();
            if (abstractC0272fwM1231ax == null) {
                return null;
            }
        } while (!(abstractC0272fwM1231ax instanceof C0226ed));
        return (C0226ed) abstractC0272fwM1231ax;
    }

    /* JADX INFO: renamed from: ag */
    public final String m1165ag() {
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        for (int i = 0; i < this.f773i.size(); i++) {
            AbstractC0272fw abstractC0272fw = (AbstractC0272fw) this.f773i.get(i);
            if (abstractC0272fw instanceof C0706vy) {
                C0706vy c0706vy = (C0706vy) abstractC0272fw;
                String strM1732f = c0706vy.m1732f();
                if (m1158k(c0706vy.f846ap) || (c0706vy instanceof C0586rm)) {
                    sbM1845g.append(strM1732f);
                } else {
                    AbstractC0727ws.m1844f(sbM1845g, strM1732f, C0706vy.m1753h(sbM1845g));
                }
            } else if (abstractC0272fw.m1230aw("br") && !C0706vy.m1753h(sbM1845g)) {
                sbM1845g.append(" ");
            }
        }
        return AbstractC0727ws.m1852n(sbM1845g).trim();
    }

    /* JADX INFO: renamed from: ah */
    public final C0589rp m1166ah(String str) {
        AbstractC0711wc.m1768c(str);
        AbstractC0213dr abstractC0213drM1458h = C0471nf.m1458h(str);
        AbstractC0711wc.m1770e(abstractC0213drM1458h);
        return AbstractC0149bh.m1024a(abstractC0213drM1458h, this);
    }

    /* JADX INFO: renamed from: ai */
    public final C0226ed m1167ai(String str) {
        AbstractC0711wc.m1768c(str);
        AbstractC0213dr abstractC0213drM1458h = C0471nf.m1458h(str);
        abstractC0213drM1458h.mo1139d();
        return (C0226ed) AbstractC0536pq.m1526b(this, C0226ed.class).filter(new C0582ri(abstractC0213drM1458h, this)).findFirst().orElse(null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: aj */
    public final boolean m1168aj(C0674ut c0674ut) {
        boolean z;
        C0226ed c0226ed;
        int i;
        C0226ed c0226ed2;
        if (c0674ut.f1582c && ((z = this.f771g.f592e) || ((c0226ed2 = (C0226ed) this.f846ap) != null && c0226ed2.f771g.f593f))) {
            if (!z && (((c0226ed = (C0226ed) this.f846ap) == null || c0226ed.f771g.f592e) && (i = this.f847aq) != 0)) {
                if (i == 1) {
                    AbstractC0272fw abstractC0272fwM1232ay = m1232ay();
                    if ((abstractC0272fwM1232ay instanceof C0706vy) && AbstractC0727ws.m1848j(((C0706vy) abstractC0272fwM1232ay).m1732f())) {
                        if (!m1158k(this.f846ap)) {
                            return true;
                        }
                    } else if (m1230aw("br")) {
                        if (!m1158k(this.f846ap)) {
                            return true;
                        }
                    }
                } else if (m1230aw("br")) {
                    if (!m1158k(this.f846ap)) {
                        return true;
                    }
                }
            } else if (!m1158k(this.f846ap)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ak */
    public final String m1169ak() {
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        AbstractC0535pp.m1525b(new C0736xa(3, sbM1845g), this);
        return AbstractC0727ws.m1852n(sbM1845g).trim();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0226ed clone() {
        return (C0226ed) super.clone();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: l */
    public final C0554qh mo1170l() {
        if (this.f774j == null) {
            this.f774j = new C0554qh();
        }
        return this.f774j;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: m */
    public final String mo1171m() {
        for (C0226ed c0226ed = this; c0226ed != null; c0226ed = (C0226ed) c0226ed.f846ap) {
            C0554qh c0554qh = c0226ed.f774j;
            if (c0554qh != null) {
                String str = f770f;
                if (c0554qh.m1590j(str)) {
                    return c0226ed.f774j.m1588h(str);
                }
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: n */
    public final int mo1172n() {
        return this.f773i.size();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: o */
    public final AbstractC0272fw mo1173o(AbstractC0272fw abstractC0272fw) {
        C0226ed c0226ed = (C0226ed) super.mo1173o(abstractC0272fw);
        C0554qh c0554qh = this.f774j;
        c0226ed.f774j = c0554qh != null ? c0554qh.clone() : null;
        C0590rq c0590rq = new C0590rq(c0226ed, this.f773i.size());
        c0226ed.f773i = c0590rq;
        c0590rq.addAll(this.f773i);
        return c0226ed;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: p */
    public final AbstractC0272fw mo1174p() {
        Iterator it = this.f773i.iterator();
        while (it.hasNext()) {
            ((AbstractC0272fw) it.next()).f846ap = null;
        }
        this.f773i.clear();
        return this;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: q */
    public final List mo1175q() {
        if (this.f773i == AbstractC0272fw.f845ao) {
            this.f773i = new C0590rq(this, 4);
        }
        return this.f773i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: r */
    public final boolean mo1176r() {
        return this.f774j != null;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: s */
    public String mo924s() {
        return this.f771g.f589b;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: t */
    public final String mo1177t() {
        return this.f771g.f590c;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: u */
    public void mo925u(StringBuilder sb, int i, C0674ut c0674ut) throws IOException {
        if (m1168aj(c0674ut) && (!(sb instanceof StringBuilder) || sb.length() > 0)) {
            AbstractC0272fw.m1225ar(sb, i, c0674ut);
        }
        Appendable appendableAppend = sb.append('<');
        C0118ad c0118ad = this.f771g;
        appendableAppend.append(c0118ad.f589b);
        C0554qh c0554qh = this.f774j;
        if (c0554qh != null) {
            c0554qh.m1591k(sb, c0674ut);
        }
        if (this.f773i.isEmpty()) {
            boolean z = c0118ad.f594g;
            if (z || c0118ad.f595h) {
                if (c0674ut.f1585f == 1 && z) {
                    sb.append('>');
                    return;
                } else {
                    sb.append(" />");
                    return;
                }
            }
        }
        sb.append('>');
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: v */
    public void mo926v(StringBuilder sb, int i, C0674ut c0674ut) throws IOException {
        boolean zIsEmpty = this.f773i.isEmpty();
        C0118ad c0118ad = this.f771g;
        if (zIsEmpty && (c0118ad.f594g || c0118ad.f595h)) {
            return;
        }
        if (c0674ut.f1582c && !this.f773i.isEmpty() && c0118ad.f593f && !m1158k(this.f846ap)) {
            AbstractC0272fw.m1225ar(sb, i, c0674ut);
        }
        sb.append("</").append(c0118ad.f589b).append('>');
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: w */
    public final AbstractC0272fw mo1178w() {
        return (C0226ed) this.f846ap;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: x */
    public final AbstractC0272fw mo1179x() {
        AbstractC0272fw abstractC0272fw = this;
        while (true) {
            AbstractC0272fw abstractC0272fw2 = abstractC0272fw.f846ap;
            if (abstractC0272fw2 == null) {
                return (C0226ed) abstractC0272fw;
            }
            abstractC0272fw = abstractC0272fw2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1180y(AbstractC0272fw abstractC0272fw) {
        AbstractC0272fw abstractC0272fw2 = abstractC0272fw.f846ap;
        if (abstractC0272fw2 != null) {
            abstractC0272fw2.mo1064c(abstractC0272fw);
        }
        abstractC0272fw.f846ap = this;
        mo1175q();
        this.f773i.add(abstractC0272fw);
        abstractC0272fw.f847aq = this.f773i.size() - 1;
    }

    /* JADX INFO: renamed from: z */
    public final List m1181z() {
        List list;
        if (this.f773i.size() == 0) {
            return f769e;
        }
        WeakReference weakReference = this.f772h;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f773i.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC0272fw abstractC0272fw = (AbstractC0272fw) this.f773i.get(i);
            if (abstractC0272fw instanceof C0226ed) {
                arrayList.add((C0226ed) abstractC0272fw);
            }
        }
        this.f772h = new WeakReference(arrayList);
        return arrayList;
    }
}
