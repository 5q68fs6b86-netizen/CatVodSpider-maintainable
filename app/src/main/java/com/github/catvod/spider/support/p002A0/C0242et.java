package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.et */
/* JADX INFO: loaded from: classes.dex */
public final class C0242et extends AbstractC0213dr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f795a;

    /* JADX INFO: renamed from: e */
    public final String f796e;

    public C0242et(String str, int i) {
        this.f795a = i;
        switch (i) {
            case 3:
                this.f796e = AbstractC0552qf.m1581c(str);
                break;
            case 4:
                StringBuilder sbM1845g = AbstractC0727ws.m1845g();
                AbstractC0727ws.m1844f(sbM1845g, str, false);
                this.f796e = AbstractC0552qf.m1581c(AbstractC0727ws.m1852n(sbM1845g));
                break;
            case 5:
                StringBuilder sbM1845g2 = AbstractC0727ws.m1845g();
                AbstractC0727ws.m1844f(sbM1845g2, str, false);
                this.f796e = AbstractC0552qf.m1581c(AbstractC0727ws.m1852n(sbM1845g2));
                break;
            default:
                AbstractC0711wc.m1770e(str);
                this.f796e = AbstractC0552qf.m1581c(str);
                break;
        }
    }

    public /* synthetic */ C0242et(String str, int i, boolean z) {
        this.f795a = i;
        this.f796e = str;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public int mo1019b() {
        switch (this.f795a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 6;
            case 3:
            case 4:
            case 6:
            default:
                return super.mo1019b();
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case 9:
                return 1;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        switch (this.f795a) {
            case 0:
                return c0226ed2.m1229av(this.f796e);
            case 1:
                C0554qh c0554qhMo1170l = c0226ed2.mo1170l();
                c0554qhMo1170l.getClass();
                ArrayList arrayList = new ArrayList(c0554qhMo1170l.f1405a);
                for (int i = 0; i < c0554qhMo1170l.f1405a; i++) {
                    String str = c0554qhMo1170l.f1406b[i];
                    if (!C0554qh.m1584d(str)) {
                        arrayList.add(new C0551qe(str, (String) c0554qhMo1170l.f1407c[i], c0554qhMo1170l));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (AbstractC0552qf.m1581c(((C0551qe) it.next()).f1397d).startsWith(this.f796e)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return c0226ed2.m1162ad(this.f796e);
            case 3:
                c0226ed2.getClass();
                StringBuilder sbM1845g = AbstractC0727ws.m1845g();
                AbstractC0535pp.m1525b(new C0232ej(sbM1845g), c0226ed2);
                return AbstractC0552qf.m1581c(AbstractC0727ws.m1852n(sbM1845g)).contains(this.f796e);
            case 4:
                return AbstractC0552qf.m1581c(c0226ed2.m1165ag()).contains(this.f796e);
            case 5:
                return AbstractC0552qf.m1581c(c0226ed2.m1169ak()).contains(this.f796e);
            case 6:
                return ((String) c0226ed2.f773i.stream().map(new C0234el(0)).collect(AbstractC0727ws.m1851m(""))).contains(this.f796e);
            case 7:
                c0226ed2.getClass();
                return ((String) AbstractC0536pq.m1526b(c0226ed2, AbstractC0272fw.class).map(new C0234el(0)).collect(AbstractC0727ws.m1851m(""))).contains(this.f796e);
            case 8:
                C0554qh c0554qh = c0226ed2.f774j;
                return this.f796e.equals(c0554qh != null ? c0554qh.m1589i("id") : "");
            case 9:
                return c0226ed2.m1230aw(this.f796e);
            case 10:
                return c0226ed2.f771g.f590c.endsWith(this.f796e);
            default:
                return c0226ed2.f771g.f590c.startsWith(this.f796e);
        }
    }

    public final String toString() {
        switch (this.f795a) {
            case 0:
                return "[" + this.f796e + "]";
            case 1:
                return "[^" + this.f796e + "]";
            case 2:
                return "." + this.f796e;
            case 3:
                return ":containsData(" + this.f796e + ")";
            case 4:
                return ":containsOwn(" + this.f796e + ")";
            case 5:
                return ":contains(" + this.f796e + ")";
            case 6:
                return ":containsWholeOwnText(" + this.f796e + ")";
            case 7:
                return ":containsWholeText(" + this.f796e + ")";
            case 8:
                return "#" + this.f796e;
            case 9:
                return this.f796e;
            case 10:
                return this.f796e;
            default:
                return this.f796e;
        }
    }
}
