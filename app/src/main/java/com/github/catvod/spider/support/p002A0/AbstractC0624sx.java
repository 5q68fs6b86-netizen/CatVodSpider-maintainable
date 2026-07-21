package com.github.catvod.spider.support.p002A0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0624sx {
    /* JADX INFO: renamed from: j */
    public static C0128an m1708j(C0128an c0128an) {
        if (c0128an.f664f != null) {
            throw new IllegalStateException();
        }
        c0128an.m1002n();
        c0128an.f663e = true;
        return c0128an.f662d > 0 ? c0128an : C0128an.f659a;
    }

    /* JADX INFO: renamed from: k */
    public static int m1709k(List list) {
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: l */
    public static List m1710l(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC0399ko.m1350e("singletonList(...)", listSingletonList);
        return listSingletonList;
    }
}
