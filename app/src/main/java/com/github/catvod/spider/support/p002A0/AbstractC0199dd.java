package com.github.catvod.spider.support.p002A0;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.dd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0199dd {
    /* JADX INFO: renamed from: a */
    public static List m1116a(Object obj) {
        if ((obj instanceof InterfaceC0717wi) && !(obj instanceof InterfaceC0254fe)) {
            m1120e("kotlin.collections.MutableList", obj);
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            AbstractC0399ko.m1354i(e, AbstractC0199dd.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1117b(Object obj) {
        if (obj == null || m1119d(2, obj)) {
            return;
        }
        m1120e("kotlin.jvm.functions.Function2", obj);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final Class m1118c(InterfaceC0578re interfaceC0578re) {
        AbstractC0399ko.m1351f("<this>", interfaceC0578re);
        Class cls = ((C0615so) ((InterfaceC0614sn) interfaceC0578re)).f1501d;
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? cls : Double.class;
            case 104431:
                return !name.equals("int") ? cls : Integer.class;
            case 3039496:
                return !name.equals("byte") ? cls : Byte.class;
            case 3052374:
                return !name.equals("char") ? cls : Character.class;
            case 3327612:
                return !name.equals("long") ? cls : Long.class;
            case 3625364:
                return !name.equals("void") ? cls : Void.class;
            case 64711720:
                return !name.equals("boolean") ? cls : Boolean.class;
            case 97526364:
                return !name.equals("float") ? cls : Float.class;
            case 109413500:
                return !name.equals("short") ? cls : Short.class;
            default:
                return cls;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1119d(int i, Object obj) {
        int arity;
        if (!(obj instanceof InterfaceC0568qv)) {
            return false;
        }
        if (obj instanceof InterfaceC0575rb) {
            arity = ((InterfaceC0575rb) obj).getArity();
        } else if (obj instanceof InterfaceC0264fo) {
            arity = 0;
        } else if (obj instanceof InterfaceC0569qw) {
            arity = 1;
        } else {
            arity = obj instanceof InterfaceC0304ha ? 2 : -1;
        }
        return arity == i;
    }

    /* JADX INFO: renamed from: e */
    public static void m1120e(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC0399ko.m1354i(classCastException, AbstractC0199dd.class.getName());
        throw classCastException;
    }
}
