package com.github.catvod.spider.support.p002A0;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ur */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0672ur extends AbstractC0272fw {

    /* JADX INFO: renamed from: d */
    public Object f1579d;

    public AbstractC0672ur(String str) {
        AbstractC0711wc.m1770e(str);
        this.f1579d = str;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: as */
    public final String mo1226as(String str) {
        m1733g();
        return super.mo1226as(str);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: au */
    public final String mo1228au(String str) {
        if (this.f1579d instanceof C0554qh) {
            return super.mo1228au(str);
        }
        return mo924s().equals(str) ? (String) this.f1579d : "";
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0672ur m1731e(String str, String str2) {
        if ((this.f1579d instanceof C0554qh) || !str.equals("#doctype")) {
            m1733g();
            AbstractC0272fw abstractC0272fwMo1179x = mo1179x();
            C0235em c0235em = abstractC0272fwMo1179x instanceof C0235em ? (C0235em) abstractC0272fwMo1179x : null;
            (c0235em != null ? c0235em.f784al : new C0736xa(new C0801zl())).getClass();
            String strM1581c = AbstractC0552qf.m1581c(str.trim());
            C0554qh c0554qhMo1170l = mo1170l();
            int iM1593m = c0554qhMo1170l.m1593m(strM1581c);
            if (iM1593m != -1) {
                c0554qhMo1170l.f1407c[iM1593m] = str2;
                if (!c0554qhMo1170l.f1406b[iM1593m].equals(strM1581c)) {
                    c0554qhMo1170l.f1406b[iM1593m] = strM1581c;
                }
            } else {
                c0554qhMo1170l.m1585e(strM1581c, str2);
            }
        } else {
            this.f1579d = str2;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final String m1732f() {
        return mo1228au(mo924s());
    }

    /* JADX INFO: renamed from: g */
    public final void m1733g() {
        Object obj = this.f1579d;
        if (obj instanceof C0554qh) {
            return;
        }
        C0554qh c0554qh = new C0554qh();
        this.f1579d = c0554qh;
        c0554qh.m1594n(mo924s(), (String) obj);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: l */
    public final C0554qh mo1170l() {
        m1733g();
        return (C0554qh) this.f1579d;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: m */
    public final String mo1171m() {
        AbstractC0272fw abstractC0272fw = this.f846ap;
        return abstractC0272fw != null ? abstractC0272fw.mo1171m() : "";
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: n */
    public final int mo1172n() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: o */
    public final AbstractC0272fw mo1173o(AbstractC0272fw abstractC0272fw) {
        AbstractC0672ur abstractC0672ur = (AbstractC0672ur) super.mo1173o(abstractC0272fw);
        Object obj = this.f1579d;
        if (obj instanceof C0554qh) {
            abstractC0672ur.f1579d = ((C0554qh) obj).clone();
        }
        return abstractC0672ur;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: p */
    public final AbstractC0272fw mo1174p() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: q */
    public final List mo1175q() {
        return AbstractC0272fw.f845ao;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: r */
    public final boolean mo1176r() {
        return this.f1579d instanceof C0554qh;
    }
}
