package com.github.catvod.spider.support.p130o;

import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.QuickJSObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.o.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2291b implements JSCallFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f5717a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5718b;

    public /* synthetic */ C2291b(Method method, Object obj) {
        this.f5717a = method;
        this.f5718b = obj;
    }

    public final Object call(Object[] objArr) {
        return QuickJSObject.a(this.f5717a, this.f5718b, objArr);
    }
}
