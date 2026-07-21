package com.github.catvod.spider.support.p002A0;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.el */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0234el implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f782a;

    public /* synthetic */ C0234el(int i) {
        this.f782a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f782a) {
            case 0:
                AbstractC0272fw abstractC0272fw = (AbstractC0272fw) obj;
                if (abstractC0272fw instanceof C0706vy) {
                    return ((C0706vy) abstractC0272fw).m1732f();
                }
                return abstractC0272fw.m1230aw("br") ? "\n" : "";
            case 1:
                return C0706vy.class.cast((AbstractC0272fw) obj);
            case 2:
                return Collections.unmodifiableList((List) obj);
            case 3:
                return ((C0226ed) obj).m1163ae();
            case 4:
                return ((C0226ed) obj).m1169ak();
            case 5:
                return ((C0226ed) obj).mo1192an();
            case 6:
                return new IdentityHashMap();
            default:
                C0593rt c0593rt = (C0593rt) obj;
                String strM1852n = AbstractC0727ws.m1852n(c0593rt.f1450a);
                c0593rt.f1450a = null;
                return strM1852n;
        }
    }
}
