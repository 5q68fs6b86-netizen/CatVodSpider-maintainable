package com.github.catvod.spider.support.p044FM.p068X;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p066V.C1661b;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p068X.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1698r implements InterfaceC1662c {
    /* JADX INFO: renamed from: b */
    private Double m3989b(String str) {
        if (C1661b.f3736a.matcher(str).matches()) {
            return Double.valueOf(Double.parseDouble(str));
        }
        return null;
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    /* JADX INFO: renamed from: a */
    public final C1665f mo3955a(C1664e c1664e, List<C1665f> list) {
        if (list.isEmpty()) {
            return new C1665f(0);
        }
        LinkedList linkedList = new LinkedList();
        for (C1665f c1665f : list) {
            if (c1665f.m3984q()) {
                linkedList.add(c1665f.m3970c());
            }
            if (c1665f.m3985r()) {
                Double dM3989b = m3989b(c1665f.m3974g());
                if (dM3989b == null) {
                    return null;
                }
                linkedList.add(dM3989b);
            }
            if (c1665f.m3981n()) {
                Iterator<C1393m> it = c1665f.m3971d().iterator();
                while (it.hasNext()) {
                    Double dM3989b2 = m3989b(it.next().m3471j0());
                    if (dM3989b2 == null) {
                        return null;
                    }
                    linkedList.add(dM3989b2);
                }
            }
        }
        Double d = (Double) linkedList.stream().reduce(Double.valueOf(0.0d), new BinaryOperator() { // from class: com.github.catvod.spider.support.p044FM.p068X.q
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Double.valueOf(((Double) obj2).doubleValue() + ((Double) obj).doubleValue());
            }
        });
        return d.compareTo(Double.valueOf(new BigDecimal(d.longValue()).doubleValue())) == 0 ? new C1665f(new Long(d.longValue())) : new C1665f(d);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    public final String name() {
        return "sum";
    }
}
