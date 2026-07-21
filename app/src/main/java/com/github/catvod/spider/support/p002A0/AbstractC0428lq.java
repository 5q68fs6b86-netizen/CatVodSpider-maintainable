package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.lq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0428lq {

    /* JADX INFO: renamed from: f */
    public int f1165f;

    /* JADX INFO: renamed from: i */
    public C0339ii f1168i;

    /* JADX INFO: renamed from: d */
    public C0367jj f1163d = null;

    /* JADX INFO: renamed from: e */
    public int f1164e = -1;

    /* JADX INFO: renamed from: g */
    public boolean f1166g = false;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1167h = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo897a();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0428lq) && this.f1164e == ((AbstractC0428lq) obj).f1164e;
    }

    public final int hashCode() {
        return this.f1164e;
    }

    /* JADX INFO: renamed from: j */
    public final void m1405j(AbstractC0488nw abstractC0488nw) {
        ArrayList<AbstractC0488nw> arrayList = this.f1167h;
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            this.f1166g = abstractC0488nw.mo873e();
        } else if (this.f1166g != abstractC0488nw.mo873e()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.f1164e));
            this.f1166g = false;
        }
        for (AbstractC0488nw abstractC0488nw2 : arrayList) {
            if (abstractC0488nw2.f1292g.f1164e == abstractC0488nw.f1292g.f1164e) {
                if (abstractC0488nw2.mo1088c() != null && abstractC0488nw.mo1088c() != null && abstractC0488nw2.mo1088c().equals(abstractC0488nw.mo1088c())) {
                    return;
                }
                if (abstractC0488nw2.mo873e() && abstractC0488nw.mo873e()) {
                    return;
                }
            }
        }
        arrayList.add(size, abstractC0488nw);
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC0488nw m1406k(int i) {
        return (AbstractC0488nw) this.f1167h.get(i);
    }

    public final String toString() {
        return String.valueOf(this.f1164e);
    }
}
