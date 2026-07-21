package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sv */
/* JADX INFO: loaded from: classes.dex */
public final class C0622sv implements InterfaceC0698vq {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1520b;

    /* JADX INFO: renamed from: c */
    public final C0742xg f1521c;

    public /* synthetic */ C0622sv(C0742xg c0742xg, int i) {
        this.f1520b = i;
        this.f1521c = c0742xg;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        Type[] actualTypeArguments;
        C0742xg c0742xg = this.f1521c;
        Type type = Object.class;
        switch (this.f1520b) {
            case 0:
                Type type2 = c0259fj.f828b;
                Class cls = c0259fj.f827a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                AbstractC0584rk.m1636a(Collection.class.isAssignableFrom(cls));
                Type typeM1521h = AbstractC0534po.m1521h(type2, cls, AbstractC0534po.m1519f(type2, cls, Collection.class), new HashMap());
                type = typeM1521h instanceof ParameterizedType ? ((ParameterizedType) typeM1521h).getActualTypeArguments()[0] : Object.class;
                return new C0621su(c0493oa, type, c0493oa.m1471aa(new C0259fj(type)), c0742xg.m1870e(c0259fj));
            default:
                Type type3 = c0259fj.f828b;
                Class cls2 = c0259fj.f827a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    AbstractC0584rk.m1636a(Map.class.isAssignableFrom(cls2));
                    Type typeM1521h2 = AbstractC0534po.m1521h(type3, cls2, AbstractC0534po.m1519f(type3, cls2, Map.class), new HashMap());
                    actualTypeArguments = typeM1521h2 instanceof ParameterizedType ? ((ParameterizedType) typeM1521h2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                return new aao(this, c0493oa, actualTypeArguments[0], (type4 == Boolean.TYPE || type4 == Boolean.class) ? ado.f620c : c0493oa.m1471aa(new C0259fj(type4)), actualTypeArguments[1], c0493oa.m1471aa(new C0259fj(actualTypeArguments[1])), c0742xg.m1870e(c0259fj));
        }
    }
}
