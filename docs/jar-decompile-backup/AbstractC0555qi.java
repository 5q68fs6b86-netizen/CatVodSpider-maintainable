package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.qi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0555qi implements InterfaceC0747xl, InterfaceC0785yw, Serializable {
    private final InterfaceC0747xl completion;

    public AbstractC0555qi(InterfaceC0747xl interfaceC0747xl) {
        this.completion = interfaceC0747xl;
    }

    public InterfaceC0747xl create(InterfaceC0747xl interfaceC0747xl) {
        AbstractC0399ko.m1351f("completion", interfaceC0747xl);
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC0747xl create(Object obj, InterfaceC0747xl interfaceC0747xl) {
        AbstractC0399ko.m1351f("completion", interfaceC0747xl);
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public InterfaceC0785yw getCallerFrame() {
        InterfaceC0747xl interfaceC0747xl = this.completion;
        if (interfaceC0747xl instanceof InterfaceC0785yw) {
            return (InterfaceC0785yw) interfaceC0747xl;
        }
        return null;
    }

    public final InterfaceC0747xl getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strM929c;
        acb acbVar = (acb) getClass().getAnnotation(acb.class);
        String str = null;
        if (acbVar == null) {
            return null;
        }
        int iM933v = acbVar.m933v();
        if (iM933v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM933v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? acbVar.m931l()[iIntValue] : -1;
        C0398kn c0398kn = acs.f578j;
        C0398kn c0398kn2 = acs.f577i;
        if (c0398kn == null) {
            try {
                C0398kn c0398kn3 = new C0398kn(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                acs.f578j = c0398kn3;
                c0398kn = c0398kn3;
            } catch (Exception unused2) {
                acs.f578j = c0398kn2;
                c0398kn = c0398kn2;
            }
        }
        if (c0398kn != c0398kn2) {
            Method method = c0398kn.f1101a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = c0398kn.f1102b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = c0398kn.f1103c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strM929c = acbVar.m929c();
        } else {
            strM929c = str + '/' + acbVar.m929c();
        }
        return new StackTraceElement(strM929c, acbVar.m932m(), acbVar.m930f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final void resumeWith(Object obj) {
        InterfaceC0747xl interfaceC0747xl = this;
        while (true) {
            AbstractC0555qi abstractC0555qi = (AbstractC0555qi) interfaceC0747xl;
            InterfaceC0747xl interfaceC0747xl2 = abstractC0555qi.completion;
            AbstractC0399ko.m1348c(interfaceC0747xl2);
            try {
                obj = abstractC0555qi.invokeSuspend(obj);
                if (obj == EnumC0781ys.f1859a) {
                    return;
                }
            } catch (Throwable th) {
                obj = act.m953b(th);
            }
            abstractC0555qi.releaseIntercepted();
            if (!(interfaceC0747xl2 instanceof AbstractC0555qi)) {
                interfaceC0747xl2.resumeWith(obj);
                return;
            }
            interfaceC0747xl = interfaceC0747xl2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
