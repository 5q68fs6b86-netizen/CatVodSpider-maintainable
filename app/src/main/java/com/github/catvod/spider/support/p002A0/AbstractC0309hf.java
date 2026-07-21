package com.github.catvod.spider.support.p002A0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.hf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0309hf {
    static {
        Object objM953b;
        try {
            objM953b = new C0269ft(m1271a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objM953b = act.m953b(th);
        }
        if (objM953b instanceof C0381jx) {
            objM953b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m1271a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (objInvoke != null) {
            return (Handler) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
