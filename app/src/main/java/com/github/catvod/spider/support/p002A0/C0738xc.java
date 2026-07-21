package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xc */
/* JADX INFO: loaded from: classes.dex */
public final class C0738xc implements InterfaceC0656ub {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Type f1783b;

    public /* synthetic */ C0738xc(Type type, int i) {
        this.f1782a = i;
        this.f1783b = type;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0656ub
    /* JADX INFO: renamed from: m */
    public final Object mo1338m() {
        switch (this.f1782a) {
            case 0:
                Type type = this.f1783b;
                if (!(type instanceof ParameterizedType)) {
                    throw new C0765yc("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C0765yc("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f1783b;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new C0765yc("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new C0765yc("Invalid EnumMap type: " + type3.toString());
        }
    }
}
