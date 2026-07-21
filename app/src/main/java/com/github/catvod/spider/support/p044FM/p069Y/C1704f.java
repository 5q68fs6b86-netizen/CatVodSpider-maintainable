package com.github.catvod.spider.support.p044FM.p069Y;

import com.github.catvod.spider.support.p044FM.p045A.C1290p;
import com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p055K.C1402v;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.Y.f */
/* JADX INFO: loaded from: classes.dex */
final class C1704f implements InterfaceC1533O {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f3746a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1551g f3747b;

    C1704f(Map map, C1551g c1551g) {
        this.f3746a = map;
        this.f3747b = c1551g;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O
    /* JADX INFO: renamed from: a */
    public final void mo3437a(AbstractC1399s abstractC1399s, int i) {
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O
    /* JADX INFO: renamed from: b */
    public final void mo3438b(AbstractC1399s abstractC1399s, int i) {
        if (abstractC1399s instanceof C1402v) {
            C1402v c1402v = (C1402v) abstractC1399s;
            String str = i + "_" + c1402v.mo3487y().hashCode();
            Integer num = (Integer) this.f3746a.get(str);
            Integer numValueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
            this.f3746a.put(str, numValueOf);
            C1393m c1393m = new C1393m("JX_TEXT");
            c1393m.mo3432u0(c1402v.m3529L());
            c1393m.m3452R("EL_DEPTH", str);
            try {
                Method declaredMethod = AbstractC1399s.class.getDeclaredMethod("setParentNode", AbstractC1399s.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(c1393m, c1402v.mo3487y());
            } catch (Exception unused) {
            }
            C1290p.m3230e(c1393m, numValueOf.intValue());
            this.f3747b.add(c1393m);
        }
    }
}
