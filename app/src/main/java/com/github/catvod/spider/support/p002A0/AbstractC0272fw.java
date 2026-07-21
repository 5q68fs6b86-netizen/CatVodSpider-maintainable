package com.github.catvod.spider.support.p002A0;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.fw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0272fw implements Cloneable {

    /* JADX INFO: renamed from: ao */
    public static final List f845ao = Collections.emptyList();

    /* JADX INFO: renamed from: ap */
    public AbstractC0272fw f846ap;

    /* JADX INFO: renamed from: aq */
    public int f847aq;

    /* JADX INFO: renamed from: ar */
    public static void m1225ar(StringBuilder sb, int i, C0674ut c0674ut) {
        String strValueOf;
        Appendable appendableAppend = sb.append('\n');
        int iMin = i * c0674ut.f1583d;
        String[] strArr = AbstractC0727ws.f1762a;
        if (!(iMin >= 0)) {
            throw new C0283gg("width must be >= 0");
        }
        int i2 = c0674ut.f1584e;
        AbstractC0711wc.m1766a(i2 >= -1);
        if (i2 != -1) {
            iMin = Math.min(iMin, i2);
        }
        if (iMin < 21) {
            strValueOf = AbstractC0727ws.f1762a[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i3 = 0; i3 < iMin; i3++) {
                cArr[i3] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    /* JADX INFO: renamed from: an */
    public String mo1192an() {
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        AbstractC0272fw abstractC0272fwMo1179x = mo1179x();
        C0235em c0235em = abstractC0272fwMo1179x instanceof C0235em ? (C0235em) abstractC0272fwMo1179x : null;
        if (c0235em == null) {
            c0235em = new C0235em();
        }
        AbstractC0535pp.m1525b(new abb(sbM1845g, c0235em.f783a, 1), this);
        return AbstractC0727ws.m1852n(sbM1845g);
    }

    /* JADX INFO: renamed from: as */
    public String mo1226as(String str) {
        AbstractC0711wc.m1768c(str);
        if (!mo1176r() || mo1170l().m1593m(str) == -1) {
            return "";
        }
        String strMo1171m = mo1171m();
        String strM1589i = mo1170l().m1589i(str);
        Pattern pattern = AbstractC0727ws.f1765d;
        String strReplaceAll = pattern.matcher(strMo1171m).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strM1589i).replaceAll("");
        try {
            try {
                strReplaceAll2 = AbstractC0727ws.m1853o(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                strReplaceAll2 = new URL(strReplaceAll2).toExternalForm();
            }
            return strReplaceAll2;
        } catch (MalformedURLException unused2) {
            return AbstractC0727ws.f1764c.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    /* JADX INFO: renamed from: at */
    public final void m1227at(int i, AbstractC0272fw... abstractC0272fwArr) {
        AbstractC0711wc.m1770e(abstractC0272fwArr);
        if (abstractC0272fwArr.length == 0) {
            return;
        }
        List listMo1175q = mo1175q();
        AbstractC0272fw abstractC0272fwMo1178w = abstractC0272fwArr[0].mo1178w();
        if (abstractC0272fwMo1178w != null && abstractC0272fwMo1178w.mo1172n() == abstractC0272fwArr.length) {
            List listMo1175q2 = abstractC0272fwMo1178w.mo1175q();
            int length = abstractC0272fwArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    boolean z = mo1172n() == 0;
                    abstractC0272fwMo1178w.mo1174p();
                    listMo1175q.addAll(i, Arrays.asList(abstractC0272fwArr));
                    int length2 = abstractC0272fwArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        abstractC0272fwArr[i3].f846ap = this;
                        length2 = i3;
                    }
                    if (z && abstractC0272fwArr[0].f847aq == 0) {
                        return;
                    }
                    m1233az(i);
                    return;
                }
                if (abstractC0272fwArr[i2] != listMo1175q2.get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (AbstractC0272fw abstractC0272fw : abstractC0272fwArr) {
            if (abstractC0272fw == null) {
                throw new C0283gg("Array must not contain any null objects");
            }
        }
        for (AbstractC0272fw abstractC0272fw2 : abstractC0272fwArr) {
            abstractC0272fw2.getClass();
            AbstractC0272fw abstractC0272fw3 = abstractC0272fw2.f846ap;
            if (abstractC0272fw3 != null) {
                abstractC0272fw3.mo1064c(abstractC0272fw2);
            }
            abstractC0272fw2.f846ap = this;
        }
        listMo1175q.addAll(i, Arrays.asList(abstractC0272fwArr));
        m1233az(i);
    }

    /* JADX INFO: renamed from: au */
    public String mo1228au(String str) {
        AbstractC0711wc.m1770e(str);
        if (!mo1176r()) {
            return "";
        }
        String strM1589i = mo1170l().m1589i(str);
        if (strM1589i.length() > 0) {
            return strM1589i;
        }
        return str.startsWith("abs:") ? mo1226as(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: av */
    public final boolean m1229av(String str) {
        AbstractC0711wc.m1770e(str);
        if (!mo1176r()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo1170l().m1593m(strSubstring) != -1 && !mo1226as(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo1170l().m1593m(str) != -1;
    }

    /* JADX INFO: renamed from: aw */
    public final boolean m1230aw(String str) {
        return mo1177t().equals(str);
    }

    /* JADX INFO: renamed from: ax */
    public final AbstractC0272fw m1231ax() {
        AbstractC0272fw abstractC0272fw = this.f846ap;
        if (abstractC0272fw == null) {
            return null;
        }
        List listMo1175q = abstractC0272fw.mo1175q();
        int i = this.f847aq + 1;
        if (listMo1175q.size() > i) {
            return (AbstractC0272fw) listMo1175q.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ay */
    public final AbstractC0272fw m1232ay() {
        AbstractC0272fw abstractC0272fw = this.f846ap;
        if (abstractC0272fw != null && this.f847aq > 0) {
            return (AbstractC0272fw) abstractC0272fw.mo1175q().get(this.f847aq - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: az */
    public final void m1233az(int i) {
        int iMo1172n = mo1172n();
        if (iMo1172n == 0) {
            return;
        }
        List listMo1175q = mo1175q();
        while (i < iMo1172n) {
            ((AbstractC0272fw) listMo1175q.get(i)).f847aq = i;
            i++;
        }
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public AbstractC0272fw clone() {
        AbstractC0272fw abstractC0272fwMo1173o = mo1173o(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC0272fwMo1173o);
        while (!linkedList.isEmpty()) {
            AbstractC0272fw abstractC0272fw = (AbstractC0272fw) linkedList.remove();
            int iMo1172n = abstractC0272fw.mo1172n();
            for (int i = 0; i < iMo1172n; i++) {
                List listMo1175q = abstractC0272fw.mo1175q();
                AbstractC0272fw abstractC0272fwMo1173o2 = ((AbstractC0272fw) listMo1175q.get(i)).mo1173o(abstractC0272fw);
                listMo1175q.set(i, abstractC0272fwMo1173o2);
                linkedList.add(abstractC0272fwMo1173o2);
            }
        }
        return abstractC0272fwMo1173o;
    }

    /* JADX INFO: renamed from: ba */
    public final void m1234ba() {
        AbstractC0272fw abstractC0272fw = this.f846ap;
        if (abstractC0272fw != null) {
            abstractC0272fw.mo1064c(this);
        }
    }

    /* JADX INFO: renamed from: bb */
    public final void m1235bb(C0226ed c0226ed) {
        AbstractC0711wc.m1770e(c0226ed);
        if (this.f846ap == null) {
            this.f846ap = c0226ed.f846ap;
        }
        AbstractC0711wc.m1770e(this.f846ap);
        AbstractC0272fw abstractC0272fw = this.f846ap;
        abstractC0272fw.getClass();
        AbstractC0711wc.m1766a(this.f846ap == abstractC0272fw);
        if (this == c0226ed) {
            return;
        }
        AbstractC0272fw abstractC0272fw2 = c0226ed.f846ap;
        if (abstractC0272fw2 != null) {
            abstractC0272fw2.mo1064c(c0226ed);
        }
        int i = this.f847aq;
        abstractC0272fw.mo1175q().set(i, c0226ed);
        c0226ed.f846ap = abstractC0272fw;
        c0226ed.f847aq = i;
        this.f846ap = null;
    }

    /* JADX INFO: renamed from: c */
    public void mo1064c(AbstractC0272fw abstractC0272fw) {
        AbstractC0711wc.m1766a(abstractC0272fw.f846ap == this);
        int i = abstractC0272fw.f847aq;
        mo1175q().remove(i);
        m1233az(i);
        abstractC0272fw.f846ap = null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: l */
    public abstract C0554qh mo1170l();

    /* JADX INFO: renamed from: m */
    public abstract String mo1171m();

    /* JADX INFO: renamed from: n */
    public abstract int mo1172n();

    /* JADX INFO: renamed from: o */
    public AbstractC0272fw mo1173o(AbstractC0272fw abstractC0272fw) {
        try {
            AbstractC0272fw abstractC0272fw2 = (AbstractC0272fw) super.clone();
            abstractC0272fw2.f846ap = abstractC0272fw;
            abstractC0272fw2.f847aq = abstractC0272fw == null ? 0 : this.f847aq;
            if (abstractC0272fw == null && !(this instanceof C0235em)) {
                AbstractC0272fw abstractC0272fwMo1179x = mo1179x();
                C0235em c0235em = abstractC0272fwMo1179x instanceof C0235em ? (C0235em) abstractC0272fwMo1179x : null;
                if (c0235em != null) {
                    C0235em c0235em2 = new C0235em(c0235em.f771g.f591d, c0235em.mo1171m());
                    C0554qh c0554qh = c0235em.f774j;
                    if (c0554qh != null) {
                        c0235em2.f774j = c0554qh.clone();
                    }
                    c0235em2.f783a = c0235em.f783a.clone();
                    abstractC0272fw2.f846ap = c0235em2;
                    c0235em2.mo1175q().add(abstractC0272fw2);
                }
            }
            return abstractC0272fw2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract AbstractC0272fw mo1174p();

    /* JADX INFO: renamed from: q */
    public abstract List mo1175q();

    /* JADX INFO: renamed from: r */
    public abstract boolean mo1176r();

    /* JADX INFO: renamed from: s */
    public abstract String mo924s();

    /* JADX INFO: renamed from: t */
    public String mo1177t() {
        return mo924s();
    }

    public String toString() {
        return mo1192an();
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo925u(StringBuilder sb, int i, C0674ut c0674ut);

    /* JADX INFO: renamed from: v */
    public abstract void mo926v(StringBuilder sb, int i, C0674ut c0674ut);

    /* JADX INFO: renamed from: w */
    public AbstractC0272fw mo1178w() {
        return this.f846ap;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC0272fw mo1179x() {
        AbstractC0272fw abstractC0272fw = this;
        while (true) {
            AbstractC0272fw abstractC0272fw2 = abstractC0272fw.f846ap;
            if (abstractC0272fw2 == null) {
                return abstractC0272fw;
            }
            abstractC0272fw = abstractC0272fw2;
        }
    }
}
