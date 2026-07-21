package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.zy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0814zy implements InterfaceC0575rb, Serializable {
    private final int arity;

    public AbstractC0814zy(int i) {
        this.arity = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0575rb
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        AbstractC0407kw.f1108a.getClass();
        String strM1566a = C0546q.m1566a(this);
        AbstractC0399ko.m1350e("renderLambdaToString(...)", strM1566a);
        return strM1566a;
    }
}
