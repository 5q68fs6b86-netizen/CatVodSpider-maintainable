package com.github.catvod.spider.support.p044FM.p068X;

import com.github.catvod.spider.support.p044FM.p051G.C1349c;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c;
import com.github.catvod.spider.support.p044FM.p070Z.C1710e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.X.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1685e implements InterfaceC1662c {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    /* JADX INFO: renamed from: a */
    public final C1665f mo3955a(C1664e c1664e, List<C1665f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strM3974g = ((C1665f) linkedList.get(0)).m3974g();
        String strM3974g2 = ((C1665f) linkedList.get(1)).m3974g();
        try {
            return (linkedList.size() <= 2 || linkedList.get(2) == null) ? new C1665f(C1349c.m3333b(strM3974g2).m3334c(strM3974g)) : new C1665f(new SimpleDateFormat(strM3974g2, Locale.forLanguageTag(((C1665f) linkedList.get(2)).m3974g())).parse(strM3974g));
        } catch (ParseException e) {
            throw new C1710e(e);
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    public final String name() {
        return "format-date";
    }
}
