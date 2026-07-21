package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.vy */
/* JADX INFO: loaded from: classes.dex */
public class C0706vy extends AbstractC0672ur {
    /* JADX INFO: renamed from: h */
    public static boolean m1753h(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0706vy clone() {
        return (C0706vy) super.clone();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: s */
    public String mo924s() {
        return "#text";
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    public final String toString() {
        return mo1192an();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: u */
    public void mo925u(StringBuilder sb, int i, C0674ut c0674ut) {
        int i2 = 1;
        if (c0674ut.f1582c && !C0226ed.m1158k(this.f846ap)) {
            AbstractC0272fw abstractC0272fw = this.f846ap;
            C0226ed c0226ed = abstractC0272fw instanceof C0226ed ? (C0226ed) abstractC0272fw : null;
            if (c0226ed != null) {
                C0118ad c0118ad = c0226ed.f771g;
                if (!c0118ad.f592e && !c0118ad.f593f) {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            int i3 = ((i2 == 0 || this.f847aq != 0) && !(abstractC0272fw instanceof C0235em)) ? 5 : 13;
            if (i2 != 0 && m1231ax() == null) {
                i3 |= 16;
            }
            i2 = i3;
            AbstractC0272fw abstractC0272fwM1231ax = m1231ax();
            AbstractC0272fw abstractC0272fwM1232ay = m1232ay();
            boolean zM1848j = AbstractC0727ws.m1848j(m1732f());
            if ((((abstractC0272fwM1231ax instanceof C0226ed) && ((C0226ed) abstractC0272fwM1231ax).m1168aj(c0674ut)) || (((abstractC0272fwM1231ax instanceof C0706vy) && AbstractC0727ws.m1848j(((C0706vy) abstractC0272fwM1231ax).m1732f())) || ((abstractC0272fwM1232ay instanceof C0226ed) && (((C0226ed) abstractC0272fwM1232ay).f771g.f592e || abstractC0272fwM1232ay.m1230aw("br"))))) && zM1848j) {
                return;
            }
            if ((abstractC0272fwM1232ay == null && c0226ed != null && c0226ed.f771g.f593f && !zM1848j) || (abstractC0272fwM1232ay != null && abstractC0272fwM1232ay.m1230aw("br"))) {
                AbstractC0272fw.m1225ar(sb, i, c0674ut);
            }
        }
        AbstractC0225ec.m1157h(sb, m1732f(), c0674ut, i2);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: v */
    public void mo926v(StringBuilder sb, int i, C0674ut c0674ut) {
    }
}
