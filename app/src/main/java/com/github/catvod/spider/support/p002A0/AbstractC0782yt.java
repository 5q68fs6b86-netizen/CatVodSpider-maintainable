package com.github.catvod.spider.support.p002A0;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.yt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0782yt {

    /* JADX INFO: renamed from: d */
    public static final AbstractC0782yt f1860d;

    static {
        AbstractC0782yt c0353iw;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c0353iw = new abo(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    c0353iw = new C0490ny(declaredMethod);
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                c0353iw = new C0126al(declaredMethod3, iIntValue);
            }
        } catch (Exception unused3) {
            c0353iw = new C0353iw();
        }
        f1860d = c0353iw;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo922c(Class cls);
}
