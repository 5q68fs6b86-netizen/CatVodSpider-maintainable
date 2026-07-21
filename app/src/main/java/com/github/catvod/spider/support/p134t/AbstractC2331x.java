package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p135u.AbstractC2373h;
import com.github.catvod.spider.support.p135u.C2359a;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2331x<Symbol, ATNInterpreter extends AbstractC2373h> {

    /* JADX INFO: renamed from: b */
    protected ATNInterpreter f5797b;

    /* JADX INFO: renamed from: a */
    private List<InterfaceC2308a> f5796a = new a();

    /* JADX INFO: renamed from: c */
    private int f5798c = -1;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.x$a */
    final class a extends CopyOnWriteArrayList<InterfaceC2308a> {
        a() {
            add(C2319l.f5759a);
        }
    }

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: c */
    public abstract C2359a mo5199c();

    /* JADX INFO: renamed from: d */
    public final InterfaceC2308a m6299d() {
        return new C2329v(this.f5796a);
    }

    /* JADX INFO: renamed from: e */
    public final ATNInterpreter m6300e() {
        return this.f5797b;
    }

    /* JADX INFO: renamed from: f */
    public final int m6301f() {
        return this.f5798c;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo6276g(int i) {
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m6302h(int i) {
        this.f5798c = i;
    }
}
