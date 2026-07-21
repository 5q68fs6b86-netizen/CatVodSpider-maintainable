package com.github.catvod.spider.support.p108N;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p106L.C2074b;
import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2075c;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p108N.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2111r implements InterfaceC2075c {
    /* JADX INFO: renamed from: b */
    private Double m5359b(String str) {
        if (C2074b.f4963a.matcher(str).matches()) {
            return Double.valueOf(Double.parseDouble(str));
        }
        return null;
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    /* JADX INFO: renamed from: a */
    public final C2078f mo5324a(C2077e c2077e, List<C2078f> list) {
        if (list.isEmpty()) {
            return new C2078f(0);
        }
        LinkedList linkedList = new LinkedList();
        for (C2078f c2078f : list) {
            if (c2078f.m5353q()) {
                linkedList.add(c2078f.m5339c());
            }
            if (c2078f.m5354r()) {
                Double dM5359b = m5359b(c2078f.m5343g());
                if (dM5359b == null) {
                    return null;
                }
                linkedList.add(dM5359b);
            }
            if (c2078f.m5350n()) {
                Iterator<C2037i> it = c2078f.m5340d().iterator();
                while (it.hasNext()) {
                    Double dM5359b2 = m5359b(it.next().m4889i0());
                    if (dM5359b2 == null) {
                        return null;
                    }
                    linkedList.add(dM5359b2);
                }
            }
        }
        Double d = (Double) linkedList.stream().reduce(Double.valueOf(0.0d), new BinaryOperator() { // from class: com.github.catvod.spider.support.p108N.q
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Double.valueOf(((Double) obj2).doubleValue() + ((Double) obj).doubleValue());
            }
        });
        return d.compareTo(Double.valueOf(new BigDecimal(d.longValue()).doubleValue())) == 0 ? new C2078f(new Long(d.longValue())) : new C2078f(d);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    public final String name() {
        return "sum";
    }
}
