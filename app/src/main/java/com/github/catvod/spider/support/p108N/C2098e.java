package com.github.catvod.spider.support.p108N;

import com.github.catvod.spider.support.p011C.C0959b;
import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2075c;
import com.github.catvod.spider.support.p110P.C2122e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p108N.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2098e implements InterfaceC2075c {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    /* JADX INFO: renamed from: a */
    public final C2078f mo5324a(C2077e c2077e, List<C2078f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strM5343g = ((C2078f) linkedList.get(0)).m5343g();
        String strM5343g2 = ((C2078f) linkedList.get(1)).m5343g();
        try {
            return (linkedList.size() <= 2 || linkedList.get(2) == null) ? new C2078f(C0959b.m2333b(strM5343g2).m2334c(strM5343g)) : new C2078f(new SimpleDateFormat(strM5343g2, Locale.forLanguageTag(((C2078f) linkedList.get(2)).m5343g())).parse(strM5343g));
        } catch (ParseException e) {
            throw new C2122e(e);
        }
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    public final String name() {
        return "format-date";
    }
}
