package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.dj */
/* JADX INFO: loaded from: classes.dex */
public final enum C0205dj extends EnumC0416le {
    public C0205dj() {
        super("ForeignContent", 23);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        C0554qh c0554qh;
        C0554qh c0554qh2;
        C0554qh c0554qh3;
        C0226ed c0226edM1919ap;
        int iM1764h = AbstractC0710wb.m1764h(abstractC0680uz.f1590g);
        if (iM1764h == 0) {
            c0801zl.m1922as(this);
        } else if (iM1764h == 1) {
            C0708w c0708w = (C0708w) abstractC0680uz;
            if (AbstractC0727ws.m1846h(c0708w.f1730d, AbstractC0702vu.f1621an)) {
                return c0801zl.f1902v.mo1058a(abstractC0680uz, c0801zl);
            }
            if (c0708w.f1730d.equals("font") && (((c0554qh = c0708w.f1732f) != null && c0554qh.m1593m("color") != -1) || (((c0554qh2 = c0708w.f1732f) != null && c0554qh2.m1593m("face") != -1) || ((c0554qh3 = c0708w.f1732f) != null && c0554qh3.m1593m("size") != -1)))) {
                return c0801zl.f1902v.mo1058a(abstractC0680uz, c0801zl);
            }
            c0801zl.m1937bh(c0708w, c0801zl.m1919ap().f771g.f591d);
        } else if (iM1764h == 2) {
            C0667um c0667um = (C0667um) abstractC0680uz;
            if (c0667um.f1730d.equals("br") || c0667um.f1730d.equals("p")) {
                return c0801zl.f1902v.mo1058a(abstractC0680uz, c0801zl);
            }
            if (c0667um.f1730d.equals("script") && c0801zl.f1895o.size() != 0 && (c0226edM1919ap = c0801zl.m1919ap()) != null) {
                C0118ad c0118ad = c0226edM1919ap.f771g;
                if (c0118ad.f590c.equals("script") && c0118ad.f591d.equals("http://www.w3.org/2000/svg")) {
                    c0801zl.m1942bm();
                    return true;
                }
            }
            ArrayList arrayList = c0801zl.f1895o;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Stack unexpectedly empty");
            }
            int size = arrayList.size() - 1;
            C0226ed c0226ed = (C0226ed) arrayList.get(size);
            if (!c0226ed.m1230aw(c0667um.f1730d)) {
                c0801zl.m1922as(this);
            }
            while (size != 0) {
                if (c0226ed.m1230aw(c0667um.f1730d)) {
                    String str = c0226ed.f771g.f590c;
                    for (int size2 = c0801zl.f1895o.size() - 1; size2 >= 0 && !c0801zl.m1942bm().m1230aw(str); size2--) {
                    }
                    return true;
                }
                size--;
                c0226ed = (C0226ed) arrayList.get(size);
                if (c0226ed.f771g.f591d.equals("http://www.w3.org/1999/xhtml")) {
                    return c0801zl.f1902v.mo1058a(abstractC0680uz, c0801zl);
                }
            }
        } else if (iM1764h == 3) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
        } else if (iM1764h == 4) {
            C0343im c0343im = (C0343im) abstractC0680uz;
            if (c0343im.f1013b.equals(EnumC0416le.f1127aa)) {
                c0801zl.m1922as(this);
            } else if (EnumC0416le.m1371ab(c0343im)) {
                c0801zl.m1932bc(c0343im);
            } else {
                c0801zl.m1932bc(c0343im);
                c0801zl.f1888ae = false;
            }
        }
        return true;
    }
}
