package com.github.catvod.spider.support.p002A0;

import com.github.catvod.p000js.Function;
import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.QuickJSObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ok */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0503ok implements JSCallFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1334a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f1335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1336c;

    public /* synthetic */ C0503ok(Function function, Method method) {
        this.f1336c = function;
        this.f1335b = method;
    }

    public /* synthetic */ C0503ok(Method method, Object obj) {
        this.f1335b = method;
        this.f1336c = obj;
    }

    public final Object call(Object[] objArr) {
        switch (this.f1334a) {
            case 0:
                return ((Function) this.f1336c).lambda$setProperty$0(this.f1335b, objArr);
            default:
                return QuickJSObject.Ϳ(this.f1335b, this.f1336c, objArr);
        }
    }
}
